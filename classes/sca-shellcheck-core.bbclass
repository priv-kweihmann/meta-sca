## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

SCA_RAW_RESULT_FILE[shellcheck] = "xml"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-license-filter
inherit sca-suppress

def do_sca_conv_shellcheck(d):
    import os
    from xml.etree.ElementTree import Element, SubElement, Comment, tostring
    from xml.etree import ElementTree
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")
    _suppress = sca_suppress_init(d, "SCA_SHELLCHECK_EXTRA_SUPPRESS",
                                  d.expand("${STAGING_DATADIR_NATIVE}/shellcheck-${SCA_MODE}-suppress"))
    _findings = []

    if os.path.exists(sca_raw_result_file(d, "shellcheck")):
        try:
            data = ElementTree.ElementTree(ElementTree.parse(sca_raw_result_file(d, "shellcheck"))).getroot()
            items = []

            for _file in data.findall(".//file"):
                for f in _file.findall(".//error"):
                    try:
                        g = sca_get_model_class(d,
                                                PackageName=package_name,
                                                Tool="ShellCheck",
                                                BuildPath=buildpath,
                                                File=_file.attrib.get("name"),
                                                Column=f.attrib.get("column"),
                                                Line=f.attrib.get("line"),
                                                Message=f.attrib.get("message"),
                                                ID=f.attrib.get("source"),
                                                Severity=f.attrib.get("severity"))
                        if _suppress.Suppressed(g):
                            continue
                        ## Mind that here the name has to be lowercase
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

python do_sca_shellcheck_core() {
    import os
    import subprocess

    _args = ["shellcheck-wrapper"]
    _args += ["-f", "checkstyle"]
    _args += ["-a"]
    
    xml_output = ""
    for k,v in { "bash": "*./bash", "sh": "*./sh", "ksh": "*./ksh"}.items():
        _files = get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), v, ".sh",
                                                   sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), 
                                                   clean_split(d, "SCA_FILE_FILTER_EXTRA")))
        _targs = _args + ["-s", k]
        xml_output = xml_combine(d, xml_output, exec_wrap_check_output(_targs, _files, combine=exec_wrap_combine_xml))
    
    with open(sca_raw_result_file(d, "shellcheck"), "w") as o:
        o.write(xml_output)
}

python do_sca_shellcheck_core_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/shellcheck.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_shellcheck(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "shellcheck", get_fatal_entries(d, "SCA_SHELLCHECK_EXTRA_FATAL",
                       d.expand("${STAGING_DATADIR_NATIVE}/shellcheck-${SCA_MODE}-fatal")))
}

DEPENDS += "shellcheck-native"
