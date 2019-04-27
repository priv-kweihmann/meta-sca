inherit sca-helper
inherit sca-global
inherit sca-htmlhint-core

SCA_DEPLOY_TASK = "do_sca_deploy_htmlhint_recipe"

python do_sca_deploy_htmlhint_recipe() {
    import os
    import shutil

    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "htmlhint", "raw"), exist_ok=True)
    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "htmlhint", "checkstyle"), exist_ok=True)

    import os
    from xml.etree.ElementTree import Element, SubElement, Comment, tostring
    from xml.etree import ElementTree
    from xml.dom import minidom

    for _file in ["sca_raw_htmlhint.xml", "sca_checkstyle_htmlhint.xml"]:
        try:
            data = ElementTree.parse(os.path.join(d.getVar("T"), _file)).getroot()
            for node in data.findall(".//error"):
                ## Patch to common format
                node.attrib["message"] = "[Package:'{}' Tool:htmlhint] {}".format(d.getVar("PN"), node.attrib["message"])
                node.attrib["source"] = "htmlhint.{}".format(node.attrib["source"])

            res = ""
            try:
                res = prettify(top).decode("utf-8")
            except:
                res = prettify(top)
            with open(os.path.join(d.getVar("T"), _file), "w") as f:
                f.write(res)
        except:
            pass

    raw_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "htmlhint", "raw", "{}-{}.xml".format(d.getVar("PN"), d.getVar("PV")))
    cs_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "htmlhint", "checkstyle", "{}-{}.xml".format(d.getVar("PN"), d.getVar("PV")))
    src_raw = os.path.join(d.getVar("T"), "sca_raw_htmlhint.xml")
    src_conv = os.path.join(d.getVar("T"), "sca_checkstyle_htmlhint.xml")
    if os.path.exists(src_raw):
        shutil.copy(src_raw, raw_target)
    if os.path.exists(src_conv):
        shutil.copy(src_conv, cs_target)
    if os.path.exists(cs_target):
        do_sca_export_sources(d, cs_target)
}

addtask do_sca_htmlhint_core before do_install after do_compile
addtask do_sca_deploy_htmlhint_recipe before do_package after do_sca_htmlhint_core

DEPENDS += "sca-recipe-htmlhint-rules-native"
