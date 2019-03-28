## Add ids to suppress on a recipe level
SCA_ZRD_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_ZRD_EXTRA_FATAL ?= ""

inherit sca-helper
inherit sca-conv-checkstyle-zrd
inherit sca-global

inherit ${@oe.utils.ifelse(d.getVar('SCA_STD_PYTHON_INTERPRETER') == 'python3', 'python3native', 'pythonnative')}

python do_sca_zrd() {
    import os
    import subprocess
    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_ZRD_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_ZRD_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "zrd-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "zrd-{}-fatal".format(d.getVar("SCA_MODE"))))

    _supress = get_suppress_entries(d)
    _fatal = get_fatal_entries(d)

    tmp_result = os.path.join(d.getVar("T", True), "sca_raw_zrd.csv")
    d.setVar("SCA_RAW_RESULT_FILE", tmp_result)

    _args = [os.path.join(d.getVar("STAGING_BINDIR_NATIVE"), d.getVar("PYTHON_PN") + "-native", d.getVar("PYTHON_PN"))]
    _args += [os.path.join(d.getVar("STAGING_BINDIR_NATIVE"), "zrd", "resource_detector.py")]
    _args += ["-d", tmp_result]
    _args += [d.getVar("SCA_SOURCES_DIR")]

    ## Run
    try:
        cmd_output = subprocess.check_output(_args, universal_newlines=True, stderr=subprocess.STDOUT)
    except subprocess.CalledProcessError as e:
        cmd_output = e.stdout or ""
    
    result_file = os.path.join(d.getVar("T", True), "sca_checkstyle_zrd.xml")
    d.setVar("SCA_RESULT_FILE", result_file)
    conv_output = do_sca_conv_zrd(d)
    with open(result_file, "w") as o:
        o.write(conv_output)

    ## Evaluate
    _warnings = get_warnings_from_result(d)
    _fatals = get_fatal_from_result(d, "Flint++.Flint++", _fatal)
    _errors = get_errors_from_result(d)

    warn_log = []
    if any(_warnings) and should_emit_to_console(d):
        warn_log.append("{} warning(s)".format(len(_warnings)))
    if any(_errors) and should_emit_to_console(d):
        warn_log.append("{} error(s)".format(len(_errors)))
    if warn_log and should_emit_to_console(d):
        bb.warn("SCA has found {}".format(",".join(warn_log)))
    
    if any(_fatals):
        bb.build.exec_func("do_sca_deploy_zrd", d)
        bb.error("SCA has following fatal errors: {}".format("\n".join(_fatals)))
}

python do_sca_deploy_zrd() {
    import os
    import shutil
    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "zrd", "raw"), exist_ok=True)
    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "zrd", "checkstyle"), exist_ok=True)
    raw_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "zrd", "raw", "{}-{}.csv".format(d.getVar("PN"), d.getVar("PV")))
    cs_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "zrd", "checkstyle", "{}-{}.xml".format(d.getVar("PN"), d.getVar("PV")))
    src_raw = os.path.join(d.getVar("T"), "sca_raw_zrd.csv")
    src_conv = os.path.join(d.getVar("T"), "sca_checkstyle_zrd.xml")
    if os.path.exists(src_raw):
        shutil.copy(src_raw, raw_target)
    if os.path.exists(src_conv):
        shutil.copy(src_conv, cs_target)
    if os.path.exists(cs_target):
        do_sca_export_sources(d, cs_target)
}

addtask do_sca_zrd before do_install after do_compile
addtask do_sca_deploy_zrd after do_sca_zrd before do_package

DEPENDS += "${SCA_STD_PYTHON_INTERPRETER}-zeroresourcedetector-native sca-recipe-zrd-rules-native"
