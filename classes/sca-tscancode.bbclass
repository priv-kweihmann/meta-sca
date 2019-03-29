## Add ids to suppress on a recipe level
SCA_TSCANCODE_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_TSCANCODE_EXTRA_FATAL ?= ""
## Include paths - use wisely - makes check extremely slow
SCA_TSCANCODE_INCLUDE_PATHS ?= ""
## Scan the following files for configuration symbols
SCA_TSCANCODE_CONFIG_FILES ?= ".config config.h"
## Prefix found symbol with
SCA_TSCANCODE_SYMBOL_PREFIX ?= "ENABLE_"
## File filter
SCA_TSCANCODE_FILE_FILTER = ".cpp .cxx .cc .c++ .c .tpp .txx"

inherit sca-helper
inherit sca-conv-checkstyle-tscancode
inherit sca-global

def get_config_symbols(d, config_file=".config", strip="CONFIG_"):
    import re
    import os
    res = []
    for x in [x for x in d.getVar("SCA_TSCANCODE_CONFIG_FILES").split(" ") if x]:
        _in = os.path.join(d.getVar("B"), x)
        if os.path.exists(_in):
            with open(_in) as i:
                content = i.read()
                for m in re.finditer(r'^CONFIG_(?P<name>[A-Z_0-9]+)=\"*(?P<value>.*)\"*', content, re.MULTILINE):
                    value = m.group("value")
                    value_repl = {"y": "1", "m": "1", "n": "0"}
                    if value in value_repl.keys():
                        value = value_repl[value]
                    res.append("{}={}".format(m.group("name"), value))
                for m in re.finditer(r'^#define\s+(?P<name>[A-Z_0-9]+)\s+\"*(?P<value>.*)\"*', content, re.MULTILINE):
                    res.append("{}={}".format(m.group("name"), m.group("value")))
    return res

python do_sca_tscancode() {
    import os
    import subprocess
    import shutil
    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_TSCANCODE_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_TSCANCODE_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "tscancode-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "tscancode-{}-fatal".format(d.getVar("SCA_MODE"))))

    _supress = get_suppress_entries(d)
    _fatal = get_fatal_entries(d)

    tmp_result = os.path.join(d.getVar("T", True), "sca_raw_tscancode.xml")

    d.setVar("SCA_RAW_RESULT_FILE", tmp_result)
    xml_output = ""
    _args = ["tscancode"]
    _args += ["--xml"]
    _args += ["--enable=all"]
    _args += ["-q"]
    _args += ["-j", d.getVar("BB_NUMBER_THREADS")]
    for sym in get_config_symbols(d):
        _args += ["-D{}{}".format(d.getVar("SCA_TSCANCODE_SYMBOL_PREFIX"), sym)]
    for x in [x for x in d.getVar("SCA_TSCANCODE_INCLUDE_PATHS") if x]:
        _args += ["-I", x]
    _args += get_files_by_extention(d, 
                                    d.getVar("SCA_SOURCES_DIR"), 
                                    clean_split(d, "SCA_TSCANCODE_FILE_FILTER"), 
                                    sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    ## create tmpdir
    _cfgdir = os.path.join(d.getVar("T"), "tscancode", "cfg")
    if os.path.exists(_cfgdir):
        shutil.rmtree(os.path.join(d.getVar("T"), "tscancode"), ignore_errors=True)
    os.makedirs(os.path.dirname(_cfgdir), exist_ok=True)
    os.symlink(os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "tscancode"), _cfgdir, target_is_directory=True)

    _curdir = os.getcwd()
    os.chdir(os.path.join(d.getVar("T"), "tscancode"))

    try:
        x = subprocess.run(_args, universal_newlines=True, stdout=subprocess.DEVNULL, stderr=subprocess.PIPE)
        cmd_output = x.stderr
    except subprocess.CalledProcessError as e:
        cmd_output = e.stderr or ""
    os.chdir(_curdir)

    with open(tmp_result, "w") as o:
        o.write(cmd_output)
    
    result_file = os.path.join(d.getVar("T", True), "sca_checkstyle_tscancode.xml")
    d.setVar("SCA_RESULT_FILE", result_file)
    conv_output = do_sca_conv_tscancode(d)
    with open(result_file, "w") as o:
        o.write(conv_output)

    ## Evaluate
    _warnings = get_warnings_from_result(d)
    _fatals = get_fatal_from_result(d, "tscancode.", _fatal)
    _errors = get_errors_from_result(d)

    warn_log = []
    if any(_warnings) and should_emit_to_console(d):
        warn_log.append("{} warning(s)".format(len(_warnings)))
    if any(_errors) and should_emit_to_console(d):
        warn_log.append("{} error(s)".format(len(_errors)))
    if warn_log and should_emit_to_console(d):
        bb.warn("SCA has found {}".format(",".join(warn_log)))
    
    if any(_fatals):
        bb.build.exec_func("do_sca_deploy_tscancode", d)
        bb.error("SCA has following fatal errors: {}".format("\n".join(_fatals)))
}

python do_sca_deploy_tscancode() {
    import os
    import shutil
    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "tscancode", "raw"), exist_ok=True)
    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "tscancode", "checkstyle"), exist_ok=True)
    raw_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "tscancode", "raw", "{}-{}.xml".format(d.getVar("PN"), d.getVar("PV")))
    cs_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "tscancode", "checkstyle", "{}-{}.xml".format(d.getVar("PN"), d.getVar("PV")))
    src_raw = os.path.join(d.getVar("T"), "sca_raw_tscancode.xml")
    src_conv = os.path.join(d.getVar("T"), "sca_checkstyle_tscancode.xml")
    if os.path.exists(src_raw):
        shutil.copy(src_raw, raw_target)
    if os.path.exists(src_conv):
        shutil.copy(src_conv, cs_target)
    if os.path.exists(cs_target):
        do_sca_export_sources(d, cs_target)
}

addtask do_sca_tscancode before do_install after do_configure
addtask do_sca_deploy_tscancode after do_sca_tscancode before do_package

DEPENDS += "tscancode-native sca-recipe-tscancode-rules-native"
