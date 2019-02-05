## This file contains the converter from raw
## cppcheck-format to checkstyle

inherit sca-conv-checkstyle-helper

def do_sca_conv_cppcheck(d):
    import os
    from xml.etree.ElementTree import Element, SubElement, Comment, tostring
    from xml.etree import ElementTree
    from xml.dom import minidom

    package_name = d.getVar("PN", True)
    buildpath = d.getVar("SCA_SOURCES_DIR", True)

    items = []

    class CppCheckItem():
        File = ""
        Line = ""
        Column = ""
        Severity = ""
        Message = ""
        ID = ""


    severity_map = {
        "error" : "error",
        "warning" : "warning",
        "style" : "info",
        "performance" : "info",
        "portability" : "info",
        "information" : "info",
        "debug": "ignore"
    }

    data = ElementTree.parse(d.getVar("SCA_RAW_RESULT")).getroot()
    for node in data.findall(".//error"):
        try:
            loc = node.find("location")
            g = CppCheckItem()
            g.Column = "1" ## there no info on that
            g.File = os.path.join(buildpath, loc.attrib.get("file"))
            g.Line = loc.attrib.get("line")
            g.Message = "[Package:%s Tool:cppcheck] %s" % (package_name, node.attrib.get("msg"))
            g.Severity = node.attrib.get("severity")
            g.ID = "CPPCheck.CPPCheck.%s" % node.attrib.get("id")
            items.append(g)     
        except:
            pass     

    filenames = list(set([x.File for x in items]))

    top = Element("checkstyle")
    top.set("version", "4.3")

    for _file in filenames:
        _fe = SubElement(top, "file", { "name": _file })
        for _fileE in [x for x in items if x.File == _file ]:
            _fee = SubElement(_fe, "error", {
                "column": _fileE.Column,
                "line": _fileE.Line,
                "message": _fileE.Message,
                "severity": severity_map[_fileE.Severity],
                "source": _fileE.ID
            })
    try:
        return checkstyle_prettify(d, top).decode("utf-8")
    except:
        return checkstyle_prettify(d, top)