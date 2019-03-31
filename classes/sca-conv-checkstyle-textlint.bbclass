## This file contains the converter from raw
## textlint-format to checkstyle

inherit sca-conv-checkstyle-helper

def do_sca_conv_textlint(d):
    import os
    from xml.etree.ElementTree import Element, SubElement, Comment, tostring
    from xml.etree import ElementTree
    from xml.dom import minidom
    import json
    import copy

    package_name = d.getVar("PN", True)
    buildpath = d.getVar("SCA_SOURCES_DIR", True)

    class TextlintItem():
        File = ""
        Line = ""
        Column = ""
        Severity = ""
        Message = ""
        ID = ""

    severity_map = {
        "0" : "info",
        "1" : "warning",
        "2": "warning" ## Originally this is error
    }
    items = []
    jobj = []
    if os.path.isfile(d.getVar("SCA_RAW_RESULT_FILE")):
        with open(d.getVar("SCA_RAW_RESULT_FILE")) as f:
            try:
                jobj = json.load(f)
            except Exception as e:
                bb.warn(str(e))
                pass

        _supress = get_suppress_entries(d)
        _excludes = sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA"))

    try:
        for item in jobj:
            g = TextlintItem()
            g.File = item["filePath"]
            for msg in item["messages"]:
                h = copy.deepcopy(g)
                h.ID = "textlint.textlint.%s" % msg["ruleId"]
                h.Message = "[Package:%s Tool:textlint] %s" % (package_name, msg["message"])
                h.Severity = severity_map[str(msg["severity"])]
                h.Line = str(msg["line"])
                h.Column = str(msg["column"])
                if h.Severity not in checkstyle_allowed_warning_level(d):
                    continue
                if h.File in _excludes:
                    continue
                if h.ID in _supress:
                    continue
                items.append(h)
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