inherit sca-conv-checkstyle-proselint
inherit sca-license-filter
inherit sca-helper

SCA_PROSELINT_EXTRA_SUPPRESS ?= ""
SCA_PROSELINT_EXTRA_FATAL ?= ""
SCA_PROSELINT_FILE_FILTER ?= ".txt .md .rst .me"

inherit ${@oe.utils.ifelse(d.getVar('SCA_STD_PYTHON_INTERPRETER') == 'python3', 'python3native', 'pythonnative')}

DEPENDS += "${SCA_STD_PYTHON_INTERPRETER}-proselint-native"

python do_sca_proselint_core() {
    import os
    import subprocess
    import json

    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_PROSELINT_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_PROSELINT_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "proselint-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "proselint-{}-fatal".format(d.getVar("SCA_MODE"))))

    _supress = get_suppress_entries(d)
    _fatal = get_fatal_entries(d)

    result_raw_file = os.path.join(d.getVar("T"), "sca_raw_proselint.json")
    d.setVar("SCA_RAW_RESULT_FILE", result_raw_file)

    _args = [os.environ.get("PYTHON", "not-exists")]
    _args += [os.path.join(d.getVar("STAGING_BINDIR_NATIVE"), "proselint")]
    _args += ["-j"]
    _files = get_files_by_extention(d, d.getVar("SCA_SOURCES_DIR"), d.getVar("SCA_PROSELINT_FILE_FILTER"),
                                sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    
    json_output = {}
    for _f in _files:
        try:
            cmd_output = subprocess.check_output(_args + [_f], universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            cmd_output = e.stdout or ""
        try:
            x = json.loads(cmd_output)
            json_output[_f] = x
        except Exception as e:
            bb.warn(cmd_output)
            bb.warn(str(e))

    with open(d.getVar("SCA_RAW_RESULT_FILE"), "w") as o:
        json.dump(json_output, o)

    xml_output = do_sca_conv_proselint(d)
    result_file = os.path.join(d.getVar("T"), "sca_checkstyle_proselint.xml")
    d.setVar("SCA_RESULT_FILE", result_file)
    with open(result_file, "w") as o:
        o.write(xml_output)

    ## Evaluate
    _warnings = get_warnings_from_result(d)
    _fatals = get_fatal_from_result(d, "proselint.proselint.", _fatal)
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
