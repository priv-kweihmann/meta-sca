## Add ids to suppress on a recipe level
SCA_KCONFIGHARD_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_KCONFIGHARD_EXTRA_FATAL ?= ""

inherit sca-helper
inherit sca-conv-checkstyle-kconfighard
inherit sca-global

DEPENDS += "kconfig-hardened-check-native sca-recipe-kconfighard-rules-native"

def get_architeture(d):
    arch = d.getVar("TARGET_ARCH")
    if arch == "x86_64":
        return "X86_64"
    elif arch == "i586":
        return "X86_32"
    elif arch == "ARM64":
        return "ARM64"
    elif arch == "ARM":
        return "ARM"
    else:
        bb.note("Unknown Arch {} can't do kconfig-hardened-check".format(arch))
        return ""

python do_sca_kconfighard() {
    import os
    import subprocess

    if get_architeture(d) and d.getVar("PN") == "linux-yocto":
        d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_CPPLINT_EXTRA_SUPPRESS"))
        d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_CPPLINT_EXTRA_FATAL"))
        d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "kconfighard-{}-suppress".format(d.getVar("SCA_MODE"))))
        d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "kconfighard-{}-fatal".format(d.getVar("SCA_MODE"))))

        _supress = get_suppress_entries(d)
        _fatal = get_fatal_entries(d)

        tmp_result = os.path.join(d.getVar("T", True), "sca_raw_kconfighard.txt")
        d.setVar("SCA_RAW_RESULT_FILE", tmp_result)

        _args = [os.path.join(d.getVar("STAGING_BINDIR_NATIVE"), "kconfig-hardening-check", "kconfig-hardened-check.py")]      
        _args += ["--print", get_architeture(d) ]
        _args += ["-c", os.path.join(d.getVar("B"), ".config")]

        cmd_output = ""

        try:
            cmd_output = subprocess.check_output(_args, universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            cmd_output = e.stdout or ""

        with open(tmp_result, "w") as o:
            o.write(cmd_output)

        result_file = os.path.join(d.getVar("T", True), "sca_checkstyle_kconfighard.xml")
        d.setVar("SCA_RESULT_FILE", result_file)

        org_source_value = d.getVar("SCA_SOURCES_DIR")
        ## patch the source of the config-file
        d.setVar("SCA_SOURCES_DIR", os.path.join(d.getVar("B"), ".config"))
        conv_output = do_sca_conv_kconfighard(d)
        with open(result_file, "w") as o:
            o.write(conv_output)
        d.setVar("SCA_SOURCES_DIR", org_source_value)

        ## Evaluate
        _warnings = get_warnings_from_result(d)
        _fatals = get_fatal_from_result(d, "Kconfighard.Kconfighard", _fatal)
        _errors = get_errors_from_result(d)

        warn_log = []
        if any(_warnings) and should_emit_to_console(d):
            warn_log.append("{} warning(s)".format(len(_warnings)))
        if any(_errors) and should_emit_to_console(d):
            warn_log.append("{} error(s)".format(len(_errors)))
        if warn_log and should_emit_to_console(d):
            bb.warn("SCA has found {}".format(",".join(warn_log)))
        
        if any(_fatals):
            bb.build.exec_func("do_sca_deploy_kconfighard", d)
            bb.error("SCA has following fatal errors: {}".format("\n".join(_fatals)))
}

python do_sca_deploy_kconfighard() {
    import os
    import shutil
    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "kconfighard", "raw"), exist_ok=True)
    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "kconfighard", "checkstyle"), exist_ok=True)
    raw_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "kconfighard", "raw", "{}-{}.txt".format(d.getVar("PN"), d.getVar("PV")))
    cs_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "kconfighard", "checkstyle", "{}-{}.xml".format(d.getVar("PN"), d.getVar("PV")))
    src_raw = os.path.join(d.getVar("T"), "sca_raw_kconfighard.txt")
    src_conv = os.path.join(d.getVar("T"), "sca_checkstyle_kconfighard.xml")
    if os.path.exists(src_raw):
        shutil.copy(src_raw, raw_target)
    if os.path.exists(src_conv):
        shutil.copy(src_conv, cs_target)
    if os.path.exists(cs_target):
        do_sca_export_sources(d, cs_target)
}

addtask do_sca_kconfighard before do_compile after do_configure
addtask do_sca_deploy_kconfighard after do_sca_kconfighard before do_compile