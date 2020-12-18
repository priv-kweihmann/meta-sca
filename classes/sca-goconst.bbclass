## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2020, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_GOCONST_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_GOCONST_EXTRA_FATAL ?= ""
## Extra arguments to goconst
SCA_GOCONST_EXTRA_ARGS ?= "-numbers"

SCA_RAW_RESULT_FILE[goconst] = "txt"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress
inherit sca-image-backtrack
inherit sca-tracefiles

def do_sca_conv_goconst(d):
    import os
    import re
    import hashlib

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    items = []
    pattern = r"^(?P<file>.*):(?P<line>\d+):(?P<col>\d+):\s*(?P<msg>.*)\sfound\sin.*"

    _excludes = sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA"))

    _suppress = sca_suppress_init(d, "SCA_GOCONST_EXTRA_SUPPRESS",
                                  d.expand("${STAGING_DATADIR_NATIVE}/goconst-${SCA_MODE}-suppress"))
    _findings = []

    if os.path.exists(sca_raw_result_file(d, "goconst")):
        with open(sca_raw_result_file(d, "goconst"), "r") as f:
            content = f.read()
            for m in re.finditer(pattern, content, re.MULTILINE):
                if m.group("file") in _excludes:
                    continue
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="goconst",
                                            BuildPath=buildpath,
                                            File=m.group("file"),
                                            Column=m.group("col"),
                                            Line=m.group("line"),
                                            Message=m.group("msg"),
                                            ID="couldbeconst",
                                            Severity="warning")
                    if _suppress.Suppressed(g):
                        continue
                    if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                        continue
                    if g.Severity in sca_allowed_warning_level(d):
                        _findings += sca_backtrack_findings(d, g)
                except Exception as e:
                    bb.note(str(e))
    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_goconst() {
    import os
    import subprocess

    _args = ["goconst"]
    _args += clean_split(d, "SCA_GOCONST_EXTRA_ARGS")

    _files = get_files_by_extention(d,
                                    d.getVar("SCA_SOURCES_DIR"),
                                    clean_split(d, "SCA_GOCONST_FILE_FILTER"),
                                    sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    cmd_output = exec_wrap_check_output(_args, [d.getVar("SCA_SOURCES_DIR")])

    with open(sca_raw_result_file(d, "goconst"), "w") as o:
        o.write(cmd_output)
}

python do_sca_goconst_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/goconst.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_goconst(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "goconst", get_fatal_entries(d, "SCA_GOCONST_EXTRA_FATAL",
                        d.expand("${STAGING_DATADIR_NATIVE}/goconst-${SCA_MODE}-fatal")))
}

do_sca_goconst[doc] = "Lint go files with goconst"
do_sca_goconst_report[doc] = "Report findings of do_sca_goconst"
addtask do_sca_goconst after do_configure before do_sca_tracefiles
addtask do_sca_goconst_report after do_sca_tracefiles before do_sca_deploy

DEPENDS += "goconst-sca-native sca-recipe-goconst-rules-native"
