## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_PHPCODEFIXER_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_PHPCODEFIXER_EXTRA_FATAL ?= ""
SCA_PHPCODEFIXER_FILE_FILTER ?= ".php"
## Set explicit php-version to be checked against, default auto pick
SCA_PHPCODEFIXER_PHP_VERSION ?= ""

SCA_RAW_RESULT_FILE[phpcodefixer] = "json"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress
inherit sca-image-backtrack
inherit sca-tracefiles

def do_sca_conv_phpcodefixer(d):
    import os
    import json

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    _findings = []
    _suppress = sca_suppress_init(d, "SCA_PHPCODEFIXER_EXTRA_SUPPRESS",
                                  d.expand("${STAGING_DATADIR_NATIVE}/phpcodefixer-${SCA_MODE}-suppress"))

    if os.path.exists(sca_raw_result_file(d, "phpcodefixer")):
        content = []
        with open(sca_raw_result_file(d, "phpcodefixer"), "r") as f:
            try:
                content = json.load(f)
            except json.JSONDecodeError:
                content = {"problems": []}
            for m in content["problems"]:
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            BuildPath=buildpath,
                                            Tool="phpcodefixer",
                                            File=os.path.join(m["path"], m["file"]),
                                            Line=str(m["line"]),
                                            Message="{}: {} since PHP version {}".format(m["type"], m["category"], m["version"]),
                                            ID=m["checker"],
                                            Severity="error")
                    if _suppress.Suppressed(g):
                        continue
                    if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                        continue
                    if g.Severity in sca_allowed_warning_level(d):
                        _findings += sca_backtrack_findings(d, g)
                except Exception as exp:
                    sca_log_note(d, str(exp))

    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_phpcodefixer() {
    import os
    import subprocess

    ## Run
    _args = [os.path.join(d.getVar("STAGING_BINDIR_NATIVE"), "phpcodefixer/vendor/bin/phpdd")]
    _args += ["--max-size=1000mb"]
    _args += ["--output-json=-"]
    _args += ["--ansi"]
    if d.getVar("SCA_PHPCODEFIXER_PHP_VERSION"):
        _args += ["--target={}".format(d.getVar("SCA_PHPCODEFIXER_PHP_VERSION"))]
    _args += ["-n"]

    _files = get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), ".*php", [".php"], \
                                                sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    cmd_output = exec_wrap_check_output(d, _args, _files, combine=exec_wrap_combine_json_subarray, key="problems",
                                        default_val={"problems": []})

    with open(sca_raw_result_file(d, "phpcodefixer"), "w") as o:
        o.write(cmd_output)
}

python do_sca_phpcodefixer_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/phpcodefixer.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_phpcodefixer(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "phpcodefixer", get_fatal_entries(d, "SCA_PHPCODEFIXER_EXTRA_FATAL",
                        d.expand("${STAGING_DATADIR_NATIVE}/phpcodefixer-${SCA_MODE}-fatal")))
}

do_sca_phpcodefixer[doc] = "Lint php scripts with phpcodefixer in workspace"
do_sca_phpcodefixer_report[doc] = "Report findings of do_sca_phpcodefixer"
addtask do_sca_phpcodefixer after do_configure before do_sca_tracefiles
addtask do_sca_phpcodefixer_report after do_sca_tracefiles before do_sca_deploy

DEPENDS += "phpcodefixer-native sca-recipe-phpcodefixer-rules-native"
