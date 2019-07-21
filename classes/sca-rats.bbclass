## Add ids to suppress on a recipe level
SCA_RATS_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_RATS_EXTRA_FATAL ?= ""

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper

def do_sca_conv_rats(d):
    import os
    import re
    from xml.etree.ElementTree import Element, SubElement, Comment, tostring
    from xml.etree import ElementTree
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    severity_map = {
        "High" : "error",
        "Medium" : "warning",
        "Low" : "info",
        "Default": "info"
    }

    _suppress = get_suppress_entries(d)

    _findings = []

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        try:
            data = ElementTree.parse(d.getVar("SCA_RAW_RESULT_FILE")).getroot()
            for node in data.findall(".//vulnerability"):
                try:
                    _severity=""
                    _msg=""
                    _id=""
                    for _i in node.iter(tag="severity"):
                        _severity = severity_map[_i.text]
                    for _i in node.iter(tag="message"):
                        _text = _i.text.replace("\n", " ")
                        _msg = re.sub(r"\s{2,}", " ", _text).strip()
                    for _i in node.iter(tag="type"):
                        _id = _i.text.replace(" ", "_")
                    
                    if not _severity in sca_allowed_warning_level(d):
                        continue
                    for _i in node.iter(tag="file"):
                        _filename = ""
                        for _j in _i.iter(tag="name"):
                            _filename = _j.text
                        for _j in _i.iter(tag="line"):
                            g = sca_get_model_class(d,
                                                    PackageName=package_name,
                                                    Tool="rats",
                                                    BuildPath=buildpath,
                                                    File=_filename,
                                                    Line=_j.text,
                                                    Message=_msg,
                                                    ID=_id,
                                                    Severity=_severity)
                            if g.GetFormattedID() in _suppress:
                                continue
                            _findings.append(g)
                except Exception as exp:
                    bb.warn(str(exp))
        except:
            pass

    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_rats() {
    import os
    import subprocess
    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_RATS_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_RATS_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "rats-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "rats-{}-fatal".format(d.getVar("SCA_MODE"))))

    tmp_result = os.path.join(d.getVar("T", True), "sca_raw_rats.xml")
    d.setVar("SCA_RAW_RESULT_FILE", tmp_result)
    xml_output = ""
    _args = ["rats"]
    _args += ["--xml"]

    _excludes = sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA"))

    _files = get_files_by_extention(d, d.getVar("SCA_SOURCES_DIR"), ".c", _excludes)
    ## C
    if any(_files):
        try:
            _targs = _args + ["-d", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "rats-c.xml")]
            _targs += _files
            cmd_output = subprocess.check_output(_targs, universal_newlines=True, stderr=subprocess.STDOUT)
        except UnicodeDecodeError:
            cmd_output = ""
        except subprocess.CalledProcessError as e:
            cmd_output = e.stdout or ""
        xml_output = xml_combine(d, xml_output, cmd_output)

    _files = get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), ".*perl", ".perl .pl", _excludes)
    ## Perl
    if any(_files):
        try:
            _targs = _args + ["-d", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "rats-perl.xml")]
            _targs += _files
            cmd_output = subprocess.check_output(_targs, universal_newlines=True, stderr=subprocess.STDOUT)
        except UnicodeDecodeError:
            cmd_output = ""
        except subprocess.CalledProcessError as e:
            cmd_output = e.stdout or ""
        xml_output = xml_combine(d, xml_output, cmd_output)

    _files = get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), d.getVar("SCA_PYTHON_SHEBANG"), ".py", _excludes)
    ## Python
    if any(_files):
        try:
            _targs = _args + ["-d", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "rats-python.xml")]
            _targs += _files
            cmd_output = subprocess.check_output(_targs, universal_newlines=True, stderr=subprocess.STDOUT)
        except UnicodeDecodeError:
            cmd_output = ""
        except subprocess.CalledProcessError as e:
            cmd_output = e.stdout or ""
        xml_output = xml_combine(d, xml_output, cmd_output)

    _files = get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), ".*php", ".php", _excludes)
    ## Php
    if any(_files):
        try:
            _targs = _args + ["-d", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "rats-php.xml")]
            _targs += _files
            cmd_output = subprocess.check_output(_targs, universal_newlines=True, stderr=subprocess.STDOUT)
        except UnicodeDecodeError:
            cmd_output = ""
        except subprocess.CalledProcessError as e:
            cmd_output = e.stdout or ""
        xml_output = xml_combine(d, xml_output, cmd_output)

    _files = get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), ".*ruby", ".ruby", _excludes)
    ## Ruby
    if any(_files):
        try:
            _targs = _args + ["-d", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "rats-ruby.xml")]
            _targs += _files
            cmd_output = subprocess.check_output(_targs, universal_newlines=True, stderr=subprocess.STDOUT)
        except UnicodeDecodeError:
            cmd_output = ""
        except subprocess.CalledProcessError as e:
            cmd_output = e.stdout or ""
        xml_output = xml_combine(d, xml_output, cmd_output)
    
    with open(tmp_result, "w") as o:
        o.write(xml_output)
    
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/rats.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_rats(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "rats", get_fatal_entries(d))
}

SCA_DEPLOY_TASK = "do_sca_deploy_rats"

python do_sca_deploy_rats() {
    sca_conv_deploy(d, "rats", "xml")
}

addtask do_sca_rats before do_install after do_configure
addtask do_sca_deploy_rats after do_sca_rats before do_package

do_sca_rats[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_rats[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "rats-native sca-recipe-rats-rules-native"
