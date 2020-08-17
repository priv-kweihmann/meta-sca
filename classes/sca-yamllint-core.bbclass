## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

SCA_YAMLLINT_EXTRA_SUPPRESS ?= ""
SCA_YAMLLINT_EXTRA_FATAL ?= ""
## File extension filter list (whitespace separated)
SCA_YAMLLINT_FILE_FILTER ?= ".yaml"

SCA_RAW_RESULT_FILE[yamllint] = "txt"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-license-filter
inherit sca-suppress

inherit python3native

DEPENDS += "python3-yamllint-native"

def do_sca_conv_yamllint(d):
    import os
    import re

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^(?P<file>.*):(?P<line>\d+):(?P<column>\d+):\s+\[(?P<severity>\w+)\]\s+(?P<msg>.*)\s\((?P<id>.*)\)"

    severity_map = {
        "error" : "error",
        "warning" : "warning",
    }

    _suppress = sca_suppress_init(d, "SCA_YAMLLINT_EXTRA_SUPPRESS",
                                  d.expand("${STAGING_DATADIR_NATIVE}/yamllint-${SCA_MODE}-suppress"))
    _findings = []

    if os.path.exists(sca_raw_result_file(d, "yamllint")):
        with open(sca_raw_result_file(d, "yamllint"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="yamllint",
                                            BuildPath=buildpath,
                                            File=m.group("file"),
                                            Column=m.group("column"),
                                            Line=m.group("line"),
                                            Message=m.group("msg"),
                                            ID=m.group("id"),
                                            Severity=severity_map[m.group("severity")])
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

python do_sca_yamllint_core() {
    import os
    import subprocess
    import json

    _args = ["yamllint"]
    _args += ["-f", "parsable"]

    _files = get_files_by_extention(d, d.getVar("SCA_SOURCES_DIR"), d.getVar("SCA_YAMLLINT_FILE_FILTER"), \
                                    sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    cmd_output = exec_wrap_check_output(_args, _files)

    with open(sca_raw_result_file(d, "yamllint"), "w") as o:
        o.write(cmd_output)
}

python do_sca_yamllint_core_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/yamllint.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_yamllint(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "yamllint", get_fatal_entries(d, "SCA_YAMLLINT_EXTRA_FATAL",
                       d.expand("${STAGING_DATADIR_NATIVE}/yamllint-${SCA_MODE}-fatal")))
}
