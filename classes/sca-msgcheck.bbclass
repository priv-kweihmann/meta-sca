## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_MSGCHECK_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_MSGCHECK_EXTRA_FATAL ?= ""

SCA_RAW_RESULT_FILE[msgcheck] = "txt"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-file-filter
inherit sca-suppress

inherit python3native

def do_sca_conv_msgcheck(d):
    import os
    import re

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    items = []
    pattern = r"^(?P<file>.*):(?P<line>\d+):(\s+(?P<severity>warning|error):\s|\s+\[(?P<id>.*)\]\s+|\s+)(?P<msg>.*)"

    __suppress = sca_suppress_init(d, "SCA_MSGCHECK_EXTRA_SUPPRESS",
                                   d.expand("${STAGING_DATADIR_NATIVE}/msgcheck-${SCA_MODE}-suppress"),
                                   file_trace=False)
    _findings = []

    if os.path.exists(sca_raw_result_file(d, "msgcheck")):
        with open(sca_raw_result_file(d, "msgcheck"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                _id = m.group("id")
                _sev = m.group("severity")
                if _id and not _sev:
                    _sev = "warning"
                elif not _sev:
                    _sev = "warning"
                elif not _id:
                    _id = "compile"
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="msgcheck",
                                            BuildPath=buildpath,
                                            File=m.group("file"),
                                            Line=m.group("line"),
                                            Message=m.group("msg"),
                                            ID=_id,
                                            Severity=_sev)
                    if __suppress.Suppressed(g):
                        continue
                    if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                        continue
                    if g.Severity in sca_allowed_warning_level(d):
                        _findings.append(g)
                except Exception as exp:
                    bb.note(str(exp))

    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_msgcheck() {
    import os
    import subprocess

    cmd_output = ""
    _args = ["msgcheck"]

    _files = get_files_by_extention(d, d.getVar("SCA_SOURCES_DIR"), ".po", \
        sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))
    for f in _files:
        cmd_output += exec_wrap_check_output(_args, [f])
        cmd_output += exec_wrap_check_output(_args, ["-c", f])

    with open(sca_raw_result_file(d, "msgcheck"), "w") as o:
        o.write(cmd_output)

    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/msgcheck.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_msgcheck(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "msgcheck", get_fatal_entries(d, "SCA_MSGCHECK_EXTRA_FATAL",
                        d.expand("${STAGING_DATADIR_NATIVE}/msgcheck-${SCA_MODE}-fatal")))
}

do_sca_msgcheck[doc] = "Lint i18n files"
addtask do_sca_msgcheck after do_configure before do_sca_deploy

DEPENDS += "python3-msgcheck-native sca-recipe-msgcheck-rules-native"
