## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

SCA_LYNIS_EXTRA_SUPPRESS ?= ""
SCA_LYNIS_EXTRA_FATAL ?= ""

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-license-filter
inherit sca-crossemu
inherit sca-suppress

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

    _suppress = sca_suppress_init(d)
    _findings = []

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        with open(d.getVar("SCA_RAW_RESULT_FILE"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="lynis",
                                            BuildPath=buildpath,
                                            File=d.getVar("FILE"),
                                            Message="{} - Details: https://cisofy.com/lynis/controls/{}".format(m.group("msg"), m.group("id")),
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

sca_lynis_do_replace_var_log() {
    ## Replace symlinked /var/log by real dir
    rm ${IMAGE_ROOTFS}/var/log
    mkdir -p ${IMAGE_ROOTFS}/var/log
}

fakeroot python do_sca_lynis() {
    import os
    import subprocess

    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_LYNIS_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_LYNIS_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "lynis-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "lynis-{}-fatal".format(d.getVar("SCA_MODE"))))

    result_raw_file = os.path.join(d.getVar("T"), "sca_raw_lynis.txt")
    d.setVar("SCA_RAW_RESULT_FILE", result_raw_file)

    _args = ["/bin/sh", "/usr/bin/lynis", "--verbose" ,"--no-colors", "audit", "system"]

    cmd_output = sca_crossemu(d, _args, ["lynis"], "lynis", "sca_lynis_do_replace_var_log;")

    with open(result_raw_file, "wb") as o:
        o.write(cmd_output)

    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/lynis.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_lynis(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "lynis", get_fatal_entries(d))
}

SCA_DEPLOY_TASK = "do_sca_deploy_lynis_image"

python do_sca_deploy_lynis_image() {
    sca_conv_deploy(d, "lynis", "txt")
}

addtask do_sca_lynis before do_image_complete after do_image
addtask do_sca_deploy_lynis_image before do_image_complete after do_sca_lynis

do_sca_lynis[depends] += "${@oe.utils.conditional('SCA_FORCE_RUN', '1', '${PN}:do_sca_do_force_meta_task', '', d)}"
do_sca_deploy_lynis_image[depends] += "${@oe.utils.conditional('SCA_FORCE_RUN', '1', '${PN}:do_sca_do_force_meta_task', '', d)}"

DEPENDS += "sca-image-lynis-rules-native"