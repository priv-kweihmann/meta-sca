## This file contains the converter from raw
## cppcheck-format to checkstyle

inherit sca-conv-checkstyle-helper

def do_sca_conv_cpplint(d):
    import os
    import re
    from xml.etree.ElementTree import Element, SubElement, Comment, tostring
    from xml.etree import ElementTree
    from xml.dom import minidom

    package_name = d.getVar("PN", True)
    buildpath = d.getVar("SCA_SOURCES_DIR", True)

    items = []

    class CppLintItem():
        File = ""
        Line = ""
        Column = ""
        Severity = ""
        Message = ""
        ID = ""


    items = []
    pattern = r"^(?P<line>\d+):\s+(?P<message>.*)\s+\[(?P<id>.*)\]\s+\[(?P<severity>\d)\]"
    ## cpplint is pedantic - so we don't accounce anything a error
    severity_map = {
        "5" : "warning",
        "4" : "info",
        "3" : "info",
        "2" : "info",
        "1" : "ignore"
    }

    data = ElementTree.ElementTree(ElementTree.parse(d.getVar("SCA_RAW_RESULT_FILE"))).getroot()
    for node in data.findall(".//testcase"):
        fail = node.find("failure")
        if not fail is None:
            for m in re.finditer(pattern, fail.text, re.MULTILINE):
                try:
                    g = CppLintItem()
                    g.Column = "1" ## there no info on that#
                    g.File = node.attrib.get("name")
                    g.Line = m.group("line")
                    g.Message = "[Package:%s Tool:cpplint] %s" % (package_name, m.group("message"))
                    g.Severity = m.group("severity")
                    g.ID = "CPPLint.CPPLint.%s" % m.group("id")
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