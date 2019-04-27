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

    new_data = Element("checkstyle")
    new_data.set("version", "4.3")

    try:
        data = ElementTree.ElementTree(ElementTree.parse(d.getVar("SCA_RAW_RESULT")))
        _excludes = sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA"))
        _severities = checkstyle_allowed_warning_level(d)

        for _file in data.findall(".//file"):
            if _file.attrib["name"] in _excludes:
                continue
            inserted = False
            new_file = Element("file")
            new_file.set("name", _file.attrib["name"])
            for f in _file.findall(".//error"):
                if f.attrib["severity"] not in _severities:
                    continue
                if f.attrib["source"] in _supress:
                    continue
                if not inserted:
                    new_data.append(new_file)
                    inserted = True
                new_file.append(f)
    except Exception as e:
        bb.note(str(e))
    
    try:
        return checkstyle_prettify(d, new_data).decode("utf-8")
    except:
        return checkstyle_prettify(d, new_data)