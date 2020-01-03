## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_CPPCHECK_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_CPPCHECK_EXTRA_FATAL ?= ""
## Additional absolute paths to additional include dirs
## can be seperated by spaces
SCA_CPPCHECK_ADD_INCLUDES ?= ""
## Set default language support level
## For multiple use a space separated list
## Possible entries are posix,c89,c99,c11,c++03,c++11,c++14,c++17,c++20
SCA_CPPCHECK_LANG_STD ?= "c99"
## File extension filter list (whitespace separated)
SCA_CPPCHECK_FILE_FILTER ?= ".c .cpp .h .hpp"
## Depth of analysis - higher value = higher effort
SCA_CPPCHECK_CHECK_DEPTH ?= "3"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress

def get_platform_type(d):
    ## Let's assume that 64bit platforms 
    ## end with a 64 in their platform name
    tmp = d.getVar("TARGET_ARCH", True)
    if tmp.endswith("64"):
        return "unix64"
    else:
        return "unix32"

def do_sca_conv_cppcheck(d):
    import os
    import re
    from xml.etree.ElementTree import Element, SubElement, Comment, tostring
    from xml.etree import ElementTree
    
    package_name = d.getVar("PN", True)
    buildpath = d.getVar("SCA_SOURCES_DIR", True)

    items = []

    severity_map = {
        "error" : "error",
        "warning" : "warning",
        "style" : "info",
        "performance" : "info",
        "portability" : "info",
        "information" : "info",
        "debug": "ignore"
    }

    _findings = []
    _suppress = sca_suppress_init(d)

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE", True)):
        data = ElementTree.parse(d.getVar("SCA_RAW_RESULT_FILE", True)).getroot()
        for node in data.findall(".//error"):
            try:
                for loc in node.findall(".//location"):
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="cppcheck",
                                            BuildPath=buildpath,
                                            File=os.path.join(buildpath, loc.attrib.get("file")),
                                            Line=loc.attrib.get("line"),
                                            Message=node.attrib.get("msg"),
                                            ID=node.attrib.get("id"),
                                            Severity=severity_map[node.attrib.get("severity")])
                    if _suppress.Suppressed(g):
                        continue
                    if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                        continue
                    if g.Severity in sca_allowed_warning_level(d):
                        _findings.append(g)
            except Exception as exp:
                bb.warn(str(exp))
    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_cppcheck() {
    import os
    import subprocess
    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_CPPCHECK_EXTRA_SUPPRESS", True))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_CPPCHECK_EXTRA_FATAL", True))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "cppcheck-{}-suppress".format(d.getVar("SCA_MODE", True))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "cppcheck-{}-fatal".format(d.getVar("SCA_MODE", True))))

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
    _args += ["--max-ctu-depth={}".format(d.getVar("SCA_CPPCHECK_CHECK_DEPTH", True))]
    for item in d.getVar("SCA_CPPCHECK_LANG_STD", True).split(" "):
        _args += ["--std={}".format(item)]
    _args += [get_platform_type(d)]    
    result_raw_file = os.path.join(d.getVar("T", True), "sca_raw_cppcheck.xml")
    d.setVar("SCA_RAW_RESULT_FILE", result_raw_file)
    _args += ["--output-file={}".format(result_raw_file)]
    _files = get_files_by_extention(d, 
                                    d.getVar("SCA_SOURCES_DIR", True), 
                                    clean_split(d, "SCA_CPPCHECK_FILE_FILTER", True), 
                                    sca_filter_files(d, d.getVar("SCA_SOURCES_DIR", True), clean_split(d, "SCA_FILE_FILTER_EXTRA")))
    _file_list = os.path.join(d.getVar("T", True), ".cppcheck_filelist")
    with open(_file_list, "w") as o:
        o.write("\n".join(_files))
    _args += ["--file-list={}".format(_file_list)]

    ## Run
    if os.path.exists("std.cfg"):
        os.remove("std.cfg")
    try:
        os.symlink(os.path.join(d.getVar("STAGING_BINDIR_NATIVE", True), "cfg", "std.cfg"), "std.cfg")
    except FileExistsError:
        pass
    cur_dir = os.getcwd()
    os.chdir(d.getVar("B", True))
    try:
        os.remove("std.cfg")
    except FileNotFoundError:
        pass
    try:
        os.symlink(os.path.join(d.getVar("STAGING_BINDIR_NATIVE", True), "cfg", "std.cfg"), "std.cfg")
    except FileExistsError:
        pass
    cmd_output = ""
    try:
        cmd_output = subprocess.check_output(_args, universal_newlines=True)
    except subprocess.CalledProcessError as e:
        cmd_output = e.stdout or ""

    if os.path.exists("std.cfg"):
        os.remove("std.cfg")
    os.chdir(cur_dir)
    if os.path.exists("std.cfg"):
        os.remove("std.cfg")

    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/cppcheck.dm".format(d.getVar("T", True)))
    dm_output = do_sca_conv_cppcheck(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE", True), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "cppcheck", get_fatal_entries(d))
}

SCA_DEPLOY_TASK = "do_sca_deploy_cppcheck"

python do_sca_deploy_cppcheck() {
    sca_conv_deploy(d, "cppcheck", "xml")
}

addtask do_sca_cppcheck before do_install after do_compile
addtask do_sca_deploy_cppcheck after do_sca_cppcheck before do_package

do_sca_cppcheck[depends] += "${@oe.utils.conditional('SCA_FORCE_RUN', '1', '${PN}:do_sca_do_force_meta_task', '', d)}"
do_sca_deploy_cppcheck[depends] += "${@oe.utils.conditional('SCA_FORCE_RUN', '1', '${PN}:do_sca_do_force_meta_task', '', d)}"

DEPENDS += "cppcheck-native sca-recipe-cppcheck-rules-native"
