## This file contains the converter from raw
## gixy-format to checkstyle

inherit sca-conv-checkstyle-helper

def do_sca_conv_gixy(d, cmd_output=""):
    import os
    import json
    import re
    from xml.etree.ElementTree import Element, SubElement, Comment, tostring
    from xml.etree import ElementTree
    from xml.dom import minidom

    package_name = d.getVar("PN", True)
    buildpath = d.getVar("SCA_SOURCES_DIR", True)

    items = []

    class GixyItem():
        File = ""
        Line = ""
        Column = ""
        Severity = ""
        Message = ""
        ID = ""

    severity_map = {
        "HIGH" : "error",
        "MEDIUM" : "warning",
        "LOW" : "info",
        "ERROR" : "error",
    }

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        io = {}
        with open(d.getVar("SCA_RAW_RESULT_FILE")) as i:
            try:
                io = json.load(i)
            except:
                pass
        for item in io:
            try:
                g = GixyItem()
                g.Column = "1"
                g.File = item["path"]
                g.Line = "1"
                g.Message = "[Package:{} Tool:gixy] {} {}".format(package_name, item["summary"], item["reason"])
                g.Severity = severity_map[str(item["severity"])]
                g.ID = "gixy.gixy.%s" % item["plugin"].replace(" ", "_")
                if g.ID in get_suppress_entries(d):
                    continue
                if g.Severity in checkstyle_allowed_warning_level(d):
                    items.append(g)
            except Exception as e:
                bb.warn(str(e))

    pattern = r'^.*\[nginx_parser\]\s+(?P<severity>[A-Z]+)\s+Failed to parse config\s.(?P<file>.*)":\s+(?P<msg>.*)\s+\(line:(?P<line>\d+),\s+col:(?P<col>\d+)'
    for m in re.finditer(pattern, cmd_output.replace("\t", " "), re.MULTILINE):
        try:
            g = GixyItem()
            g.Column = m.group("col")
            g.File = m.group("file")
            g.Line = m.group("line")
            g.Message = "[Package:%s Tool:gixy] %s" % (package_name, m.group("msg"))
            g.Severity = severity_map[m.group("severity")]
            g.ID = "gixy.gixy.ParserFailure"
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