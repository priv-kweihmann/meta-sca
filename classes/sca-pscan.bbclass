## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_PSCAN_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_PSCAN_EXTRA_FATAL ?= ""
## File extension filter list (whitespace separated)
SCA_PSCAN_FILE_FILTER ?= ".c"

SCA_RAW_RESULT_FILE[pscan] = "txt"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress
inherit sca-tracefiles

def do_sca_conv_pscan(d):
    import os
    import re

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    items = []
    pattern = r"^(?P<file>.*):(?P<line>\d+)\s+(?P<severity>.*):\s(?P<msg>.*)"

    severity_map = {
        "SECURITY" : "error",
        "Warning" : "warning"
    }

    _suppress = sca_suppress_init(d, "SCA_PSCAN_EXTRA_SUPPRESS",
                                  d.expand("${STAGING_DATADIR_NATIVE}/pscan-${SCA_MODE}-suppress"))
    _findings = []

    if os.path.exists(sca_raw_result_file(d, "pscan")):
        with open(sca_raw_result_file(d, "pscan"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    _id = "NonConstantString"
                    if m.group("severity"):
                        _id = "InsecurePrintf"
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="pscan",
                                            BuildPath=buildpath,
                                            File=m.group("file"),
                                            Line=m.group("line"),
                                            Message=m.group("msg"),
                                            ID=_id,
                                            Severity=severity_map[m.group("severity").strip()])
                    if _suppress.Suppressed(g):
                        continue
                    if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                        continue
                    if g.Severity in sca_allowed_warning_level(d):
                        _findings.append(g)
                except Exception:
                    pass
    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_pscan() {
    import os
    import subprocess

    _args = ["pscan"]
    _args += ["-w"]
    _files = get_files_by_extention(d,
                                    d.getVar("SCA_SOURCES_DIR"),
                                    clean_split(d, "SCA_PSCAN_FILE_FILTER"),
                                    sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    ## Run
    cmd_output = exec_wrap_check_output(_args, _files)

    with open(sca_raw_result_file(d, "pscan"), "w") as o:
        o.write(cmd_output)
}

python do_sca_pscan_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/pscan.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_pscan(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "pscan", get_fatal_entries(d, "SCA_PSCAN_EXTRA_FATAL",
                        d.expand("${STAGING_DATADIR_NATIVE}/pscan-${SCA_MODE}-fatal")))
}

SCA_DEPLOY_TASK = "do_sca_deploy_pscan"

python do_sca_deploy_pscan() {
    sca_conv_deploy(d, "pscan")
}

do_sca_pscan[doc] = "Lint (s|v|f)print usage in c files"
do_sca_pscan_report[doc] = "Report findings of do_sca_pscan"
do_sca_deploy_pscan[doc] = "Deploy results of do_sca_pscan"
addtask do_sca_pscan after do_compile before do_sca_tracefiles
addtask do_sca_pscan_report after do_sca_tracefiles
addtask do_sca_deploy_pscan after do_sca_pscan_report before do_package

DEPENDS += "pscan-native sca-recipe-pscan-rules-native"
