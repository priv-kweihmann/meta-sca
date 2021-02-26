## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

SCA_DETECTSECRETS_EXTRA_SUPPRESS ?= ""
SCA_DETECTSECRETS_EXTRA_FATAL ?= ""

SCA_RAW_RESULT_FILE[detectsecrets] = "json"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-license-filter
inherit sca-suppress
inherit sca-image-backtrack

inherit python3native

DEPENDS += "python3-detect-secrets-native"

def do_sca_conv_detectsecrets(d):
    import os
    import json

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    items = []
    __excludes = sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA"))
    __suppress = sca_suppress_init(d, "SCA_DETECTSECRETS_EXTRA_SUPPRESS",
                                    d.expand("${STAGING_DATADIR_NATIVE}/detectsecrets-${SCA_MODE}-suppress"))
    _findings = []

    if os.path.exists(sca_raw_result_file(d, "detectsecrets")):
        j = {}
        with open(sca_raw_result_file(d, "detectsecrets")) as i:
            try:
                j = json.load(i)
            except:
                pass
        if "results" in j.keys():
            for k, v in j["results"].items():
                if k in __excludes:
                    continue
                for w in v:
                    try:
                        g = sca_get_model_class(d,
                                                PackageName=package_name,
                                                Tool="detectsecrets",
                                                File=k,
                                                BuildPath=buildpath,
                                                Line=str(w["line_number"]),
                                                Message="{} found: {}".format(w["type"], w["hashed_secret"]),
                                                ID=w["type"].replace(" ", ""),
                                                Severity="warning")
                        if __suppress.Suppressed(g):
                            continue
                        if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                            continue
                        if g.Severity in sca_allowed_warning_level(d):
                            _findings += sca_backtrack_findings(d, g)
                    except Exception as exp:
                        sca_log_note(d, str(exp))

    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_detectsecrets_core() {
    import os
    import subprocess
    import json

    _args = [d.getVar("PYTHON")]
    _args += [os.path.join(d.getVar("STAGING_BINDIR_NATIVE"), "detect-secrets")]
    _args += ["scan"]
    _args += ["--all-files"]
    _args += ["--no-verify"]
    _files = get_files_by_extention(d, d.getVar("SCA_SOURCES_DIR"), "",
                                sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    cmd_output = exec_wrap_check_output(d, _args, _files, combine=exec_wrap_combine_json_subdict, key="results", default_val={"results": {}})

    with open(sca_raw_result_file(d, "detectsecrets"), "w") as o:
        o.write(cmd_output)
}

python do_sca_detectsecrets_core_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/detectsecrets.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_detectsecrets(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)
    sca_task_aftermath(d, "detectsecrets", get_fatal_entries(d, "SCA_DETECTSECRETS_EXTRA_FATAL",
                       d.expand("${STAGING_DATADIR_NATIVE}/detectsecrets-${SCA_MODE}-fatal")))
}
