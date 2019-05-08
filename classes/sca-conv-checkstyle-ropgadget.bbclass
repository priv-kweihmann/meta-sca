inherit sca-conv-checkstyle-helper

def do_sca_conv_ropgadget(d):
    import os
    import re
    from xml.etree.ElementTree import Element, SubElement, Comment, tostring
    from xml.etree import ElementTree
    from xml.dom import minidom
    import json

    package_name = d.getVar("PN", True)
    buildpath = d.getVar("SCA_SOURCES_DIR", True)

    items = []
    pattern = r"^(?P<bin>.*)\s+-\s+(?P<file>.*):(?P<line>\d+)\s+-\s+(?P<msg>.*)"

    class RGItem():
        File = ""
        Line = ""
        Column = "1"
        Severity = "info"
        Message = ""
        ID = "ropgadget.ropgadget.ropprone"

    _findings = {}

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        f = open(d.getVar("SCA_RAW_RESULT_FILE"), "r")
        content = f.read()
        f.close()
        for m in re.finditer(pattern, content, re.MULTILINE):
            try:
                g = RGItem()
                g.File = m.group("file")
                g.Line = m.group("line")
                g.Message = "[Package:%s Tool:ropgadget] %s" % (package_name, m.group("msg"))
                if not m.group("bin") in _findings.keys():
                    _findings[m.group("bin")] = 0
                _findings[m.group("bin")] += 1
                if g.Severity in checkstyle_allowed_warning_level(d):
                    items.append(g)
            except:
                pass
    _threshold = 99999999999
    try:
        _threshold = int(d.getVar("SCA_ROPGADGET_WARNING_THRESHOLD"))
    except:
        pass

    for k, v in _findings.items():
        if v > _threshold:
            g = RGItem()
            g.File = k
            g.Line = "1"
            g.Severity = "warning"
            g.Message = "[Package:{} Tool:ropgadget] executable exceeded ROP exploit threshold ({}/{})".format(package_name, v, _threshold)
            g.ID = "ropgadget.ropgadget.thresholdexceeded"
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