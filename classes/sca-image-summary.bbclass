inherit sca-helper
inherit sca-conv-checkstyle-helper
inherit sca-global

python sca_image_summary_init() {
    for item in intersect_lists(d, d.getVar("SCA_ENABLED_MODULES"), d.getVar("SCA_AVAILABLE_MODULES")):
        for taskstr in ["do_sca_deploy_{}".format(item), "do_sca_deploy_{}_image".format(item)]:
            task = d.getVar(taskstr, False)
            if task is not None:
                d.appendVarFlag("do_sca_image_summary", "depends", " {}:{}".format(d.getVar("PN"), taskstr))
}

python do_sca_image_summary() {
    from xml.etree.ElementTree import Element, SubElement, Comment, tostring
    from xml.etree import ElementTree
    from xml.dom import minidom
    import json

    xml_output = ""
    _json = {}
    with open(d.getVar("SCA_IMAGE_PKG_LIST")) as i:
        _json = json.load(i)

    for rpm, v in _json.items():
        for mod in intersect_lists(d, d.getVar("SCA_ENABLED_MODULES"), d.getVar("SCA_AVAILABLE_MODULES")):
            fp = os.path.join(d.getVar("SCA_EXPORT_DIR"), mod, "checkstyle", "{}-{}.xml".format(rpm, v["ver"]))
            if os.path.exists(fp):
                new_data = Element("checkstyle")
                new_data.set("version", "4.3")
                data = ElementTree.ElementTree(ElementTree.parse(fp).getroot())
                for f in data.findall(".//error"):
                    if f.attrib["severity"] in checkstyle_allowed_warning_level(d):
                        new_data.append(f)
                tmp_xml = ""
                try:
                    tmp_xml = checkstyle_prettify(d, new_data).decode("utf-8")
                except:
                    tmp_xml = checkstyle_prettify(d, new_data)
                xml_output = xml_combine(d, xml_output, tmp_xml)
    
    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "image-summary", "checkstyle"), exist_ok=True)
    cs_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "image-summary", "checkstyle", "{}-{}.xml".format(d.getVar("PN"), d.getVar("PV")))

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
            bb.warn("Image contains {}".format(",".join(warn_log)))
}

addtask do_sca_image_summary after do_rootfs before do_image_complete
