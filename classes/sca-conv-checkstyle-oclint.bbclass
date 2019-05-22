## This file contains the converter from raw
## oclint-format to checkstyle

inherit sca-conv-checkstyle-helper

def do_sca_conv_oclint(d):
    import os
    import json
    from xml.etree.ElementTree import Element, SubElement, Comment, tostring
    from xml.etree import ElementTree
    from xml.dom import minidom

    package_name = d.getVar("PN", True)
    buildpath = d.getVar("SCA_SOURCES_DIR", True)

    items = []

    class OCLintItem():
        File = ""
        Line = ""
        Column = ""
        Severity = ""
        Message = ""
        ID = ""

    severity_map = {
        "1" : "error",
        "2" : "warning",
        "3" : "info"
    }

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        io = {}
        with open(d.getVar("SCA_RAW_RESULT_FILE")) as i:
            try:
                io = json.load(i)
            except:
                pass
        
        if "violation" in io.keys():
            for item in io["violation"]:
                try:
                    g = OCLintItem()
                    g.Column = str(item["startColumn"])
                    g.File = item["path"]
                    g.Line = str(item["startLine"])
                    ## Some element don't have a message so we use the rule as fallback
                    msg = item["message"].strip() or item["rule"]
                    g.Message = "[Package:%s Tool:oclint] %s" % (package_name, msg)
                    g.Severity = severity_map[str(item["priority"])]
                    g.ID = "OCLint.OCLint.%s" % item["rule"].replace(" ", "_")
                    if g.ID in get_suppress_entries(d):
                        continue
                    if g.Severity in checkstyle_allowed_warning_level(d):
                        items.append(g)
                except Exception as e:
                    bb.warn(str(e))

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