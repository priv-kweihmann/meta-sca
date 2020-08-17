## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_PHPMD_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_PHPMD_EXTRA_FATAL ?= ""
SCA_PHPMD_FILE_FILTER ?= ".php .phtml"
SCA_PHPMD_CHECKS ?= "codesize cleancode controversial naming unusedcode design"

SCA_RAW_RESULT_FILE[phpmd] = "json"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress
inherit sca-tracefiles

def do_sca_conv_phpmd(d):
    import os
    import json
    import hashlib

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    _findings = []
    _suppress = sca_suppress_init(d, "SCA_PHPMD_EXTRA_SUPPRESS",
                                  d.expand("${STAGING_DATADIR_NATIVE}/phpmd-${SCA_MODE}-suppress"))

    if os.path.exists(sca_raw_result_file(d, "phpmd")):
        content = []
        with open(sca_raw_result_file(d, "phpmd"), "r") as f:
            try:
                content = json.load(f)
            except json.JSONDecodeError:
                content = {"files": []}
            for f in content["files"]:
                for m in f["violations"]:
                    try:
                        g = sca_get_model_class(d,
                                                PackageName=package_name,
                                                BuildPath=buildpath,
                                                Tool="phpmd",
                                                File=f["file"],
                                                Line=str(m["beginLine"]),
                                                Message=m["description"],
                                                ID=m["rule"],
                                                Severity="warning")
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

python do_sca_phpmd() {
    import os
    import subprocess

    ## Run
    _args = [os.path.join(d.getVar("STAGING_BINDIR_NATIVE"), "phpmd/vendor/bin/phpmd")]

    _files = get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), ".*php", d.getVar("SCA_PHPMD_FILE_FILTER"), \
                                                sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    _args += [",".join(_files)]
    _args += ["json"]
    _args += [",".join(clean_split(d, "SCA_PHPMD_CHECKS"))]
    _args += ["--suffixes", ",".join([x.lstrip(".") for x in clean_split(d, "SCA_PHPMD_FILE_FILTER")])]

    cmd_output = exec_wrap_check_output(_args, _files, combine=exec_wrap_combine_json_subarray, key="files",
                                        default_val={"files": []})

    with open(sca_raw_result_file(d, "phpmd"), "w") as o:
        o.write(cmd_output)
}

python do_sca_phpmd_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/phpmd.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_phpmd(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "phpmd", get_fatal_entries(d, "SCA_PHPMD_EXTRA_FATAL",
                        d.expand("${STAGING_DATADIR_NATIVE}/phpmd-${SCA_MODE}-fatal")))
}

SCA_DEPLOY_TASK = "do_sca_deploy_phpmd"

python do_sca_deploy_phpmd() {
    sca_conv_deploy(d, "phpmd")
}

do_sca_phpmd[doc] = "Lint php scripts with phpmd in workspace"
do_sca_phpmd_report[doc] = "Report findings of do_sca_phpmd"
do_sca_deploy_phpmd[doc] = "Deploy results of do_sca_phpmd"
addtask do_sca_phpmd after do_configure before do_sca_tracefiles
addtask do_sca_phpmd_report after do_sca_tracefiles
addtask do_sca_deploy_phpmd after do_sca_phpmd_report before do_package

DEPENDS += "phpmd-native sca-recipe-phpmd-rules-native"
