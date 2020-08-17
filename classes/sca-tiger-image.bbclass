## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

SCA_TIGER_EXTRA_SUPPRESS ?= ""
SCA_TIGER_EXTRA_FATAL ?= ""

SCA_RAW_RESULT_FILE[tiger] = "txt"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-license-filter
inherit sca-crossemu
inherit sca-suppress

DEPENDS += "tiger tiger-native"

def do_sca_conv_tiger(d):
    import os
    import re

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^--(?P<severity>ERROR|WARN)--\s*\[(?P<id>.*)\]\s*(?P<msg>.*)"

    severity_map = {
        "ERROR" : "error",
        "WARN" : "warning"
    }

    _suppress = sca_suppress_init(d, "SCA_TIGER_EXTRA_SUPPRESS",
                                  d.expand("${STAGING_DATADIR_NATIVE}/tiger-${SCA_MODE}-suppress"))
    _findings = []

    if os.path.exists(sca_raw_result_file(d, "tiger")):
        with open(sca_raw_result_file(d, "tiger"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    if m.group("msg").find("/usr/share/tiger") != -1:
                        ## Sometimes there are internal message spamming the log
                        continue
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="tiger",
                                            BuildPath=sca_get_layer_path_for_file(d, d.getVar("FILE")),
                                            File=d.getVar("FILE"),
                                            Message=m.group("msg").strip(),
                                            ID=m.group("id"),
                                            Severity=severity_map[m.group("severity")])
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

fakeroot python do_sca_tiger() {
    import os
    import subprocess

    _args = ["/bin/sh", "-c", "/usr/bin/tiger && cat /usr/share/tiger/security.report.*"]

    cmd_output, _ = sca_crossemu(d, _args, ["tiger"], "tiger", ";")

    with open(sca_raw_result_file(d, "tiger"), "wb") as o:
        o.write(cmd_output)

    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/tiger.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_tiger(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "tiger", get_fatal_entries(d, "SCA_TIGER_EXTRA_FATAL",
                       d.expand("${STAGING_DATADIR_NATIVE}/tiger-${SCA_MODE}-fatal")))
}

SCA_DEPLOY_TASK = "do_sca_deploy_tiger_image"

python do_sca_deploy_tiger_image() {
    sca_conv_deploy(d, "tiger")
}

do_sca_tiger[doc] = "Run audit with tiger on image"
do_sca_deploy_tiger_image[doc] = "Deploy results of do_sca_tiger"
addtask do_sca_tiger before do_image_complete after do_image
addtask do_sca_deploy_tiger_image before do_image_complete after do_sca_tiger

DEPENDS += "sca-image-tiger-rules-native"
