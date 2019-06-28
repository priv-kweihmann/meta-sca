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

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper

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

def do_sca_conv_tscancode(d):
    import os
    import re
    from xml.etree.ElementTree import Element, SubElement, Comment, tostring
    from xml.etree import ElementTree
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    severity_map = {
        "Serious" : "error",
        "Critical" : "error",
        "Error" : "warning",
        "Warning" : "info",
        "Information" : "info"
    }

    __suppress = get_suppress_entries(d)

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        try:
            data = ElementTree.parse(d.getVar("SCA_RAW_RESULT_FILE")).getroot()
            for node in data.findall(".//error"):
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="tscancode",
                                            BuildPath=buildpath,
                                            File=node.attrib["file"],
                                            Line=node.attrib["line"],
                                            Message=node.attrib["msg"],
                                            ID="{}_{}".format(node.attrib["id"], node.attrib["subid"]),
                                            Severity=severity_map[node.attrib["severity"]])
                    if g.GetPlainID() in __suppress:
                        continue
                    if g.Severity in sca_allowed_warning_level(d):
                        sca_add_model_class(d, g)
                except Exception as exp:
                    bb.warn(str(exp))
        except:
            pass

    return sca_save_model_to_string(d)

python do_sca_tscancode() {
    import os
    import subprocess
    import shutil
    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_TSCANCODE_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_TSCANCODE_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "tscancode-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "tscancode-{}-fatal".format(d.getVar("SCA_MODE"))))

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
    
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/tscancode.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_tscancode(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "tscancode", get_fatal_entries(d))
}

SCA_DEPLOY_TASK = "do_sca_deploy_tscancode"

python do_sca_deploy_tscancode() {
    sca_conv_deploy(d, "tscancode", "xml")
}

addtask do_sca_tscancode before do_install after do_configure
addtask do_sca_deploy_tscancode after do_sca_tscancode before do_package

DEPENDS += "tscancode-native sca-recipe-tscancode-rules-native"
