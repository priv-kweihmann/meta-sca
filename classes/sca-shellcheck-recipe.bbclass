inherit sca-helper
inherit sca-global
inherit sca-shellcheck-core

python do_sca_deploy_shellcheck_recipe() {
    import os
    import shutil

    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "shellcheck", "raw"), exist_ok=True)
    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "shellcheck", "checkstyle"), exist_ok=True)

    import os
    from xml.etree.ElementTree import Element, SubElement, Comment, tostring
    from xml.etree import ElementTree
    from xml.dom import minidom

    for _file in ["sca_raw_shellcheck.xml", "sca_checkstyle_shellcheck.xml"]:
        try:
            data = ElementTree.parse(os.path.join(d.getVar("T"), _file)).getroot()
            for node in data.findall(".//error"):
                ## Patch to common format
                node.attrib["message"] = "[Package:'{}' Tool:shellcheck] {}".format(d.getVar("PN"), node.attrib["message"])
                node.attrib["source"] = "ShellCheck.{}".format(node.attrib["source"])

            res = ""
            try:
                res = prettify(top).decode("utf-8")
            except:
                res = prettify(top)
            with open(os.path.join(d.getVar("T"), _file), "w") as f:
                f.write(res)
        except:
            pass

    raw_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "shellcheck", "raw", "{}-{}.xml".format(d.getVar("PN"), d.getVar("PV")))
    cs_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "shellcheck", "checkstyle", "{}-{}.xml".format(d.getVar("PN"), d.getVar("PV")))
    if os.path.exists(os.path.join(d.getVar("T"), "sca_raw_shellcheck.xml")):
        shutil.copy(os.path.join(d.getVar("T"), "sca_raw_shellcheck.xml"), raw_target)
    if os.path.exists(os.path.join(d.getVar("T"), "sca_checkstyle_shellcheck.xml")):
        shutil.copy(os.path.join(d.getVar("T"), "sca_checkstyle_shellcheck.xml"), cs_target)

    do_sca_export_sources(d, cs_target)
}

addtask do_sca_shellcheck_core before do_install after do_compile
addtask do_sca_deploy_shellcheck_recipe before do_package after do_sca_shellcheck_core

DEPENDS += "sca-recipe-shellcheck-rules-native"
