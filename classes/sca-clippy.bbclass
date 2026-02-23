## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2026, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_CLIPPY_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_CLIPPY_EXTRA_FATAL ?= ""
## File extension filter list (whitespace separated)
SCA_CLIPPY_FILE_FILTER ?= "Cargo.toml **/Cargo.toml"

SCA_RAW_RESULT_FILE[clippy] = "json"
SCA_RAW_RESULT_FILE[clippy_raw] = "txt"

SCA_ACTIVE_MODULES:append = " clippy_raw"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress
inherit sca-image-backtrack
inherit sca-tracefiles

def do_sca_conv_clippy(d):
    import os
    import re
    import json

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    items = []
    _findings = []
    _suppress = sca_suppress_init(d, clean_split(d, "SCA_CLIPPY_EXTRA_SUPPRESS"),
                                  d.expand("${STAGING_DATADIR_NATIVE}/clippy-${SCA_MODE}-suppress"))

    if os.path.exists(sca_raw_result_file(d, "clippy")):
        with open(sca_raw_result_file(d, "clippy"), "r") as f:
            cnt = json.load(f)
            for item in cnt:
                if 'message' in item.keys():
                    item = item['message']

                    try:
                        _severity = item.get('level', 'info')
                        _line = item.get('spans', [])[0].get('line_start', 0)
                        _column = item.get('spans', [])[0].get('column_start', 0)
                        _file = item.get('spans', [])[0].get('file_name', '')
                        _id = f'clippy.clippy.{item.get("code", {}).get("code").split(":")[-1]}'
                        _message = item.get('message', '')

                        if _severity not in sca_allowed_warning_level(d):
                            continue
                        if not _line or not _column or not _file or not _id or not _message:
                            continue
                        g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="clippy",
                                            BuildPath=buildpath,
                                            File=_file,
                                            Line=str(_line),
                                            Column=str(_column),
                                            Message=_message,
                                            ID=_id,
                                            Severity=_severity)
                        if _suppress.Suppressed(g):
                            continue
                        if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                            continue
                        _findings += sca_backtrack_findings(d, g)
                    except Exception as exp:
                        sca_log_note(d, str(exp))
    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_clippy() {
    import os
    import json
    import subprocess

    os.environ["OTMP"] = d.getVar("T")
    _args = ["cargo", "clippy", "--message-format=json", "--offline", "--no-deps"]

    _files = get_files_by_glob(d,
                                d.getVar("SCA_SOURCES_DIR"),
                                d.getVar("SCA_CLIPPY_FILE_FILTER"),
                                sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))
    ## Run
    cmd_output = []
    _tmp = ""
    for item in _files:
        _tmp += exec_wrap_check_output(d, _args, [f'--manifest-path={item}'])

    cmd_output += [json.loads(x) for x in _tmp.split('\n') if x.startswith('{')]
    with open(sca_raw_result_file(d, "clippy_raw"), "w") as o:
        o.write(_tmp)
    with open(sca_raw_result_file(d, "clippy"), "w") as o:
        json.dump(cmd_output, o)
}

do_sca_clippy[vardeps] += "\
    SCA_CLIPPY_FILE_FILTER \
    SCA_FILE_FILTER_EXTRA \
    SCA_LOCAL_FILE_FILTER \
"

python do_sca_clippy_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/clippy.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_clippy(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "clippy", get_fatal_entries(d, clean_split(d, "SCA_CLIPPY_EXTRA_FATAL"),
                        d.expand("${STAGING_DATADIR_NATIVE}/clippy-${SCA_MODE}-fatal")))
}

do_sca_clippy_report[vardeps] += "\
    SCA_CLIPPY_EXTRA_FATAL \
    SCA_CLIPPY_EXTRA_SUPPRESS \
    SCA_SCOPE_FILTER \
    SCA_SEVERITY_TRANSFORM \
    SCA_SUPPRESS_LOCALS \
"

do_sca_clippy[doc] = "Lint Rust/Cargo projects"
do_sca_clippy_report[doc] = "Report findings of do_sca_clippy"
addtask do_sca_clippy after do_compile before do_sca_tracefiles
addtask do_sca_clippy_report after do_sca_tracefiles before do_sca_deploy

DEPENDS += "rust-native clippy-sca-native sca-recipe-clippy-rules-native"
