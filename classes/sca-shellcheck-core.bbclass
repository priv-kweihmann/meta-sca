inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-license-filter

def do_sca_conv_shellcheck(d):
    import os
    import re
    from xml.etree.ElementTree import Element, SubElement, Comment, tostring
    from xml.etree import ElementTree
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        try:
            data = ElementTree.ElementTree(ElementTree.parse(d.getVar("SCA_RAW_RESULT_FILE"))).getroot()
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
                        if g.Severity in sca_allowed_warning_level(d):
                            sca_add_model_class(d, g)
                    except Exception as exp:
                        bb.warn(str(exp))
        except:
            pass

    return sca_save_model_to_string(d)

python do_sca_shellcheck_core() {
    import os
    import subprocess
    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_SHELLCHECK_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_SHELLCHECK_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "shellcheck-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "shellcheck-{}-fatal".format(d.getVar("SCA_MODE"))))

    _suppress = get_suppress_entries(d)

    _args = ["shellcheck"]
    _args += ["-f", "checkstyle"]
    if any(_suppress):
        _args += ["--exclude=SC{}".format(",SC".join(_suppress))]
    
    xml_output = ""
    for k,v in { "bash": "*./bash", "sh": "*./sh", "ksh": "*./ksh"}.items():
        for item in get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), v, ".sh",
                                                      sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA"))):
            _t_args = _args + ["-s", k, item]
            cmd_output = ""
            try:
                cmd_output = subprocess.check_output(_t_args, universal_newlines=True)
            except subprocess.CalledProcessError as e:
                cmd_output = e.stdout or ""
            xml_output = xml_combine(d, xml_output, cmd_output)
    result_raw_file = os.path.join(d.getVar("T"), "sca_raw_shellcheck.xml")
    d.setVar("SCA_RAW_RESULT_FILE", result_raw_file)
    with open(result_raw_file, "w") as o:
        o.write(xml_output)
    
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/shellcheck.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_shellcheck(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "shellcheck", get_fatal_entries(d))
}

DEPENDS += "shellcheck-native"
