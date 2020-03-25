## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_PHPSECAUDIT_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_PHPSECAUDIT_EXTRA_FATAL ?= ""
SCA_PHPSECAUDIT_FILE_FILTER ?= ".php"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress

def do_sca_conv_phpsecaudit(d):
    import os
    import json
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")
    
    _findings = []
    _suppress = sca_suppress_init(d)

    _severity_map = {
        "ERROR": "error",
        "WARNING": "warning"
    }

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        content = []
        with open(d.getVar("SCA_RAW_RESULT_FILE"), "r") as f:
            try:
                content = json.load(f)
            except json.JSONDecodeError as e:
                bb.warn(str(e))
                content = {"files": {}}
            for k,v in content["files"].items():
                for m in v["messages"]:
                    try:
                        g = sca_get_model_class(d,
                                                PackageName=package_name,
                                                BuildPath=buildpath,
                                                Tool="phpsecaudit",
                                                File=k,
                                                Line=str(m["line"]),
                                                Column=str(m["column"]),
                                                Message=m["message"],
                                                ID=m["source"],
                                                Severity=_severity_map[m["type"]])
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

python do_sca_phpsecaudit() {
    import os
    import subprocess
    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_PHPSECAUDIT_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_PHPSECAUDIT_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "phpsecaudit-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "phpsecaudit-{}-fatal".format(d.getVar("SCA_MODE"))))

    tmp_result = os.path.join(d.getVar("T", True), "sca_raw_phpsecaudit.json")
    d.setVar("SCA_RAW_RESULT_FILE", tmp_result)
    cmd_output = ""

    ## Run
    _args = [os.path.join(d.getVar("STAGING_BINDIR_NATIVE"), "phpcs-security-audit/vendor/bin/phpcs")]
    _args += ["--no-colors"]
    _args += ["--no-cache"]
    _args += ["-s"]
    _args += ["--report=json"]
    _args += ["--standard=Security"]
   
    _files = get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), ".*php", d.getVar("SCA_PHPSECAUDIT_FILE_FILTER"), \
                                                sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))
    
    if any(_files): 
        try:
            cmd_output += subprocess.check_output(_args + _files, universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            cmd_output += e.stdout or ""

    with open(tmp_result, "w") as o:
        o.write(cmd_output)
    
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/phpsecaudit.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_phpsecaudit(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "phpsecaudit", get_fatal_entries(d))
}

SCA_DEPLOY_TASK = "do_sca_deploy_phpsecaudit"

python do_sca_deploy_phpsecaudit() {
    sca_conv_deploy(d, "phpsecaudit", "json")
}

addtask do_sca_phpsecaudit before do_install after do_configure
addtask do_sca_deploy_phpsecaudit after do_sca_phpsecaudit before do_package

DEPENDS += "phpcs-security-audit-native sca-recipe-phpsecaudit-rules-native"
