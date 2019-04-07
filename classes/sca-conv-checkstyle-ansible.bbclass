## This file contains the converter from raw
## bandit-format to checkstyle

inherit sca-conv-checkstyle-helper

def _split_name(_in):
    import re
    m = re.match(r"^\[(?P<severity>.*)\]\s*(?P<msg>.*)", _in)
    return (m.group("severity"), m.group("msg"))

def _get_clean_name(_in):
    import string
    res = ""
    for i in _in:
        if i in string.ascii_letters or i in string.digits:
            res += i
    return res.lower()

def _get_finding_id(d, pb_key, tk_node, item):
    res = [_get_clean_name(pb_key["name"])]
    _, msg = _split_name(tk_node["name"])
    res.append(_get_clean_name(msg))
    return ".".join(res)

def _get_finding_filename(d, pb_key, tk_node, item):
    return item["path"]

def _get_finding_message(d, pb_key, tk_node, item):
    res = []
    for k,v in item["diff"]["after"].items():
        if k == "path":
            continue
        res.append("{} should be {}".format(k,v))
    return ",".join(res)

def _get_finding_severity(d, pb_key, tk_node, item):
    sev, _ = _split_name(tk_node["name"])
    return sev

def do_sca_conv_ansible(d):
    import os
    from xml.etree.ElementTree import Element, SubElement, Comment, tostring
    from xml.etree import ElementTree
    from xml.dom import minidom
    import json

    package_name = d.getVar("PN", True)
    buildpath = d.getVar("SCA_SOURCES_DIR", True)

    class AnsibleItem():
        File = ""
        Line = "1"
        Column = "1"
        Severity = ""
        Message = ""
        ID = ""

    _supress = get_suppress_entries(d)

    items = []
    jobj = []
    with open(d.getVar("SCA_RAW_RESULT_FILE")) as f:
        try:
            jobj = json.load(f)
        except Exception as e:
            bb.note(str(e))
    for k, v in jobj.items():
        for _play in v["plays"]:
            _pb_key = _play["play"]
            for _task in _play["tasks"]:
                _tk_node = _task["task"]
                try:
                    _items =  _task["hosts"]["127.0.0.1"]
                    if "results" in _items.keys():
                        _items = _items["results"]
                    for item in _items:
                        if not isinstance(item, dict):
                            continue
                        if not "changed" in item or not item["changed"]:
                            continue
                        g = AnsibleItem()
                        g.ID = "ansible.{}".format(_get_finding_id(d, _pb_key, _tk_node, item))
                        if g.ID in _supress:
                            continue
                        g.File = _get_finding_filename(d, _pb_key, _tk_node, item)
                        g.Severity = _get_finding_severity(d, _pb_key, _tk_node, item)
                        g.Message = "[Package:{} Tool:ansible] {}".format(package_name, _get_finding_message(d, _pb_key, _tk_node, item))
                        if g.Severity in checkstyle_allowed_warning_level(d):
                            items.append(g)
                except Exception as e:
                    bb.note(str(e))
    
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