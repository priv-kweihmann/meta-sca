## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

SCA_RECONBF_EXTRA_SUPPRESS ?= ""
SCA_RECONBF_EXTRA_FATAL ?= ""
SCA_RECONBF_CONFIG ?= "${prefix}/etc/reconbf/hos.cfg"

SCA_RAW_RESULT_FILE[reconbf] = "json"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-license-filter
inherit sca-crossemu
inherit sca-suppress
inherit sca-image-backtrack

DEPENDS += "reconbf reconbf-native"

def do_sca_conv_reconbf(d):
    import os
    import json
    import hashlib

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    items = []

    __excludes = sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA"))
    _suppress = sca_suppress_init(d, "SCA_RECONBF_EXTRA_SUPPRESS",
                                  d.expand("${STAGING_DATADIR_NATIVE}/reconbf-${SCA_MODE}-suppress"))
    _findings = []

    if os.path.exists(sca_raw_result_file(d, "reconbf")):
        j = []
        try:
            with open(sca_raw_result_file(d, "reconbf")) as i:
                j = json.load(i)
        except:
            j = []
        for item in j:
            try:
                if isinstance(item["result"], str):
                    item = {"result": [item], "name": item["name"]}
                _name = item["name"]
                for sub in item["result"]:
                    if str(sub["result"]) == "FAIL":
                        if sub["name"] != _name:
                            _name += "." + hashlib.md5(str.encode(sub["name"])).hexdigest()
                        _msg = "Failed {}".format(sub["name"])
                        if "notes" in sub and sub["notes"]:
                            _msg += ": " + sub["notes"]
                        g = sca_get_model_class(d,
                                                PackageName=package_name,
                                                Tool="reconbf",
                                                BuildPath=sca_get_layer_path_for_file(d, d.getVar("FILE")),
                                                File=d.getVar("FILE"),
                                                Message=_msg,
                                                ID=_name,
                                                Severity="error")
                        if _suppress.Suppressed(g):
                            continue
                        if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                            continue
                        if g.Severity in sca_allowed_warning_level(d):
                            _findings += sca_backtrack_findings(d, g)
            except Exception as exp:
                sca_log_note(d, str(exp))

    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

fakeroot python do_sca_reconbf() {
    import os
    import subprocess

    _args = ["/bin/sh", "-c", "mkdir -p /tmp;python3 -m reconbf -c {} -rt json -dm all -rf /tmp/reconbf.result >/dev/null 2>&1;cat /tmp/reconbf.result".format(d.getVar("SCA_RECONBF_CONFIG"))]

    cmd_output, _ = sca_crossemu(d, _args, ["reconbf"], "reconbf", ";")

    if not isinstance(cmd_output, str):
        cmd_output = cmd_output.decode("utf-8")
    with open(sca_raw_result_file(d, "reconbf"), "w") as o:
        if not cmd_output.startswith("["):
            cmd_output = cmd_output[cmd_output.find("["):]
        o.write(cmd_output)

    # Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/reconbf.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_reconbf(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "reconbf", get_fatal_entries(d, "SCA_RECONBF_EXTRA_FATAL",
                        d.expand("${STAGING_DATADIR_NATIVE}/reconbf-${SCA_MODE}-fatal")))
}

do_sca_reconbf[doc] = "Run reconbf audit on image"
addtask do_sca_reconbf before do_sca_deploy after do_image

DEPENDS += "sca-image-reconbf-rules-native"
