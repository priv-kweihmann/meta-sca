inherit sca-helper
inherit sca-conv-checkstyle-helper
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

def insert_finding(d, tool, _file, xmlmatch, tools, findings):
    _severity = xmlmatch.attrib["severity"]
    _msg = xmlmatch.attrib["message"]
    _line = xmlmatch.attrib["line"]
    _col = xmlmatch.attrib["column"]
    _id = xmlmatch.attrib["source"]

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
    from xml.etree.ElementTree import Element, SubElement, Comment, tostring
    from xml.etree import ElementTree
    from xml.dom import minidom
    import json
    import os

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
        fp = os.path.join(d.getVar("SCA_EXPORT_DIR"), mod, "checkstyle", "{}-{}.xml".format(d.getVar("PN"), d.getVar("PV")))
        if os.path.exists(fp):
            data = ElementTree.ElementTree(ElementTree.parse(fp).getroot())
            for f in data.findall(".//file"):
                _file = f.attrib["name"]
                for x in f.findall(".//error"):
                    _findings = insert_finding(d, mod, _file, x, _tools, _findings)

    with open(os.path.join(d.getVar("T"), "bestof.json"), "w") as o:
        json.dump(_findings, o)
    
    top = Element("checkstyle")
    top.set("version", "4.3")

    ## match up
    _languages = []
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
                _fe = SubElement(top, "file", { "name": item["file"] })
                ## calc new severity
                _nseverity = ""
                if any([x for x in item["occ"] if x["severity"] == "error"]):
                    _nseverity = "error"
                elif any([x for x in item["occ"] if x["severity"] == "warning"]):
                    _nseverity = "warning"
                else:
                    _nseverity = "info"

                ## New message
                _nMsg = sorted(item["occ"], key=lambda x: x["tool"], reverse=False)[0]["msg"]
                _nMsg = _nMsg[_nMsg.find("]") + 1:].strip()
                _nMsg = "[Package:{} Tools:{}] {}".format(d.getVar("PN"), ",".join(list(set([x["tool"] for x in item["occ"]]))), _nMsg) 
                
                _fee = SubElement(_fe, "error", {
                    "column": item["col"],
                    "line": item["line"],
                    "message": _nMsg,
                    "severity": _nseverity,
                    "source": sorted(item["occ"], key=lambda x: x["tool"], reverse=False)[0]["id"]
                })
    xml_output = ""
    try:
        xml_output = checkstyle_prettify(d, top).decode("utf-8")
    except:
        xml_output = checkstyle_prettify(d, top)
    
    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "bestof", "checkstyle"), exist_ok=True)
    cs_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "bestof", "checkstyle", "{}-{}.xml".format(d.getVar("PN"), d.getVar("PV")))

    with open(cs_target, "w") as o:
        o.write(xml_output)

    d.setVar("SCA_RESULT_FILE", cs_target)

    if xml_output:
        _warnings = get_warnings_from_result(d)
        _errors = get_errors_from_result(d)

        warn_log = []
        if any(_warnings):
            warn_log.append("{} warning(s)".format(len(_warnings)))
        if any(_errors):
            warn_log.append("{} error(s)".format(len(_errors)))
        if warn_log and should_emit_to_console(d):
            bb.warn("SCA BestOf reported {}".format(",".join(warn_log)))
}
