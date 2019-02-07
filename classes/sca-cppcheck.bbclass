## Add ids to suppress on a recipe level
SCA_CPPCHECK_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_CPPCHECK_EXTRA_FATAL ?= ""
## Additional absolute paths to additional include dirs
## can be seperated by spaces
SCA_CPPCHECK_ADD_INCLUDES ?= ""
## Set default language support level
## For multiple use a space separated list
## Possible entries are posix,c89,c99,c11,c++03,c++11,c++14
SCA_CPPCHECK_LANG_STD ?= "c99"

def get_platform_type(d):
    ## Let's assume that 64bit platforms 
    ## end with a 64 in their platform name
    tmp = d.getVar("TARGET_ARCH")
    if tmp.endswith("64"):
        return "unix64"
    else:
        return "unix32"

inherit sca-helper
inherit sca-conv-checkstyle-cppcheck
inherit sca-global

python do_sca_cppcheck() {
    import os
    import subprocess
    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_CPPCHECK_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_CPPCHECK_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "cppcheck-suppress"))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "cppcheck-fatal"))

    _supress = get_suppress_entries(d)
    _fatal = get_fatal_entries(d)
    _user_rules = os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "cppcheck-user-rules.xml")
    _add_include = d.getVar("SCA_CPPCHECK_ADD_INCLUDES", True).split(" ")

    _args = ["cppcheck"]
    if os.path.exists(_user_rules):
        _args += ["--rule-file={}".format(_user_rules)]

    _args += ["--enable=all"]
    _args += ["--inline-suppr"]
    _args += ["-I", d.getVar("STAGING_INCDIR", True)]
    for item in _add_include:
        _args += ["-I", item]
    _args += ["--xml-version=2"]
    _args += ["--force"]
    _args += ["--max-configs=1"]
    for item in d.getVar("SCA_CPPCHECK_LANG_STD").split(" "):
        _args += ["--std={}".format(item)]
    _args += [get_platform_type(d)]    
    _args += ["--suppress={}".format(x) for x in _supress]
    result_raw_file = os.path.join(d.getVar("T", True), "sca_raw_cppcheck.xml")
    d.setVar("SCA_RAW_RESULT", result_raw_file)
    _args += ["--output-file={}".format(result_raw_file)]
    _args += ["."]

    ## Run
    if os.path.exists("std.cfg"):
        os.remove("std.cfg")
    os.symlink(os.path.join(d.getVar("STAGING_BINDIR_NATIVE", True), "cfg", "std.cfg"), "std.cfg")
    cur_dir = os.getcwd()
    os.chdir(d.getVar("B", True))
    if os.path.exists("std.cfg"):
        os.remove("std.cfg")
    os.symlink(os.path.join(d.getVar("STAGING_BINDIR_NATIVE", True), "cfg", "std.cfg"), "std.cfg")
    cmd_output = ""
    try:
        cmd_output = subprocess.check_output(_args, universal_newlines=True)
    except subprocess.CalledProcessError as e:
        cmd_output = e.stdout or ""
        bb.warn(cmd_output)

    if os.path.exists("std.cfg"):
        os.remove("std.cfg")
    os.chdir(cur_dir)
    if os.path.exists("std.cfg"):
        os.remove("std.cfg")
    
    result_file = os.path.join(d.getVar("T", True), "sca_checkstyle_cppcheck.xml")
    d.setVar("SCA_RESULT_FILE", result_file)
    conv_output = do_sca_conv_cppcheck(d)
    with open(result_file, "w") as o:
        o.write(conv_output)

    ## Evaluate
    _warnings = get_warnings_from_result(d)
    _fatals = get_fatal_from_result(d, _fatal)
    _errors = get_errors_from_result(d)

    warn_log = []
    if any(_warnings):
        warn_log.append("{} warning(s)".format(len(_warnings)))
    if any(_errors):
        warn_log.append("{} error(s)".format(len(_errors)))
    if warn_log:
        bb.warning("SCA has found {}".format(",".join(warn_log)))
    
    if any(_fatal):
        bb.fatal("SCA has following fatal errors: {}".format("\n".join(_fatals)))
}

python do_sca_deploy_cppcheck() {
    import os
    import shutil
    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "cppcheck", "raw"), exist_ok=True)
    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "cppcheck", "checkstyle"), exist_ok=True)
    raw_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "cppcheck", "raw", "{}-{}.xml".format(d.getVar("PN"), d.getVar("PV")))
    cs_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "cppcheck", "checkstyle", "{}-{}.xml".format(d.getVar("PN"), d.getVar("PV")))
    shutil.copy(os.path.join(d.getVar("T"), "sca_raw_cppcheck.xml"), raw_target)
    shutil.copy(os.path.join(d.getVar("T"), "sca_checkstyle_cppcheck.xml"), cs_target)
    do_sca_export_sources(d, cs_target)
}

addtask do_sca_cppcheck before do_install after do_compile
addtask do_sca_deploy_cppcheck after do_sca_cppcheck before do_package

DEPENDS += "cppcheck-native sca-recipe-cppcheck-rules-native"
