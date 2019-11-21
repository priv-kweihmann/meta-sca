## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

SCA_XMLLINT_EXTRA_SUPPRESS ?= ""
SCA_XMLLINT_EXTRA_FATAL ?= ""
## File extension filter list (whitespace separated)
SCA_XMLLINT_FILE_FILTER ?= ".xml"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-license-filter

DEPENDS += "libxml2-native"

def do_sca_conv_xmllint(d):
    import os
    import re
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^(?P<file>.*):(?P<line>\d+):\s+(?P<id>.*)\s+error\s+:\s+(?P<msg>.*)"

    _suppress = get_suppress_entries(d)
    _findings = []

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        with open(d.getVar("SCA_RAW_RESULT_FILE"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="xmllint",
                                            File=m.group("file"),
                                            BuildPath=buildpath,
                                            Line=m.group("line"),
                                            Message=m.group("msg"),
                                            ID=m.group("id"),
                                            Severity="error")
                    if g.GetFormattedID() in _suppress:
                        continue
                    if not sca_is_in_finding_scope(d, "xmllint", g.GetFormattedID()):
                        continue
                    if g.Severity in sca_allowed_warning_level(d):
                        _findings.append(g)
                except Exception as exp:
                    bb.warn(str(exp))

    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_xmllint_core() {
    import os
    import subprocess

    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_XMLLINT_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_XMLLINT_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "xmllint-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "xmllint-{}-fatal".format(d.getVar("SCA_MODE"))))

    _args = ["xmllint"]
    _args += ["--noout"]
    _args += ["--valid"]

    _files = get_files_by_extention(d, d.getVar("SCA_SOURCES_DIR"), d.getVar("SCA_XMLLINT_FILE_FILTER"), \
                                    sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))
    cmd_output = ""
    if any(_files):
        _args += _files    
        try:
            cmd_output = subprocess.check_output(_args, universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            cmd_output = e.stdout or ""

    result_raw_file = os.path.join(d.getVar("T"), "sca_raw_xmllint.txt")
    d.setVar("SCA_RAW_RESULT_FILE", result_raw_file)
    with open(result_raw_file, "w") as o:
        o.write(cmd_output)

    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/xmllint.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_xmllint(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "xmllint", get_fatal_entries(d))
}
