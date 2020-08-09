## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

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

SCA_RAW_RESULT_FILE[tscancode] = "txt"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress
inherit sca-tracefiles

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

    _suppress = sca_suppress_init(d, "SCA_TSCANCODE_EXTRA_SUPPRESS", 
                                  d.expand("${STAGING_DATADIR_NATIVE}/tscancode-${SCA_MODE}-suppress"))
    _findings = []

    if os.path.exists(sca_raw_result_file(d, "tscancode")):
        try:
            data = ElementTree.parse(sca_raw_result_file(d, "tscancode")).getroot()
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
                    if _suppress.Suppressed(g):
                        continue
                    if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                        continue
                    if g.Severity in sca_allowed_warning_level(d):
                        _findings.append(g)
                except Exception as exp:
                    bb.warn(str(exp))
        except:
            pass

    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

def exec_wrap_tool_exec_tscancode(args, files, stdout=None, stderr=None, **kwargs):
    import subprocess
    try:
        x = subprocess.run(args + files, universal_newlines=True, stdout=subprocess.DEVNULL, stderr=subprocess.PIPE)
        return x.stderr
    except subprocess.CalledProcessError as e:
        return e.stderr or ""

do_sca_tscancode[vardepsexclude] += "BB_NUMBER_THREADS"
python do_sca_tscancode() {
    import os
    import subprocess
    import shutil

    _args = ["tscancode"]
    _args += ["--xml"]
    _args += ["--enable=all"]
    _args += ["-q"]
    _args += ["-j", d.getVar("BB_NUMBER_THREADS")]
    for sym in get_config_symbols(d):
        _args += ["-D{}{}".format(d.getVar("SCA_TSCANCODE_SYMBOL_PREFIX"), sym)]
    for x in [x for x in d.getVar("SCA_TSCANCODE_INCLUDE_PATHS") if x]:
        _args += ["-I", x]
    _files = get_files_by_extention(d,    
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

    xml_output = exec_wrap_check_output(_args, _files, 
                                        combine=exec_wrap_combine_xml,
                                        toolexec=exec_wrap_tool_exec_tscancode)

    with open(sca_raw_result_file(d, "tscancode"), "w") as o:
        o.write(xml_output)
    
    os.chdir(_curdir)
}

python do_sca_tscancode_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/tscancode.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_tscancode(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "tscancode", get_fatal_entries(d, "SCA_TSCANCODE_EXTRA_FATAL",
                       d.expand("${STAGING_DATADIR_NATIVE}/tscancode-${SCA_MODE}-fatal")))
}

SCA_DEPLOY_TASK = "do_sca_deploy_tscancode"

python do_sca_deploy_tscancode() {
    sca_conv_deploy(d, "tscancode")
}

do_sca_tscancode[doc] = "Lint C/C++ files with tscancode"
do_sca_tscancode_report[doc] = "Report findings of do_sca_tscancode"
do_sca_deploy_tscancode[doc] = "Deploy results of do_sca_tscancode"
addtask do_sca_tscancode after do_configure before do_sca_tracefiles
addtask do_sca_tscancode_report after do_sca_tracefiles
addtask do_sca_deploy_tscancode after do_sca_tscancode_report before do_package

DEPENDS += "tscancode-native sca-recipe-tscancode-rules-native"
