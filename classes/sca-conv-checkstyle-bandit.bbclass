## This file contains the converter from raw
## bandit-format to checkstyle

inherit sca-conv-checkstyle-helper

def do_sca_conv_bandit(d):
    import os
    from xml.etree.ElementTree import Element, SubElement, Comment, tostring
    from xml.etree import ElementTree
    from xml.dom import minidom
    import json

    package_name = d.getVar("PN", True)
    buildpath = d.getVar("SCA_SOURCES_DIR", True)

    class BanditItem():
        File = ""
        Line = ""
        Column = "1"
        Severity = ""
        Message = ""
        ID = ""

    severity_map = {
        "LOW" : "info",
        "MEDIUM" : "warning",
        "HIGH": "error"
    }
    items = []
    jobj = []
    with open(d.getVar("SCA_RAW_RESULT_FILE")) as f:
        try:
            jobj = json.load(f)
        except Exception as e:
            bb.warn(str(e))
            pass
    try:
        if "results" in jobj.keys():
            for item in jobj["results"]:
                g = BanditItem()
                filename = item["filename"]
                if filename.startswith("./"):
                    filename = os.path.join(buildpath, filename[2:])
                g.File = filename
                g.Line = item["line_number"]
                g.Message = "[Package:%s Tool:bandit] %s" % (package_name, item["issue_text"])
                g.Severity = severity_map[item["issue_severity"]]
                g.ID = "bandit.bandit.%s" % item["test_id"]
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