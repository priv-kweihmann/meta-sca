## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

SCA_LYNIS_EXTRA_SUPPRESS ?= ""
SCA_LYNIS_EXTRA_FATAL ?= ""

SCA_RAW_RESULT_FILE[lynis] = "txt"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-license-filter
inherit sca-crossemu
inherit sca-suppress
inherit sca-image-backtrack

DEPENDS += "lynis lynis-native"

def do_sca_conv_lynis(d):
    import os
    import re

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^\s*(?P<severity>\!|\*)\s*(?P<msg>.*)\s\[(?P<id>.*)\]"

    severity_map = {
        "!" : "error",
        "*" : "warning"
    }

    _suppress = sca_suppress_init(d, clean_split(d, "SCA_LYNIS_EXTRA_SUPPRESS"),
                                  d.expand("${STAGING_DATADIR_NATIVE}/lynis-${SCA_MODE}-suppress"))
    _findings = []

    if os.path.exists(sca_raw_result_file(d, "lynis")):
        with open(sca_raw_result_file(d, "lynis"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="lynis",
                                            BuildPath=sca_get_layer_path_for_file(d, d.getVar("FILE")),
                                            File=d.getVar("FILE"),
                                            Message="{} - Details: https://cisofy.com/lynis/controls/{}".format(m.group("msg"), m.group("id")),
                                            ID=m.group("id"),
                                            Severity=severity_map[m.group("severity")])
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

sca_lynis_do_replace_var_log() {
    ## Replace symlinked /var/log by real dir
    rm ${IMAGE_ROOTFS}/var/log
    mkdir -p ${IMAGE_ROOTFS}/var/log
}

fakeroot python do_sca_lynis() {
    import os
    import subprocess

    _args = ["/bin/sh", "/usr/bin/lynis", "--verbose" ,"--no-colors", "audit", "system"]

    cmd_output, _ = sca_crossemu(d, _args, ["lynis"], "lynis", "sca_lynis_do_replace_var_log;")

    with open(sca_raw_result_file(d, "lynis"), "wb") as o:
        o.write(cmd_output)

    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/lynis.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_lynis(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "lynis", get_fatal_entries(d, clean_split(d, "SCA_LYNIS_EXTRA_FATAL"),
                        d.expand("${STAGING_DATADIR_NATIVE}/lynis-${SCA_MODE}-fatal")))
}

do_sca_lynis[doc] = "Audit image with lynis"
do_sca_lynis[nosdkgen] = "1"
addtask do_sca_lynis before do_sca_deploy after do_image

DEPENDS += "sca-image-lynis-rules-native"
