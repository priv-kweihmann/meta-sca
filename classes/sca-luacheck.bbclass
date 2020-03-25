## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_LUACHECK_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_LUACHECK_EXTRA_FATAL ?= ""

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress

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

    _suppress = sca_suppress_init(d)

    _findings = []

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        with open(d.getVar("SCA_RAW_RESULT_FILE"), "r") as f:
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
    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_MYPY_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_LUACHECK_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "luacheck-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "luacheck-{}-fatal".format(d.getVar("SCA_MODE"))))

    _args = ["luacheck"]
    _args += ["--codes", "--formatter", "plain"]

    _files = get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), ".*/lua", ".lua",
                                               sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))
    ## Run
    cmd_output = ""
    tmp_result = os.path.join(d.getVar("T", True), "sca_raw_luacheck.txt")
    d.setVar("SCA_RAW_RESULT_FILE", tmp_result)
    if any(_files):
        try:
            cmd_output += subprocess.check_output(_args + _files, universal_newlines=True)
        except subprocess.CalledProcessError as e:
            cmd_output += e.stdout or ""
    with open(tmp_result, "w") as o:
        o.write(cmd_output)
    
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/luacheck.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_luacheck(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "luacheck", get_fatal_entries(d))
}

SCA_DEPLOY_TASK = "do_sca_deploy_luacheck"

python do_sca_deploy_luacheck() {
    sca_conv_deploy(d, "luacheck", "txt")
}

addtask do_sca_luacheck before do_install after do_compile
addtask do_sca_deploy_luacheck after do_sca_luacheck before do_package

DEPENDS += "luacheck-native sca-recipe-luacheck-rules-native"
