## This file contains the converter from raw
## cppcheck-format to checkstyle

inherit sca-conv-checkstyle-helper

def do_sca_conv_tscancode(d):
    import os
    import copy
    import re
    from xml.etree.ElementTree import Element, SubElement, Comment, tostring
    from xml.etree import ElementTree
    from xml.dom import minidom

    package_name = d.getVar("PN", True)
    buildpath = d.getVar("SCA_SOURCES_DIR", True)

    items = []

    class TSCItem():
        File = ""
        Line = ""
        Column = "1"
        Severity = ""
        Message = ""
        ID = ""

        def __repr__(self):
            return "{} {} {} {} {}".format(self.File, self.Line, self.Column, self.Message, self.ID)


    severity_map = {
        "Serious" : "error",
        "Critical" : "error",
        "Error" : "warning",
        "Warning" : "info"
    }

    _supress = get_suppress_entries(d)

    try:
        data = ElementTree.parse(d.getVar("SCA_RAW_RESULT_FILE")).getroot()
        for node in data.findall(".//error"):
            try:
                g = TSCItem()
                g.Message = "[Package:%s Tool:tscancode] %s" % (package_name, node.attrib["msg"])
                g.ID = "tscancode.%s.%s" % (node.attrib["id"], node.attrib["subid"])
                g.Line = node.attrib["line"]
                g.File = node.attrib["file"]
                
                if g.ID in _supress:
                    continue
                g.Severity = severity_map[node.attrib["severity"]]
                if not g.Severity in checkstyle_allowed_warning_level(d):
                    continue
                
                items.append(g)
            except Exception as e:
                bb.note("Exception on parsing SCA result {}".format(e))
    except Exception as e:
        bb.note("Exception on parsing SCA result {}".format(e))

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
                "severity": _fileE.Severity,
                "source": _fileE.ID
            })
    try:
        return checkstyle_prettify(d, top).decode("utf-8")
    except:
        return checkstyle_prettify(d, top)