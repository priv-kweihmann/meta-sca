inherit sca-conv-checkstyle-shellcheck
inherit sca-license-filter
inherit sca-helper

python do_sca_shellcheck_core() {
    import os
    import subprocess
    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_SHELLCHECK_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_SHELLCHECK_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "shellcheck-suppress"))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "shellcheck-fatal"))

    _supress = get_suppress_entries(d)
    _fatal = get_fatal_entries(d)

    _args = ["shellcheck"]
    _args += ["-f", "checkstyle"]
    if any(_supress):
        _args += ["--exclude=SC{}".format(",SC".join(_supress))]
    
    xml_output = ""
    for k,v in { "bash": "*./bash", "sh": "*./sh", "ksh": "*./ksh"}.items():
        for item in get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), v, ".sh",
                                                      sca_filter_by_license(d)):
            _t_args = _args + ["-s", k, item]
            cmd_output = ""
            try:
                cmd_output = subprocess.check_output(_t_args, universal_newlines=True)
            except subprocess.CalledProcessError as e:
                cmd_output = e.stdout or ""
            xml_output = xml_combine(d, xml_output, cmd_output)
    result_raw_file = os.path.join(d.getVar("T"), "sca_raw_shellcheck.xml")
    d.setVar("SCA_RAW_RESULT", result_raw_file)
    with open(result_raw_file, "w") as o:
        o.write(xml_output)
    xml_output = do_sca_conv_shellcheck(d)
    result_file = os.path.join(d.getVar("T"), "sca_checkstyle_shellcheck.xml")
    d.setVar("SCA_RESULT_FILE", result_file)
    with open(result_file, "w") as o:
        o.write(xml_output)

    ## Evaluate
    _warnings = get_warnings_from_result(d)
    _fatals = get_fatal_from_result(d, "ShellCheck.", _fatal)
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

DEPENDS += "shellcheck-native"
