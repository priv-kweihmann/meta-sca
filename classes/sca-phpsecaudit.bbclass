## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_PHPSECAUDIT_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_PHPSECAUDIT_EXTRA_FATAL ?= ""
SCA_PHPSECAUDIT_FILE_FILTER ?= ".php"

SCA_RAW_RESULT_FILE[phpsecaudit] = "json"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress
inherit sca-tracefiles

def do_sca_conv_phpsecaudit(d):
    import os
    import json
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")
    
    _findings = []
    _suppress = sca_suppress_init(d, "SCA_PHPSECAUDIT_EXTRA_SUPPRESS", 
                                  d.expand("${STAGING_DATADIR_NATIVE}/phpsecaudit-${SCA_MODE}-suppress"))

    _severity_map = {
        "ERROR": "error",
        "WARNING": "warning"
    }

    if os.path.exists(sca_raw_result_file(d, "phpsecaudit")):
        content = []
        with open(sca_raw_result_file(d, "phpsecaudit"), "r") as f:
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

    with open(sca_raw_result_file(d, "phpsecaudit"), "w") as o:
        o.write(cmd_output)
}

python do_sca_phpsecaudit_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/phpsecaudit.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_phpsecaudit(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "phpsecaudit", get_fatal_entries(d, "SCA_PHPSECAUDIT_EXTRA_FATAL",
                        d.expand("${STAGING_DATADIR_NATIVE}/phpsecaudit-${SCA_MODE}-fatal")))
}

SCA_DEPLOY_TASK = "do_sca_deploy_phpsecaudit"

python do_sca_deploy_phpsecaudit() {
    sca_conv_deploy(d, "phpsecaudit")
}

do_sca_phpsecaudit[doc] = "Lint php scripts with phpsecaudit in workspace"
do_sca_phpsecaudit_report[doc] = "Report findings of do_sca_phpsecaudit"
do_sca_deploy_phpsecaudit[doc] = "Deploy results of do_sca_phpsecaudit"
addtask do_sca_phpsecaudit after do_configure before do_sca_tracefiles
addtask do_sca_phpsecaudit_report after do_sca_tracefiles
addtask do_sca_deploy_phpsecaudit after do_sca_phpsecaudit_report before do_package

DEPENDS += "phpcs-security-audit-native sca-recipe-phpsecaudit-rules-native"
