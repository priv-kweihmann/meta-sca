## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Set the config file to be used - the files must be placed at ${STAGING_DATADIR_NATIVE}/eslint/configs
## See eslint-native recipe for details
SCA_ESLINT_CONFIG_FILE ?= "eslint-plain.json"
SCA_ESLINT_EXTRA_SUPPRESS ?= ""
SCA_ESLINT_EXTRA_FATAL ?= ""
SCA_ESLINT_FILE_FILTER ?= ".js .vue .html .htm"

SCA_RAW_RESULT_FILE[eslint] = "xml"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-license-filter
inherit sca-suppress

DEPENDS += "eslint-native"

def do_sca_conv_eslint(d):
    import os
    from xml.etree.ElementTree import Element, SubElement, Comment, tostring
    from xml.etree import ElementTree

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    items = []
    pattern = r"^(?P<file>.*):(?P<line>\d+):(?P<column>\d+):\s+(?P<severity>\w+):\s+(?P<message>.*)\s\[-(?P<id>.*)\]"

    severity_map = {
        "error" : "error",
        "warning" : "warning",
        "info": "info"
    }

    __excludes = sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA"))
    __suppress = sca_suppress_init(d, "SCA_ESLINT_EXTRA_SUPPRESS",
                                   d.expand("${STAGING_DATADIR_NATIVE}/eslint-${SCA_MODE}-suppress"))
    _findings = []

    if os.path.exists(sca_raw_result_file(d, "eslint")):
        try:
            data = ElementTree.ElementTree(ElementTree.parse(sca_raw_result_file(d, "eslint")))
            for _file in data.findall(".//file"):
                if _file.attrib["name"] in __excludes:
                    continue
                try:
                    for f in _file.findall(".//error"):
                        g = sca_get_model_class(d,
                                                PackageName=package_name,
                                                Tool="eslint",
                                                BuildPath=buildpath,
                                                File=_file.attrib["name"],
                                                Line=f.attrib["line"],
                                                Column=f.attrib["column"],
                                                Message=f.attrib["message"],
                                                ID=f.attrib["source"],
                                                Severity=f.attrib["severity"])
                        if __suppress.Suppressed(g):
                            continue
                        if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                            continue
                        if g.Severity in sca_allowed_warning_level(d):
                            _findings.append(g)
                except Exception as exp:
                    bb.note(str(exp))
        except Exception as e:
            bb.note(str(e))
    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_eslint_core() {
    import os
    import subprocess
    import json

    if not os.path.exists("node_modules"):
        os.symlink(os.path.join(d.getVar("STAGING_LIBDIR_NATIVE"), "node_modules"), "node_modules", target_is_directory=True)

    _args = ["eslint"]
    _args += ["-c", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "eslint", "configs", d.getVar("SCA_ESLINT_CONFIG_FILE"))]
    _args += ["-f", "checkstyle"]
    _args += ["--quiet"]
    _files = get_files_by_extention(d, d.getVar("SCA_SOURCES_DIR"), d.getVar("SCA_ESLINT_FILE_FILTER"),
                                sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    cmd_output = exec_wrap_check_output(_args, _files, combine=exec_wrap_combine_xml)
    with open(sca_raw_result_file(d, "eslint"), "w") as o:
        o.write(cmd_output)

    try:
        os.remove("node_modules")
    except FileNotFoundError:
        pass
}

python do_sca_eslint_core_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/eslint.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_eslint(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "eslint", get_fatal_entries(d, "SCA_ESLINT_EXTRA_FATAL",
                        d.expand("${STAGING_DATADIR_NATIVE}/eslint-${SCA_MODE}-fatal")))
}
