## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

SCA_PROSELINT_EXTRA_SUPPRESS ?= ""
SCA_PROSELINT_EXTRA_FATAL ?= ""
SCA_PROSELINT_FILE_FILTER ?= ".txt .md .rst .me"

SCA_RAW_RESULT_FILE[proselint] = "json"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-license-filter
inherit sca-suppress

inherit python3native

DEPENDS += "python3-proselint-native"

def do_sca_conv_proselint(d):
    import os
    import json

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    items = []

    _suppress = sca_suppress_init(d, "SCA_PROSELINT_EXTRA_SUPPRESS", 
                                    d.expand("${STAGING_DATADIR_NATIVE}/proselint-${SCA_MODE}-suppress"))
    _findings = []

    if os.path.exists(sca_raw_result_file(d, "proselint")):
        jobj = {}
        try:
            with open(sca_raw_result_file(d, "proselint")) as f:
                jobj = json.load(f)
        except Exception as e:
            pass
        for _file, _vals in jobj.items():
            if "data" in _vals.keys() and "errors" in _vals["data"].keys():
                for item in _vals["data"]["errors"]:
                    try:
                        g = sca_get_model_class(d,
                                                PackageName=package_name,
                                                Tool="proselint",
                                                BuildPath=buildpath,
                                                File=_file,
                                                Column=str(item["column"]),
                                                Line=str(item["line"]),
                                                Message=item["message"],
                                                ID=item["check"],
                                                Severity=item["severity"])
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

python do_sca_proselint_core() {
    import os
    import subprocess
    import json

    _args = [os.path.join(d.getVar("STAGING_BINDIR_NATIVE"), "proselint")]
    _args += ["-j"]
    _files = get_files_by_extention(d, d.getVar("SCA_SOURCES_DIR"), d.getVar("SCA_PROSELINT_FILE_FILTER"),
                                sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    json_output = {}
    if any(_files):
        try:
            _ = subprocess.check_output(["proselint", "--clean"], universal_newlines=True)
        except subprocess.CalledProcessError as e:
            pass

    os.environ["XDG_CACHE_HOME"] = os.path.join(d.getVar("T"), "proselint")

    for _f in _files:
        try:
            cmd_output = subprocess.check_output(_args + [_f], universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            cmd_output = e.stdout or ""
        try:
            if not cmd_output.startswith("{"):
                cmd_output = cmd_output[cmd_output.find("{"):]
            x = json.loads(cmd_output)
            json_output[_f] = x
        except Exception as e:
            bb.warn(cmd_output)
            bb.warn(str(e))

    try:
        _ = subprocess.check_output(["proselint", "--clean"], universal_newlines=True)
    except subprocess.CalledProcessError as e:
        pass

    with open(sca_raw_result_file(d, "proselint"), "w") as o:
        json.dump(json_output, o)
}

python do_sca_proselint_core_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/proselint.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_proselint(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "proselint", get_fatal_entries(d, "SCA_PROSELINT_EXTRA_FATAL", 
                        d.expand("${STAGING_DATADIR_NATIVE}/proselint-${SCA_MODE}-fatal")))
}
