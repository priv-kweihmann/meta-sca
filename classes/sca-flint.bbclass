## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_FLINT_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_FLINT_EXTRA_FATAL ?= ""
## File extension filter list (whitespace separated)
SCA_FLINT_FILE_FILTER ?= ".c .cpp .h .hpp"

SCA_RAW_RESULT_FILE[flint] = "txt"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress
inherit sca-tracefiles

def do_sca_conv_flint(d):
    import os
    import re
    import hashlib
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    items = []
    pattern = r"^\[(?P<severity>.*)\s+\]\s+(?P<file>.*):(?P<line>\d+):\s+(?P<msg>.*)"

    severity_map = {
        "Error" : "error",
        "Warning" : "warning",
        "Advice" : "info"
    }

    _suppress = sca_suppress_init(d, "SCA_FLINT_EXTRA_SUPPRESS", 
                                  d.expand("${STAGING_DATADIR_NATIVE}/flint-${SCA_MODE}-suppress"))
    _findings = []

    if os.path.exists(sca_raw_result_file(d, "flint")):
        with open(sca_raw_result_file(d, "flint"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="flint",
                                            BuildPath=buildpath,
                                            File=m.group("file"),
                                            Line=m.group("line"),
                                            Message=m.group("msg"),
                                            ID=hashlib.md5(str.encode(m.group("msg"))).hexdigest(),
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

python do_sca_flint() {
    import os
    import subprocess

    _args = ["flint++"]
    _args += ["-r"]
    _args += ["-l", "3"]
    _args += ["-v"]
    _files = get_files_by_extention(d,    
                                    d.getVar("SCA_SOURCES_DIR"),    
                                    clean_split(d, "SCA_FLINT_FILE_FILTER"),    
                                    sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    ## Run
    cur_dir = os.getcwd()
    os.chdir(d.getVar("B", True))

    cmd_output = exec_wrap_check_output(_args, _files)
    
    with open(sca_raw_result_file(d, "flint"), "w") as o:
        o.write(cmd_output)
    os.chdir(cur_dir)
}

python do_sca_flint_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/flint.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_flint(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "flint", get_fatal_entries(d, "SCA_FLINT_EXTRA_FATAL",
                        d.expand("${STAGING_DATADIR_NATIVE}/flint-${SCA_MODE}-fatal")))
}

SCA_DEPLOY_TASK = "do_sca_deploy_flint"

python do_sca_deploy_flint() {
    sca_conv_deploy(d, "flint")
}

do_sca_flint[doc] = "Lint C/C++ files with flint++"
do_sca_flint_report[doc] = "Report findings of do_sca_flint"
do_sca_deploy_flint[doc] = "Deploy results of do_sca_flint"
addtask do_sca_flint after do_compile before do_sca_tracefiles
addtask do_sca_flint_report after do_sca_tracefiles
addtask do_sca_deploy_flint after do_sca_flint_report before do_package

DEPENDS += "flint++-native sca-recipe-flint-rules-native"
