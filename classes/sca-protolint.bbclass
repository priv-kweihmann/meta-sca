## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2021, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_PROTOLINT_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_PROTOLINT_EXTRA_FATAL ?= ""
## File extension filter list (whitespace separated)
SCA_PROTOLINT_FILE_FILTER ?= ".proto"

SCA_RAW_RESULT_FILE[protolint] = "json"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress
inherit sca-image-backtrack
inherit sca-tracefiles

def do_sca_conv_protolint(d):
    import os
    import json

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    items = []
    _suppress = sca_suppress_init(d, clean_split(d, "SCA_PROTOLINT_EXTRA_SUPPRESS"),
                                  d.expand("${STAGING_DATADIR_NATIVE}/protolint-${SCA_MODE}-suppress"),
                                  file_trace=False)
    _findings = []
    _severity_map = {
        "PARSER" : "error"
    }

    if os.path.exists(sca_raw_result_file(d, "protolint")):
        with open(sca_raw_result_file(d, "protolint"), "r") as f:
            try:
                j = json.load(f)
            except:
                j = {"lints": []}
            for m in j["lints"]:
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="protolint",
                                            BuildPath=buildpath,
                                            File=m["filename"],
                                            Column=str(m["column"]),
                                            Line=str(m["line"]),
                                            Message=m["message"],
                                            ID=m["rule"],
                                            Severity=_severity_map.get(m["rule"], "warning"))
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

def exec_wrap_combine_protolint(a, b, **kwargs):
    import json
    import re

    try:
        b = json.loads(b)
    except:
         # in case this fails extra check for parser failaure
        m = re.match(r"^.*Pos=(?P<file>.*):(?P<line>\d+):(?P<col>\d+).*s", b)
        if m:
            b = {
                "lints": [
                    {
                        "filename": m.group("file"),
                        "line": int(m.group("line")),
                        "column": int(m.group("col")),
                        "message": m.group(0),
                        "rule": "PARSER"
                    }
                ]
            }
        else:
            b = {"lints": []}

    try:
        a = json.loads(a)
        a["lints"] += b["lints"]
    except:
        a = b
    return json.dumps(a)

python do_sca_protolint() {
    import os
    import subprocess

    _args = ["protolint", "lint", "-reporter", "json"]

    _files = get_files_by_extention(d,
                                    d.getVar("SCA_SOURCES_DIR"),
                                    clean_split(d, "SCA_PROTOLINT_FILE_FILTER"),
                                    sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    ## Run
    cmd_output = exec_wrap_check_output(d, _args, _files, chunk_size=1, combine=exec_wrap_combine_protolint, default_val={"lints": []})
    with open(sca_raw_result_file(d, "protolint"), "w") as o:
        o.write(cmd_output)
}

python do_sca_protolint_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/protolint.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_protolint(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "protolint", get_fatal_entries(d, clean_split(d, "SCA_PROTOLINT_EXTRA_FATAL"),
                       d.expand("${STAGING_DATADIR_NATIVE}/protolint-${SCA_MODE}-fatal")))
}

do_sca_protolint[doc] = "Lint go code with protolint"
do_sca_protolint_report[doc] = "Report findings of do_sca_protolint"
addtask do_sca_protolint after do_configure before do_sca_tracefiles
addtask do_sca_protolint_report after do_sca_tracefiles before do_sca_deploy

DEPENDS += "protolint-sca-native sca-recipe-protolint-rules-native"
