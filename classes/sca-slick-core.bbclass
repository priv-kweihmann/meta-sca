## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_SLICK_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_SLICK_EXTRA_FATAL ?= ""

SCA_RAW_RESULT_FILE[slick] = "txt"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-license-filter
inherit sca-suppress

def do_sca_conv_slick(d):
    import os
    import re
    import hashlib
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^(\d+|/|\s|:)*\s+(?P<file>.*):(?P<line>\d+):(?P<col>\d+):\s+(?P<msg>.*)"

    _findings = []
    _suppress = sca_suppress_init(d, "SCA_SLICK_EXTRA_SUPPRESS",
                                  d.expand("${STAGING_DATADIR_NATIVE}/slick-${SCA_MODE}-suppress"))

    if os.path.exists(sca_raw_result_file(d, "slick")):
        with open(sca_raw_result_file(d, "slick"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="slick",
                                            BuildPath=buildpath,
                                            File=m.group("file"),
                                            Line=m.group("line"),
                                            Column=m.group("col"),
                                            Message=m.group("msg"),
                                            ID=hashlib.md5(str.encode(m.group("msg"))).hexdigest(),
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

python do_sca_slick_core() {
    import os
    import subprocess

    _args = ["slick", "-n"]

    _files = get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), ".*/(ba|k|mk)*sh", ".sh",
                                                    sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))
    
    ## Run
    cmd_output = exec_wrap_check_output(_args, _files)
    with open(sca_raw_result_file(d, "slick"), "w") as o:
        o.write(cmd_output)
}

python do_sca_slick_core_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/slick.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_slick(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "slick", get_fatal_entries(d, "SCA_SLICK_EXTRA_FATAL",
                       d.expand("${STAGING_DATADIR_NATIVE}/slick-${SCA_MODE}-fatal")))
}

DEPENDS += "slick-native"
