## This file contains the converter from raw
## proselint-format to checkstyle

inherit sca-conv-checkstyle-helper

def do_sca_conv_proselint(d):
    import os
    from xml.etree.ElementTree import Element, SubElement, Comment, tostring
    from xml.etree import ElementTree
    from xml.dom import minidom
    import json

    package_name = d.getVar("PN", True)
    buildpath = d.getVar("SCA_SOURCES_DIR", True)

    class PLItem():
        File = ""
        Line = ""
        Column = ""
        Severity = ""
        Message = ""
        ID = ""

    items = []
    _supress = get_suppress_entries(d)

    jobj = {}

    with open(d.getVar("SCA_RAW_RESULT_FILE")) as f:
        try:
            jobj = json.load(f)
        except Exception as e:
            bb.warn(str(e))
            pass

    for _file, _vals in jobj.items():
        if "data" in _vals.keys() and "errors" in _vals["data"].keys():
            for item in _vals["data"]["errors"]:
                g = PLItem()
                g.File = _file
                g.Line = str(item["line"])
                g.Column = str(item["column"])
                g.Message = "[Package:%s Tool:proselint] %s" % (package_name, item["message"])
                g.Severity = item["severity"]
                g.ID = "proselint.proselint.%s" % item["check"]
                if g.ID in _supress:
                    continue
                if g.Severity in checkstyle_allowed_warning_level(d):
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