## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2021, Konrad Weihmann

SCA_SECRETLINT_EXTRA_SUPPRESS ?= ""
SCA_SECRETLINT_EXTRA_FATAL ?= ""
SCA_SECRETLINT_RULES ?= "\
    @secretlint/secretlint-rule-no-dotenv \
    @secretlint/secretlint-rule-no-homedir \
    @secretlint/secretlint-rule-no-k8s-kind-secret \
    @secretlint/secretlint-rule-preset-recommend \
    @secretlint/secretlint-rule-secp256k1-privatekey \
"

SCA_RAW_RESULT_FILE[secretlint] = "json"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-license-filter
inherit sca-suppress
inherit sca-image-backtrack

inherit python3native

DEPENDS += "secretlint-sca-native"

def do_sca_conv_secretlint(d):
    import os
    import json

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    items = []
    __excludes = sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA"))
    __suppress = sca_suppress_init(d, "SCA_SECRETLINT_EXTRA_SUPPRESS",
                                    d.expand("${STAGING_DATADIR_NATIVE}/secretlint-${SCA_MODE}-suppress"))
    _findings = []

    __severity_map = {
        2: "error",
        1: "warning",
        0: "info"
    }

    if os.path.exists(sca_raw_result_file(d, "secretlint")):
        j = []
        with open(sca_raw_result_file(d, "secretlint")) as i:
            try:
                j = json.load(i)
            except:
                pass
            for item in j:
                if item["filePath"] in __excludes:
                    continue
                for msg in item["messages"]:
                    try:
                        g = sca_get_model_class(d,
                                                PackageName=package_name,
                                                Tool="secretlint",
                                                File=item["filePath"],
                                                BuildPath=buildpath,
                                                Line=str(msg["line"]),
                                                Column=str(msg["column"]),
                                                Message=msg["message"],
                                                ID=msg["ruleId"].split(">")[-1].strip(),
                                                Severity=__severity_map[msg["severity"]])
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

python do_sca_secretlint_core() {
    import os
    import json

    _args = ["secretlint"]
    _args += ["--format", "json"]
    _args += ["--secretlintrc", d.expand("${T}/secretlint.config")]

    # create the runtime config
    _config = {
        "rules": [
        ]
    }
    for rule in clean_split(d, "SCA_SECRETLINT_RULES"):
        _config["rules"].append({"id": rule})

    with open(d.expand("${T}/secretlint.config"), "w") as o:
        json.dump(_config, o)

    _files = get_files(d, d.getVar("SCA_SOURCES_DIR"),
            sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    cmd_output = exec_wrap_check_output(d, _args, _files, chunk_size=50, combine=exec_wrap_combine_json, default_val=[])

    with open(sca_raw_result_file(d, "secretlint"), "w") as o:
        o.write(cmd_output)
}

python do_sca_secretlint_core_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/secretlint.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_secretlint(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)
    sca_task_aftermath(d, "secretlint", get_fatal_entries(d, "SCA_SECRETLINT_EXTRA_FATAL",
                       d.expand("${STAGING_DATADIR_NATIVE}/secretlint-${SCA_MODE}-fatal")))
}
