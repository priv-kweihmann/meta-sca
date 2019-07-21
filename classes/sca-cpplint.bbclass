## Add ids to suppress on a recipe level
SCA_CPPLINT_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_CPPLINT_EXTRA_FATAL ?= ""
## File extension filter list (whitespace separated)
SCA_CPPLINT_FILE_FILTER ?= ".c .cpp .h .hpp"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper

def do_sca_conv_cpplint(d):
    import os
    import re
    from xml.etree.ElementTree import Element, SubElement, Comment, tostring
    from xml.etree import ElementTree
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    items = []

    severity_map = {
        "5" : "warning",
        "4" : "info",
        "3" : "info",
        "2" : "info",
        "1" : "ignore"
    }
    pattern = r"^(?P<line>\d+):\s+(?P<message>.*)\s+\[(?P<id>.*)\]\s+\[(?P<severity>\d)\]"
    _findings = []
    _suppress = get_suppress_entries(d)

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        try:
            data = ElementTree.ElementTree(ElementTree.parse(d.getVar("SCA_RAW_RESULT_FILE"))).getroot()
            for node in data.findall(".//testcase"):
                _filename = node.attrib.get("name")
                fail = node.find("failure")
                if not fail is None:
                    for m in re.finditer(pattern, fail.text, re.MULTILINE):
                        try:
                            g = sca_get_model_class(d,
                                                PackageName=package_name,
                                                Tool="cpplint",
                                                BuildPath=buildpath,
                                                File=_filename,
                                                Line=m.group("line"),
                                                Message=m.group("message"),
                                                ID=m.group("id"),
                                                Severity=severity_map[m.group("severity")])
                            if g.GetFormattedID() in _suppress:
                                continue
                            if g.Severity in sca_allowed_warning_level(d):
                                _findings.append(g)
                        except Exception as exp:
                            bb.warn(str(exp))
        except:
            pass
    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_cpplint() {
    import os
    import subprocess
    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_CPPLINT_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_CPPLINT_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "cpplint-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "cpplint-{}-fatal".format(d.getVar("SCA_MODE"))))

    _args = ["python3", os.path.join(d.getVar("STAGING_BINDIR_NATIVE"), "cpplint.py")]
    _args += ["--output=junit"]
    _args += ["--quiet"]
    _args += ["--root={}".format(d.getVar("B", True))]

    ## Run
    cur_dir = os.getcwd()
    os.chdir(d.getVar("B", True))
    cmd_output = ""
    tmp_result = os.path.join(d.getVar("T", True), "sca_raw_cpplint.xml")
    d.setVar("SCA_RAW_RESULT_FILE", tmp_result)
    _files = get_files_by_extention(d, 
                                    d.getVar("SCA_SOURCES_DIR"), 
                                    clean_split(d, "SCA_CPPLINT_FILE_FILTER"), 
                                    sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))
    if any(_files):
        _args += _files
        try:
            cmd_output = subprocess.check_output(_args, universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            cmd_output = e.stdout or ""
    with open(tmp_result, "w") as o:
        o.write(cmd_output)
    os.chdir(cur_dir)
    
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/cpplint.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_cpplint(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "cpplint", get_fatal_entries(d))
}

SCA_DEPLOY_TASK = "do_sca_deploy_cpplint"

python do_sca_deploy_cpplint() {
    sca_conv_deploy(d, "cpplint", "xml")
}

addtask do_sca_cpplint before do_install after do_compile
addtask do_sca_deploy_cpplint after do_sca_cpplint before do_package

do_sca_cpplint[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_cpplint[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "cpplint-native sca-recipe-cpplint-rules-native"
