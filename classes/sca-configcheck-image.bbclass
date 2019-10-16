## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

SCA_CONFIGCHECK_EXTRA_SUPPRESS ?= ""
SCA_CONFIGCHECK_EXTRA_FATAL ?= ""
SCA_CONFIGCHECK_MODULES ?= "\
                            freeradius \
                            nftables \
                            nginx \
                            sshd \
                           "

## Glob where to look for nftables-rules
SCA_CONFIGCHECK_nftables_FILEGLOB ?= "/etc/nft/rules/*"
## Path to base dir where to look for nftables includes
SCA_CONFIGCHECK_nftables_INCLUDEDIR ?= "/etc/nft/rules"
## Path of used nginx config
SCA_CONFIGCHECK_nginx_CONFIGFILE ?= "/etc/nginx/nginx.conf"
## Path of used sshd config
SCA_CONFIGCHECK_sshd_CONFIGFILE ?= "/etc/ssh/sshd_config"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-license-filter
inherit sca-crossemu

def do_sca_configcheck_run_freeradius(d):
    return ["/bin/sh", "-c", "[ ! -z $(which radiusd) ] && mkdir -p /tmp && radiusd -C -l /tmp/radius_check; cat /tmp/radius_check"]

def do_sca_configcheck_run_nftables(d):
    return ["/bin/sh", "-c", "[ ! -z $(which nft) ] && for f in {};do nft -c -I {} -f $f; done".format(d.getVar("SCA_CONFIGCHECK_nftables_FILEGLOB"), d.getVar("SCA_CONFIGCHECK_nftables_INCLUDEDIR"))]

def do_sca_configcheck_run_nginx(d):
    return ["/bin/sh", "-c", "[ ! -z $(which nginx) ] && nginx -T -c {}".format(d.getVar("SCA_CONFIGCHECK_nginx_CONFIGFILE"))]

def do_sca_configcheck_run_sshd(d):
    return ["/bin/sh", "-c", "[ ! -z $(which sshd) ] && /usr/libexec/openssh/sshd_check_keys && sshd -T -f {}".format(d.getVar("SCA_CONFIGCHECK_sshd_CONFIGFILE"))]

def do_sca_configcheck_conv_nginx(d, toolout, suppress):
    import os
    import re

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^(nginx:|.*)\s+\[(?P<severity>.*)\]\s+(?P<msg>.*)\s+in\s+(?P<file>.*):(?P<line>\d+)"

    severity_map = {
        "emerg" : "error",
    }

    _findings = []

    for m in re.finditer(pattern, toolout, re.MULTILINE):
        try:
            g = sca_get_model_class(d,
                                    PackageName=package_name,
                                    Tool="configcheck",
                                    BuildPath=buildpath,
                                    File=m.group("file"),
                                    Line=m.group("line"),
                                    Message=m.group("msg").strip(),
                                    ID="nginx",
                                    Severity=severity_map[m.group("severity")])
            if g.GetFormattedID() in suppress:
                continue
            if not sca_is_in_finding_scope(d, "configcheck", g.GetFormattedID()):
                continue
            if g.Severity in sca_allowed_warning_level(d):
                _findings.append(g)
        except Exception as exp:
            bb.warn(str(exp))

    return _findings

def do_sca_configcheck_conv_freeradius(d, toolout, suppress):
    import os
    import re

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^.*:\s+(?P<severity>Error|Warning):\s*\[(?P<file>.*)\]:(?P<line>\d+)\s+(?P<msg>.*)"

    severity_map = {
        "Error" : "error",
        "Warning": "warning"
    }

    _findings = []

    for m in re.finditer(pattern, toolout, re.MULTILINE):
        try:
            g = sca_get_model_class(d,
                                    PackageName=package_name,
                                    Tool="configcheck",
                                    BuildPath=buildpath,
                                    Line=m.group("line"),
                                    File=m.group("file"),
                                    Message=m.group("msg").strip(),
                                    ID="freeradius",
                                    Severity=severity_map[m.group("severity")])
            if g.GetFormattedID() in suppress:
                continue
            if not sca_is_in_finding_scope(d, "configcheck", g.GetFormattedID()):
                continue
            if g.Severity in sca_allowed_warning_level(d):
                _findings.append(g)
        except Exception as exp:
            bb.warn(str(exp))

    return _findings

def do_sca_configcheck_conv_sshd(d, toolout, suppress):
    import os
    import re

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^(?P<file>.*)\s+line\s+(?P<line>\d+):\s+(?P<msg>.*)"

    _findings = []

    for m in re.finditer(pattern, toolout, re.MULTILINE):
        try:
            g = sca_get_model_class(d,
                                    PackageName=package_name,
                                    Tool="configcheck",
                                    BuildPath=buildpath,
                                    File=m.group("file"),
                                    Line=m.group("line"),
                                    Message=m.group("msg").strip(),
                                    ID="sshd",
                                    Severity="error")
            if g.GetFormattedID() in suppress:
                continue
            if not sca_is_in_finding_scope(d, "configcheck", g.GetFormattedID()):
                continue
            if g.Severity in sca_allowed_warning_level(d):
                _findings.append(g)
        except Exception as exp:
            bb.warn(str(exp))

    return _findings

def do_sca_configcheck_conv_nftables(d, toolout, suppress):
    import os
    import re

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^(?P<file>.*):(?P<line>\d+):(?P<col>\d+)-\d+:\s+(?P<severity>.*):\s+(?P<msg>.*)"

    _findings = []

    severity_map = {
        "Error" : "error",
        "Warning": "warning"
    }

    for m in re.finditer(pattern, toolout, re.MULTILINE):
        try:
            g = sca_get_model_class(d,
                                    PackageName=package_name,
                                    Tool="configcheck",
                                    BuildPath=buildpath,
                                    File=m.group("file"),
                                    Line=m.group("line"),
                                    Column=m.group("col"),
                                    Message=m.group("msg").strip(),
                                    ID="nftables",
                                    Severity=severity_map[m.group("severity")])
            if g.GetFormattedID() in suppress:
                continue
            if not sca_is_in_finding_scope(d, "configcheck", g.GetFormattedID()):
                continue
            if g.Severity in sca_allowed_warning_level(d):
                _findings.append(g)
        except Exception as exp:
            bb.warn(str(exp))

    return _findings

def do_sca_conv_configcheck(d, findings):
    sca_add_model_class_list(d, findings)
    return sca_save_model_to_string(d)

sca_configcheck_prepare() {
    ## openssl requires /dev/null for key generation
    mkdir -p ${IMAGE_ROOTFS}/dev || true
    mknod ${IMAGE_ROOTFS}/dev/null c 1 3 || true
    chmod 666 ${IMAGE_ROOTFS}/dev/null || true

    ## nginx requires its log dir
    mkdir -p ${IMAGE_ROOTFS}/var/log/nginx/ || true

    ## create at least the configured include dir of nftables
    mkdir -p ${IMAGE_ROOTFS}${SCA_CONFIGCHECK_nftables_INCLUDEDIR} || true
}

fakeroot python do_sca_configcheck() {
    import os
    import subprocess

    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_TIGER_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_TIGER_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "configcheck-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "configcheck-{}-fatal".format(d.getVar("SCA_MODE"))))

    result_raw_file = os.path.join(d.getVar("T"), "sca_raw_configcheck.txt")
    d.setVar("SCA_RAW_RESULT_FILE", result_raw_file)

    cmd_output = ""

    ## Create rootfs first
    sca_crossemu(d, None, [], "configcheck", "sca_configcheck_prepare;")

    _raw_findings = []
    _suppress = get_suppress_entries(d)

    for mod in clean_split(d, "SCA_CONFIGCHECK_MODULES"):
        _run_args_name = "do_sca_configcheck_run_{}".format(mod)
        _conv_args_name = "do_sca_configcheck_conv_{}".format(mod)
        try:
            _args = sca_get_func_by_name(d, _run_args_name)(d)
            _cmd_output = sca_crossemu(d, _args, [], "configcheck", ";", nocreateroot=True)
            if _cmd_output:
                _cmd_output = _cmd_output.decode("utf-8")
                cmd_output += _cmd_output + "\n###########\n"
                _raw_findings += sca_get_func_by_name(d, _conv_args_name)(d, _cmd_output, _suppress)
        except NotImplementedError:
            pass
        except Exception as e:
            bb.warn(str(e))

    with open(result_raw_file, "w") as o:
        o.write(cmd_output)

    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/configcheck.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_configcheck(d, _raw_findings)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "configcheck", get_fatal_entries(d))
}

SCA_DEPLOY_TASK = "do_sca_deploy_configcheck_image"

python do_sca_deploy_configcheck_image() {
    sca_conv_deploy(d, "configcheck", "txt")
}

addtask do_sca_configcheck before do_image_complete after do_image
addtask do_sca_deploy_configcheck_image before do_image_complete after do_sca_configcheck

do_sca_configcheck[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_configcheck_image[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "configcheck-sca-native sca-image-configcheck-rules-native"