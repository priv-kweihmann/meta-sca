## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-datamodel

def checkstyle_prettify(d, elem):
    from xml.etree.ElementTree import Element, SubElement, Comment, tostring
    from xml.etree import ElementTree
    from xml.dom import minidom
    from xml.parsers.expat import ExpatError
    rough_string = ElementTree.tostring(elem, 'utf-8')
    okay = False
    while not okay:
        try:
            reparsed = minidom.parseString(rough_string)
            okay = True
        except ExpatError as e:
            # strip off invalid characters at this stage
            s = list(rough_string)
            try:
                del s[e.offset]
            except:
                top = Element("checkstyle")
                top.set("version", "4.3")
                # Okay time to give up on this one
                bb.warn("Checkstyle output is corrupted, check raw files for errors")
                return ElementTree.tostring(top, 'utf-8')
            s = [x for x in s if isinstance(x, str)]
            rough_string = "".join(s)
    return reparsed.toprettyxml(indent="  ")

def sca_conv_dm_checkstyle(d, tool):
    from xml.etree.ElementTree import Element, SubElement, Comment, tostring
    from xml.etree import ElementTree
    from xml.dom import minidom
    import json
    import os
    import stat
    import shutil

    _items = sca_get_datamodel(d, d.getVar("SCA_DATAMODEL_STORAGE"))

    filenames = list(set([x.File for x in _items]))

    top = Element("checkstyle")
    top.set("version", "4.3")

    for _file in filenames:
        _firstItem = [x for x in _items if x.File == _file ]
        if any(_firstItem):
            _firstItem = _firstItem[0]
        else:
            continue
        if d.getVar("SCA_EXPORT_FINDING_SRC") == "1":
            _fname = _firstItem.GetPath(exportPath=d.getVar("SCA_EXPORT_FINDING_DIR"))
            _srcname = _firstItem.GetPath()
            if os.path.exists(_srcname):
                os.makedirs(os.path.dirname(_fname), exist_ok=True)
                try:
                    shutil.copy(_srcname, _fname)
                except Exception as e:
                    bb.note("SCA_EXPORT_FINDING_SRC-error: {}".format(e))
        else:
            _fname = _firstItem.GetPath()
        _fe = SubElement(top, "file", { "name": _fname })
        for _fileE in [x for x in _items if x.File == _file ]:
            _fee = SubElement(_fe, "error", {
                "column": _fileE.Column or "1",
                "line": _fileE.Line or "1",
                "message": _fileE.GetFormattedMessage(),
                "severity": _fileE.Severity,
                "source": _fileE.GetFormattedID()
            })

    try:
        return checkstyle_prettify(d, top).decode("utf-8")
    except:
        return checkstyle_prettify(d, top)
