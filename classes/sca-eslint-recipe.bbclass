inherit sca-helper
inherit sca-global
inherit sca-eslint-core

python do_sca_deploy_eslint_recipe() {
    import os
    import shutil

    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "eslint", "raw"), exist_ok=True)
    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "eslint", "checkstyle"), exist_ok=True)

    import os
    from xml.etree.ElementTree import Element, SubElement, Comment, tostring
    from xml.etree import ElementTree
    from xml.dom import minidom

    for _file in ["sca_raw_eslint.xml", "sca_checkstyle_eslint.xml"]:
        try:
            data = ElementTree.parse(os.path.join(d.getVar("T"), _file)).getroot()
            for node in data.findall(".//error"):
                ## Patch to common format
                node.attrib["message"] = "[Package:'{}' Tool:eslint] {}".format(d.getVar("PN"), node.attrib["message"])
                node.attrib["source"] = "eslint.{}".format(node.attrib["source"])

            res = ""
            try:
                res = prettify(top).decode("utf-8")
            except:
                res = prettify(top)
            with open(os.path.join(d.getVar("T"), _file), "w") as f:
                f.write(res)
        except:
            pass

    raw_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "eslint", "raw", "{}-{}.xml".format(d.getVar("PN"), d.getVar("PV")))
    cs_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "eslint", "checkstyle", "{}-{}.xml".format(d.getVar("PN"), d.getVar("PV")))
    if os.path.exists(os.path.join(d.getVar("T"), "sca_raw_eslint.xml")):
        shutil.copy(os.path.join(d.getVar("T"), "sca_raw_eslint.xml"), raw_target)
    if os.path.exists(os.path.join(d.getVar("T"), "sca_checkstyle_eslint.xml")):
        shutil.copy(os.path.join(d.getVar("T"), "sca_checkstyle_eslint.xml"), cs_target)

    do_sca_export_sources(d, cs_target)
}

addtask do_sca_eslint_core before do_install after do_compile
addtask do_sca_deploy_eslint_recipe before do_package after do_sca_eslint_core

DEPENDS += "sca-recipe-eslint-rules-native"
