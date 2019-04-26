## This file contains the converter from raw
## dennis-adv-format to checkstyle

inherit sca-conv-checkstyle-helper

def do_sca_conv_dennis(d):
    import os
    import re
    from xml.etree.ElementTree import Element, SubElement, Comment, tostring
    from xml.etree import ElementTree
    from xml.dom import minidom

    package_name = d.getVar("PN", True)
    buildpath = d.getVar("SCA_SOURCES_DIR", True)

    items = []
    pattern = r"^(?P<file>.*):\s+(?P<severity>W|E)(?P<id>\d+)\:\s+(?P<msg>.*)\n.*:\s+(?P<line>\d+)"

    class DennisItem():
        File = ""
        Line = ""
        Column = "1"
        Severity = ""
        Message = ""
        ID = ""

    severity_map = {
        "E" : "error",
        "W" : "warning",
    }

    __supress = get_suppress_entries(d)

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        f = open(d.getVar("SCA_RAW_RESULT_FILE"), "r")
        content = f.read()
        f.close()

        for m in re.finditer(pattern, content, re.MULTILINE):
            try:
                g = DennisItem()
                g.File = m.group("file")
                g.Line = m.group("line")
                g.Message = "[Package:%s Tool:dennis] %s" % (package_name, m.group("msg"))
                g.Severity = severity_map[m.group("severity")]
                g.ID = "dennis.dennis.%s" % m.group("id")
                if g.Severity in checkstyle_allowed_warning_level(d) and not g.ID in __supress:
                    items.append(g)
            except Exception:
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
