## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_PHPCODESNIFFER_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_PHPCODESNIFFER_EXTRA_FATAL ?= ""
SCA_PHPCODESNIFFER_FILE_FILTER ?= ".php .js .css"

SCA_RAW_RESULT_FILE[phpcodesniffer] = "json"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress
inherit sca-tracefiles

def do_sca_conv_phpcodesniffer(d):
    import os
    import json

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    _findings = []
    _suppress = sca_suppress_init(d, "SCA_PHPCODESNIFFER_EXTRA_SUPPRESS",
                                  d.expand("${STAGING_DATADIR_NATIVE}/phpcodesniffer-${SCA_MODE}-suppress"))

    _severity_map = {
        "ERROR": "error",
        "WARNING": "warning"
    }

    if os.path.exists(sca_raw_result_file(d, "phpcodesniffer")):
        content = []
        with open(sca_raw_result_file(d, "phpcodesniffer"), "r") as f:
            try:
                content = json.load(f)
            except json.JSONDecodeError:
                content = {"files": {}}
            for k,v in content["files"].items():
                for m in v["messages"]:
                    try:
                        g = sca_get_model_class(d,
                                                PackageName=package_name,
                                                BuildPath=buildpath,
                                                Tool="phpcodesniffer",
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

python do_sca_phpcodesniffer() {
    import os
    import subprocess

    ## Run
    _args = [os.path.join(d.getVar("STAGING_BINDIR_NATIVE"), "phpcodesniffer/vendor/bin/phpcs")]
    _args += ["--no-colors"]
    _args += ["--no-cache"]
    _args += ["-s"]
    _args += ["--report=json"]

    _files = get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), ".*php", d.getVar("SCA_PHPCODESNIFFER_FILE_FILTER"), \
                                                sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    cmd_output = exec_wrap_check_output(_args, _files, combine=exec_wrap_combine_json_subdict, key="files",
                                        default_val={"files": {}})

    with open(sca_raw_result_file(d, "phpcodesniffer"), "w") as o:
        o.write(cmd_output)
}

python do_sca_phpcodesniffer_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/phpcodesniffer.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_phpcodesniffer(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "phpcodesniffer", get_fatal_entries(d, "SCA_PHPCODESNIFFER_EXTRA_FATAL",
                        d.expand("${STAGING_DATADIR_NATIVE}/phpcodesniffer-${SCA_MODE}-fatal")))
}

SCA_DEPLOY_TASK = "do_sca_deploy_phpcodesniffer"

python do_sca_deploy_phpcodesniffer() {
    sca_conv_deploy(d, "phpcodesniffer")
}

do_sca_phpcodesniffer[doc] = "Lint php scripts with phpcodesniffer in workspace"
do_sca_phpcodesniffer_report[doc] = "Report findings of do_sca_phpcodesniffer"
do_sca_deploy_phpcodesniffer[doc] = "Deploy results of do_sca_phpcodesniffer"
addtask do_sca_phpcodesniffer after do_configure before do_sca_tracefiles
addtask do_sca_phpcodesniffer_report after do_sca_tracefiles
addtask do_sca_deploy_phpcodesniffer after do_sca_phpcodesniffer_report before do_package

DEPENDS += "phpcodesniffer-native sca-recipe-phpcodesniffer-rules-native"
