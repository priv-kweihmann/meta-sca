## This file contains the converter from raw
## cppcheck-format to checkstyle

inherit sca-conv-checkstyle-helper

def do_sca_conv_pysymcheck(d):
    import os
    import re
    from xml.etree.ElementTree import Element, SubElement, Comment, tostring
    from xml.etree import ElementTree
    from xml.dom import minidom

    package_name = d.getVar("PN", True)
    buildpath = d.getVar("SCA_SOURCES_DIR", True)

    items = []
    pattern = r"^(?P<file>.*):(?P<severity>.*):(?P<id>,*):\s+(?P<message>.*)"

    class SymItem():
        File = ""
        Line = "1"
        Column = "1"
        Severity = ""
        Message = ""
        ID = ""

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        f = open(d.getVar("SCA_RAW_RESULT_FILE"), "r")
        content = f.read()
        f.close()

        for m in re.finditer(pattern, content, re.MULTILINE):
            try:
                g = SymItem()
                g.File = m.group("file")
                g.Message = "[Package:%s Tool:pysymcheck] %s" % (package_name, m.group("message"))
                g.Severity = m.group("severity")
                g.ID = "pysymcheck.pysymcheck.%s" % m.group("id")
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