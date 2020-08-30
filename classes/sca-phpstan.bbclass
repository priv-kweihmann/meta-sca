## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_PHPSTAN_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_PHPSTAN_EXTRA_FATAL ?= ""
SCA_PHPSTAN_FILE_FILTER ?= ".php"

SCA_RAW_RESULT_FILE[phpstan] = "json"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress
inherit sca-tracefiles

def do_sca_conv_phpstan(d):
    import os
    import json
    import hashlib

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    _findings = []
    _suppress = sca_suppress_init(d, "SCA_PHPSTAN_EXTRA_SUPPRESS",
                                  d.expand("${STAGING_DATADIR_NATIVE}/phpstan-${SCA_MODE}-suppress"))

    _severity_map = {
        "True": "warning",
        "False": "error"
    }

    if os.path.exists(sca_raw_result_file(d, "phpstan")):
        content = []
        with open(sca_raw_result_file(d, "phpstan"), "r") as f:
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
                                                Tool="phpstan",
                                                File=k,
                                                Line=str(m["line"] or 1),
                                                Message=m["message"],
                                                ID=hashlib.md5(str.encode(m["message"])).hexdigest(),
                                                Severity=_severity_map[str(m["ignorable"])])
                        if _suppress.Suppressed(g):
                            continue
                        if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                            continue
                        if g.Severity in sca_allowed_warning_level(d):
                            _findings.append(g)
                    except Exception as exp:
                        bb.note(str(exp))

    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_phpstan() {
    import os
    import subprocess

    ## Run
    _args = [os.path.join(d.getVar("STAGING_BINDIR_NATIVE"), "phpstan/vendor/bin/phpstan")]
    _args += ["analyse"]
    _args += ["--ansi"]
    _args += ["-n"]
    _args += ["--error-format=json"]
    _args += ["--no-progress"]

    _files = get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), ".*php", [".php"], \
                                                sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    cmd_output = exec_wrap_check_output(_args, _files, combine=exec_wrap_combine_json_subdict, key="files",
                                        default_val={"files": {}})

    with open(sca_raw_result_file(d, "phpstan"), "w") as o:
        o.write(cmd_output)
}

python do_sca_phpstan_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/phpstan.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_phpstan(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "phpstan", get_fatal_entries(d, "SCA_PHPSTAN_EXTRA_FATAL",
                        d.expand("${STAGING_DATADIR_NATIVE}/phpstan-${SCA_MODE}-fatal")))
}

do_sca_phpstan[doc] = "Lint php scripts with phpstan in workspace"
do_sca_phpstan_report[doc] = "Report findings of do_sca_phpstan"
addtask do_sca_phpstan after do_configure before do_sca_tracefiles
addtask do_sca_phpstan_report after do_sca_tracefiles before do_sca_deploy

DEPENDS += "phpstan-native sca-recipe-phpstan-rules-native"
