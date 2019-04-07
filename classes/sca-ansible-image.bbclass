## Add ids to suppress on a recipe level
SCA_ANSIBLE_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_ANSIBLE_EXTRA_FATAL ?= ""

SCA_ANSIBLE_PATH_base_prefix ?= "${SCA_SOURCES_DIR}${base_prefix}"
SCA_ANSIBLE_PATH_prefix ?= "${SCA_SOURCES_DIR}${prefix}"
SCA_ANSIBLE_PATH_exec_prefix ?= "${SCA_SOURCES_DIR}${exec_prefix}"
SCA_ANSIBLE_PATH_base_bindir ?= "${SCA_SOURCES_DIR}${base_bindir}"
SCA_ANSIBLE_PATH_base_sbindir ?= "${SCA_SOURCES_DIR}${base_sbindir}"
SCA_ANSIBLE_PATH_base_libdir ?= "${SCA_SOURCES_DIR}${base_libdir}"
SCA_ANSIBLE_PATH_nonarch_base_libdir ?= "${SCA_SOURCES_DIR}${nonarch_base_libdir}"
SCA_ANSIBLE_PATH_sysconfdir ?= "${SCA_SOURCES_DIR}${sysconfdir}"
SCA_ANSIBLE_PATH_servicedir ?= "${SCA_SOURCES_DIR}${servicedir}"
SCA_ANSIBLE_PATH_sharedstatedir ?= "${SCA_SOURCES_DIR}${sharedstatedir}"
SCA_ANSIBLE_PATH_localstatedir ?= "${SCA_SOURCES_DIR}${localstatedir}"
SCA_ANSIBLE_PATH_datadir ?= "${SCA_SOURCES_DIR}${datadir}"
SCA_ANSIBLE_PATH_infodir ?= "${SCA_SOURCES_DIR}${infordir}"
SCA_ANSIBLE_PATH_mandir ?= "${SCA_SOURCES_DIR}${mandir}"
SCA_ANSIBLE_PATH_docdir ?= "${SCA_SOURCES_DIR}${docdir}"
SCA_ANSIBLE_PATH_systemd_unitdir ?= "${SCA_SOURCES_DIR}${systemd_unitdir}"
SCA_ANSIBLE_PATH_systemd_system_unitdir ?= "${SCA_SOURCES_DIR}${systemd_system_unitdir}"
SCA_ANSIBLE_PATH_nonarch_libdir ?= "${SCA_SOURCES_DIR}${nonarch_libdir}"
SCA_ANSIBLE_PATH_systemd_user_unitdir ?= "${SCA_SOURCES_DIR}${systemd_user_unitdir}"
SCA_ANSIBLE_PATH_bindir ?= "${SCA_SOURCES_DIR}${bindir}"
SCA_ANSIBLE_PATH_sbindir ?= "${SCA_SOURCES_DIR}${sbindir}"
SCA_ANSIBLE_PATH_libdir ?= "${SCA_SOURCES_DIR}${libdir}"
SCA_ANSIBLE_PATH_libexecdir ?= "${SCA_SOURCES_DIR}${libexecdir}"
SCA_ANSIBLE_PATH_includedir ?= "${SCA_SOURCES_DIR}${includedir}"
SCA_ANSIBLE_PATH_oldincludedir ?= "${SCA_SOURCES_DIR}${oldincludedir}"
SCA_ANSIBLE_PATH_localedir ?= "${SCA_SOURCES_DIR}${localedir}"

_SCA_ANSIBLE_GLOBAL_VARS = "base_prefix prefix exec_prefix base_bindir base_sbindir \
                            base_libdir nonarch_base_libdir sysconfdir servicedir \
                            sharedstatedir localstatedir datadir infodir mandir docdir \
                            systemd_unitdir systemd_system_unitdir nonarch_libdir \
                            systemd_user_unitdir bindir sbindir libdir libexecdir \
                            includedir oldincludedir localedir"

SCA_ANSIBLE_PLAYBOOKS ?= "*.yaml"


def create_inventory(d, target_path):
    import yaml
    inv = {
        "all": {
            "vars": {

            }
        }
    }
    for item in clean_split(d, "_SCA_ANSIBLE_GLOBAL_VARS"):
        inv["all"]["vars"][item] = d.getVar("SCA_ANSIBLE_PATH_{}".format(item))
    
    with open(target_path, "w") as out:
        yaml.dump(inv, out)

inherit sca-helper
inherit sca-conv-checkstyle-ansible
inherit sca-global

python do_sca_ansible() {
    import os
    import json
    import glob
    import subprocess
    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_CPPCHECK_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_CPPCHECK_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "ansible-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "ansible-{}-fatal".format(d.getVar("SCA_MODE"))))

    _supress = get_suppress_entries(d)
    _fatal = get_fatal_entries(d)

    _inventory = "ansible_inv.yaml"
    create_inventory(d, _inventory)

    os.environ["ANSIBLE_STDOUT_CALLBACK"] = "json"
    os.environ["ANSIBLE_ACTION_WARNINGS"] = "False"
    os.environ["ANSIBLE_COMMAND_WARNINGS"] = "False"
    os.environ["ANSIBLE_LOCALHOST_WARNING"] = "False"
    _args = ["ansible-playbook"]
    _args += ["--check"]
    _args += ["--flush-cache"]
    _args += ["-i", _inventory]

    result_raw_file = os.path.join(d.getVar("T", True), "sca_raw_ansible.json")
    d.setVar("SCA_RAW_RESULT_FILE", result_raw_file)
    json_output = {}

    for pb_glob in clean_split(d, "SCA_ANSIBLE_PLAYBOOKS"):
        for playbook in glob.glob(os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "ansible_sec") + "/" + pb_glob):
            _t_args = _args + [playbook]
            try:
                cmd_output = subprocess.check_output(_t_args, universal_newlines=True)
            except subprocess.CalledProcessError as e:
                cmd_output = e.stdout or ""
            if cmd_output.find("{") != -1:
                cmd_output = cmd_output[cmd_output.find("{"):]
            try:
                json_output[os.path.basename(playbook)] = json.loads(cmd_output)
            except:
                pass

    with open(result_raw_file, "w") as o:
        json.dump(json_output, o)
    
    os.remove(_inventory)
    result_file = os.path.join(d.getVar("T", True), "sca_checkstyle_ansible.xml")
    d.setVar("SCA_RESULT_FILE", result_file)
    conv_output = do_sca_conv_ansible(d)
    with open(result_file, "w") as o:
        o.write(conv_output)

    ## Evaluate
    _warnings = get_warnings_from_result(d)
    _fatals = get_fatal_from_result(d, "ansible.", _fatal)
    _errors = get_errors_from_result(d)

    warn_log = []
    if any(_warnings) and should_emit_to_console(d):
        warn_log.append("{} warning(s)".format(len(_warnings)))
    if any(_errors) and should_emit_to_console(d):
        warn_log.append("{} error(s)".format(len(_errors)))
    if warn_log and should_emit_to_console(d):
        bb.warn("SCA has found {}".format(",".join(warn_log)))
    
    if any(_fatals):
        bb.build.exec_func("do_sca_deploy_ansible", d)
        bb.error("SCA has following fatal errors: {}".format("\n".join(_fatals)))
}

python do_sca_deploy_ansible() {
    import os
    import shutil
    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "ansible", "raw"), exist_ok=True)
    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "ansible", "checkstyle"), exist_ok=True)
    raw_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "ansible", "raw", "{}-{}.json".format(d.getVar("PN"), d.getVar("PV")))
    cs_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "ansible", "checkstyle", "{}-{}.xml".format(d.getVar("PN"), d.getVar("PV")))
    src_raw = os.path.join(d.getVar("T"), "sca_raw_ansible.json")
    src_conv = os.path.join(d.getVar("T"), "sca_checkstyle_ansible.xml")
    if os.path.exists(src_raw):
        shutil.copy(src_raw, raw_target)
    if os.path.exists(src_conv):
        shutil.copy(src_conv, cs_target)
    if os.path.exists(cs_target):
        do_sca_export_sources(d, cs_target)
}

addtask do_sca_ansible before do_image_complete after do_image
addtask do_sca_deploy_ansible before do_image_complete after do_sca_ansible

DEPENDS += "python-ansible-native ansible-sca-native ${SCA_STD_PYTHON_INTERPRETER}-pyyaml-native sca-image-ansible-rules-native"
