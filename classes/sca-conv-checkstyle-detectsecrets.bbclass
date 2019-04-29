## This file contains the converter from raw
## cppcheck-format to checkstyle

inherit sca-conv-checkstyle-helper

def do_sca_conv_detectsecrets(d):
    import os
    import re
    from xml.etree.ElementTree import Element, SubElement, Comment, tostring
    from xml.etree import ElementTree
    from xml.dom import minidom
    import json

    package_name = d.getVar("PN", True)
    buildpath = d.getVar("SCA_SOURCES_DIR", True)

    items = []
    pattern = r"^(?P<file>.*):(?P<line>\d+):(?P<column>\d+):\s+\[(?P<severity>\w+)\]\s+(?P<msg>.*)\s\((?P<id>.*)\)"

    __supress = get_suppress_entries(d)

    class DSItem():
        File = ""
        Line = ""
        Column = "1"
        Severity = "warning"
        Message = ""
        ID = ""

    _excludes = sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA"))

    if os.path.exists(d.getVar("SCA_RAW_RESULT")):
        j = {}
        with open(d.getVar("SCA_RAW_RESULT")) as i:
            j = json.load(i)
        
        if "results" in j.keys():
            for k, v in j["results"].items():
                if k in _excludes:
                    continue
                for w in v:
                    g = DSItem()
                    g.File = k
                    g.Line = str(w["line_number"])
                    g.Message = "[Package:%s Tool:detectsecrets] %s found: %s" % (package_name, w["type"], w["hashed_secret"] )
                    g.ID = "detectsecrets.detectsecrets.%s" % w["type"].replace(" ", "")
                    if g.Severity in checkstyle_allowed_warning_level(d) and not g.ID in __supress:
                        items.append(g)

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