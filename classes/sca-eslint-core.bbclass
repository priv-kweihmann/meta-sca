## Set the config file to be used - the files must be placed at ${STAGING_DATADIR_NATIVE}/eslint/configs
## See eslint-native recipe for details
SCA_ESLINT_CONFIG_FILE ?= "eslint-plain.json"
SCA_ESLINT_EXTRA_SUPPRESS ?= ""
SCA_ESLINT_EXTRA_FATAL ?= ""

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-license-filter

DEPENDS += "eslint-native"

def do_sca_conv_eslint(d):
    import os
    import re
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
    __suppress = get_suppress_entries(d)

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        try:
            data = ElementTree.ElementTree(ElementTree.parse(d.getVar("SCA_RAW_RESULT_FILE")))
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
                        if g.GetPlainID() in __suppress:
                            continue
                        if g.Severity in sca_allowed_warning_level(d):
                            sca_add_model_class(d, g)
                except Exception as exp:
                    bb.warn(str(exp))
        except Exception as e:
            bb.note(str(e))
    return sca_save_model_to_string(d)

python do_sca_eslint_core() {
    import os
    import subprocess
    import json

    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_ESLINT_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_ESLINT_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "eslint-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "eslint-{}-fatal".format(d.getVar("SCA_MODE"))))

    os.symlink(os.path.join(d.getVar("STAGING_LIBDIR_NATIVE"), "node_modules"), "node_modules", target_is_directory=True)

    _args = ["eslint"]
    _args += ["-c", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "eslint", "configs", d.getVar("SCA_ESLINT_CONFIG_FILE"))]
    _args += ["-f", "checkstyle"]
    _args += ["--quiet"]
    _args += [d.getVar("SCA_SOURCES_DIR") + "/"]

    cmd_output = ""
    try:
        cmd_output = subprocess.check_output(_args, universal_newlines=True)
    except subprocess.CalledProcessError as e:
        cmd_output = e.stdout or ""
    result_raw_file = os.path.join(d.getVar("T"), "sca_raw_eslint.xml")
    d.setVar("SCA_RAW_RESULT_FILE", result_raw_file)
    with open(result_raw_file, "w") as o:
        o.write(cmd_output)

    os.remove("node_modules")
    
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/eslint.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_eslint(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "eslint", get_fatal_entries(d))
}
