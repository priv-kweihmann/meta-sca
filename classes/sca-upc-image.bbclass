## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

SCA_UPC_EXTRA_SUPPRESS ?= ""
SCA_UPC_EXTRA_FATAL ?= ""
SCA_UPC_MODULES ?= "\
                    credentials \
                    devices_options \
                    devices_permission \
                    gpg_agent \
                    group_writable \
                    history_readable \
                    homedirs_executable \
                    homedirs_writable \
                    jar \
                    key_material \
                    ldap_authentication \
                    nis_authentication \
                    passwd_hashes \
                    postgresql_configuration \
                    postgresql_connection \
                    postgresql_trust \
                    privileged_arguments \
                    privileged_banned \
                    privileged_change_privileges \
                    privileged_chroot \
                    privileged_dependency \
                    privileged_environment_variables \
                    privileged_nx \
                    privileged_path \
                    privileged_pie \
                    privileged_random \
                    privileged_relro \
                    privileged_rpath \
                    privileged_ssp \
                    privileged_tmp \
                    privileged_writable \
                    setgid \
                    setuid \
                    shadow_hashes \
                    ssh_agent \
                    ssh_key \
                    sudo \
                    system_aslr \
                    system_configuration \
                    system_libraries \
                    system_mmap \
                    system_nx \
                    "

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-license-filter
inherit sca-crossemu

DEPENDS += "upc upc-native"

def do_sca_conv_upc(d):
    import os
    import re
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^(?P<severity>W|E):\s+\[(?P<id>.*)\]\s+(?P<msg>.*)"

    severity_map = {
        "E" : "error",
        "W" : "warning"
    }

    _suppress = get_suppress_entries(d)
    _findings = []

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        with open(d.getVar("SCA_RAW_RESULT_FILE"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="upc",
                                            BuildPath=buildpath,
                                            File=d.getVar("FILE"),
                                            Message=m.group("msg").strip(),
                                            ID=m.group("id"),
                                            Severity=severity_map[m.group("severity")])
                    if g.GetFormattedID() in _suppress:
                        continue
                    if not sca_is_in_finding_scope(d, "upc", g.GetFormattedID()):
                        continue
                    if g.Severity in sca_allowed_warning_level(d):
                        _findings.append(g)
                except Exception as exp:
                    bb.warn(str(exp))

    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

fakeroot python do_sca_upc() {
    import os
    import subprocess

    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_UPC_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_UPC_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "upc-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "upc-{}-fatal".format(d.getVar("SCA_MODE"))))

    result_raw_file = os.path.join(d.getVar("T"), "sca_raw_upc.txt")
    d.setVar("SCA_RAW_RESULT_FILE", result_raw_file)

    _args = ["/bin/sh", "-c", "cd /usr/bin/upc && ./upc.sh --checks {}".format(",".join(clean_split(d, "SCA_UPC_MODULES")))]

    cmd_output = sca_crossemu(d, _args, ["upc"], "upc", ";")

    with open(result_raw_file, "wb") as o:
        o.write(cmd_output)

    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/upc.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_upc(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "upc", get_fatal_entries(d))
}

SCA_DEPLOY_TASK = "do_sca_deploy_upc_image"

python do_sca_deploy_upc_image() {
    sca_conv_deploy(d, "upc", "txt")
}

addtask do_sca_upc before do_image_complete after do_image
addtask do_sca_deploy_upc_image before do_image_complete after do_sca_upc

do_sca_upc[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_upc_image[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "sca-image-upc-rules-native"
