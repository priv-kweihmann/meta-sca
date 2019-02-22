## This class does parse the bitbake log for WARNING and ERROR strings

inherit sca-helper
inherit sca-global
inherit sca-conv-checkstyle-helper

CONLOG = "${LOG_DIR}/cooker/${MACHINE}/console-latest.log"

def sca_bitbake_create_file(d, content):
    import os
    import re
    from xml.etree.ElementTree import Element, SubElement, Comment, tostring
    from xml.etree import ElementTree
    from xml.dom import minidom

    package_name = d.getVar("PN", True)
    buildpath = d.getVar("SCA_SOURCES_DIR", True)

    items = []
    pattern = r"^(?P<severity>WARNING|ERROR):\s+{}-{}-{}\s+(?P<task>.*):\s+(?P<message>.*)$".format(d.getVar("PN"), d.getVar("PKGV"), d.getVar("PR"))

    class BitbakeItem():
        File = ""
        Line = "1"
        Column = "1"
        Severity = ""
        Message = ""
        ID = ""

    severity_map = {
        "ERROR" : "error",
        "WARNING" : "warning",
    }

    for m in re.finditer(pattern, content, re.MULTILINE):
        try:
            g = BitbakeItem()
            g.File = d.getVar("FILE")
            g.Message = "[Package:%s Tool:bitbake] %s: %s" % (package_name, m.group("task"), m.group("message"))
            g.Severity = severity_map[m.group("severity")]
            g.ID = "bitbake.bitbake.%s" % m.group("severity")
            if g.Severity in checkstyle_allowed_warning_level(d):
                items.append(g)
        except Exception as e:
            pass

    filenames = list(set([x.File for x in items]))

    bb.warn("{}".format(items))

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

python do_sca_bitbake () {
    content = ""
    with open(d.getVar("CONLOG")) as f:
        content = f.read()
    output = sca_bitbake_create_file(d, content)
    result_raw_file = os.path.join(d.getVar("T"), "sca_raw_bitbake.xml")
    d.setVar("SCA_RAW_RESULT", result_raw_file)
    with open(result_raw_file, "w") as o:
        o.write(output)
    result_file = os.path.join(d.getVar("T"), "sca_checkstyle_bitbake.xml")
    d.setVar("SCA_RESULT_FILE", result_file)
    with open(result_file, "w") as o:
        o.write(output)
}

python do_sca_deploy_bitbake() {
    import os
    import shutil
    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "bitbake", "raw"), exist_ok=True)
    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "bitbake", "checkstyle"), exist_ok=True)
    raw_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "bitbake", "raw", "{}-{}.txt".format(d.getVar("PN"), d.getVar("PV")))
    cs_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "bitbake", "checkstyle", "{}-{}.xml".format(d.getVar("PN"), d.getVar("PV")))
    shutil.copy(os.path.join(d.getVar("T"), "sca_raw_bitbake.xml"), raw_target)
    shutil.copy(os.path.join(d.getVar("T"), "sca_checkstyle_bitbake.xml"), cs_target)
    do_sca_export_sources(d, cs_target)
}