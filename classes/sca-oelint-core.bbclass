inherit sca-conv-checkstyle-oelint
inherit sca-license-filter
inherit sca-helper

SCA_OELINT_EXTRA_SUPPRESS ?= ""
SCA_OELINT_EXTRA_FATAL ?= ""

DEPENDS += "${SCA_STD_PYTHON_INTERPRETER}-oelint-adv-native"

inherit ${@oe.utils.ifelse(d.getVar('SCA_STD_PYTHON_INTERPRETER') == 'python3', 'python3native', 'pythonnative')}

python do_sca_oelint_core() {
    import os
    import subprocess
    import glob

    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_OELINT_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_OELINT_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "oelint-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "oelint-{}-fatal".format(d.getVar("SCA_MODE"))))

    _supress = get_suppress_entries(d)
    _fatal = get_fatal_entries(d)

    result_raw_file = os.path.join(d.getVar("T"), "sca_raw_oelint.txt")
    d.setVar("SCA_RAW_RESULT_FILE", result_raw_file)

    _app = os.path.join(d.getVar("STAGING_DIR_NATIVE"), d.getVar("PYTHON_SITEPACKAGES_DIR")[1:], "oelint_adv") + "/"
    _args = [os.path.join(d.getVar("STAGING_BINDIR_NATIVE"), "python3-native", "python3")]
    _args += [_app]
    for item in _supress:
        _args += ["--suppress={}".format(item)]
    _args += ["--output={}".format(result_raw_file)]
    _files = [x.strip() for x in d.getVar("BBINCLUDED").split(" ") if x.strip().endswith(".bb") or x.strip().endswith(".bbappend")]

    with open(d.getVar("SCA_RAW_RESULT_FILE"), "w") as o:
        o.write("")

    if any(_files):
        _args += _files
        try:
            subprocess.check_output(_args, universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            pass

    xml_output = do_sca_conv_oelint(d)
    result_file = os.path.join(d.getVar("T"), "sca_checkstyle_oelint.xml")
    d.setVar("SCA_RESULT_FILE", result_file)
    with open(result_file, "w") as o:
        o.write(xml_output)

    ## Evaluate
    _warnings = get_warnings_from_result(d)
    _fatals = get_fatal_from_result(d, "oelint.oelint.", _fatal)
    _errors = get_errors_from_result(d)

    warn_log = []
    if any(_warnings):
        warn_log.append("{} warning(s)".format(len(_warnings)))
    if any(_errors):
        warn_log.append("{} error(s)".format(len(_errors)))
    if warn_log and should_emit_to_console(d):
        bb.warn("SCA has found {}".format(",".join(warn_log)))
    
    if any(_fatals):
        bb.build.exec_func(d.getVar("SCA_DEPLOY_TASK"), d)
        bb.error("SCA has following fatal errors: {}".format("\n".join(_fatals)))
}
