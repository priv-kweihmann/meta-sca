## This file contains the converter from raw
## cppcheck-format to checkstyle

inherit sca-conv-checkstyle-helper

def do_sca_conv_kconfighard(d):
    import os
    import re
    from xml.etree.ElementTree import Element, SubElement, Comment, tostring
    from xml.etree import ElementTree
    from xml.dom import minidom

    package_name = d.getVar("PN", True)
    buildpath = d.getVar("SCA_SOURCES_DIR", True)

    items = []
    pattern = r"^\s*(?P<symbol>CONFIG_[A-Z0-9_]+)\s*\|\s*(?P<exp>.*?\s*)\|\s*(?P<source>\w+\s*)\|.*\|\|\s*(?P<result>.*)"

    class KCHItem():
        File = "1"
        Line = "1"
        Column = ""
        Severity = ""
        Message = ""
        ID = ""

    severity_map = {
        "defconfig" : "error",
        "kspp": "warning",
        "my": "warning",
        "grsecurity" : "warning",
        "lockdown" : "warning"
    }

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        f = open(d.getVar("SCA_RAW_RESULT_FILE"), "r")
        content = f.read()
        f.close()

        for m in re.finditer(pattern, content, re.MULTILINE):
            try:
                g = KCHItem()
                result_fail = m.group("result").strip().startswith("FAIL:")
                if not result_fail:
                    continue
                clean_result = m.group("result").strip().replace("FAIL:", "").replace("OK:", "").replace("\"", "").strip()
                g.File = buildpath
                g.Message = "[Package:%s Tool:Kconfighard] %s" % (package_name, "{} should be {} but is {}".format(m.group("symbol"), m.group("exp").strip(), clean_result))
                if m.group("source") in severity_map.keys():
                    g.Severity = severity_map[m.group("source")]
                else:
                    ## default to warning
                    g.Severity = "warning"
                g.ID = "Kconfighard.Kconfighard.%s" % m.group("symbol")
                if g.Severity in checkstyle_allowed_warning_level(d):
                    items.append(g)
            except Exception as e:
                bb.warn(str(e))
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