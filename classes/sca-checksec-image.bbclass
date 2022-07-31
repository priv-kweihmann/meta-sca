## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2021, Konrad Weihmann

SCA_CHECKSEC_EXTRA_SUPPRESS ?= ""
SCA_CHECKSEC_EXTRA_FATAL ?= ""

SCA_CHECKSEC_CHECKS ?= "canary nx pie relro rpath safestack symbols"
SCA_CHECKSEC_CHECKS[canary] ?= "yes"
SCA_CHECKSEC_CHECKS[msg-canary] ?= "binary should have stack canary enabled"
SCA_CHECKSEC_CHECKS[nx] ?= "yes"
SCA_CHECKSEC_CHECKS[msg-nx] ?= "NX bit should be set"
SCA_CHECKSEC_CHECKS[pie] ?= "dso"
SCA_CHECKSEC_CHECKS[msg-pie] ?= "PIE should be enabled"
SCA_CHECKSEC_CHECKS[relro] ?= "full"
SCA_CHECKSEC_CHECKS[msg-relro] ?= "Relocation Read-Only should be enabled"
SCA_CHECKSEC_CHECKS[rpath] ?= "yes"
SCA_CHECKSEC_CHECKS[msg-rpath] ?= "RPATH should be set in binary"
SCA_CHECKSEC_CHECKS[safestack] ?= "yes"
SCA_CHECKSEC_CHECKS[msg-safestack] ?= "binary should be compiled stacksafe"
SCA_CHECKSEC_CHECKS[symbols] ?= "no"
SCA_CHECKSEC_CHECKS[msg-symbols] ?= "binary should not contain symbols"

SCA_RAW_RESULT_FILE[checksec] = "txt"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-license-filter
inherit sca-crossemu
inherit sca-suppress
inherit sca-image-backtrack

DEPENDS += "checksec checksec-native sca-image-checksec-rules-native"

def do_sca_conv_checksec(d):
    import os
    import json

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    _suppress = sca_suppress_init(d, clean_split(d, "SCA_CHECKSEC_EXTRA_SUPPRESS"),
                                  d.expand("${STAGING_DATADIR_NATIVE}/checksec-${SCA_MODE}-suppress"))
    _findings = []

    if os.path.exists(sca_raw_result_file(d, "checksec")):
        with open(sca_raw_result_file(d, "checksec"), "r") as f:
            for m in f.readlines():
                try:
                    if m.startswith("{"):
                        try:
                            j = json.loads(m)
                        except JSONDecodeError:
                            continue
                        for check in clean_split(d, "SCA_CHECKSEC_CHECKS"):
                            _msg = d.getVarFlag("SCA_CHECKSEC_CHECKS", "msg-{}".format(check)) or ""
                            _val = d.getVarFlag("SCA_CHECKSEC_CHECKS", check) or ""
                            if not _msg or not _val:
                                continue
                            for k, v in j.items():
                                if v[check] != _val:
                                    g = sca_get_model_class(d,
                                                            PackageName=package_name,
                                                            Tool="checksec",
                                                            BuildPath=sca_get_layer_path_for_file(d, d.getVar("FILE")),
                                                            File=k.lstrip("/"),
                                                            Message=_msg,
                                                            ID=check,
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

fakeroot python do_sca_checksec() {
    import os
    import subprocess

    _args = ["/bin/sh", "-c", "find / -type f -exec checksec --extended --output=json --file={} \;"]

    cmd_output, _ = sca_crossemu(d, _args, ["checksec"], "checksec", ";")

    cmd_output = cmd_output.decode("utf-8").replace("grep: /dev/fd/63: No such file or directory\n", "")
    cmd_output = cmd_output.replace("bash: warning: setlocale: LC_ALL: cannot change locale (en_US.UTF-8)", "")

    with open(sca_raw_result_file(d, "checksec"), "w") as o:
        o.write(cmd_output)

    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/checksec.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_checksec(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "checksec", get_fatal_entries(d, clean_split(d, "SCA_CHECKSEC_EXTRA_FATAL"),
                       d.expand("${STAGING_DATADIR_NATIVE}/checksec-${SCA_MODE}-fatal")))
}

do_sca_checksec[doc] = "Find security weaknesses in binaries"
do_sca_checksec[nosdkgen] = "1"
addtask do_sca_checksec before do_sca_deploy after do_image
