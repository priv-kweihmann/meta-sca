## This file contains the converter from raw
## cppcheck-format to checkstyle

inherit sca-conv-checkstyle-helper

def do_sca_conv_pylint(d):
    import os
    import sys
    import re
    import shutil
    from xml.etree.ElementTree import Element, SubElement, Comment, tostring
    from xml.etree import ElementTree
    from xml.dom import minidom

    package_name = d.getVar("PN", True)
    buildpath = d.getVar("SCA_SOURCES_DIR", True)

    items = []
    pattern = r"^(?P<file>.*):(?P<line>\d+):\s+\[(?P<raw_severity>\w+)\((?P<raw_severity_id>.*)\).*\]\s+(?P<message>.*)"

    class PylintItem():
        File = ""
        Line = ""
        Column = ""
        Severity = ""
        Message = ""
        ID = ""

    severity_map = {
        "F" : "error",
        "E" : "error",
        "W" : "warning",
        "R" : "info",
        "C" : "info"
    }

    with open(d.getVar("SCA_RAW_RESULT_FILE")) as i:
        content = i.read()

    for m in re.finditer(pattern, content, re.MULTILINE):
        g = PylintItem()
        g.Column = "1"
        ## copy file to sourcetarget
        __file = m.group("file")
        if __file.startswith("/"):
            __file = __file[1:]
        __fileTarget = os.path.join(sourcetarget, __file)
        __fileOriginal = os.path.join(buildpath, __file)
        os.makedirs(os.path.dirname(__fileTarget), exist_ok=True)
        shutil.copy(__fileOriginal, __fileTarget)
        ## 
        g.File = __fileTarget
        g.Line = m.group("line")
        g.Message = "[Package:%s Tool:pylint] %s - ID %s" % (package_name, m.group("message"), m.group("raw_severity"))
        g.Severity = severity_map[m.group("raw_severity")[0]]
        g.ID = "pylint.pylint.%s" % m.group("raw_severity_id")
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