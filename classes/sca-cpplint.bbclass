## Add ids to suppress on a recipe level
SCA_CPPLINT_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_CPPLINT_EXTRA_FATAL ?= ""
## File extension filter list (whitespace separated)
SCA_CPPLINT_FILE_FILTER ?= ".c .cpp .h .hpp"

inherit sca-helper
inherit sca-conv-checkstyle-cpplint
inherit sca-global

python do_sca_cpplint() {
    import os
    import subprocess
    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_CPPLINT_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_CPPLINT_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "cpplint-suppress"))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "cpplint-fatal"))

    _supress = get_suppress_entries(d)
    _fatal = get_fatal_entries(d)

    _args = ["python3", os.path.join(d.getVar("STAGING_BINDIR_NATIVE"), "cpplint.py")]
    _args += ["--output=junit"]
    _args += ["--quiet"]
    _args += ["--root={}".format(d.getVar("B", True))]
    if any(_supress):
        _args += ["--filter=+,-{}".format(",-".join(_supress))]

    ## Run
    cur_dir = os.getcwd()
    os.chdir(d.getVar("B", True))
    cmd_output = ""
    tmp_result = os.path.join(d.getVar("T", True), "sca_raw_cpplint.xml")
    d.setVar("SCA_RAW_RESULT_FILE", tmp_result)
    for root, dirs, files in os.walk(os.getcwd(), topdown=True):
        for name in files:
            _filepath = os.path.join(root, name)
            _filename, _file_extension = os.path.splitext(_filepath)
            if _file_extension in d.getVar("SCA_CPPLINT_FILE_FILTER").split(" "):
                _args += [_filepath]
    try:
        cmd_output = subprocess.check_output(_args, universal_newlines=True, stderr=subprocess.STDOUT)
    except subprocess.CalledProcessError as e:
        cmd_output = e.stdout or ""
    with open(tmp_result, "w") as o:
        o.write(cmd_output)
    os.chdir(cur_dir)
    
    result_file = os.path.join(d.getVar("T", True), "sca_checkstyle_cpplint.xml")
    d.setVar("SCA_RESULT_FILE", result_file)
    conv_output = do_sca_conv_cpplint(d)
    with open(result_file, "w") as o:
        o.write(conv_output)

    ## Evaluate
    _warnings = get_warnings_from_result(d)
    _fatals = get_fatal_from_result(d, "CPPLint.CPPLint", _fatal)
    _errors = get_errors_from_result(d)

    warn_log = []
    if any(_warnings) and should_emit_to_console(d):
        warn_log.append("{} warning(s)".format(len(_warnings)))
    if any(_errors) and should_emit_to_console(d):
        warn_log.append("{} error(s)".format(len(_errors)))
    if warn_log and should_emit_to_console(d):
        bb.warn("SCA has found {}".format(",".join(warn_log)))
    
    if any(_fatal) and should_emit_to_console(d):
        bb.fatal("SCA has following fatal errors: {}".format("\n".join(_fatals)))
}

python do_sca_deploy_cpplint() {
    import os
    import shutil
    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "cpplint", "raw"), exist_ok=True)
    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "cpplint", "checkstyle"), exist_ok=True)
    raw_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "cpplint", "raw", "{}-{}.xml".format(d.getVar("PN"), d.getVar("PV")))
    cs_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "cpplint", "checkstyle", "{}-{}.xml".format(d.getVar("PN"), d.getVar("PV")))
    src_raw = os.path.join(d.getVar("T"), "sca_raw_cpplint.xml")
    src_conv = os.path.join(d.getVar("T"), "sca_checkstyle_cpplint.xml")
    if os.path.exists(src_raw):
        shutil.copy(src_raw, raw_target)
    if os.path.exists(src_conv):
        shutil.copy(src_conv, cs_target)
    if os.path.exists(cs_target):
        do_sca_export_sources(d, cs_target)
}

addtask do_sca_cpplint before do_install after do_compile
addtask do_sca_deploy_cpplint after do_sca_cpplint before do_package

DEPENDS += "cpplint-native sca-recipe-cpplint-rules-native"
