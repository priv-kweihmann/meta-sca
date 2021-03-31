## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_REVIVE_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_REVIVE_EXTRA_FATAL ?= ""
## File extension filter list (whitespace separated)
SCA_REVIVE_FILE_FILTER ?= ".go"

SCA_RAW_RESULT_FILE[revive] = "txt"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress
inherit sca-image-backtrack
inherit sca-tracefiles

def do_sca_conv_revive(d):
    import os
    import re

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    items = []
    pattern = r"^(?P<file>.*):(?P<line>\d+):(?P<col>\d+):\s+\[(?P<id>\w+)\]\s+(?P<msg>.*)"

    _suppress = sca_suppress_init(d, "SCA_REVIVE_EXTRA_SUPPRESS",
                                  d.expand("${STAGING_DATADIR_NATIVE}/revive-${SCA_MODE}-suppress"))
    _findings = []

    if os.path.exists(sca_raw_result_file(d, "revive")):
        with open(sca_raw_result_file(d, "revive"), "r") as f:
            content = f.read()
            for m in re.finditer(pattern, content, re.MULTILINE):
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="revive",
                                            BuildPath=buildpath,
                                            File=m.group("file"),
                                            Column=m.group("col"),
                                            Line=m.group("line"),
                                            Message=m.group("msg"),
                                            ID=m.group("id"),
                                            Severity="warning")
                    if _suppress.Suppressed(g):
                        continue
                    if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                        continue
                    if g.Severity in sca_allowed_warning_level(d):
                        _findings += sca_backtrack_findings(d, g)
                except Exception as e:
                    sca_log_note(d, str(e))
    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_revive() {
    import os
    import subprocess

    _args = ["revive", "-formatter", "unix"]

    _files = get_files_by_extention(d,
                                    d.getVar("SCA_SOURCES_DIR"),
                                    clean_split(d, "SCA_REVIVE_FILE_FILTER"),
                                    sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    ## Run
    cmd_output = exec_wrap_check_output(d, _args, _files)
    with open(sca_raw_result_file(d, "revive"), "w") as o:
        o.write(cmd_output)
}

python do_sca_revive_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/revive.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_revive(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "revive", get_fatal_entries(d, "SCA_REVIVE_EXTRA_FATAL",
                       d.expand("${STAGING_DATADIR_NATIVE}/revive-${SCA_MODE}-fatal")))
}

do_sca_revive[doc] = "Lint go code with revive"
do_sca_revive_report[doc] = "Report findings of do_sca_revive"
addtask do_sca_revive after do_configure before do_sca_tracefiles
addtask do_sca_revive_report after do_sca_tracefiles before do_sca_deploy

DEPENDS += "revive-sca-native sca-recipe-revive-rules-native"
