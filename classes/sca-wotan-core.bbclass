## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

SCA_WOTAN_EXTRA_SUPPRESS ?= ""
SCA_WOTAN_EXTRA_FATAL ?= ""
SCA_WOTAN_FILE_FILTER ?= ".js .ts .vue"
SCA_WOTAN_CONFIG ?= "wotan:recommended"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-license-filter
inherit sca-suppress

DEPENDS += "wotan-native"

SCA_RAW_RESULT_FILE[wotan] = "json"

def do_sca_conv_wotan(d):
    import os
    import json

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    _suppress = sca_suppress_init(d, "SCA_WOTAN_EXTRA_SUPPRESS",
                                  d.expand("${STAGING_DATADIR_NATIVE}/wotan-${SCA_MODE}-suppress"))
    _findings = []

    if os.path.exists(sca_raw_result_file(d, "wotan")):
        content = []
        with open(sca_raw_result_file(d, "wotan"), "r") as f:
            try:
                content = json.load(f)
            except json.JSONDecodeError:
                content = []
            for m in content:
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            BuildPath=buildpath,
                                            Tool="wotan",
                                            File=m["fileName"],
                                            Line=str(m["start"]["line"]),
                                            Column=str(m["start"]["character"] + 1),
                                            Message=m["message"],
                                            ID=m["ruleName"],
                                            Severity=m["severity"])
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

def exec_wrap_combine_json_wotan(a, b, **kwargs):
    import json
    try:
        b = "\n".join([x for x in b.split("\n") if not x.startswith("Rule") and not x.endswith("requires type information.")])
        b = json.loads(b)
    except:
        b = []

    try:
        a = json.loads(a)
        a += b
    except:
        a = b
    return json.dumps(a)

python do_sca_wotan_core() {
    import os
    import subprocess

    _args = ["wotan"]
    _args += ["-c", d.getVar("SCA_WOTAN_CONFIG")]
    _args += ["--fix", "false"]
    _args += ["--formatter", "json"]

    _files = get_files_by_extention(d, d.getVar("SCA_SOURCES_DIR"), d.getVar("SCA_WOTAN_FILE_FILTER"), \
                                    sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    cmd_output = exec_wrap_check_output(_args, _files, combine=exec_wrap_combine_json_wotan, default_val=[])

    with open(sca_raw_result_file(d, "wotan"), "w") as o:
        o.write(cmd_output)
}

python do_sca_wotan_core_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/wotan.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_wotan(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "wotan", get_fatal_entries(d, "SCA_WOTAN_EXTRA_FATAL",
                       d.expand("${STAGING_DATADIR_NATIVE}/wotan-${SCA_MODE}-fatal")))
}
