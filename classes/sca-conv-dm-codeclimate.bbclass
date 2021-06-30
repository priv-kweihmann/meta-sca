## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2021, Konrad Weihmann

# Full format description to be found at 
# https://docs.gitlab.com/ee/user/project/merge_requests/code_quality.html#implementing-a-custom-tool

inherit sca-datamodel

# Map combination of scope_severity to severity of export
SCA_EXPORT_CODECLIMATE_SEVERITY_MAP[security_error] ?= "blocker"
SCA_EXPORT_CODECLIMATE_SEVERITY_MAP[functional_error] ?= "blocker"
SCA_EXPORT_CODECLIMATE_SEVERITY_MAP[compliance_error] ?= "blocker"
SCA_EXPORT_CODECLIMATE_SEVERITY_MAP[style_error] ?= "minor"
SCA_EXPORT_CODECLIMATE_SEVERITY_MAP[security_warning] ?= "critical"
SCA_EXPORT_CODECLIMATE_SEVERITY_MAP[functional_warning] ?= "major"
SCA_EXPORT_CODECLIMATE_SEVERITY_MAP[compliance_warning] ?= "major"
SCA_EXPORT_CODECLIMATE_SEVERITY_MAP[style_warning] ?= "minor"
SCA_EXPORT_CODECLIMATE_SEVERITY_MAP[security_info] ?= "info"
SCA_EXPORT_CODECLIMATE_SEVERITY_MAP[functional_info] ?= "info"
SCA_EXPORT_CODECLIMATE_SEVERITY_MAP[compliance_info] ?= "info"
SCA_EXPORT_CODECLIMATE_SEVERITY_MAP[style_info] ?= "info"


def sca_conv_dm_codeclimate(d, tool):
    import json
    import os
    import shutil

    _items = sca_get_datamodel(d, d.getVar("SCA_DATAMODEL_STORAGE"))

    res = []

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
            "description": i.GetFormattedMessage(),
            "fingerprint": i.GetItemHash(),
            "severity": d.getVarFlag("SCA_EXPORT_CODECLIMATE_SEVERITY_MAP", "{}_{}".format(i.Scope, i.Severity)),
            "location": {
                "path": i.File,
                "lines": {
                    "begin": int(i.Line)
                }
            }
        }
        res.append(_sub)

    return json.dumps(res)
