## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2020, Konrad Weihmann

SCA_LSE_EXTRA_SUPPRESS ?= ""
SCA_LSE_EXTRA_FATAL ?= ""
SCA_LSE_MODULES ?= "usr sud fst sys sec ret"

SCA_RAW_RESULT_FILE[lse] = "txt"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-license-filter
inherit sca-crossemu
inherit sca-suppress

DEPENDS += "linux-smart-enumeration linux-smart-enumeration-native sca-image-lse-rules-native"

def do_sca_conv_lse(d):
    import os
    import re

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    _severity_map = {
        "!": "error",
        "*": "warning",
        "i": "info"
    }

    pattern = r"^\[(?P<sev>.)\]\s+(?P<id>[a-z0-9]+)\s+(?P<msg>.*?)\.+\s+yes!"

    _suppress = sca_suppress_init(d, "SCA_LSE_EXTRA_SUPPRESS",
                                  d.expand("${STAGING_DATADIR_NATIVE}/lse-${SCA_MODE}-suppress"))
    _findings = []

    if os.path.exists(sca_raw_result_file(d, "lse")):
        with open(sca_raw_result_file(d, "lse"), "r") as f:
            _content = f.read()
            for m in re.finditer(pattern, _content, re.MULTILINE):
                try:
                    _msg = m.group("msg").strip().rstrip("?")
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="lse",
                                            BuildPath=sca_get_layer_path_for_file(d, d.getVar("FILE")),
                                            File=d.getVar("FILE"),
                                            Message=_msg,
                                            ID=m.group("id"),
                                            Severity=_severity_map[m.group("sev")])
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

fakeroot python do_sca_lse() {
    import os
    import subprocess

    _args = ["/bin/sh", "-c", "lse.sh -l 1 -p 1 -i -s {} | sed -r 's/\x1b\[[0-9;]*m//g'".format(",".join(clean_split(d, "SCA_LSE_MODULES")))]

    cmd_output, _ = sca_crossemu(d, _args, ["linux-smart-enumeration"], "lse", ";")

    with open(sca_raw_result_file(d, "lse"), "wb") as o:
        o.write(cmd_output)

    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/lse.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_lse(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "lse", get_fatal_entries(d, "SCA_LSE_EXTRA_FATAL",
                       d.expand("${STAGING_DATADIR_NATIVE}/lse-${SCA_MODE}-fatal")))
}

do_sca_lse[doc] = "Find security weaknesses in a image"
addtask do_sca_lse before do_sca_deploy after do_image
