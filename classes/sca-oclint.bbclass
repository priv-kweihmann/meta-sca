## Add ids to suppress on a recipe level
SCA_OCLINT_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_OCLINT_EXTRA_FATAL ?= ""
## Additional absolute paths to additional include dirs
## can be seperated by spaces
SCA_OCLINT_ADD_INCLUDES ?= ""
## File extension filter
SCA_OCLINT_FILE_FILTER ?= ".c .cpp"

inherit sca-helper
inherit sca-conv-checkstyle-oclint
inherit sca-global

python do_sca_oclint() {
    import os
    import subprocess
    import glob

    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_OCLINT_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_OCLINT_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "oclint-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "oclint-{}-suppress".format(d.getVar("SCA_MODE"))))

    _supress = get_suppress_entries(d)
    _fatal = get_fatal_entries(d)
    _add_include = d.getVar("SCA_OCLINT_ADD_INCLUDES", True).split(" ")

    inc_dirs = [d.getVar("SCA_SOURCES_DIR"), 
                os.path.join(d.getVar("SCA_SOURCES_DIR"), "include"),
                os.path.join(d.getVar("STAGING_DIR"), "include"),
                d.getVar("STAGING_INCDIR")]
    if d.getVar("SCA_OCLINT_ADD_INCLUDES"):
        inc_dirs += d.getVar("SCA_OCLINT_ADD_INCLUDES").split(" ")

    _args = [os.path.join(d.getVar("STAGING_BINDIR_NATIVE"), "oclint", "bin", "oclint")]
    _args += ["-report-type", "json"]
    for item in inc_dirs:
       _args += ["-extra-arg", "-I{}".format(item)]

    compile_json = []
    _files = get_files_by_extention(d, d.getVar("SCA_SOURCES_DIR"), d.getVar("SCA_OCLINT_FILE_FILTER").split(" "), [])
    for _f in _files:
        compile_json.append(
            {
                "directory": d.getVar("B"),
                "file": _f,
                "command": "{} -c {}".format(os.environ.get("CC", "gcc"), _f)
            }
        )

    import json
    with open(os.path.join(d.getVar("B"), "compile_commands.json"), "w") as o:
        json.dump(compile_json, o)

    cmd_output = ""
    
    if any(_files):
        try:
            cmd_output += subprocess.check_output(_args + _files, universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            cmd_output += e.stdout or ""

    ## Only the first line is on interest
    cmd_output = cmd_output.split("\n")[0]

    if os.path.exists(os.path.join(d.getVar("B"), "compile_commands.json")):
        os.remove(os.path.join(d.getVar("B"), "compile_commands.json"))

    raw_file = os.path.join(d.getVar("T", True), "sca_raw_oclint.json")
    d.setVar("SCA_RAW_RESULT_FILE", raw_file)
    with open(raw_file, "w") as o:
        o.write(cmd_output)
    
    result_file = os.path.join(d.getVar("T", True), "sca_checkstyle_oclint.xml")
    d.setVar("SCA_RESULT_FILE", result_file)
    conv_output = do_sca_conv_oclint(d)
    with open(result_file, "w") as o:
        o.write(conv_output)

    ## Evaluate
    _warnings = get_warnings_from_result(d)
    _fatals = get_fatal_from_result(d, "OCLint.OCLint", _fatal)
    _errors = get_errors_from_result(d)

    warn_log = []
    if any(_warnings):
        warn_log.append("{} warning(s)".format(len(_warnings)))
    if any(_errors):
        warn_log.append("{} error(s)".format(len(_errors)))
    if warn_log and should_emit_to_console(d):
        bb.warn("SCA has found {}".format(",".join(warn_log)))
    
    if any(_fatals):
        bb.build.exec_func("do_sca_deploy_oclint", d)
        bb.error("SCA has following fatal errors: {}".format("\n".join(_fatals)))
}

python do_sca_deploy_oclint() {
    import os
    import shutil
    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "oclint", "raw"), exist_ok=True)
    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "oclint", "checkstyle"), exist_ok=True)
    raw_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "oclint", "raw", "{}-{}.json".format(d.getVar("PN"), d.getVar("PV")))
    cs_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "oclint", "checkstyle", "{}-{}.xml".format(d.getVar("PN"), d.getVar("PV")))
    src_raw = os.path.join(d.getVar("T"), "sca_raw_oclint.json")
    src_conv = os.path.join(d.getVar("T"), "sca_checkstyle_oclint.xml")
    if os.path.exists(src_raw):
        shutil.copy(src_raw, raw_target)
    if os.path.exists(src_conv):
        shutil.copy(src_conv, cs_target)
    if os.path.exists(cs_target):
        do_sca_export_sources(d, cs_target)
}

addtask do_sca_oclint before do_install after do_compile
addtask do_sca_deploy_oclint after do_sca_oclint before do_package

DEPENDS += "oclint-native sca-recipe-oclint-rules-native"
