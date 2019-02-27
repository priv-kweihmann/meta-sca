## Add ids to suppress on a recipe level
SCA_PYSYMCHECK_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_PYSYMCHECK_EXTRA_FATAL ?= ""
## Used rule file
SCA_PYSYMCHECK_RULE_FILE ?= "basic-rules.json"

inherit sca-helper
inherit sca-conv-checkstyle-pysymcheck
inherit sca-global

python do_sca_pysymcheck() {
    import os
    import subprocess
    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_PYSYMCHECK_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_PYSYMCHECK_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "pysymcheck-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "pysymcheck-{}-fatal".format(d.getVar("SCA_MODE"))))

    _supress = get_suppress_entries(d)
    _fatal = get_fatal_entries(d)

    _args = ["python3", os.path.join(d.getVar("STAGING_BINDIR_NATIVE"), "pysymbolcheck", "pysymbolcheck.py")]
    _args += ["--libpath", ":".join([d.getVar("STAGING_LIBDIR_NATIVE")])]
    _args += [os.path.join(d.getVar("STAGING_BINDIR_NATIVE"), "pysymbolcheck", d.getVar("SCA_PYSYMCHECK_RULE_FILE"))]

    _files = get_files_by_mimetype(d, d.getVar("B"), ["application/x-executable", 'application/x-sharedlib'], [])
    ## Run
    cmd_output = ""
    tmp_result = os.path.join(d.getVar("T", True), "sca_raw_pysymcheck.txt")
    d.setVar("SCA_RAW_RESULT_FILE", tmp_result)
    for _f in _files:
        try:
            cmd_output += subprocess.check_output(_args + [_f], universal_newlines=True)
        except subprocess.CalledProcessError as e:
            cmd_output += e.stdout or ""
    with open(tmp_result, "w") as o:
        o.write(cmd_output)
    
    result_file = os.path.join(d.getVar("T", True), "sca_checkstyle_pysymcheck.xml")
    d.setVar("SCA_RESULT_FILE", result_file)
    conv_output = do_sca_conv_pysymcheck(d)
    with open(result_file, "w") as o:
        o.write(conv_output)

    ## Evaluate
    _warnings = get_warnings_from_result(d)
    _fatals = get_fatal_from_result(d, "pysymcheck.pysymcheck", _fatal)
    _errors = get_errors_from_result(d)

    warn_log = []
    if any(_warnings) and should_emit_to_console(d):
        warn_log.append("{} warning(s)".format(len(_warnings)))
    if any(_errors) and should_emit_to_console(d):
        warn_log.append("{} error(s)".format(len(_errors)))
    if warn_log and should_emit_to_console(d):
        bb.warn("SCA has found {}".format(",".join(warn_log)))
    
    if any(_fatals):
        bb.build.exec_func("do_sca_deploy_pysymcheck", d)
        bb.error("SCA has following fatal errors: {}".format("\n".join(_fatals)))
}

python do_sca_deploy_pysymcheck() {
    import os
    import shutil
    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "pysymcheck", "raw"), exist_ok=True)
    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "pysymcheck", "checkstyle"), exist_ok=True)
    raw_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "pysymcheck", "raw", "{}-{}.txt".format(d.getVar("PN"), d.getVar("PV")))
    cs_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "pysymcheck", "checkstyle", "{}-{}.xml".format(d.getVar("PN"), d.getVar("PV")))
    src_raw = os.path.join(d.getVar("T"), "sca_raw_pysymcheck.txt")
    src_conv = os.path.join(d.getVar("T"), "sca_checkstyle_pysymcheck.xml")
    if os.path.exists(src_raw):
        shutil.copy(src_raw, raw_target)
    if os.path.exists(src_conv):
        shutil.copy(src_conv, cs_target)
    if os.path.exists(cs_target):
        do_sca_export_sources(d, cs_target)
}

addtask do_sca_pysymcheck before do_install after do_compile
addtask do_sca_deploy_pysymcheck after do_sca_pysymcheck before do_package

DEPENDS += "pysymbolcheck-native sca-recipe-pysymcheck-rules-native"
