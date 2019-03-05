## This file contains the converter from raw
## cppcheck-format to checkstyle

inherit sca-conv-checkstyle-helper

def do_sca_conv_shellcheck(d):
    import os
    from xml.etree.ElementTree import Element, SubElement, Comment, tostring
    from xml.etree import ElementTree
    from xml.dom import minidom

    package_name = d.getVar("PN", True)
    buildpath = d.getVar("SCA_SOURCES_DIR", True)

    new_data = Element("checkstyle")
    new_data.set("version", "4.3")

    try:
        data = ElementTree.ElementTree(ElementTree.parse(d.getVar("SCA_RAW_RESULT"))).getroot()
        items = []

        for f in data.findall(".//error"):
            if ElementTree.tostring(f) in items or f.attrib["severity"] not in checkstyle_allowed_warning_level(d):
                for h in f:
                    f.remove(h)
                continue
            else:
                items.append(ElementTree.tostring(f))
                new_data.append(f)
    except:
        pass
        
    try:
        return checkstyle_prettify(d, new_data).decode("utf-8")
    except:
        return checkstyle_prettify(d, new_data)