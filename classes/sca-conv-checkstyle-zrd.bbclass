## This file contains the converter from raw
## cppcheck-format to checkstyle

inherit sca-conv-checkstyle-helper

def do_sca_conv_zrd(d):
    import os
    import csv
    from xml.etree.ElementTree import Element, SubElement, Comment, tostring
    from xml.etree import ElementTree
    from xml.dom import minidom

    package_name = d.getVar("PN", True)
    buildpath = d.getVar("SCA_SOURCES_DIR", True)

    items = []

    class ZRDItem():
        File = ""
        Line = ""
        Column = "1"
        Severity = ""
        Message = ""
        ID = ""

    severity_map = {
        "warning" : "warning",
        "error" : "error"
    }

    code_map = {
        "2000" : "duplicate key",
        "2001" : "missing key",
        "2002" : "redundant key",
        "2003" : "untranslated value",
        "2004" : "unused key",
        "2005" : "undefined key",
        "2006" : "missing file",
        "2007" : "redundant file",
        "2008" : "unmatched placeholder",
        "2009" : "format error",
        "2010" : "encoding error"
    }

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        with open(d.getVar("SCA_RAW_RESULT_FILE")) as i:
            reader = csv.DictReader(i)
            for row in reader:
                try:
                    g = ZRDItem()
                    g.File = row["file"]
                    g.Line = row["line"]
                    g.Severity = severity_map[row["severity"]]
                    g.Message = "[Package:%s Tool:zrd] %s:%s" % (package_name, str(row["code"]), code_map[str(row["code"])])
                    g.ID = "zrd.zrd.%s" % row["code"]
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