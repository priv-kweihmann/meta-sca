## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_CHECKBASHISM_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_CHECKBASHISM_EXTRA_FATAL ?= ""

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-license-filter
inherit sca-suppress

SCA_RAW_RESULT_FILE[checkbashism] = "txt"

def do_sca_conv_checkbashism(d):
    import os
    import re
    import hashlib

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^possible\sbashism\sin\s(?P<file>.*)\sline\s(?P<line>\d+)\s\((?P<id>.*)\)"

    __suppress = sca_suppress_init(d, "SCA_CHECKBASHISM_EXTRA_SUPPRESS",
                                   d.expand("${STAGING_DATADIR_NATIVE}/checkbashism-${SCA_MODE}-suppress"))
    _findings = []
    if os.path.exists(sca_raw_result_file(d, "checkbashism")):
        with open(sca_raw_result_file(d, "checkbashism"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    ## This tool does not have explicit IDs
                    ## so we are creating one from the hash of the message
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="checkbashism",
                                            BuildPath=buildpath,
                                            File=m.group("file"),
                                            Line=m.group("line"),
                                            Message=m.group("id"),
                                            ID=hashlib.md5(str.encode(m.group("id"))).hexdigest(),
                                            Severity="warning")
                    if __suppress.Suppressed(g):
                        continue
                    if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                        continue
                    if g.Severity in sca_allowed_warning_level(d):
                        _findings.append(g)
                except Exception as exp:
                    bb.warn(str(exp))

    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_checkbashism_core() {
    import os
    import subprocess

    _args = ["checkbashisms.pl"]
    _args += ["-n", "-p"]

    _files = get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), ".*/(ba|k)*sh", ".sh",
                                                sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    ## Run
    cmd_output = exec_wrap_check_output(_args, _files)
    with open(sca_raw_result_file(d, "checkbashism"), "w") as o:
        o.write(cmd_output)
}

python do_sca_checkbashism_core_report() {
    import os

    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/checkbashism.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_checkbashism(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "checkbashism", get_fatal_entries(d, "SCA_CHECKBASHISM_EXTRA_FATAL",
                        d.expand("${STAGING_DATADIR_NATIVE}/checkbashism-${SCA_MODE}-fatal")))
}

DEPENDS += "checkbashism-native"
