inherit sca-conv-checkstyle-xmllint
inherit sca-license-filter
inherit sca-helper

SCA_XMLLINT_EXTRA_SUPPRESS ?= ""
SCA_XMLLINT_EXTRA_FATAL ?= ""
## File extension filter list (whitespace separated)
SCA_XMLLINT_FILE_FILTER ?= ".c .cpp .h .hpp"

DEPENDS += "libxml2-native"

python do_sca_xmllint_core() {
    import os
    import subprocess
    import json

    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_XMLLINT_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_XMLLINT_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "xmllint-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "xmllint-{}-fatal".format(d.getVar("SCA_MODE"))))

    _supress = get_suppress_entries(d)
    _fatal = get_fatal_entries(d)

    _args = ["xmllint"]
    _args += ["--noout"]
    _args += ["--valid"]

    _files = get_files_by_extention(d, d.getVar("SCA_SOURCES_DIR"), d.getVar("SCA_XMLLINT_FILE_FILTER"), sca_filter_by_license(d))
    cmd_output = ""
    if any(_files):
        _args += _files    
        try:
            cmd_output = subprocess.check_output(_args, universal_newlines=True)
        except subprocess.CalledProcessError as e:
            cmd_output = e.stdout or ""

    result_raw_file = os.path.join(d.getVar("T"), "sca_raw_xmllint.txt")
    d.setVar("SCA_RAW_RESULT", result_raw_file)
    with open(result_raw_file, "w") as o:
        o.write(cmd_output)

    xml_output = do_sca_conv_xmllint(d)
    result_file = os.path.join(d.getVar("T"), "sca_checkstyle_xmllint.xml")
    d.setVar("SCA_RESULT_FILE", result_file)
    with open(result_file, "w") as o:
        o.write(xml_output)

    ## Evaluate
    _warnings = get_warnings_from_result(d)
    _fatals = get_fatal_from_result(d, "xmllint.", _fatal)
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
