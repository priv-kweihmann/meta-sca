## This file contains the converter from raw
## pyfindinjection-format to checkstyle

inherit sca-conv-checkstyle-helper

def do_sca_conv_pyfindinjection(d):
    import os
    import sys
    import re
    from xml.etree.ElementTree import Element, SubElement, Comment, tostring
    from xml.etree import ElementTree
    from xml.dom import minidom

    package_name = d.getVar("PN", True)
    buildpath = d.getVar("SCA_SOURCES_DIR", True)

    items = []
    pattern = r"^(?P<file>.*):(?P<line>\d*)\t+(?P<msg>.*)"

    class PINJItem():
        File = ""
        Line = ""
        Column = "1"
        Severity = ""
        Message = ""
        ID = ""

    severity_map = {
        "string interpolation of SQL query" : {"error", "string.interpolation"},
        "string concatenation of SQL query" : ("error", "string.concat"),
        "str.format called on SQL query" : ("error", "string.format"),
        "eval() is just generally evil" : ("error", "evil.eval"),
    }

    _supress = get_suppress_entries(d)

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        with open(d.getVar("SCA_RAW_RESULT_FILE")) as i:
            content = i.read()
    else:
        content = ""

    for m in re.finditer(pattern, content, re.MULTILINE):
        try:
            g = PINJItem()
            g.File = m.group("file")
            g.Line = m.group("line")
            _sev, _id = severity_map[m.group("msg")]
            g.Message = "[Package:%s Tool:pyfindinjection] %s" % (package_name, m.group("msg"))
            g.Severity = _sev
            g.ID = "pyfindinjection.pyfindinjection.%s" % _id
            if _id in _supress:
                continue
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