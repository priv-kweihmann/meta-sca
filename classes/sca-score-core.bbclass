inherit sca-helper
inherit sca-conv-checkstyle-helper
inherit sca-global

SCA_SCORE_EXTRA_FUNCTIONAL ?= ""
SCA_SCORE_EXTRA_SECURITY ?= ""
SCA_SCORE_EXTRA_STYLE ?= ""

SCA_SCORE_SECURITY_PEN ?= "100"
SCA_SCORE_FUNCTIONAL_PEN ?= "5"
SCA_SCORE_STYLE_PEN ?= "1"

SCA_SCORE_ERROR_PEN ?= "7"
SCA_SCORE_WARNING_PEN ?= "5"
SCA_SCORE_INFO_PEN ?= "1"

SCA_SCORE_SECURITY_WARN ?= "70"
SCA_SCORE_FUNCTIONAL_WARN ?= "60"
SCA_SCORE_STYLE_WARN ?= "30"

SCA_SCORE_SECURITY_ERROR ?= "50"
SCA_SCORE_FUNCTIONAL_ERROR ?= "35"
SCA_SCORE_STYLE_ERROR ?= "15"

def score_get_classifier_from_tool(d, tool):
    import os
    import json
    import re
    _path = os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "{}.sca.score".format(tool))
    _pathdes = os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "{}.sca.description".format(tool))
    if os.path.exists(_path) and os.path.exists(_pathdes):
        with open(_path) as i, open(_pathdes) as des:
            score = json.load(i)
            desc = json.load(des)
            res = {}
            for k, v in score.items():
                res[k] = v
                res["lang_{}".format(k)] = desc["languages"]
            return res
    return {}

def score_get_classifier(d, tools):
    _db = {
        "functional": clean_split(d, "SCA_SCORE_EXTRA_FUNCTIONAL"),
        "security": clean_split(d, "SCA_SCORE_EXTRA_SECURITY"),
        "style": clean_split(d, "SCA_SCORE_EXTRA_STYLE"),
        "lang_functional" : [],
        "lang_security": [],
        "lang_style": []
    }
    for t in tools:
        for k, v in score_get_classifier_from_tool(d, t).items():
            _db[k] = list(set(_db[k] + v))
    return _db

def score_sum_up_lang(d, xml):
    from xml.etree.ElementTree import Element, SubElement, Comment, tostring
    from xml.etree import ElementTree
    from xml.dom import minidom

    res = 0
    for elem in xml.findall(".//file"):
        lang = elem.attrib["language"]
        code = int(elem.attrib["code"])
        doc = int(elem.attrib["comment"])
        res += code
    return res

def score_get_classifier_match(d, tooldb, finding, default="functional"):
    from xml.etree.ElementTree import Element, SubElement, Comment, tostring
    from xml.etree import ElementTree
    from xml.dom import minidom
    import re
    ## First security, functional 2nd, aso
    for k in ["security", "functional", "style"]:
        for x in tooldb[k]:
            if re.match(x, finding.attrib["source"]):
                return k
    return default

def score_get_score(d, item, lines):
    if item.endswith("%"):
        item = item.replace("%", "")
        return lines / float(item)
    return float(item)

def score_calc_score(d, tooldb, lines):
    from xml.etree.ElementTree import Element, SubElement, Comment, tostring
    from xml.etree import ElementTree
    from xml.dom import minidom

    _db = {
        "functional": 0.0,
        "security": 0.0,
        "style": 0.0
    }

    for mod in intersect_lists(d, d.getVar("SCA_ENABLED_MODULES"), d.getVar("SCA_AVAILABLE_MODULES")):
        fp = os.path.join(d.getVar("SCA_EXPORT_DIR"), mod, "checkstyle", "{}-{}.xml".format(d.getVar("PN"), d.getVar("PV")))
        if os.path.exists(fp):
            data = ElementTree.ElementTree(ElementTree.parse(fp).getroot())
            for f in data.findall(".//file"):
                _file = f.attrib["name"]
                for x in f.findall(".//error"):
                    cl = score_get_classifier_match(d, tooldb, x)
                    ety = x.attrib["severity"]
                    score = score_get_score(d, d.getVar("SCA_SCORE_{}_PEN".format(cl.upper())), lines) * \
                            score_get_score(d, d.getVar("SCA_SCORE_{}_PEN".format(ety.upper())), lines)
                    _db[cl] += score
    ## Calc the final score -> (100.0 - (score / total lines))
    for k, v in _db.items():
        if v == 0:
            v = 1.0
        _db[k] = 100.0 - (v * 100.0 / float(lines))
    return _db

DEPENDS += "python3-pygount-native"


python do_sca_score_core() {
    from xml.etree.ElementTree import Element, SubElement, Comment, tostring
    from xml.etree import ElementTree
    from xml.dom import minidom
    import subprocess
    import os

    if d.getVar("SCA_ENABLE_SCORE") != "1":
        return

    _scoretools = score_get_classifier(d, intersect_lists(d, d.getVar("SCA_ENABLED_MODULES"), d.getVar("SCA_AVAILABLE_MODULES")))

    _args = ["pygount"]
    _args += ["--format=cloc-xml"]
    _args += [d.getVar("SCA_SOURCES_DIR")]
    cmd_output = ""
    try:
        cmd_output = subprocess.check_output(_args, universal_newlines=True)
    except subprocess.CalledProcessError as e:
        cmd_output = e.stdout or ""

    tmp_file = os.path.join(d.getVar("T"), "pygount.result.xml")
    with open(tmp_file, "w") as o:
        o.write(cmd_output)
    try:
        data = ElementTree.ElementTree(ElementTree.parse(tmp_file)).getroot()
        _scorelang = score_sum_up_lang(d, data)
    except Exception as e:
        _scorelang = 1
    
    _finalscore = score_calc_score(d, _scoretools, _scorelang)

    if _finalscore["security"] < float(d.getVar("SCA_SCORE_SECURITY_ERROR")):
        bb.error("Security score of {:.1f} is below threshold of {:.1f}".format(
                    _finalscore["security"], float(d.getVar("SCA_SCORE_SECURITY_ERROR"))))
    elif _finalscore["security"] < float(d.getVar("SCA_SCORE_SECURITY_WARN")):
        bb.warn("Security score of {:.1f} is below threshold of {:.1f}".format(
                    _finalscore["security"], float(d.getVar("SCA_SCORE_SECURITY_WARN"))))
    else:
        bb.note("Security score is {:.1f}".format(_finalscore["security"]))

    if _finalscore["functional"] < float(d.getVar("SCA_SCORE_FUNCTIONAL_ERROR")):
        bb.error("Functional score of {:.1f} is below threshold of {:.1f}".format(
                    _finalscore["functional"], float(d.getVar("SCA_SCORE_FUNCTIONAL_ERROR"))))
    elif _finalscore["functional"] < float(d.getVar("SCA_SCORE_FUNCTIONAL_WARN")):
        bb.warn("Functional score of {:.1f} is below threshold of {:.1f}".format(
                    _finalscore["functional"], float(d.getVar("SCA_SCORE_FUNCTIONAL_WARN"))))
    else:
        bb.note("Functional score is {:.1f}".format(_finalscore["functional"]))

    if _finalscore["style"] < float(d.getVar("SCA_SCORE_STYLE_ERROR")):
        bb.error("Style score of {:.1f} is below threshold of {:.1f}".format(
                    _finalscore["style"], float(d.getVar("SCA_SCORE_STYLE_ERROR"))))
    elif _finalscore["style"] < float(d.getVar("SCA_SCORE_STYLE_WARN")):
        bb.warn("Style score of {:.1f} is below threshold of {:.1f}".format(
                    _finalscore["style"], float(d.getVar("SCA_SCORE_STYLE_WARN"))))
    else:
        bb.note("Style score is {:.1f}".format(_finalscore["style"]))
}
