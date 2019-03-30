## This file contains the converter from raw
## cppcheck-format to checkstyle

inherit sca-conv-checkstyle-helper

def do_sca_conv_eslint(d):
    import os
    from xml.etree.ElementTree import Element, SubElement, Comment, tostring
    from xml.etree import ElementTree
    from xml.dom import minidom

    package_name = d.getVar("PN", True)
    buildpath = d.getVar("SCA_SOURCES_DIR", True)

    try:
        data = ElementTree.ElementTree(ElementTree.parse(d.getVar("SCA_RAW_RESULT")))
        items = []
        _excludes = sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA"))
        ## Filter out files
        for f in data.findall(".//file"):
            if ElementTree.tostring(f) in items or \
                f.attrib["name"] in _excludes:
                for h in f:
                    f.remove(h)
                continue
            items.append(ElementTree.tostring(f))
        ## Filter out items
        data = data.getroot()
        for f in data.findall(".//error"):
            if ElementTree.tostring(f) in items or \
               f.attrib["severity"] not in checkstyle_allowed_warning_level(d):
                for h in f:
                    f.remove(h)
                continue
            items.append(ElementTree.tostring(f))
        data = data.getroot()
    except Exception as e:
        ##bb.warn(str(e))
        data = Element("checkstyle")
        data.set("version", "4.3")
    
    try:
        return checkstyle_prettify(d, data).decode("utf-8")
    except:
        return checkstyle_prettify(d, data)