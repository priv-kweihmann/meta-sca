## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_ALEXKOHLER_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_ALEXKOHLER_EXTRA_FATAL ?= ""
## File extension filter list (whitespace separated)
SCA_ALEXKOHLER_FILE_FILTER ?= ".go"
SCA_ALEXKOHLER_MODULES ?= "noret nargs nakedret dogsled prealloc identypo unimport"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress
inherit sca-tracefiles

SCA_RAW_RESULT_FILE[alexkohler] = "txt"

def do_sca_conv_alexkohler(d):
    import os
    import re
    import hashlib

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    items = []
    pattern = r"^\[(?P<id>.*)\]\s+(?P<file>.*):(?P<line>\d+)\s+(?P<msg>.*)"

    _suppress = sca_suppress_init(d, "SCA_ALEXKOHLER_EXTRA_SUPPRESS",
                                  d.expand("${STAGING_DATADIR_NATIVE}/alexkohler-${SCA_MODE}-suppress"))
    _findings = []

    if os.path.exists(sca_raw_result_file(d, "alexkohler")):
        with open(sca_raw_result_file(d, "alexkohler"), "r") as f:
            content = f.read()
            for m in re.finditer(pattern, content, re.MULTILINE):
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="alexkohler",
                                            BuildPath=buildpath,
                                            File=m.group("file"),
                                            Line=m.group("line"),
                                            Message=m.group("msg"),
                                            ID=m.group("id"),
                                            Severity="warning")
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

def exec_wrap_combine_txt_alexkohler(a, b, **kwargs):
    b = b.replace("[", "\n[")
    lines = [x.strip() for x in b.split("\n") if x and not x.startswith("running on package")]
    lines = ["[{}] {}".format(kwargs["mod"], x) for x in lines]
    return a + "\n".join(lines) + "\n"

python do_sca_alexkohler() {
    import os
    import subprocess

    cmd_output = ""

    _files = get_files_by_extention(d,
                                    d.getVar("SCA_SOURCES_DIR"),
                                    clean_split(d, "SCA_ALEXKOHLER_FILE_FILTER"),
                                    sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    ## Run
    cmd_output = ""
    if any(_files):
        for mod in clean_split(d, "SCA_ALEXKOHLER_MODULES"):
            cmd_output += exec_wrap_check_output([mod], _files, combine=exec_wrap_combine_txt_alexkohler, mod=mod)
    with open(sca_raw_result_file(d, "alexkohler"), "w") as o:
        o.write(cmd_output)
}

python do_sca_alexkohler_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/alexkohler.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_alexkohler(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "alexkohler", get_fatal_entries(d, "SCA_ALEXKOHLER_EXTRA_FATAL",
                       d.expand("${STAGING_DATADIR_NATIVE}/alexkohler-${SCA_MODE}-fatal")))
}

SCA_DEPLOY_TASK = "do_sca_deploy_alexkohler"

python do_sca_deploy_alexkohler() {
    sca_conv_deploy(d, "alexkohler")
}

do_sca_alexkohler[doc] = "Lint go files with alex kohler tools"
do_sca_alexkohler_report[doc] = "Report findings from do_sca_alexkohler"
do_sca_deploy_alexkohler[doc] = "Deploy results of do_sca_alexkohler"
addtask do_sca_alexkohler after do_configure before do_sca_tracefiles
addtask do_sca_alexkohler_report after do_sca_tracefiles
addtask do_sca_deploy_alexkohler after do_sca_alexkohler_report before do_package

DEPENDS += "alexkohler-native sca-recipe-alexkohler-rules-native"
