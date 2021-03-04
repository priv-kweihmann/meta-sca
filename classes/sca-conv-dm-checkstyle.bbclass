## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-datamodel

def sca_conv_dm_checkstyle(d, tool):
    from xml.etree.ElementTree import Element, SubElement
    from xml.etree import ElementTree
    import os
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

    return ElementTree.tostring(top, 'utf-8')
