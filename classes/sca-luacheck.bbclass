## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_LUACHECK_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_LUACHECK_EXTRA_FATAL ?= ""

SCA_RAW_RESULT_FILE[luacheck] = "txt"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress
inherit sca-tracefiles

def do_sca_conv_luacheck(d):
    import os
    import re
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^(?P<file>.*):(?P<line>\d+):(?P<col>\d+):\s+\((?P<id>\w+)\)\s+(?P<msg>.*)"

    severity_map = {
        "E" : "error",
        "W" : "warning",
        "I": "info"
    }

    _suppress = sca_suppress_init(d, "SCA_LUACHECK_EXTRA_SUPPRESS",
                                  d.expand("${STAGING_DATADIR_NATIVE}/luacheck-${SCA_MODE}-suppress"))

    _findings = []

    if os.path.exists(sca_raw_result_file(d, "luacheck")):
        with open(sca_raw_result_file(d, "luacheck"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="luacheck",
                                            BuildPath=buildpath,
                                            Line=m.group("line"),
                                            File=m.group("file"),
                                            Column=m.group("col"),
                                            Message=m.group("msg"),
                                            ID=m.group("id")[1:],
                                            Severity=severity_map[m.group("id")[0]])
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

python do_sca_luacheck() {
    import os
    import subprocess

    _args = ["luacheck"]
    _args += ["--codes", "--formatter", "plain"]

    _files = get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), ".*/lua", ".lua",
                                               sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))
    ## Run
    cmd_output = ""
    if any(_files):
        try:
            cmd_output += subprocess.check_output(_args + _files, universal_newlines=True)
        except subprocess.CalledProcessError as e:
            cmd_output += e.stdout or ""
    with open(sca_raw_result_file(d, "luacheck"), "w") as o:
        o.write(cmd_output)
}

python do_sca_luacheck_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/luacheck.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_luacheck(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "luacheck", get_fatal_entries(d, "SCA_LUACHECK_EXTRA_FATAL", 
                       d.expand("${STAGING_DATADIR_NATIVE}/luacheck-${SCA_MODE}-fatal")))
}

SCA_DEPLOY_TASK = "do_sca_deploy_luacheck"

python do_sca_deploy_luacheck() {
    sca_conv_deploy(d, "luacheck")
}

do_sca_luacheck[doc] = "Lint lua files"
do_sca_luacheck_report[doc] = "Report findings of do_sca_luacheck"
do_sca_deploy_luacheck[doc] = "Deploy results of do_sca_luacheck"
addtask do_sca_luacheck after do_compile before do_sca_tracefiles
addtask do_sca_luacheck_report after do_sca_tracefiles
addtask do_sca_deploy_luacheck after do_sca_luacheck_report before do_package

DEPENDS += "luacheck-native sca-recipe-luacheck-rules-native"
