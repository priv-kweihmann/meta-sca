## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2021, Pascal Bach
## Copyright (c) 2021, Siemens AG

# Full format description to be found at https://docs.sonarqube.org/latest/analysis/generic-issue/

inherit sca-datamodel

def sca_conv_dm_sonarqube(d, tool):
    import json
    import os
    import stat
    import shutil

    _items = sca_get_datamodel(d, d.getVar("SCA_DATAMODEL_STORAGE"))

    _sev_map = {
        "error": "MAJOR",
        "warning": "MINOR",
        "info": "INFO"
    }

    res = {"issues": []}

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
            "engineId": tool,
            "ruleId": i.GetFormattedID(),
            "primaryLocation": {
                "message": i.Message,
                "filePath": _fname,
                "textRange" : {
                    "startLine": int(i.Line),
                    "startColumn": int(i.Column)
                },
            }
        }
        if i.Scope in ["security"]:
            _sub["type"] = "VULNERABILITY"
        elif i.Scope in ["functional"]:
            _sub["type"] = "BUG"
        else:
            # Map everything else to CODE_SMELL
            _sub["type"] = "CODE_SMELL"

        _sub["severity"] = _sev_map[i.Severity]

        res["issues"].append(_sub)

    return json.dumps(res)
