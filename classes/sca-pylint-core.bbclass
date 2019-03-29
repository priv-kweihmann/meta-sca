inherit sca-helper
inherit sca-conv-checkstyle-pylint
inherit sca-license-filter

python do_sca_pylint_core() {
    import os
    import subprocess
    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_PYLINT_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_PYLINT_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "pylint-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "pylint-{}-fatal".format(d.getVar("SCA_MODE"))))

    _supress = get_suppress_entries(d)
    _fatal = get_fatal_entries(d)

    _args = ["python3", "-m", "pylint"]
    _args += ["--output-format=parseable"]
    _args += ["--score=no"]
    if any(_supress):
        _args += ["--disable={}".format(",".join(_supress))]
    _args += ["--rcfile={}/pylint.rc".format(d.getVar("T"))]
    _args += get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), ".*python3", [".py"])
    if d.getVar("SCA_PYLINT_EXTRA"):
        _args += d.getVar("SCA_PYLINT_EXTRA").split(" ")
    _args += ["-j", d.getVar("BB_NUMBER_THREADS")]

    ## Run
    cur_dir = os.getcwd()
    os.chdir(d.getVar("SCA_SOURCES_DIR", True))
    cmd_output = ""
    tmp_result = os.path.join(d.getVar("T", True), "sca_raw_pylint.txt")
    d.setVar("SCA_RAW_RESULT_FILE", tmp_result)

    ## Patch a pylint.rc-file with all the library paths
    with open(os.path.join(d.getVar("T"), "pylint.rc"), "w") as f:
        f.write("[MASTER]\n")
        f.write("import sys\n")
        f.write("[sys.path.insert(0, a) for a in \"{}\".split(\":\")];\n".format(d.getVar("SCA_PYLINT_LIBATH")))

    _args += get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), ".*/python3", ".py",
                                               sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    try:
        cmd_output = subprocess.check_output(_args, universal_newlines=True)
    except subprocess.CalledProcessError as e:
        cmd_output = e.stdout or ""
    with open(tmp_result, "w") as o:
        o.write(cmd_output)
    os.chdir(cur_dir)
    
    result_file = os.path.join(d.getVar("T", True), "sca_checkstyle_pylint.xml")
    d.setVar("SCA_RESULT_FILE", result_file)
    conv_output = do_sca_conv_pylint(d)
    with open(result_file, "w") as o:
        o.write(conv_output)

    ## Evaluate
    _warnings = get_warnings_from_result(d)
    _fatals = get_fatal_from_result(d, "pylint.pylint", _fatal)
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

## addtask do_static_code_analysis_pylint before do_install after do_compile

DEPENDS += "${SCA_STD_PYTHON_INTERPRETER}-pylint-native"
