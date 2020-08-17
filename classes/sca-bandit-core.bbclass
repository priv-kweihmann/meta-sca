## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

SCA_BANDIT_EXTRA_SUPPRESS ?= ""
SCA_BANDIT_EXTRA_FATAL ?= ""

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-license-filter
inherit sca-suppress

DEPENDS += "python3-bandit-native"

SCA_RAW_RESULT_FILE[bandit] = "json"

def do_sca_conv_bandit(d):
    import os
    import json

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    severity_map = {
        "LOW" : "info",
        "MEDIUM" : "warning",
        "HIGH": "error"
    }

    _findings = []
    _suppress = sca_suppress_init(d, "SCA_BANDIT_EXTRA_FATAL",
                    d.expand("${STAGING_DATADIR_NATIVE}/bandit-${SCA_MODE}-suppress"))

    if os.path.exists(sca_raw_result_file(d, "bandit")):
        with open(sca_raw_result_file(d, "bandit")) as f:
            try:
                jobj = json.load(f)
            except Exception as e:
                bb.warn(str(e))
                pass
            if isinstance(jobj, dict):
                if "results" in jobj.keys():
                    for item in jobj["results"]:
                        try:
                            filename = item["filename"]
                            if filename.startswith("./"):
                                filename = os.path.join(buildpath, filename[2:])
                            g = sca_get_model_class(d,
                                                    PackageName=package_name,
                                                    Tool="bandit",
                                                    BuildPath=buildpath,
                                                    File=filename,
                                                    Line=str(item["line_number"]),
                                                    Message=item["issue_text"],
                                                    ID=item["test_id"],
                                                    Severity=severity_map[item["issue_severity"]])
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

def exec_wrap_combine_json_bandit(a, b, **kwargs):
    import json
    try:
        with open(kwargs["sourcefile"]) as i:
            b = json.load(i)
    except:
        b = {"results": []}

    try:
        a = json.loads(a)
        a["results"] += b["results"]
    except:
        a = b
    return json.dumps(a)

python do_sca_bandit_core() {
    import os
    import subprocess
    import json

    _args = ["bandit"]
    _args += ["-f", "json"]
    _args += ["-o", sca_raw_result_file(d, "bandit")]
    _files = get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), d.getVar("SCA_PYTHON_SHEBANG"), ".py",
                                sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))


    cmd_output = exec_wrap_check_output(_args, _files,
                                        combine=exec_wrap_combine_json_bandit, default_val={"results": []},
                                        sourcefile=sca_raw_result_file(d, "bandit"))

    with open(sca_raw_result_file(d, "bandit"), "w") as o:
        o.write(cmd_output)
}

python do_sca_bandit_core_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/bandit.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_bandit(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "bandit", get_fatal_entries(d, "SCA_BANDIT_EXTRA_SUPPRESS",
                        d.expand("${STAGING_DATADIR_NATIVE}/bandit-${SCA_MODE}-fatal")))
}
