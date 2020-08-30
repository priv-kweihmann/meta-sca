## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to lead to a fatal on a recipe level
SCA_RETIRE_EXTRA_FATAL ?= ""
## File extension filter list (whitespace separated)
SCA_RETIRE_FILE_FILTER ?= ".js .json"

SCA_RAW_RESULT_FILE[retire] = "json"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress
inherit sca-tracefiles

def do_sca_conv_retire(d):
    import os
    import json

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    items = []

    _findings = []

    _severity_map = {
        "critical" : "error",
        "high": "error",
        "medium": "warning",
        "low": "info"
    }

    _suppress = sca_suppress_init(d, "", None)

    if os.path.exists(sca_raw_result_file(d, "retire")):
        content = []
        with open(sca_raw_result_file(d, "retire"), "r") as f:
            try:
                content = json.load(f)
            except json.JSONDecodeError as e:
                bb.note(str(e))
            for item in content:
                try:
                    _file = item["file"]
                    for results in item["results"]:
                        _component = results["component"]
                        for vul in results["vulnerabilities"]:
                            g = sca_get_model_class(d,
                                                    PackageName=package_name,
                                                    Tool="retire",
                                                    BuildPath=buildpath,
                                                    File=_file,
                                                    Message="{}: Used version has a known vulnerability of {}".format(_component, vul["identifiers"]["summary"]),
                                                    ID="knownVulnerability",
                                                    Severity=_severity_map[vul["severity"]])
                            if _suppress.Suppressed(g):
                                continue
                            if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                                continue
                            if g.Severity in sca_allowed_warning_level(d):
                                _findings.append(g)
                except Exception as e:
                    bb.note(str(e))
    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_retire() {
    import os
    import subprocess

    _args = ["retire", "-c", "--outputformat", "jsonsimple", "--path", d.getVar("SCA_SOURCES_DIR")]

    _files = get_files_by_extention(d,
                                    d.getVar("SCA_SOURCES_DIR"),
                                    clean_split(d, "SCA_RETIRE_FILE_FILTER"),
                                    sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    ## Run
    cmd_output = exec_wrap_check_output(_args, _files, combine=exec_wrap_combine_json, default_val={})

    with open(sca_raw_result_file(d, "retire"), "w") as o:
        if not cmd_output:
            cmd_output = "[]"
        o.write(cmd_output)
}

python do_sca_retire_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/retire.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_retire(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "retire", get_fatal_entries(d, "SCA_RETIRE_EXTRA_FATAL",
                       d.expand("${STAGING_DATADIR_NATIVE}/retire-${SCA_MODE}-fatal")))
}

do_sca_retire[doc] = "Find vulnerable js code"
do_sca_retire_report[doc] = "Report finding of do_sca_retire"
addtask do_sca_retire after do_install before do_sca_tracefiles
addtask do_sca_retire_report after do_sca_tracefiles before do_sca_deploy

DEPENDS += "retire-native sca-recipe-retire-rules-native"
