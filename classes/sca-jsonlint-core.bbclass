inherit sca-conv-checkstyle-jsonlint
inherit sca-license-filter
inherit sca-helper

## Add ids to lead to a fatal on a recipe level
SCA_JSONLINT_EXTRA_FATAL ?= ""
## File extension filter list (whitespace separated)
SCA_JSONLINT_FILE_FILTER ?= ".json"

python do_sca_jsonlint_core() {
    import os
    import json

    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_JSONLINT_EXTRA_FATAL"))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "jsonlint-{}-fatal".format(d.getVar("SCA_MODE"))))

    _fatal = get_fatal_entries(d)

    result_raw_file = os.path.join(d.getVar("T"), "sca_raw_jsonlint.txt")
    d.setVar("SCA_RAW_RESULT_FILE", result_raw_file)

    with open(result_raw_file, "w") as o:
        for _f in get_files_by_extention(d, d.getVar("SCA_SOURCES_DIR"), d.getVar("SCA_JSONLINT_FILE_FILTER").split(" "), 
                                            sca_filter_by_license(d)):
            try:
                with open(_f) as i:
                    json.load(i)
            except json.JSONDecodeError as e:
                o.write("{}:{}:{}:error:jsonlint.parsererror:{}\n".format(e.doc, e.lineno, e.colno, e.msg))

    xml_output = do_sca_conv_jsonlint(d)
    result_file = os.path.join(d.getVar("T"), "sca_checkstyle_jsonlint.xml")
    d.setVar("SCA_RESULT_FILE", result_file)
    with open(result_file, "w") as o:
        o.write(xml_output)

    ## Evaluate
    _warnings = get_warnings_from_result(d)
    _fatals = get_fatal_from_result(d, "jsonlint.jsonlint.", _fatal)
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

DEPENDS += "json-sca-native"