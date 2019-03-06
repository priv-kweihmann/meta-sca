inherit sca-conv-checkstyle-bandit
inherit sca-license-filter
inherit sca-helper

SCA_BANDIT_EXTRA_SUPPRESS ?= ""
SCA_BANDIT_EXTRA_FATAL ?= ""

DEPENDS += "${SCA_STD_PYTHON_INTERPRETER}-bandit-native"

python do_sca_bandit_core() {
    import os
    import subprocess
    import json

    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_BANDIT_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_BANDIT_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "bandit-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "bandit-{}-fatal".format(d.getVar("SCA_MODE"))))

    _supress = get_suppress_entries(d)
    _fatal = get_fatal_entries(d)

    result_raw_file = os.path.join(d.getVar("T"), "sca_raw_bandit.json")
    d.setVar("SCA_RAW_RESULT_FILE", result_raw_file)

    _args = ["bandit"]
    _args += ["-f", "json"]
    _args += ["-o", result_raw_file]
    if any(_supress):
        _args += ["--skip", ",".join(_supress)]
    _files = get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), ".*python3", ".py",
                                                      sca_filter_by_license(d))

    with open(d.getVar("SCA_RAW_RESULT_FILE"), "w") as o:
        json.dump([], o)

    if any(_files):
        _args += _files
        cmd_output = ""
        try:
            cmd_output = subprocess.check_output(_args, universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            cmd_output = e.stdout or ""

    xml_output = do_sca_conv_bandit(d)
    result_file = os.path.join(d.getVar("T"), "sca_checkstyle_bandit.xml")
    d.setVar("SCA_RESULT_FILE", result_file)
    with open(result_file, "w") as o:
        o.write(xml_output)

    ## Evaluate
    _warnings = get_warnings_from_result(d)
    _fatals = get_fatal_from_result(d, "bandit.bandit.", _fatal)
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
