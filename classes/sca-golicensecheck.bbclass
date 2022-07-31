## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_GOLICENSECHECK_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_GOLICENSECHECK_EXTRA_FATAL ?= ""
## Minimum confidence about the license
SCA_GOLICENSECHECK_MIN_CONFIDENCE ?= "0.9"

SCA_RAW_RESULT_FILE[golicensecheck] = "txt"
SCA_RAW_RESULT_FILE[golicensecheck_raw] = "json"

SCA_ACTIVE_MODULES:append = " golicensecheck_raw"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress
inherit sca-image-backtrack
inherit sca-tracefiles

def do_sca_conv_golicensecheck(d):
    import os
    import re

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    items = []
    pattern = r"^(?P<pkg>.*):\[(?P<id>.+)\]\s+(?P<msg>.*)"

    _suppress = sca_suppress_init(d, clean_split(d, "SCA_GOLICENSECHECK_EXTRA_SUPPRESS"),
                                  d.expand("${STAGING_DATADIR_NATIVE}/golicensecheck-${SCA_MODE}-suppress"),
                                  file_trace=False)
    _findings = []

    if os.path.exists(sca_raw_result_file(d, "golicensecheck")):
        with open(sca_raw_result_file(d, "golicensecheck"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="golicensecheck",
                                            BuildPath=sca_get_layer_path_for_file(d, d.getVar("FILE")),
                                            File=d.getVar("FILE"),
                                            Column="1",
                                            Line="1",
                                            Message="{}: {}".format(m.group("pkg"), m.group("msg")),
                                            ID=m.group("id"),
                                            Severity="warning")
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

python do_sca_golicensecheck() {
    import os
    import json
    import subprocess

    _args = ["license-detector"]
    _args += ["-f", "json"]

    _folders = get_folders(d, d.getVar("SCA_SOURCES_DIR"),
                sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    ## Run
    cmd_output = exec_wrap_check_output(d, _args, _folders, combine=exec_wrap_combine_json, default_val=[])

    ## filter
    _confidence = float(d.getVar("SCA_GOLICENSECHECK_MIN_CONFIDENCE"))
    _res = []
    for item in json.loads(cmd_output):
        _res.append({
            "project": item["project"],
            "matches": [x for x in item.get("matches", []) if x["confidence"] >= _confidence and not x["license"].startswith("deprecated_")]
        })

    with open(sca_raw_result_file(d, "golicensecheck_raw"), "w") as o:
        json.dump(_res, o)
}

def golicensecheck_get_license(d, _in):
    import re
    _pn = d.getVar("PN")
    x = d.getVar("LICENSE:{}".format(_in))
    if not x:
        x = d.getVar("LICENSE:${{PN}}{}".format(_in.replace(_pn, "")))
    if not x:
        x = d.getVar("LICENSE")
    if not x:
        x = "CLOSED"
    # Apply SPDXLICENSEMAP settings
    for rename_flag in d.getVarFlags("SPDXLICENSEMAP"):
        x = re.sub(r"{}(\||&|\s+|$)".format(re.escape(rename_flag)), d.getVarFlag("SPDXLICENSEMAP", rename_flag), x)
    return x

python do_sca_golicensecheck_report() {
    import os
    import json

    cmd_output = ""

    if os.path.exists(d.getVar("SCA_TRACEFILES_LIST") or "/does/not/exist"):
        with open(d.getVar("SCA_TRACEFILES_LIST")) as i:
            _jobj = json.load(i)
            for key, val in _jobj.items():
                _args = ["licensecheck",
                         golicensecheck_get_license(d, key),
                         "golicensecheck",
                         sca_raw_result_file(d, "golicensecheck_raw")]
                _tmp = exec_wrap_check_output(d, _args, val)
                cmd_output += "\n".join(["{}:{}".format(key, x) for x in _tmp.split("\n") if x]) + "\n"
    with open(sca_raw_result_file(d, "golicensecheck"), "w") as o:
        o.write(cmd_output)

    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/golicensecheck.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_golicensecheck(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "golicensecheck", get_fatal_entries(d, clean_split(d, "SCA_GOLICENSECHECK_EXTRA_FATAL"),
                       d.expand("${STAGING_DATADIR_NATIVE}/golicensecheck-${SCA_MODE}-fatal")))
}

do_sca_golicensecheck[doc] = "Scan license information in workspace"
do_sca_golicensecheck_report[doc] = "Report findings of do_sca_golicensecheck"
do_sca_golicensecheck[nosdkgen] = "1"
do_sca_golicensecheck_report[nosdkgen] = "1"
addtask do_sca_golicensecheck after do_compile before do_sca_tracefiles
addtask do_sca_golicensecheck_report after do_sca_tracefiles before do_sca_deploy

DEPENDS += "golicensecheck-sca-native sca-recipe-golicensecheck-rules-native"
