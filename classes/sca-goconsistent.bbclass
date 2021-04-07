## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2021, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_GOCONSISTENT_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_GOCONSISTENT_EXTRA_FATAL ?= ""

SCA_RAW_RESULT_FILE[goconsistent] = "txt"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress
inherit sca-image-backtrack
inherit sca-tracefiles

def do_sca_conv_goconsistent(d):
    import os
    import re
    import hashlib

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    items = []
    pattern = r"^(?P<file>.*):(?P<line>\d+):(?P<col>\d+):\s*(?P<msg>.*)"

    _excludes = sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA"))

    _suppress = sca_suppress_init(d, "SCA_GOCONSISTENT_EXTRA_SUPPRESS",
                                  d.expand("${STAGING_DATADIR_NATIVE}/goconsistent-${SCA_MODE}-suppress"))
    _findings = []

    if os.path.exists(sca_raw_result_file(d, "goconsistent")):
        with open(sca_raw_result_file(d, "goconsistent"), "r") as f:
            content = f.read()
            for m in re.finditer(pattern, content, re.MULTILINE):
                if m.group("file") in _excludes or not m.group("file").startswith(buildpath):
                    continue
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="goconsistent",
                                            BuildPath=buildpath,
                                            File=m.group("file"),
                                            Column=m.group("col"),
                                            Line=m.group("line"),
                                            Message=m.group("msg"),
                                            ID=hashlib.md5(str.encode(m.group("msg"))).hexdigest(),
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

python do_sca_goconsistent() {
    import os
    import subprocess

    _args = ["go-consistent", "-pedantic"]

    _files = get_files_by_extention(d,
                                    d.getVar("SCA_SOURCES_DIR"),
                                    clean_split(d, "SCA_GOCONSISTENT_FILE_FILTER"),
                                    sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    cmd_output = exec_wrap_check_output(d, _args, _files)

    with open(sca_raw_result_file(d, "goconsistent"), "w") as o:
        o.write(cmd_output)
}

python do_sca_goconsistent_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/goconsistent.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_goconsistent(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "goconsistent", get_fatal_entries(d, "SCA_GOCONSISTENT_EXTRA_FATAL",
                        d.expand("${STAGING_DATADIR_NATIVE}/goconsistent-${SCA_MODE}-fatal")))
}

do_sca_goconsistent[doc] = "Lint go files with goconsistent"
do_sca_goconsistent_report[doc] = "Report findings of do_sca_goconsistent"
addtask do_sca_goconsistent after do_configure before do_sca_tracefiles
addtask do_sca_goconsistent_report after do_sca_tracefiles before do_sca_deploy

DEPENDS += "goconsistent-sca-native sca-recipe-goconsistent-rules-native"
