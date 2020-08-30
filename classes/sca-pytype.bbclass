## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_PYTYPE_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_PYTYPE_EXTRA_FATAL ?= ""

SCA_RAW_RESULT_FILE[pytype] = "txt"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress
inherit sca-tracefiles

inherit python3native

def do_sca_conv_pytype(d):
    import os
    import re

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^File\s+\"(?P<file>.*)\",\s+line\s+(?P<line>\d+),\s+in\s+(?P<name>[\w\<\>]+):\s+(?P<msg>.*)\s+\[(?P<id>.*)\]"

    _findings = []
    _suppress = sca_suppress_init(d, "SCA_PYTYPE_EXTRA_SUPPRESS",
                                  d.expand("${STAGING_DATADIR_NATIVE}/pytype-${SCA_MODE}-suppress"))

    if os.path.exists(sca_raw_result_file(d, "pytype")):
        with open(sca_raw_result_file(d, "pytype"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="pytype",
                                            BuildPath=buildpath,
                                            File=m.group("file"),
                                            Line=m.group("line"),
                                            Message="{}:{}".format(m.group("name"), m.group("msg")),
                                            ID=m.group("id"),
                                            Severity="warning")
                    if _suppress.Suppressed(g):
                        continue
                    if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                        continue
                    if g.Severity in sca_allowed_warning_level(d):
                        _findings.append(g)
                except Exception as exp:
                    bb.note(str(exp))

    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_pytype() {
    import os
    import subprocess

    os.makedirs(os.path.join(d.getVar("T"), "pytypeout"), exist_ok=True)

    _paths = [os.path.join(d.getVar("STAGING_DIR"), d.getVar("PYTHON_SITEPACKAGES_DIR").lstrip("/")),
              d.getVar("SCA_SOURCES_DIR"),
              os.environ.get("PYTHONPATH", "")
              ]
    _args = ["pytype"]
    _args += ["--keep-going"]
    _args += ["-V", d.getVar("PYTHON_BASEVERSION")]
    _args += ["-P", ":".join(_paths)]
    _args += ["-o", os.path.join(d.getVar("T"), "pytypeout")]

    _files = get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), d.getVar("SCA_PYTHON_SHEBANG"), [".py"], \
                                                sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

        ## Run
    cmd_output = exec_wrap_check_output(_args, _files)

    with open(sca_raw_result_file(d, "pytype"), "w") as o:
        o.write(cmd_output)
}

python do_sca_pytype_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/pytype.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_pytype(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "pytype", get_fatal_entries(d, "SCA_PYTYPE_EXTRA_FATAL",
                        d.expand("${STAGING_DATADIR_NATIVE}/pytype-${SCA_MODE}-fatal")))
}

do_sca_pytype[doc] = "Lint python scripts with pytype"
do_sca_pytype_report[doc] = "Report findings of do_sca_pytype"
addtask do_sca_pytype after do_configure before do_sca_tracefiles
addtask do_sca_pytype_report after do_sca_tracefiles before do_sca_deploy

DEPENDS += "python3-pytype-native sca-recipe-pytype-rules-native"
