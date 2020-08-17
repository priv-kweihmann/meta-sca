## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2020, Konrad Weihmann

inherit sca-datamodel

def sca_conv_dm_sarif(d, tool):
    import json
    import os
    import stat
    import shutil
    import pathlib

    fp = os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "{}.sca.description".format(tool))
    if os.path.exists(fp):
        with open(fp) as i:
            _tool = json.load(i)
    else:
        _tool= {
                "description": "unknown tool",
                "homepage": "https://github.com/priv-kweihmann/meta-sca",
                "version": "unknown",
                "languages": [],
                "scope": []
               }
    _tool["name"] = tool

    _sev_map = {
        "error": "error",
        "warning": "warning",
        "info": "note"
    }

    _items = sca_get_datamodel(d, d.getVar("SCA_DATAMODEL_STORAGE"))

    res = {
        "$schema": "https://raw.githubusercontent.com/oasis-tcs/sarif-spec/master/Schemata/sarif-schema-2.1.0.json",
        "version": "2.1.0",
        "runs": [
            {
                "tool": {
                    "driver": {
                        "name": _tool["name"],
                        "version": _tool["version"],
                        "fullDescription": {
                            "text": _tool["description"]
                        },
                        "informationUri": _tool["homepage"],
                        "properties": { "tags": _tool["languages"] + _tool["scope"] }
                    }
                },
                "results": []
            }
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

        # Add tool info
        res["runs"][0]["results"].append({
            "ruleId": i.GetFormattedID(),
            "message": {
                "text": i.Message if i.Message.endswith(".") else i.Message + "."
            },
            "properties": { "tags": [ i.Scope, i.PackageName ] },
            "level": _sev_map[i.Severity],
            "locations": [
                {
                    "physicalLocation": {
                        "artifactLocation": {
                            "uri": pathlib.Path(_fname).as_uri()
                        },
                        "region": {
                            "startLine": int(i.Line),
                            "startColumn": int(i.Column)
                        }
                    }
                }
            ]
        })
    return json.dumps(res)
