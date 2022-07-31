## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to lead to a fatal on a recipe level
SCA_IT_EXTRA_FATAL ?= ""
SCA_IT_EXTRA_SUPPRESS ?= ""

SCA_RAW_RESULT_FILE[it] = "txt"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress
inherit sca-image-backtrack
inherit sca-tracefiles

inherit python3-dir

def do_sca_conv_it(d):
    import os
    import re

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^\s+-\s+(?P<file>.*):(?P<line>\d+):(?P<col>\d+)\s+=>\s+(?P<id>.*)"

    _suppress = sca_suppress_init(d, clean_split(d, "SCA_IT_EXTRA_SUPPRESS"), 
                                  d.expand("${STAGING_DATADIR_NATIVE}/it-${SCA_MODE}-suppress"))
    _excludes = sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA"))

    _findings = []

    if os.path.exists(sca_raw_result_file(d, "it")):
        with open(sca_raw_result_file(d, "it"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="it",
                                            Line=m.group("line"),
                                            Column=m.group("col"),
                                            BuildPath=buildpath,
                                            File=m.group("file"),
                                            Message="Issue of type {} found".format(m.group("id")),
                                            ID=m.group("id"),
                                            Severity="warning")
                    if g.File in _excludes or _suppress.Suppressed(g):
                        continue
                    if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                        continue
                    if g.Severity in sca_allowed_warning_level(d):
                        _findings += sca_backtrack_findings(d, g)
                except Exception as exp:
                    sca_log_note(d, str(exp))

    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_it() {
    import os
    import subprocess
    import re

    _args = ["it"]
    _args += ["--workers", d.getVar("BB_NUMBER_THREADS")]

    _files = get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), d.getVar("SCA_PYTHON_SHEBANG"), ".py",
                                               sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))
    ## Run
    cmd_output = exec_wrap_check_output(d, _args, _files)

    with open(sca_raw_result_file(d, "it"), "w") as o:
        o.write(cmd_output)
}

python do_sca_it_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/it.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_it(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "it", get_fatal_entries(d, clean_split(d, "SCA_IT_EXTRA_FATAL"),
                        d.expand("${STAGING_DATADIR_NATIVE}/it-${SCA_MODE}-fatal")))
}

do_sca_it[doc] = "Lint python files"
do_sca_it_report[doc] = "Report findings of do_sca_it"
addtask do_sca_it after do_compile before do_sca_tracefiles
addtask do_sca_it_report after do_sca_tracefiles before do_sca_deploy

DEPENDS += "python3-it-native sca-recipe-it-rules-native"
