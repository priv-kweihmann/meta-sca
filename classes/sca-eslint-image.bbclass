inherit sca-helper
inherit sca-global
inherit sca-eslint-core
inherit sca-conv-checkstyle-helper

python do_sca_deploy_eslint_image() {
    import os
    import shutil

    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "eslint", "raw"), exist_ok=True)
    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "eslint", "checkstyle"), exist_ok=True)

    import os
    from xml.etree.ElementTree import Element, SubElement, Comment, tostring
    from xml.etree import ElementTree
    from xml.dom import minidom

    for _file in ["sca_raw_eslint.xml", "sca_checkstyle_eslint.xml"]:
        if not os.path.exists(os.path.join(d.getVar("T"), _file)):
            continue
        data = ElementTree.parse(os.path.join(d.getVar("T"), _file)).getroot()
        for node in data.findall(".//error"):
            ## Patch to common format
            node.attrib["message"] = "[Package:'{}' Tool:eslint] {}".format(d.getVar("PN"), node.attrib["message"])
            node.attrib["source"] = "ShellCheck.{}".format(node.attrib["source"])

        res = ""
        try:
            res = checkstyle_prettify(d, data).decode("utf-8")
        except:
            res = checkstyle_prettify(d, data)
        with open(os.path.join(d.getVar("T"), _file), "w") as f:
            f.write(res)

    raw_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "eslint", "raw", "{}-{}.xml".format(d.getVar("PN"), d.getVar("PV")))
    cs_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "eslint", "checkstyle", "{}-{}.xml".format(d.getVar("PN"), d.getVar("PV")))
    shutil.copy(os.path.join(d.getVar("T"), "sca_raw_eslint.xml"), raw_target)
    shutil.copy(os.path.join(d.getVar("T"), "sca_checkstyle_eslint.xml"), cs_target)

    do_sca_export_sources(d, cs_target)
}

addtask do_sca_eslint_core before before do_image_complete after do_image
addtask do_sca_deploy_eslint_image before do_image_complete after do_sca_eslint_core

DEPENDS += "sca-image-eslint-rules-native"
