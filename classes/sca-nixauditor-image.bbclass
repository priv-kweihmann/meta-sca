## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

SCA_NIXAUDITOR_EXTRA_SUPPRESS ?= ""
SCA_NIXAUDITOR_EXTRA_FATAL ?= ""

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-license-filter
inherit sca-crossemu
inherit sca-suppress

DEPENDS += "nixauditor nixauditor-native"

def do_sca_conv_nixauditor(d):
    import os
    import re
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^(?P<id>.*)\sFailed"

    _suppress = sca_suppress_init(d)
    _findings = []

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        with open(d.getVar("SCA_RAW_RESULT_FILE"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="nixauditor",
                                            BuildPath=buildpath,
                                            File=d.getVar("FILE"),
                                            Message="Check for {} failed".format(m.group("id")),
                                            ID=m.group("id").replace(" ", "_"),
                                            Severity="warning")
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

fakeroot python do_sca_nixauditor() {
    import os
    import subprocess

    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_NIXAUDITOR_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_NIXAUDITOR_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "nixauditor-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "nixauditor-{}-fatal".format(d.getVar("SCA_MODE"))))

    result_raw_file = os.path.join(d.getVar("T"), "sca_raw_nixauditor.txt")
    d.setVar("SCA_RAW_RESULT_FILE", result_raw_file)

    _args = ["/bin/sh", "-c", "/usr/bin/nixauditor | sed 's/\x1b\[[0-9;]*m//g'"]

    cmd_output = sca_crossemu(d, _args, ["nixauditor"], "nixauditor", ";")

    with open(result_raw_file, "wb") as o:
        o.write(cmd_output)

    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/nixauditor.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_nixauditor(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "nixauditor", get_fatal_entries(d))
}

SCA_DEPLOY_TASK = "do_sca_deploy_nixauditor_image"

python do_sca_deploy_nixauditor_image() {
    sca_conv_deploy(d, "nixauditor", "txt")
}

addtask do_sca_nixauditor before do_image_complete after do_image
addtask do_sca_deploy_nixauditor_image before do_image_complete after do_sca_nixauditor

do_sca_nixauditor[depends] += "${@oe.utils.conditional('SCA_FORCE_RUN', '1', '${PN}:do_sca_do_force_meta_task', '', d)}"
do_sca_deploy_nixauditor_image[depends] += "${@oe.utils.conditional('SCA_FORCE_RUN', '1', '${PN}:do_sca_do_force_meta_task', '', d)}"

DEPENDS += "sca-image-nixauditor-rules-native"