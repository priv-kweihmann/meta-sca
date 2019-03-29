## This file contains the converter from raw
## cppcheck-format to checkstyle

inherit sca-conv-checkstyle-helper

def do_sca_conv_flint(d):
    import os
    import re
    from xml.etree.ElementTree import Element, SubElement, Comment, tostring
    from xml.etree import ElementTree
    from xml.dom import minidom
    import hashlib

    package_name = d.getVar("PN", True)
    buildpath = d.getVar("SCA_SOURCES_DIR", True)

    items = []
    pattern = r"^\[(?P<severity>.*)\s+\]\s+(?P<file>.*):(?P<line>\d+):\s+(?P<msg>.*)"

    class FlintItem():
        File = ""
        Line = ""
        Column = "1"
        Severity = ""
        Message = ""
        ID = ""

    severity_map = {
        "Error" : "error",
        "Warning" : "warning",
        "Advice" : "info"
    }

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        f = open(d.getVar("SCA_RAW_RESULT_FILE"), "r")
        content = f.read()
        f.close()

        for m in re.finditer(pattern, content, re.MULTILINE):
            try:
                g = FlintItem()
                g.File = os.path.join(buildpath, m.group("file").strip("./"))
                g.Line = m.group("line")
                g.Message = "[Package:%s Tool:Flint++] %s" % (package_name, m.group("msg"))
                g.Severity = severity_map[m.group("severity").strip()]
                ## Flint++ does not have ID - so let's compute one - it will be the md5sum over the message
                g.ID = "Flint++.Flint++.%s" % hashlib.md5(str.encode(m.group("msg"))).hexdigest()
                ## Strip out suppressed things
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