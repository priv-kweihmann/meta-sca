## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_CPPLINT_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_CPPLINT_EXTRA_FATAL ?= ""
## File extension filter list (whitespace separated)
SCA_CPPLINT_FILE_FILTER ?= ".c .cpp .h .hpp"

SCA_RAW_RESULT_FILE[cpplint] = "txt"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress
inherit sca-tracefiles

def do_sca_conv_cpplint(d):
    import os
    import re

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    items = []

    severity_map = {
        "5" : "warning",
        "4" : "warning",
        "3" : "info",
        "2" : "info",
        "1" : "ignore"
    }
    pattern = r"^(?P<file>.*):(?P<line>\d+):\s+(?P<message>.*)\s+\[(?P<id>.*)\]\s+\[(?P<severity>\d)\]"
    _findings = []
    _suppress = sca_suppress_init(d, "SCA_CPPLINT_EXTRA_SUPPRESS",
                                  d.expand("${STAGING_DATADIR_NATIVE}/cpplint-${SCA_MODE}-suppress"))

    if os.path.exists(sca_raw_result_file(d, "cpplint")):
        with open(sca_raw_result_file(d, "cpplint"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    g = sca_get_model_class(d,
                                        PackageName=package_name,
                                        Tool="cpplint",
                                        BuildPath=buildpath,
                                        File=m.group("file"),
                                        Line=str(int(m.group("line")) + 1),
                                        Message=m.group("message"),
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

do_sca_cpplint[vardepsexclude] += "BB_NUMBER_THREADS"
python do_sca_cpplint() {
    import os
    import subprocess

    os.environ["OTMP"] = d.getVar("T")
    _args = ["cpplint-multi"]
    _args += ["--jobs={}".format(d.getVar("BB_NUMBER_THREADS"))]
    _args += ["--output=emacs"]
    _args += ["--quiet"]
    _args += ["--root={}".format(d.getVar("B", True))]

    _files = get_files_by_extention(d,
                                    d.getVar("SCA_SOURCES_DIR"),
                                    clean_split(d, "SCA_CPPLINT_FILE_FILTER"),
                                    sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))
    ## Run
    cmd_output = exec_wrap_check_output(_args, _files)

    with open(sca_raw_result_file(d, "cpplint"), "w") as o:
        o.write(cmd_output)
}

python do_sca_cpplint_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/cpplint.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_cpplint(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "cpplint", get_fatal_entries(d, "SCA_CPPLINT_EXTRA_FATAL",
                        d.expand("${STAGING_DATADIR_NATIVE}/cpplint-${SCA_MODE}-fatal")))
}

SCA_DEPLOY_TASK = "do_sca_deploy_cpplint"

python do_sca_deploy_cpplint() {
    sca_conv_deploy(d, "cpplint")
}

do_sca_cpplint[doc] = "Lint C/C++ files with cpplint"
do_sca_cpplint_report[doc] = "Report findings of do_sca_cpplint"
do_sca_deploy_cpplint[doc] = "Deploy results of do_sca_cpplint"
addtask do_sca_cpplint after do_compile before do_sca_tracefiles
addtask do_sca_cpplint_report after do_sca_tracefiles
addtask do_sca_deploy_cpplint after do_sca_cpplint_report before do_package

DEPENDS += "cpplint-native sca-recipe-cpplint-rules-native"
