## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_GOSEC_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_GOSEC_EXTRA_FATAL ?= ""
## File extension filter list (whitespace separated)
SCA_GOSEC_FILE_FILTER ?= ".go"

SCA_RAW_RESULT_FILE[gosec] = "json"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress
inherit sca-tracefiles

def do_sca_conv_gosec(d):
    import os
    import json

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    items = []

    _suppress = sca_suppress_init(d, "SCA_GOSEC_EXTRA_SUPPRESS",
                                   d.expand("${STAGING_DATADIR_NATIVE}/gosec-${SCA_MODE}-suppress"))
    _findings = []

    _severity_map = {
        "LOW": "warning",
        "MEDIUM": "warning",
        "HIGH": "error"
    }

    if os.path.exists(sca_raw_result_file(d, "gosec")):
        content = {}
        with open(sca_raw_result_file(d, "gosec"), "r") as f:
            try:
                content = json.load(f)
            except json.JSONDecodeError:
                pass
        if "Issues" in content.keys():
            for item in content["Issues"]:
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="gosec",
                                            BuildPath=buildpath,
                                            File=item["file"],
                                            Line=item["line"],
                                            Message=item["details"],
                                            ID=item["rule_id"],
                                            Severity=_severity_map[item["severity"]])
                    if _suppress.Suppressed(g):
                        continue
                    if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                        continue
                    if g.Severity in sca_allowed_warning_level(d):
                        _findings.append(g)
                except Exception as e:
                    bb.warn(str(e))
    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

def exec_wrap_combine_json_gosec(a, b, **kwargs):
    import json
    try:
        with open(kwargs["sourcefile"]) as i:
            b = json.load(i)
    except:
        b = {"Issues": []}

    try:
        a = json.loads(a)
        a["Issues"] += b["Issues"]
    except:
        a = b
    return json.dumps(a)

python do_sca_gosec() {
    import os
    import subprocess
    import json

    _args = ["gosec", "-fmt=json"]
    _args += ["-out={}".format(sca_raw_result_file(d, "gosec"))]

    _files = get_files_by_extention(d,
                                    d.getVar("SCA_SOURCES_DIR"),
                                    clean_split(d, "SCA_GOSEC_FILE_FILTER"),
                                    sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    ## Run
    cmd_output = exec_wrap_check_output(_args, _files, combine=exec_wrap_combine_json_gosec,
                                        default_val={"Issues": []},
                                        sourcefile=sca_raw_result_file(d, "gosec"))
    with open(sca_raw_result_file(d, "gosec"), "w") as o:
        o.write(cmd_output)
}

python do_sca_gosec_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/gosec.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_gosec(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "gosec", get_fatal_entries(d, "SCA_GOSEC_EXTRA_FATAL",
                       d.expand("${STAGING_DATADIR_NATIVE}/gosec-${SCA_MODE}-fatal")))
}

do_sca_gosec[doc] = "Lint go files with gosec for security issues"
do_sca_gosec_report[doc] = "Report findings of do_sca_gosec"
addtask do_sca_gosec after do_configure before do_sca_tracefiles
addtask do_sca_gosec_report after do_sca_tracefiles before do_sca_deploy

DEPENDS += "gosec-native sca-recipe-gosec-rules-native"
