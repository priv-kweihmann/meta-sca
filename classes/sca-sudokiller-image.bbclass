## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

SCA_SUDOKILLER_EXTRA_SUPPRESS ?= ""
SCA_SUDOKILLER_EXTRA_FATAL ?= ""
SCA_SUDOKILLER_PASSWORD ?= ""

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-license-filter
inherit sca-crossemu
inherit sca-suppress

DEPENDS += "sudokiller sudokiller-native"

def do_sca_conv_sudokiller(d):
    import os
    import re
    import hashlib
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^\[\-]\s+(?P<msg>.*)(\:+|\s+)"
    cve_pattern = r"^\[\+\]\s+Please\s+find the following exploit for (?P<msg>[A-Z\-0-9]+) in the exploits' directory"

    _suppress = sca_suppress_init(d)
    _findings = []

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        with open(d.getVar("SCA_RAW_RESULT_FILE"), "r") as f:
            _content = f.read()
            for m in re.finditer(pattern, _content, re.MULTILINE):
                try:
                    _msg = m.group("msg").strip().rstrip(":")
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="sudokiller",
                                            BuildPath=buildpath,
                                            File=d.getVar("FILE"),
                                            Message=_msg,
                                            ID=hashlib.md5(str.encode(_msg)).hexdigest(),
                                            Severity="error")
                    if _suppress.Suppressed(g):
                        continue
                    if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                        continue
                    if g.Severity in sca_allowed_warning_level(d):
                        _findings.append(g)
                except Exception as exp:
                    bb.warn(str(exp))
            for m in re.finditer(cve_pattern, _content, re.MULTILINE):
                try:
                    _msg = "sudo is vulnerable to {}".format(m.group("msg"))
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="sudokiller",
                                            BuildPath=buildpath,
                                            File=d.getVar("FILE"),
                                            Message=_msg,
                                            ID="cve",
                                            Severity="error")
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

fakeroot python do_sca_sudokiller() {
    import os
    import subprocess

    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_SUDOKILLER_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_SUDOKILLER_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "sudokiller-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "sudokiller-{}-fatal".format(d.getVar("SCA_MODE"))))

    result_raw_file = os.path.join(d.getVar("T"), "sca_raw_sudokiller.txt")
    d.setVar("SCA_RAW_RESULT_FILE", result_raw_file)

    _password = ""
    if d.getVar("SCA_SUDOKILLER_PASSWORD"):
        _password = "-s \"{}\"".format(d.getVar("SCA_SUDOKILLER_PASSWORD"))
    _args = ["/bin/sh", "-c", "[ ! -z \"$(which sudo)\" ] && cd /usr/bin/sudokiller && ./sudokiller -c {} | sed 's/\x1b\[[0-9;]*m//g'".format(_password)]

    cmd_output = sca_crossemu(d, _args, ["sudokiller"], "sudokiller", ";")

    with open(result_raw_file, "wb") as o:
        o.write(cmd_output)

    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/sudokiller.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_sudokiller(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "sudokiller", get_fatal_entries(d))
}

SCA_DEPLOY_TASK = "do_sca_deploy_sudokiller_image"

python do_sca_deploy_sudokiller_image() {
    sca_conv_deploy(d, "sudokiller", "txt")
}

addtask do_sca_sudokiller before do_image_complete after do_image
addtask do_sca_deploy_sudokiller_image before do_image_complete after do_sca_sudokiller

do_sca_sudokiller[depends] += "${@oe.utils.conditional('SCA_FORCE_RUN', '1', '${PN}:do_sca_do_force_meta_task', '', d)}"
do_sca_deploy_sudokiller_image[depends] += "${@oe.utils.conditional('SCA_FORCE_RUN', '1', '${PN}:do_sca_do_force_meta_task', '', d)}"

# FIXME: DEPENDS += "sca-image-sudokiller-rules-native"
