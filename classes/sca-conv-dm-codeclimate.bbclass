## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2020, Konrad Weihmann

inherit sca-datamodel

def sca_conv_dm_codeclimate(d, tool):
    import json
    import os
    import stat
    import shutil

    _items = sca_get_datamodel(d, d.getVar("SCA_DATAMODEL_STORAGE"))

    res = {
        "statVersion": "1.0.0",
        "process": {
            "name": next((i.Tool for i in _items), "Unknown tool"),
            "version": "latest",
            "description": "Found by meta-sca",
            "maintainer": "meta-sca maintainer",
            "email": "dontreply@thisisntavalidserver.com",
            "homepage": "https://github.com/priv-kweihmann/meta-sca",
            "repeatability": "Volatile"
        },
        "findings": [

        ]
    }

    for i in _items:
        _srcname = i.GetPath()
        if d.getVar("SCA_EXPORT_FINDING_SRC") == "1":
            _fname = i.GetPath(exportPath=d.getVar("SCA_EXPORT_FINDING_DIR"))
            if os.path.exists(_srcname) and not os.path.exists(_fname):
                os.makedirs(os.path.dirname(_fname), exist_ok=True)
                try:
                    shutil.copy(_srcname, _fname)
                except Exception as e:
                    bb.note("SCA_EXPORT_FINDING_SRC-error: {}".format(e))
        else:
            _fname = _srcname
        _sub = {
            "rule": i.GetFormattedID(),
            "description": i.Message,
            "location": {
                "path": _fname,
                "beginLine": int(i.Line),
                "beginColumn": int(i.Column)
            }
        }
        _sub["failure"] = True if i.Severity in ["error"] else False
        if i.Scope in ["security"]:
            _sub["categories"] = "Security"
        elif i.Scope in ["functional"]:
            _sub["categories"] = "Bug Risk"
        elif i.Scope in ["compliance"]:
            _sub["categories"] = "Compatibility"
        elif i.Scope in ["style"]:
            _sub["categories"] = "Style"
        else:
            # Don't really know what to use here, so lets use Clarity
            _sub["categories"] = "Clarity"
        res["findings"].append(_sub)

        # Possible TODO export

    return json.dumps(res)
