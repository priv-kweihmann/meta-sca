## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_FLAWFINDER_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_FLAWFINDER_EXTRA_FATAL ?= ""
## File extension filter list (whitespace separated)
SCA_FLAWFINDER_FILE_FILTER ?= ".c .cpp .h .hpp"

SCA_RAW_RESULT_FILE[flawfinder] = "txt"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress
inherit sca-tracefiles

def do_sca_conv_flawfinder(d):
    import os
    import re
    import hashlib

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    items = []
    pattern = r"^(?P<file>.*):(?P<line>\d+):\s+\[(?P<severity>\d+)\]\s+\(.*\)\s+(?P<id>.*?):(?P<msg>.*)"

    severity_map = {
        "5" : "error",
        "4" : "error",
        "3" : "warning",
        "2" : "warning",
        "1" : "info"
    }

    _suppress = sca_suppress_init(d, "SCA_FLAWFINDER_EXTRA_SUPPRESS",
                                  d.expand("${STAGING_DATADIR_NATIVE}/flawfinder-${SCA_MODE}-suppress"))
    _findings = []

    if os.path.exists(sca_raw_result_file(d, "flawfinder")):
        with open(sca_raw_result_file(d, "flawfinder"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="flawfinder",
                                            BuildPath=buildpath,
                                            File=m.group("file"),
                                            Line=m.group("line"),
                                            Message=m.group("msg"),
                                            ID=m.group("id"),
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

python do_sca_flawfinder() {
    import os
    import subprocess

    _args = ["flawfinder"]
    _args += ["--dataonly"]
    _args += ["--quiet"]
    _args += ["--singleline"]
    _files = get_files_by_extention(d,
                                    d.getVar("SCA_SOURCES_DIR"),
                                    clean_split(d, "SCA_FLAWFINDER_FILE_FILTER"),
                                    sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    ## Run
    cmd_output = exec_wrap_check_output(_args, _files)

    with open(sca_raw_result_file(d, "flawfinder"), "w") as o:
        o.write(cmd_output)
}

python do_sca_flawfinder_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/flawfinder.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_flawfinder(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "flawfinder", get_fatal_entries(d, "SCA_FLAWFINDER_EXTRA_FATAL",
                        d.expand("${STAGING_DATADIR_NATIVE}/flawfinder-${SCA_MODE}-fatal")))
}

SCA_DEPLOY_TASK = "do_sca_deploy_flawfinder"

python do_sca_deploy_flawfinder() {
    sca_conv_deploy(d, "flawfinder")
}

do_sca_flawfinder[doc] = "Find insecure C/C++ code"
do_sca_flawfinder_report[doc] = "Report findings of do_sca_flawfinder"
do_sca_deploy_flawfinder[doc] = "Deploy results of do_sca_flawfinder"
addtask do_sca_flawfinder after do_compile before do_sca_tracefiles
addtask do_sca_flawfinder_report after do_sca_tracefiles
addtask do_sca_deploy_flawfinder after do_sca_flawfinder_report before do_package

DEPENDS += "python3-flawfinder-native sca-recipe-flawfinder-rules-native"
