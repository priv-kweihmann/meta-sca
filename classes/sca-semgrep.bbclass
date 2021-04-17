## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2021, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_SEMGREP_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_SEMGREP_EXTRA_FATAL ?= ""

SCA_SEMGREP_RULESETS ?= "\
    ${STAGING_DATADIR_NATIVE}/semgrep/semgrep-go \
"

SCA_SEMGREP_ALLOW_ARBITRARY_CODE ?= "1"

SCA_SEMGREP_USER_RULES_RECIPES ?= ""

SCA_RAW_RESULT_FILE[semgrep] = "json"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress
inherit sca-image-backtrack
inherit sca-tracefiles

def do_sca_conv_semgrep(d):
    import os
    import json

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")
    rule_prefixes = [os.path.relpath(x, d.getVar("TOPDIR")).lstrip("/").replace("/", ".") for x in clean_split(d, "SCA_SEMGREP_RULESETS")]

    items = []
    _suppress = sca_suppress_init(d, "SCA_SEMGREP_EXTRA_SUPPRESS",
                                   d.expand("${STAGING_DATADIR_NATIVE}/semgrep-${SCA_MODE}-suppress"))
    _findings = []

    _severity_map = {
        "WARNING": "warning",
        "ERROR": "error"
    }

    if os.path.exists(sca_raw_result_file(d, "semgrep")):
        content = { "results": [] }
        with open(sca_raw_result_file(d, "semgrep"), "r") as f:
            try:
                content = json.load(f)
            except json.JSONDecodeError:
                pass
        for item in content["results"]:
            try:
                _id = item["check_id"]
                for x in rule_prefixes:
                    _id = _id.replace(x, "", 1).lstrip(".")
                g = sca_get_model_class(d,
                                        PackageName=package_name,
                                        Tool="semgrep",
                                        BuildPath=buildpath,
                                        File=item["path"],
                                        Line=str(item["start"]["line"]),
                                        Column=str(item["start"]["col"]),
                                        Message=item["extra"]["message"],
                                        ID=_id,
                                        Severity=_severity_map.get(item["extra"]["severity"], "warning"))
                if _suppress.Suppressed(g):
                    continue
                if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                    continue
                if g.Severity in sca_allowed_warning_level(d):
                    _findings += sca_backtrack_findings(d, g)
            except Exception as e:
                sca_log_note(d, str(e))
    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_semgrep() {
    import os
    import subprocess

    _args = ["semgrep", "--json", "--quiet"]
    if d.getVar("SCA_SEMGREP_ALLOW_ARBITRARY_CODE") == "1":
        _args += ["--dangerously-allow-arbitrary-code-execution-from-rules"]
    cmd_output = ""
    for ruleset in clean_split(d, "SCA_SEMGREP_RULESETS"):
        _tmp = exec_wrap_check_output(d, _args + ["-c", ruleset], [d.getVar("SCA_SOURCES_DIR")],
                                      default_val={"results": []},
                                      combine=exec_wrap_combine_json_subarray, key="results")
        cmd_output = exec_wrap_combine_json_subarray(cmd_output, _tmp, key="results")
    with open(sca_raw_result_file(d, "semgrep"), "w") as o:
        o.write(cmd_output)
}

python do_sca_semgrep_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/semgrep.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_semgrep(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "semgrep", get_fatal_entries(d, "SCA_SEMGREP_EXTRA_FATAL",
                       d.expand("${STAGING_DATADIR_NATIVE}/semgrep-${SCA_MODE}-fatal")))
}

do_sca_semgrep[doc] = "Lint many files with semgrep"
do_sca_semgrep_report[doc] = "Report findings of do_sca_semgrep"
addtask do_sca_semgrep after do_configure before do_sca_tracefiles
addtask do_sca_semgrep_report after do_sca_tracefiles before do_sca_deploy

DEPENDS += "\
    ${SCA_SEMGREP_USER_RULES_RECIPES} \
    python3-semgrep-native \
    sca-recipe-semgrep-rules-native \
    semgrep-go-native \
    semgrep-core-native \
"
