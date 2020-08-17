## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2020, Konrad Weihmann

inherit sca-datamodel

def sca_conv_dm_diff(d, tool):
    import json
    import os
    import stat
    import shutil

    res = []

    _items = sca_get_datamodel(d, d.getVar("SCA_DATAMODEL_STORAGE"))

    try:
        _last = sca_get_datamodel(d, d.getVar("SCA_DATAMODEL_STORAGE") + ".last")
    except:
        _last = []

    result_file = os.path.join(d.getVar("T"), d.getVar("SCA_DATAMODEL_STORAGE") + ".last")
    sca_save_model_to_file(d, _items, result_file)

    _items = [x for x in _items if x not in _last]

    filenames = list(set([x.File for x in _items]))

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
    for i in _items:
        res.append("[{}] {} :{}:{} - {} - [{}]".format(i.Severity, i.GetPath(), i.Line, i.Column, i.Message, i.GetFormattedID()))
        bb.warn(res[-1])

    return "\n".join(res)
