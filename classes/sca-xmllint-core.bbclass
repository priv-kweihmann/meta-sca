## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

SCA_XMLLINT_EXTRA_SUPPRESS ?= ""
SCA_XMLLINT_EXTRA_FATAL ?= ""
## File extension filter list (whitespace separated)
SCA_XMLLINT_FILE_FILTER ?= ".xml"

SCA_RAW_RESULT_FILE[xmllint] = "txt"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-license-filter
inherit sca-suppress

DEPENDS += "libxml2-native"

def do_sca_conv_xmllint(d):
    import os
    import re

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^(?P<file>.*):(?P<line>\d+):\s+(?P<id>.*)\s+error\s+:\s+(?P<msg>.*)"

    _suppress = sca_suppress_init(d, "SCA_XMLLINT_EXTRA_SUPPRESS",
                                  d.expand("${STAGING_DATADIR_NATIVE}/xmllint-${SCA_MODE}-suppress"))
    _findings = []

    if os.path.exists(sca_raw_result_file(d, "xmllint")):
        with open(sca_raw_result_file(d, "xmllint"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="xmllint",
                                            File=m.group("file"),
                                            BuildPath=buildpath,
                                            Line=m.group("line"),
                                            Message=m.group("msg"),
                                            ID=m.group("id"),
                                            Severity="error")
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

python do_sca_xmllint_core() {
    import os
    import subprocess

    _args = ["xmllint"]
    _args += ["--noout"]
    _args += ["--valid"]

    _files = get_files_by_extention(d, d.getVar("SCA_SOURCES_DIR"), d.getVar("SCA_XMLLINT_FILE_FILTER"), \
                                    sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    cmd_output = exec_wrap_check_output(_args, _files)

    with open(sca_raw_result_file(d, "xmllint"), "w") as o:
        o.write(cmd_output)
}

python do_sca_xmllint_core_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/xmllint.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_xmllint(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "xmllint", get_fatal_entries(d, "SCA_XMLLINT_EXTRA_FATAL",
                       d.expand("${STAGING_DATADIR_NATIVE}/xmllint-${SCA_MODE}-fatal")))
}
