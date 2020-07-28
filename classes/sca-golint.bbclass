## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_GOLINT_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_GOLINT_EXTRA_FATAL ?= ""
## File extension filter list (whitespace separated)
SCA_GOLINT_FILE_FILTER ?= ".go"

SCA_RAW_RESULT_FILE[golint] = "txt"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress
inherit sca-tracefiles

def do_sca_conv_golint(d):
    import os
    import re
    import hashlib
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    items = []
    pattern = r"^(?P<file>.*):(?P<line>\d+):(?P<col>\d+):\s*(?P<msg>.*)"

    _suppress = sca_suppress_init(d, "SCA_GOLINT_EXTRA_SUPPRESS",
                                  d.expand("${STAGING_DATADIR_NATIVE}/golint-${SCA_MODE}-suppress"))
    _findings = []

    if os.path.exists(sca_raw_result_file(d, "golint")):
        with open(sca_raw_result_file(d, "golint"), "r") as f:
            content = f.read()
            for m in re.finditer(pattern, content, re.MULTILINE):
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="golint",
                                            BuildPath=buildpath,
                                            File=m.group("file"),
                                            Column=m.group("col"),
                                            Line=m.group("line"),
                                            Message=m.group("msg"),
                                            ID=hashlib.md5(str.encode(m.group("msg"))).hexdigest(),
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

python do_sca_golint() {
    import os
    import subprocess

    _args = ["golint"]

    cmd_output = ""

    _files = get_files_by_extention(d,    
                                    d.getVar("SCA_SOURCES_DIR"),    
                                    clean_split(d, "SCA_GOLINT_FILE_FILTER"),    
                                    sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    ## Run
    if any(_files):
        try:
            cmd_output = subprocess.check_output(_args + _files, universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            cmd_output = e.stdout or ""
    with open(sca_raw_result_file(d, "golint"), "w") as o:
        o.write(cmd_output)
}

python do_sca_golint_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/golint.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_golint(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "golint", get_fatal_entries(d, "SCA_GOLINT_EXTRA_FATAL",
                        d.expand("${STAGING_DATADIR_NATIVE}/golint-${SCA_MODE}-fatal")))
}

SCA_DEPLOY_TASK = "do_sca_deploy_golint"

python do_sca_deploy_golint() {
    sca_conv_deploy(d, "golint")
}

do_sca_golint[doc] = "Lint go files with golint"
do_sca_golint_report[doc] = "Report findings of do_sca_golint"
do_sca_deploy_golint[doc] = "Deploy results of do_sca_golint"
addtask do_sca_golint after do_configure before do_sca_tracefiles 
addtask do_sca_golint_report after do_sca_tracefiles
addtask do_sca_deploy_golint after do_sca_golint_report before do_package

DEPENDS += "golint-sca-native sca-recipe-golint-rules-native"
