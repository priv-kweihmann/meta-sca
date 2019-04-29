inherit sca-conv-checkstyle-detectsecrets
inherit sca-license-filter
inherit sca-helper

SCA_DETECTSECRETS_EXTRA_SUPPRESS ?= ""
SCA_DETECTSECRETS_EXTRA_FATAL ?= ""

inherit ${@oe.utils.ifelse(d.getVar('SCA_STD_PYTHON_INTERPRETER') == 'python3', 'python3native', 'pythonnative')}

DEPENDS += "${SCA_STD_PYTHON_INTERPRETER}-detect-secrets-native"

python do_sca_detectsecrets_core() {
    import os
    import subprocess
    import json

    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_DETECTSECRETS_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_DETECTSECRETS_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "detectsecrets-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "detectsecrets-{}-fatal".format(d.getVar("SCA_MODE"))))

    _supress = get_suppress_entries(d)
    _fatal = get_fatal_entries(d)

    _args = [d.getVar("PYTHON")]
    _args += [os.path.join(d.getVar("STAGING_BINDIR_NATIVE"), "detect-secrets")]
    _args += ["scan"]
    _args += ["--all-files"]
    _args += ["--use-all-plugins"]
    _args += [d.getVar("SCA_SOURCES_DIR")]

    cmd_output = "" 
    try:
        cmd_output = subprocess.check_output(_args, universal_newlines=True, stderr=subprocess.STDOUT)
    except subprocess.CalledProcessError as e:
        cmd_output = e.stdout or ""

    result_raw_file = os.path.join(d.getVar("T"), "sca_raw_detectsecrets.json")
    d.setVar("SCA_RAW_RESULT", result_raw_file)
    with open(result_raw_file, "w") as o:
        o.write(cmd_output)

    xml_output = do_sca_conv_detectsecrets(d)
    result_file = os.path.join(d.getVar("T"), "sca_checkstyle_detectsecrets.xml")
    d.setVar("SCA_RESULT_FILE", result_file)
    with open(result_file, "w") as o:
        o.write(xml_output)

    ## Evaluate
    _warnings = get_warnings_from_result(d)
    _fatals = get_fatal_from_result(d, "detectsecrets.", _fatal)
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
