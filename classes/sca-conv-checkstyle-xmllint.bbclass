## This file contains the converter from raw
## cppcheck-format to checkstyle

inherit sca-conv-checkstyle-helper

def do_sca_conv_xmllint(d):
    import os
    import re
    from xml.etree.ElementTree import Element, SubElement, Comment, tostring
    from xml.etree import ElementTree
    from xml.dom import minidom

    package_name = d.getVar("PN", True)
    buildpath = d.getVar("SCA_SOURCES_DIR", True)

    items = []
    pattern = r"^(?P<file>.*):(?P<line>\d+):\s+(?P<id>.*)\s+:\s+(?P<msg>.*)"

    class XmlLintItem():
        File = ""
        Line = ""
        Column = "1"
        Severity = "error"
        Message = ""
        ID = ""

    if os.path.exists(d.getVar("SCA_RAW_RESULT")):
        f = open(d.getVar("SCA_RAW_RESULT"), "r")
        content = f.read()
        f.close()

        for m in re.finditer(pattern, content, re.MULTILINE):
            try:
                g = XmlLintItem()
                filename = m.group("file")
                if not os.path.isabs(filename):
                    filename = os.path.join(buildpath, filename)
                g.File = filename
                g.Line = m.group("line")
                g.Message = "[Package:%s Tool:xmllint] %s" % (package_name, m.group("msg"))
                g.ID = "xmllint.xmllint.%s" % m.group("id").replace(" ", "")
                if g.Severity in checkstyle_allowed_warning_level(d) and not g.ID in get_suppress_entries(d):
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