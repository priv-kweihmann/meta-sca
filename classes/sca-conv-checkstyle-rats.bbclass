## This file contains the converter from raw
## cppcheck-format to checkstyle

inherit sca-conv-checkstyle-helper

def do_sca_conv_rats(d):
    import os
    import copy
    import re
    from xml.etree.ElementTree import Element, SubElement, Comment, tostring
    from xml.etree import ElementTree
    from xml.dom import minidom

    package_name = d.getVar("PN", True)
    buildpath = d.getVar("SCA_SOURCES_DIR", True)

    items = []

    class RatsItem():
        File = ""
        Line = ""
        Column = "1"
        Severity = ""
        Message = ""
        ID = ""

        def __repr__(self):
            return "{} {} {} {} {}".format(self.File, self.Line, self.Column, self.Message, self.ID)


    severity_map = {
        "High" : "error",
        "Medium" : "warning",
        "Low" : "info"
    }

    _supress = get_suppress_entries(d)

    try:
        data = ElementTree.parse(d.getVar("SCA_RAW_RESULT_FILE")).getroot()
        for node in data.findall(".//vulnerability"):
            g = RatsItem()
            for _i in node.iter(tag="severity"):
                g.Severity = severity_map[_i.text]
            for _i in node.iter(tag="message"):
                _text = _i.text.replace("\n", " ")
                _text = re.sub(r"\s{2,}", " ", _text).strip()
                g.Message = "[Package:%s Tool:rats] %s" % (package_name, _text)
            for _i in node.iter(tag="type"):
                g.ID = "Rats.Rats.%s" % _i.text.replace(" ", "_")
            
            if not g.Severity in checkstyle_allowed_warning_level(d):
                continue
            if g.ID in _supress:
                continue
            for _i in node.iter(tag="file"):
                _filename = ""
                for _j in _i.iter(tag="name"):
                    _filename = _j.text
                for _j in _i.iter(tag="line"):
                    h = copy.deepcopy(g)
                    h.File = _filename
                    h.Line = _j.text
                    items.append(h)
    except Exception as e:
        bb.note("Exception on parsing SCA result {}".format(e))

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