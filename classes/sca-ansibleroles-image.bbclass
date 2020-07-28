## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2020, Konrad Weihmann

SCA_ANSIBLEROLES_EXTRA_FATAL ?= ""
SCA_ANSIBLEROLES_ROLES ?= "\
                           dev-sec.mysql-hardening \
                           dev-sec.nginx-hardening \
                           dev-sec.os-hardening \
                           dev-sec.ssh-hardening \
                           konstruktoid.hardening \
                           sansible.security_hardening \
                        "
SCA_ANSIBLEROLES_ROLES[dev-sec.mysql-hardening] ?= "mysql,mariadb"
SCA_ANSIBLEROLES_ROLES[dev-sec.nginx-hardening] ?= "nginx"
SCA_ANSIBLEROLES_ROLES[dev-sec.ssh-hardening] ?= "openssh"

SCA_ANSIBLEROLES_FAKEOS ?= "RedHat"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-license-filter
inherit sca-file-filter
inherit sca-crossemu
inherit sca-suppress

SCA_RAW_RESULT_FILE[ansibleroles] = "txt"

DEPENDS += "ansibleroles-sca-native ansible-role-merger-native packagegroup-ansible-roles"

def do_sca_conv_ansibleroles(d):
    import os
    import re
    import json
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^localhost\s+\|\s+CHANGED\s+=>\s+(?P<msg>.*)"

    _suppress = sca_suppress_init(d, "", None)
    _findings = []

    if os.path.exists(sca_raw_result_file(d, "ansibleroles")):
        with open(sca_raw_result_file(d, "ansibleroles"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    _dict = json.loads(m.group("msg"))
                    _msg = ""
                    for _id in ["path", "src", "dest"]:
                        if _id in _dict.keys():
                            # ignore the ansible related issues by default
                            if "/home/root/.ansible" not in _dict[_id] and \
                               "/etc/ansible/facts.d" not in _dict[_id]:
                                _msg = "File {} has insecurities or is missing".format(_dict[_id])
                            break
                    if _msg:
                        g = sca_get_model_class(d,
                                                PackageName=package_name,
                                                Tool="ansibleroles",
                                                BuildPath=sca_get_layer_path_for_file(d, d.getVar("FILE")),
                                                File=d.getVar("FILE"),
                                                Message=_msg,
                                                ID="insecure",
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

def sca_ansibleroles_create_config(d, rootfs, path, playbooks):
    import subprocess
    import os

    _roles = [os.path.join(rootfs, d.getVar("datadir")[1:], "ansible/roles", "{}.json".format(x))
              for x in playbooks]
    try:
        output = subprocess.check_output(["nativepython3", os.path.join(d.getVar("STAGING_BINDIR_NATIVE"), "ansible-role-merger")] +
                                          _roles, universal_newlines=True)
    except subprocess.CalledProcessError as e:
        output = e.stdout or ""

    with open(path, "w") as o:
        o.write(output)

# Some of the roles try to os specific settings
# fake that by symlinking againt the one specified
# with SCA_ANSIBLEROLES_FAKEOS
do_sca_ansibleroles_fix_osvars() {
    for f in dev-sec.os-hardening dev-sec.mysql-hardening dev-sec.nginx-hardening dev-sec.ssh-hardening; do
        if [ -d ${IMAGE_ROOTFS}/${datadir}/ansible/roles/${f}/vars ]; then
            cd ${IMAGE_ROOTFS}/${datadir}/ansible/roles/${f}/vars
            ln -sf "${SCA_ANSIBLEROLES_FAKEOS}.yml" "${DISTRO_NAME}.yml" || true
            cd -
        fi
    done
}

fakeroot python do_sca_ansibleroles() {
    import os
    import subprocess

    if not os.path.exists("/dev/shm"):
        bb.warn("SCA: ansibleroles module requires /dev/shm on the host.\nThis is a known issue of python/ansible.\nThis module won't produce any output till that is fixed")
    else:
        os.environ["ANSIBLE_STDOUT_CALLBACK"] = "oneline"
        os.environ["ANSIBLE_ACTION_WARNINGS"] = "False"
        os.environ["ANSIBLE_COMMAND_WARNINGS"] = "False"
        os.environ["ANSIBLE_LOCALHOST_WARNING"] = "False"
        # First create rootfs
        cmd_output, rootfs_path = sca_crossemu(d, [], ["packagegroup-ansible-roles"], "ansibleroles", "do_sca_ansibleroles_fix_osvars;")

        _args = ["/bin/sh", "-c", "ansible-playbook --flush-cache /rolebook.yaml"]
        cmd_output = b""

        _installed_pkgs = sca_get_installed_pkgs(d)
        _role_flags = d.getVarFlags("SCA_ANSIBLEROLES_ROLES")
        # As playbooks could crash run each in a single instance
        for pb in clean_split(d, "SCA_ANSIBLEROLES_ROLES"):
            # Check if the package that is checked is installed
            if pb in _role_flags.keys():
                if not any(intersect_lists(d, _installed_pkgs, _role_flags[pb].split(","))):
                    bb.note("Skipping {}, as none of {} is installed".format(pb, _role_flags[pb]))
                    continue
            sca_ansibleroles_create_config(d, rootfs_path, os.path.join(rootfs_path, "rolebook.yaml"), [pb])
            _tmp, _ = sca_crossemu(d, _args, [], "ansibleroles", "", nocreateroot=True, addargs=["-b", "/dev/shm:/dev/shm"])
            cmd_output += _tmp

        with open(sca_raw_result_file(d, "ansibleroles"), "wb") as o:
            o.write(cmd_output)

        ## Create data model
        d.setVar("SCA_DATAMODEL_STORAGE", "{}/ansibleroles.dm".format(d.getVar("T")))
        dm_output = do_sca_conv_ansibleroles(d)
        with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
            o.write(dm_output)

        sca_task_aftermath(d, "ansibleroles", get_fatal_entries(d, "SCA_ANSIBLEROLES_EXTRA_FATAL", None))
}

SCA_DEPLOY_TASK = "do_sca_deploy_ansibleroles_image"

python do_sca_deploy_ansibleroles_image() {
    sca_conv_deploy(d, "ansibleroles")
}

do_sca_ansibleroles[doc] = "Audit image with ansible roles"
addtask do_sca_ansibleroles before do_image_complete after do_image
do_sca_deploy_ansibleroles_image[doc] = "Deploy results of do_sca_ansibleroles"
addtask do_sca_deploy_ansibleroles_image before do_image_complete after do_sca_ansibleroles
