## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_BASHATE_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_BASHATE_EXTRA_FATAL ?= ""

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-license-filter
inherit sca-suppress
inherit sca-image-backtrack

SCA_RAW_RESULT_FILE[bashate] = "txt"

def do_sca_conv_bashate(d):
    import os
    import re

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^(?P<file>.*):(?P<line>\d+):(?P<col>\d+):\s*(?P<severity>E|W)(?P<id>\d+)\s+(?P<msg>.*)"

    severity_map = {
        "001" : "warning",
        "002" : "info",
        "003" : "info",
        "004" : "warning",
        "005" : "error",
        "006" : "info",
        "010" : "warning",
        "011" : "warning",
        "012" : "error",
        "020" : "error",
        "040" : "error",
        "041" : "warning",
        "042" : "error",
        "043" : "error",
        "044" : "error"
    }

    _findings = []
    _suppress = sca_suppress_init(d, "SCA_BASHATE_EXTRA_SUPPRESS",
                                  d.expand("${STAGING_DATADIR_NATIVE}/bashate-${SCA_MODE}-suppress"))

    if os.path.exists(sca_raw_result_file(d, "bashate")):
        with open(sca_raw_result_file(d, "bashate"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    if severity_map[m.group("id")] not in sca_allowed_warning_level(d):
                        continue
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="bashate",
                                            BuildPath=buildpath,
                                            File=m.group("file"),
                                            Line=m.group("line"),
                                            Column=m.group("col"),
                                            Message=m.group("msg"),
                                            ID=m.group("id"),
                                            Severity=severity_map[m.group("id")])
                    if _suppress.Suppressed(g):
                        continue
                    if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                        continue
                    _findings += sca_backtrack_findings(d, g)
                except Exception as exp:
                    sca_log_note(d, str(exp))
    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_bashate_core() {
    import os
    import subprocess

    _args = ["bashate"]

    _files = get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), ".*/(ba|k)*sh", ".sh",
                                                sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    ## Run
    cmd_output = exec_wrap_check_output(d, _args, _files)

    with open(sca_raw_result_file(d, "bashate"), "w") as o:
        o.write(cmd_output)
}

python do_sca_bashate_core_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/bashate.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_bashate(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "bashate", get_fatal_entries(d, "SCA_BASHATE_EXTRA_FATAL",
                        d.expand("${STAGING_DATADIR_NATIVE}/bashate-${SCA_MODE}-fatal")))
}

DEPENDS += "python3-bashate-native"
