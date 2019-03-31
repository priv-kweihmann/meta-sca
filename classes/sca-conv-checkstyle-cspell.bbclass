## This file contains the converter from raw
## cppcheck-format to checkstyle

inherit sca-conv-checkstyle-helper

def do_sca_conv_cspell(d):
    import os
    import re
    from xml.etree.ElementTree import Element, SubElement, Comment, tostring
    from xml.etree import ElementTree
    from xml.dom import minidom

    package_name = d.getVar("PN", True)
    buildpath = d.getVar("SCA_SOURCES_DIR", True)

    items = []
    pattern = r"^(?P<file>.*)\:(?P<line>\d+):(?P<column>\d+)\s+-\s+(?P<id>.*)\s+\((?P<msg>.*)\)"

    class GccItem():
        File = ""
        Line = ""
        Column = ""
        Severity = "info"
        Message = ""
        ID = ""

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        f = open(d.getVar("SCA_RAW_RESULT_FILE"), "r")
        content = f.read()
        f.close()

        for m in re.finditer(pattern, content, re.MULTILINE):
            try:
                g = GccItem()
                g.Column = m.group("column")
                g.File = m.group("file")
                g.Line = m.group("line")
                g.Message = "[Package:%s Tool:cspell] %s:%s" % (package_name, m.group("id"), m.group("msg"))
                g.ID = "cpsell.cspell.%s" % m.group("id").replace(" ", "_")
                if g.Severity in checkstyle_allowed_warning_level(d):
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
                "severity": _fileE.Severity,
                "source": _fileE.ID
            })
    try:
        return checkstyle_prettify(d, top).decode("utf-8")
    except:
        return checkstyle_prettify(d, top)