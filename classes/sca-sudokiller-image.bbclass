## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

SCA_SUDOKILLER_EXTRA_SUPPRESS ?= ""
SCA_SUDOKILLER_EXTRA_FATAL ?= ""
SCA_SUDOKILLER_PASSWORD ?= ""

SCA_RAW_RESULT_FILE[sudokiller] = "txt"

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

    _suppress = sca_suppress_init(d, "SCA_SUDOKILLER_EXTRA_SUPPRESS",
                                  d.expand("${STAGING_DATADIR_NATIVE}/sudokiller-${SCA_MODE}-suppress"))
    _findings = []

    if os.path.exists(sca_raw_result_file(d, "sudokiller")):
        with open(sca_raw_result_file(d, "sudokiller"), "r") as f:
            _content = f.read()
            for m in re.finditer(pattern, _content, re.MULTILINE):
                try:
                    _msg = m.group("msg").strip().rstrip(":")
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="sudokiller",
                                            BuildPath=sca_get_layer_path_for_file(d, d.getVar("FILE")),
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
                                            BuildPath=sca_get_layer_path_for_file(d, d.getVar("FILE")),
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

    _password = ""
    if d.getVar("SCA_SUDOKILLER_PASSWORD"):
        _password = "-s \"{}\"".format(d.getVar("SCA_SUDOKILLER_PASSWORD"))
    _args = ["/bin/sh", "-c", "[ ! -z \"$(which sudo)\" ] && cd /usr/bin/sudokiller && ./sudokiller -c {} | sed 's/\x1b\[[0-9;]*m//g'".format(_password)]

    cmd_output, _ = sca_crossemu(d, _args, ["sudokiller"], "sudokiller", ";")

    with open(sca_raw_result_file(d, "sudokiller"), "wb") as o:
        o.write(cmd_output)

    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/sudokiller.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_sudokiller(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "sudokiller", get_fatal_entries(d, "SCA_SUDOKILLER_EXTRA_FATAL",
                       d.expand("${STAGING_DATADIR_NATIVE}/sudokiller-${SCA_MODE}-fatal")))
}

SCA_DEPLOY_TASK = "do_sca_deploy_sudokiller_image"

python do_sca_deploy_sudokiller_image() {
    sca_conv_deploy(d, "sudokiller")
}

do_sca_sudokiller[doc] = "Find exploitable CVEs of sudo in image"
do_sca_deploy_sudokiller_image[doc] = "Deploy results of do_sca_sudokiller"
addtask do_sca_sudokiller before do_image_complete after do_image
addtask do_sca_deploy_sudokiller_image before do_image_complete after do_sca_sudokiller

# FIXME: DEPENDS += "sca-image-sudokiller-rules-native"
