## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global

## BestOf mode - threshold or ratio
SCA_BESTOF_MODE = "threshold"
## A minimum of this value on tools have to report an finding
SCA_BESTOF_THRESHOLD_MIN = "2"
## A minimum ratio of tools have to report a finding
SCA_BESTOF_RATIO = "0.5"

def calc_hit_count(d, tools, hits):
    mode = d.getVar("SCA_BESTOF_MODE")
    if mode == "threshold":
        t = min(int(d.getVar("SCA_BESTOF_THRESHOLD_MIN")), len(tools))
        return len(hits) >= t
    elif mode == "ratio":
        return float(d.getVar("SCA_BESTOF_RATIO")) < float(len(hits) / len(tools))
    return False

def insert_finding(d, tool, obj, tools, findings):
    _severity = obj.Severity
    _msg = obj.Message
    _line = obj.Line
    _col = obj.Column
    _id = obj.GetPlainID()
    _file = obj.GetPath()

    if not tool in tools.keys():
        return findings
    for _t in tools[tool]["languages"]:
        if not _t in findings.keys():
            findings[_t] = []
        found = False
        for _f in findings[_t]:
            if _f["file"] == _file and _f["line"] == _line:
               _f["occ"].append({"tool": tool, "msg": _msg, "id": _id, "severity": _severity })
               found = True
        if not found:
            findings[_t].append(
                {
                    "file": _file,
                    "line": _line,
                    "col": _col,
                    "occ": [
                        { "tool": tool, "msg": _msg, "id": _id, "severity": _severity }
                    ]
                }
            )
    return findings


python do_sca_bestof_core() {
    import json
    import os

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    _findings = {}
    _tools = {}
    ## Read tool data
    for mod in intersect_lists(d, d.getVar("SCA_ENABLED_MODULES"), d.getVar("SCA_AVAILABLE_MODULES")):
        fp = os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "{}.sca.description".format(mod))
        if not os.path.exists(fp):
            continue
        with open(fp) as i:
            _tools[mod] = json.load(i)

    ## aquire data
    for mod in intersect_lists(d, d.getVar("SCA_ENABLED_MODULES"), d.getVar("SCA_AVAILABLE_MODULES")):
        fp = os.path.join(d.getVar("T"), "{}.dm".format(mod))
        if os.path.exists(fp):
            _data = sca_get_datamodel(d, fp)
            for f in _data:
                _findings = insert_finding(d, mod, f, _tools, _findings)


    with open(os.path.join(d.getVar("T"), "bestof.json"), "w") as o:
        json.dump(_findings, o)

    ## match up
    items = []
    _languages = []
    _findingsres = []
    for _t in _tools.keys():
        _languages += _tools[_t]["languages"]
    for lang in list(set(_languages)):
        _overall_tools = list(set([k for k,v in _tools.items() if lang in _tools[k]["languages"]]))
        ## calc threshold
        if not lang in _findings.keys():
            continue
        for item in _findings[lang]:
            _tools_in_occ = list(set([x["tool"] for x in item["occ"]]))
            if calc_hit_count(d, _overall_tools, _tools_in_occ):
                _nseverity = ""
                if any([x for x in item["occ"] if x["severity"] == "error"]):
                    _nseverity = "error"
                elif any([x for x in item["occ"] if x["severity"] == "warning"]):
                    _nseverity = "warning"
                else:
                    _nseverity = "info"

                _nMsg = sorted(item["occ"], key=lambda x: x["tool"], reverse=False)[0]["msg"]
                _nMsg = _nMsg[_nMsg.find("]") + 1:].strip()
                _nMsg = "[Package:{} Tools:{}] {}".format(d.getVar("PN"), ",".join(list(set([x["tool"] for x in item["occ"]]))), _nMsg)

                g = sca_get_model_class(d,
                                        PackageName=package_name,
                                        Tool="bestof",
                                        BuildPath=buildpath,
                                        Column=item["col"],
                                        File=item["file"],
                                        Line=item["line"],
                                        Message=_nMsg,
                                        ID=sorted(item["occ"], key=lambda x: x["tool"], reverse=False)[0]["id"],
                                        Severity=_nseverity)
                if g.Severity in sca_allowed_warning_level(d):
                    _findingsres.append(g)

    d.setVar("SCA_DATAMODEL_STORAGE", "{}/bestof.dm".format(d.getVar("T")))
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(sca_save_model_to_string(d))
    sca_add_model_class_list(d, _findingsres)
    sca_task_aftermath(d, "bestof")
}
