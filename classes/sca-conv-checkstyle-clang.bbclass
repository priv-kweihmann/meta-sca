## This file contains the converter from raw
## clang-format to checkstyle

inherit sca-conv-checkstyle-helper



def do_sca_conv_clang(d):
    import os
    import re
    from xml.etree.ElementTree import Element, SubElement, Comment, tostring
    from xml.etree import ElementTree
    from xml.dom import minidom

    package_name = d.getVar("PN", True)
    buildpath = d.getVar("SCA_SOURCES_DIR", True)

    items = []
    pattern = r"^(?P<file>.*):(?P<line>\d+):(?P<column>\d+):\s+(?P<severity>warning|error):\s+(?P<msg>.*)\[(?P<id>.*)\]"

    class ClangItem():
        File = ""
        Line = ""
        Column = ""
        Severity = ""
        Message = ""
        ID = ""

    severity_map = {
        "error" : "error",
        "warning" : "warning",
    }

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        f = open(d.getVar("SCA_RAW_RESULT_FILE"), "r")
        content = f.read()
        f.close()

        for m in re.finditer(pattern, content, re.MULTILINE):
            try:
                g = ClangItem()
                g.Column = m.group("column")
                g.File = m.group("file")
                g.Line = m.group("line")
                g.Message = "[Package:%s Tool:clang] %s" % (package_name, m.group("msg"))
                g.Severity = m.group("severity")
                g.ID = "Clang.Clang.%s" % m.group("id")
                if g.ID in get_suppress_entries(d):
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
                "severity": severity_map[_fileE.Severity],
                "source": _fileE.ID
            })
    try:
        return checkstyle_prettify(d, top).decode("utf-8")
    except:
        return checkstyle_prettify(d, top)