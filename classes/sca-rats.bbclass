## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_RATS_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_RATS_EXTRA_FATAL ?= ""

SCA_RAW_RESULT_FILE[rats] = "xml"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress
inherit sca-tracefiles

def do_sca_conv_rats(d):
    import os
    import re
    import hashlib
    from xml.etree.ElementTree import Element, SubElement, Comment, tostring
    from xml.etree import ElementTree
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    severity_map = {
        "High" : "error",
        "Medium" : "warning",
        "Low" : "info",
        "Default": "info"
    }

    _suppress = sca_suppress_init(d, "SCA_RATS_EXTRA_SUPPRESS", 
                                  d.expand("${STAGING_DATADIR_NATIVE}/rats-${SCA_MODE}-suppress"))

    _findings = []

    if os.path.exists(sca_raw_result_file(d, "rats")):
        try:
            data = ElementTree.parse(sca_raw_result_file(d, "rats")).getroot()
            for node in data.findall(".//vulnerability"):
                try:
                    _severity=""
                    _msg=""
                    _id=""
                    for _i in node.iter(tag="severity"):
                        _severity = severity_map[_i.text]
                    for _i in node.iter(tag="message"):
                        _text = _i.text.replace("\n", " ")
                        _msg = re.sub(r"\s{2,}", " ", _text).strip()
                    for _i in node.iter(tag="type"):
                        _id = _i.text.replace(" ", "_")
                    if not _severity in sca_allowed_warning_level(d):
                        continue
                    # address the bug that rats sometimes doesn't report    
                    # a proper ID for the findings
                    if not _id:
                        _id = hashlib.md5(str.encode(_msg)).hexdigest()
                    for _i in node.iter(tag="file"):
                        _filename = ""
                        for _j in _i.iter(tag="name"):
                            _filename = _j.text
                        for _j in _i.iter(tag="line"):
                            g = sca_get_model_class(d,
                                                    PackageName=package_name,
                                                    Tool="rats",
                                                    BuildPath=buildpath,
                                                    File=_filename,
                                                    Line=_j.text,
                                                    Message=_msg,
                                                    ID=_id,
                                                    Severity=_severity)
                            if _suppress.Suppressed(g):
                                continue
                            _findings.append(g)
                except Exception as exp:
                    bb.warn(str(exp))
        except:
            pass

    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_rats() {
    import os
    import subprocess

    xml_output = ""
    _args = ["rats"]
    _args += ["--xml"]

    _excludes = sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA"))

    _files = get_files_by_extention(d, d.getVar("SCA_SOURCES_DIR"), ".c", _excludes)
    ## C
    if any(_files):
        try:
            _targs = _args + ["-d", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "rats-c.xml")]
            _targs += _files
            cmd_output = subprocess.check_output(_targs, universal_newlines=True, stderr=subprocess.STDOUT)
        except UnicodeDecodeError:
            cmd_output = ""
        except subprocess.CalledProcessError as e:
            cmd_output = e.stdout or ""
        xml_output = xml_combine(d, xml_output, cmd_output)

    _files = get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), ".*perl", ".perl .pl", _excludes)
    ## Perl
    if any(_files):
        try:
            _targs = _args + ["-d", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "rats-perl.xml")]
            _targs += _files
            cmd_output = subprocess.check_output(_targs, universal_newlines=True, stderr=subprocess.STDOUT)
        except UnicodeDecodeError:
            cmd_output = ""
        except subprocess.CalledProcessError as e:
            cmd_output = e.stdout or ""
        xml_output = xml_combine(d, xml_output, cmd_output)

    _files = get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), d.getVar("SCA_PYTHON_SHEBANG"), ".py", _excludes)
    ## Python
    if any(_files):
        try:
            _targs = _args + ["-d", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "rats-python.xml")]
            _targs += _files
            cmd_output = subprocess.check_output(_targs, universal_newlines=True, stderr=subprocess.STDOUT)
        except UnicodeDecodeError:
            cmd_output = ""
        except subprocess.CalledProcessError as e:
            cmd_output = e.stdout or ""
        xml_output = xml_combine(d, xml_output, cmd_output)

    _files = get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), ".*php", ".php", _excludes)
    ## Php
    if any(_files):
        try:
            _targs = _args + ["-d", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "rats-php.xml")]
            _targs += _files
            cmd_output = subprocess.check_output(_targs, universal_newlines=True, stderr=subprocess.STDOUT)
        except UnicodeDecodeError:
            cmd_output = ""
        except subprocess.CalledProcessError as e:
            cmd_output = e.stdout or ""
        xml_output = xml_combine(d, xml_output, cmd_output)

    _files = get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), ".*ruby", ".ruby .rb", _excludes)
    ## Ruby
    if any(_files):
        try:
            _targs = _args + ["-d", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "rats-ruby.xml")]
            _targs += _files
            cmd_output = subprocess.check_output(_targs, universal_newlines=True, stderr=subprocess.STDOUT)
        except UnicodeDecodeError:
            cmd_output = ""
        except subprocess.CalledProcessError as e:
            cmd_output = e.stdout or ""
        xml_output = xml_combine(d, xml_output, cmd_output)
    
    with open(sca_raw_result_file(d, "rats"), "w") as o:
        o.write(xml_output)
}

python do_sca_rats_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/rats.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_rats(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "rats", get_fatal_entries(d, "SCA_RATS_EXTRA_FATAL",
                        d.expand("${STAGING_DATADIR_NATIVE}/rats-${SCA_MODE}-fatal")))
}

SCA_DEPLOY_TASK = "do_sca_deploy_rats"

python do_sca_deploy_rats() {
    sca_conv_deploy(d, "rats")
}

do_sca_rats[doc] = "Find risky functions in multiple languages"
do_sca_rats_report[doc] = "Report findings of do_sca_rats"
do_sca_deploy_rats[doc] = "Deploy results of do_sca_rats"
addtask do_sca_rats after do_configure before do_sca_tracefiles
addtask do_sca_rats_report after do_sca_tracefiles
addtask do_sca_deploy_rats after do_sca_rats_report before do_package

DEPENDS += "rats-native sca-recipe-rats-rules-native"
