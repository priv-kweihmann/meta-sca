## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_SAFETY_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_SAFETY_EXTRA_FATAL ?= ""

SCA_RAW_RESULT_FILE[safety] = "json"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress

inherit python3native

def do_sca_conv_safety(d, cmd_output=""):
    import os
    import json

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    items = []
    _suppress = sca_suppress_init(d, "SCA_SAFETY_EXTRA_SUPPRESS",
                                  d.expand("${STAGING_DATADIR_NATIVE}/safety-${SCA_MODE}-suppress"),
                                  file_trace=False)
    _findings = []

    ## Result file parsing
    if os.path.exists(sca_raw_result_file(d, "safety")):
        io = []
        with open(sca_raw_result_file(d, "safety")) as i:
            try:
                io = json.load(i)
            except:
                io = []
        for k in io:
            try:
                g = sca_get_model_class(d,
                                        PackageName=package_name,
                                        Tool="safety",
                                        BuildPath=sca_get_layer_path_for_file(d, d.getVar("FILE")),
                                        File=d.getVar("FILE"),
                                        Message="{} - {}".format(k[0], k[3]),
                                        ID="vulnerability",
                                        Severity="error")
                if _suppress.Suppressed(g):
                    continue
                if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                    continue
                if g.Severity in sca_allowed_warning_level(d):
                    _findings.append(g)
            except Exception as e:
                bb.note(str(e))

    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

## happily taken from https://stackoverflow.com/a/37078593
def import_and_extract(d, parent_dir):
    import sys
    import unittest.mock as mock
    import tempfile
    import os
    try:
        import setuptools
    except ImportError:
        try:
            ## in case we can't import setuptools we return nothing
            ## so this tool might not work, but build won't fail
            sys.path.append(os.path.join(d.getVar("STAGING_DIR_NATIVE"), d.getVar("PYTHON_SITEPACKAGES_DIR")[1:]))
            import setuptools
        except ImportError:
            return []
    sys.path.insert(0, parent_dir)
    with tempfile.NamedTemporaryFile(prefix="setup_temp_", mode='w', dir=parent_dir, suffix='.py') as temp_fh:
        with open(os.path.join(parent_dir, "setup.py"), 'r') as setup_fh:
            temp_fh.write(setup_fh.read())
            temp_fh.flush()
        try:
            with mock.patch.object(setuptools, 'setup') as mock_setup:
                module_name = os.path.basename(temp_fh.name).split(".")[0]
                __import__(module_name)
        except:
            pass
        try:
            args, kwargs = mock_setup.call_args
        except:
            sys.path.pop(0)
            return []
        sys.path.pop(0)
        return sorted(kwargs.get('install_requires', [])) or []

python do_sca_safety() {
    import os
    import subprocess

    ## Build tmp requirements.txt file
    tmp_req = os.path.join(d.getVar("T"), "_safety_tmp.txt")
    tmp_req_lines = []
    if os.path.exists(os.path.join(d.getVar("SCA_SOURCES_DIR"), "requirements.txt")):
        with open(os.path.join(d.getVar("SCA_SOURCES_DIR"), "requirements.txt"), "r") as i:
            tmp_req_lines += [x.strip("\n ") for x in i.readlines()]
    if os.path.exists(os.path.join(d.getVar("SCA_SOURCES_DIR"), "setup.py")):
        for x in import_and_extract(d, d.getVar("SCA_SOURCES_DIR")):
            tmp_req_lines.append(x)

    with open(tmp_req, "w") as o:
        o.write("\n".join(list(set(tmp_req_lines))))

    ## Run
    if any(tmp_req_lines):
        _args = [d.getVar("PYTHON")]
        _args += ["-m", "safety", "check"]
        _args += ["--output", sca_raw_result_file(d, "safety"), "--json"]
        _args += ["-r", tmp_req]

        try:
            subprocess.check_output(_args, universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError:
            pass

    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/safety.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_safety(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "safety", get_fatal_entries(d, "SCA_SAFETY_EXTRA_FATAL",
                       d.expand("${STAGING_DATADIR_NATIVE}/safety-${SCA_MODE}-fatal")))
}

do_sca_safety[doc] = "Find known vulnarabilities in used python libraries"
addtask do_sca_safety before do_sca_deploy after do_compile

DEPENDS += "\
            python3-safety-native \
            python3-setuptools-native \
            sca-recipe-safety-rules-native \
           "
