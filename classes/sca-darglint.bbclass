## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_DARGLINT_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_DARGLINT_EXTRA_FATAL ?= ""

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress

inherit python3native

def do_sca_conv_darglint(d):
    import os
    import re
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^(?P<file>.*?):(\w+):(?P<line>\d+):\s*(?P<severity>[A-Z]+)(?P<id>[0-9]+):\s*(?P<msg>.*)"

    _suppress = sca_suppress_init(d)
    _findings = []
    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        with open(d.getVar("SCA_RAW_RESULT_FILE"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="darglint",
                                            BuildPath=buildpath,
                                            File=m.group("file"),
                                            Line=m.group("line"),
                                            Message=m.group("msg"),
                                            ID="{}{}".format(m.group("severity"), m.group("id")),
                                            Severity="warning")
                    if _suppress.Suppressed(g):
                        continue
                    if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                        continue
                    if g.Severity in sca_allowed_warning_level(d):
                        _findings.append(g)
                except Exception as exp:
                    bb.warn(str(exp))
    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_darglint() {
    import os
    import subprocess
    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_DARGLINT_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_DARGLINT_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "darglint-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "darglint-{}-fatal".format(d.getVar("SCA_MODE"))))

    tmp_result = os.path.join(d.getVar("T", True), "sca_raw_darglint.txt")
    d.setVar("SCA_RAW_RESULT_FILE", tmp_result)
    cmd_output = ""

    os.makedirs(os.path.join(d.getVar("T"), "darglintout"), exist_ok=True)
    ## Run
    _paths = [os.path.join(d.getVar("STAGING_DIR"), d.getVar("PYTHON_SITEPACKAGES_DIR").lstrip("/")),
              d.getVar("SCA_SOURCES_DIR"),
              os.environ.get("PYTHONPATH", "") 
              ]
    _args = ["darglint"]
    _args += ["--no-exit-code"]
   
    _files = get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), d.getVar("SCA_PYTHON_SHEBANG"), [".py"], \
                                                sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))
    
    if any(_files): 
        try:
            cmd_output += subprocess.check_output(_args + _files, universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            cmd_output += e.stdout or ""

    with open(tmp_result, "w") as o:
        o.write(cmd_output)
    
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/darglint.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_darglint(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "darglint", get_fatal_entries(d))
}

SCA_DEPLOY_TASK = "do_sca_deploy_darglint"

python do_sca_deploy_darglint() {
    sca_conv_deploy(d, "darglint", "txt")
}

addtask do_sca_darglint before do_install after do_configure
addtask do_sca_deploy_darglint after do_sca_darglint before do_package

DEPENDS += "python3-darglint-native sca-recipe-darglint-rules-native"
