## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

SCA_HTMLHINT_EXTRA_SUPPRESS ?= ""
SCA_HTMLHINT_EXTRA_FATAL ?= ""

SCA_RAW_RESULT_FILE[htmlhint] = "txt"

DEPENDS += "htmlhint-native"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-helper
inherit sca-license-filter
inherit sca-suppress

def do_sca_conv_htmlhint(d):
    import os
    import re
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    items = []

    __excludes = sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA"))
    _suppress = sca_suppress_init(d, "SCA_HTMLHINT_EXTRA_SUPPRESS",
                                    d.expand("${STAGING_DATADIR_NATIVE}/htmlhint-${SCA_MODE}-suppress"))
    _findings = []

    pattern = r"^(?P<file>.*):(?P<line>\d+):(?P<col>\d+):\s*(?P<msg>.*)\s+\[(?P<rawseverity>.+)\]"

    if os.path.exists(sca_raw_result_file(d, "htmlhint")):
        with open(sca_raw_result_file(d, "htmlhint"), "r") as f:
            content = f.read()
            for m in re.finditer(pattern, content, re.MULTILINE):
                try:
                    _sev, _id = m.group("rawseverity").split("/")
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="htmlhint",
                                            BuildPath=buildpath,
                                            File=m.group("file"),
                                            Column=m.group("col"),
                                            Line=m.group("line"),
                                            Message=m.group("msg"),
                                            ID=_id,
                                            Severity=_sev)
                    if _suppress.Suppressed(g):
                        continue
                    if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                        continue
                    if g.Severity in sca_allowed_warning_level(d):
                        _findings.append(g)
                except Exception as e:
                    bb.warn(str(e))

    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_htmlhint_core() {
    import os
    import subprocess
    import json

    _args = ["htmlhint"]
    _args += ["-f", "unix"]

    cmd_output = exec_wrap_check_output(_args, [d.getVar("SCA_SOURCES_DIR") + "/"])
    
    with open(sca_raw_result_file(d, "htmlhint"), "w") as o:
        o.write(cmd_output)
}

python do_sca_htmlhint_core_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/htmlhint.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_htmlhint(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "htmlhint", get_fatal_entries(d, "SCA_HTMLHINT_EXTRA_FATAL",
                        d.expand("${STAGING_DATADIR_NATIVE}/htmlhint-${SCA_MODE}-fatal")))
}
