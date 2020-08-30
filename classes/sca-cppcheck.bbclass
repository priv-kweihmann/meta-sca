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
## Mode of running the tool fast=multithreaded, complete=singlethreaded
SCA_CPPCHECK_RUNMODE ?= "fast"
## Number of config permutations
SCA_CPPCHECK_MAX_CONFIG ?= "1"
## Config to use
SCA_CPPCHECK_LIBRARY ?= "std.cfg"

SCA_RAW_RESULT_FILE[cppcheck] = "xml"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress
inherit sca-tracefiles

def get_platform_type(d):
    ## Let's assume that 64bit platforms
    ## end with a 64 in their platform name
    tmp = d.getVar("TARGET_ARCH")
    if tmp.endswith("64"):
        return "unix64"
    else:
        return "unix32"

def do_sca_conv_cppcheck(d):
    import os
    from xml.etree.ElementTree import Element, SubElement, Comment, tostring
    from xml.etree import ElementTree

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

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
    _suppress = sca_suppress_init(d, "SCA_CPPCHECK_EXTRA_SUPPRESS",
                                  d.expand("${STAGING_DATADIR_NATIVE}/cppcheck-${SCA_MODE}-suppress"))

    if os.path.exists(sca_raw_result_file(d, "cppcheck")):
        data = ElementTree.parse(sca_raw_result_file(d, "cppcheck")).getroot()
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

def exec_wrap_combine_xml_cppcheck(a, b, **kwargs):
    try:
        with open(kwargs["sourcefile"]) as i:
            b = i.read()
    except:
        b = ""
    return xml_combine(None, a, b)

do_sca_cppcheck[vardepsexclude] += "BB_NUMBER_THREADS"
python do_sca_cppcheck() {
    import os
    import subprocess

    _user_rules = os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "cppcheck-user-rules.xml")
    _add_include = d.getVar("SCA_CPPCHECK_ADD_INCLUDES", True).split(" ")

    # Copy configurations into special dir
    subprocess.check_call(["ln", "-sf", d.expand("${STAGING_DATADIR_NATIVE}/cfg"), d.expand("${T}/cfg")])
    subprocess.check_call(["ln", "-sf", d.expand("${STAGING_DATADIR_NATIVE}/platform"), d.expand("${T}/platform")])

    _args = ["cppcheck"]
    if os.path.exists(_user_rules):
        _args += ["--rule-file={}".format(_user_rules)]

    if d.getVar("SCA_CPPCHECK_RUNMODE") == "complete":
        _args += ["--enable=all"]
        _args += ["--force"]
    elif d.getVar("SCA_CPPCHECK_RUNMODE") == "fast":
        _args += ["--max-configs={}".format(d.getVar("SCA_CPPCHECK_MAX_CONFIG"))]
        _args += ["--enable=warning,style,performance,portability,information"]
        _args += ["-j", d.getVar("BB_NUMBER_THREADS")]
    _args += ["--inline-suppr"]
    _args += ["-I", d.getVar("STAGING_INCDIR", True)]
    for item in _add_include:
        _args += ["-I", item]
    _args += ["--xml-version=2"]
    _args += ["--library={}".format(d.getVar("SCA_CPPCHECK_LIBRARY"))]
    _args += ["--max-ctu-depth={}".format(d.getVar("SCA_CPPCHECK_CHECK_DEPTH"))]
    for item in d.getVar("SCA_CPPCHECK_LANG_STD").split(" "):
        _args += ["--std={}".format(item)]
    _args += [get_platform_type(d)]
    _args += ["--output-file={}".format(sca_raw_result_file(d, "cppcheck"))]
    _files = get_files_by_extention(d,
                                    d.getVar("SCA_SOURCES_DIR"),
                                    clean_split(d, "SCA_CPPCHECK_FILE_FILTER"),
                                    sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))
    _file_list = os.path.join(d.getVar("T"), ".cppcheck_filelist")
    with open(_file_list, "w") as o:
        o.write("\n".join(_files))
    _args += ["--file-list={}".format(_file_list)]

    old_cwd = os.getcwd()
    os.chdir(d.getVar("T"))

    _def = '<results version="2"><cppcheck version="2.1" /><errors/></results>'
    cmd_output = exec_wrap_check_output(_args, _files, combine=exec_wrap_combine_xml_cppcheck,
                                        default_val=_def, sourcefile=sca_raw_result_file(d, "cppcheck"))

    os.chdir(old_cwd)

    with open(sca_raw_result_file(d, "cppcheck"), "w") as o:
        o.write(cmd_output)
}

python do_sca_cppcheck_report() {
    import os

    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/cppcheck.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_cppcheck(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "cppcheck", get_fatal_entries(d, d.getVar("SCA_CPPCHECK_EXTRA_FATAL"),
                      d.expand("${STAGING_DATADIR_NATIVE}/cppcheck-${SCA_MODE}-fatal")))
}

do_sca_cppcheck[doc] = "Lint C/C++ files with cppcheck"
do_sca_cppcheck_report[doc] = "Create cppcheck result report"
do_sca_deploy_cppcheck[doc] = "Deploy results of do_sca_cppcheck"
addtask do_sca_cppcheck after do_compile before do_sca_tracefiles
addtask do_sca_cppcheck_report after do_sca_tracefiles before do_sca_deploy

DEPENDS += "cppcheck-native sca-recipe-cppcheck-rules-native"
