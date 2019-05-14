inherit sca-helper
inherit sca-conv-checkstyle-pyfindinjection
inherit sca-license-filter

## Add ids to suppress on a recipe level
SCA_PYFINDINJECTION_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_PYFINDINJECTION_EXTRA_FATAL ?= ""

python do_sca_pyfindinjection_core() {
    import os
    import subprocess
    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_PYFINDINJECTION_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_PYFINDINJECTION_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "pyfindinjection-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "pyfindinjection-{}-fatal".format(d.getVar("SCA_MODE"))))

    _supress = get_suppress_entries(d)
    _fatal = get_fatal_entries(d)

    _args = [os.path.join(d.getVar("STAGING_BINDIR_NATIVE"), "python-native", "python")]
    _args += [os.path.join(d.getVar("STAGING_BINDIR_NATIVE"), "py-find-injection")]

    result_raw_file = os.path.join(d.getVar("T"), "sca_checkstyle_pyfindinjection.txt")
    d.setVar("SCA_RAW_RESULT_FILE", result_raw_file)

    cmd_output = ""

    ## Run
    _files = get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), ".*/python", ".py",
                                               sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))
    if any(_files):
        try:
            cmd_output = subprocess.check_output(_args + _files, universal_newlines=True)
        except subprocess.CalledProcessError as e:
            cmd_output = e.stdout or ""
    with open(result_raw_file, "w") as o:
        o.write(cmd_output)
    
    result_file = os.path.join(d.getVar("T", True), "sca_checkstyle_pyfindinjection.xml")
    d.setVar("SCA_RESULT_FILE", result_file)
    conv_output = do_sca_conv_pyfindinjection(d)
    with open(result_file, "w") as o:
        o.write(conv_output)

    ## Evaluate
    _warnings = get_warnings_from_result(d)
    _fatals = get_fatal_from_result(d, "pyfindinjection.pyfindinjection", _fatal)
    _errors = get_errors_from_result(d)

    warn_log = []
    if any(_warnings) and should_emit_to_console(d):
        warn_log.append("{} warning(s)".format(len(_warnings)))
    if any(_errors) and should_emit_to_console(d):
        warn_log.append("{} error(s)".format(len(_errors)))
    if warn_log and should_emit_to_console(d):
        bb.warn("SCA has found {}".format(",".join(warn_log)))

    if any(_fatals):
        bb.build.exec_func(d.getVar("SCA_DEPLOY_TASK"), d)
        bb.error("SCA has following fatal errors: {}".format("\n".join(_fatals)))
}

DEPENDS += "python-pyfindinjection-native"
