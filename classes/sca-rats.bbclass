## Add ids to suppress on a recipe level
SCA_RATS_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_RATS_EXTRA_FATAL ?= ""

inherit sca-helper
inherit sca-conv-checkstyle-rats
inherit sca-global

python do_sca_rats() {
    import os
    import subprocess
    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_RATS_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_RATS_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "rats-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "rats-{}-fatal".format(d.getVar("SCA_MODE"))))

    _supress = get_suppress_entries(d)
    _fatal = get_fatal_entries(d)

    tmp_result = os.path.join(d.getVar("T", True), "sca_raw_rats.xml")
    d.setVar("SCA_RAW_RESULT_FILE", tmp_result)
    xml_output = ""
    _args = ["rats"]
    _args += ["--xml"]

    _files = get_files_by_extention(d, d.getVar("SCA_SOURCES_DIR"), ".c", excludes=[])
    ## C
    if any(_files):
        try:
            _targs = _args + ["-d", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "rats-c.xml")]
            _targs += _files
            cmd_output = subprocess.check_output(_targs, universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            cmd_output = e.stdout or ""
        xml_output = xml_combine(d, xml_output, cmd_output)

    _files = get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), ".*perl", ".perl .pl", excludes=[])
    ## Perl
    if any(_files):
        try:
            _targs = _args + ["-d", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "rats-perl.xml")]
            _targs += _files
            cmd_output = subprocess.check_output(_targs, universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            cmd_output = e.stdout or ""
        xml_output = xml_combine(d, xml_output, cmd_output)

    _files = get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), ".*python", ".py", excludes=[])
    ## Python
    if any(_files):
        try:
            _targs = _args + ["-d", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "rats-python.xml")]
            _targs += _files
            cmd_output = subprocess.check_output(_targs, universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            cmd_output = e.stdout or ""
        xml_output = xml_combine(d, xml_output, cmd_output)

    _files = get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), ".*php", ".php", excludes=[])
    ## Php
    if any(_files):
        try:
            _targs = _args + ["-d", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "rats-php.xml")]
            _targs += _files
            cmd_output = subprocess.check_output(_targs, universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            cmd_output = e.stdout or ""
        xml_output = xml_combine(d, xml_output, cmd_output)

    _files = get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), ".*ruby", ".ruby", excludes=[])
    ## Ruby
    if any(_files):
        try:
            _targs = _args + ["-d", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "rats-ruby.xml")]
            _targs += _files
            cmd_output = subprocess.check_output(_targs, universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            cmd_output = e.stdout or ""
        xml_output = xml_combine(d, xml_output, cmd_output)
    
    with open(tmp_result, "w") as o:
        o.write(xml_output)
    
    result_file = os.path.join(d.getVar("T", True), "sca_checkstyle_rats.xml")
    d.setVar("SCA_RESULT_FILE", result_file)
    conv_output = do_sca_conv_rats(d)
    with open(result_file, "w") as o:
        o.write(conv_output)

    ## Evaluate
    _warnings = get_warnings_from_result(d)
    _fatals = get_fatal_from_result(d, "rats.rats", _fatal)
    _errors = get_errors_from_result(d)

    warn_log = []
    if any(_warnings) and should_emit_to_console(d):
        warn_log.append("{} warning(s)".format(len(_warnings)))
    if any(_errors) and should_emit_to_console(d):
        warn_log.append("{} error(s)".format(len(_errors)))
    if warn_log and should_emit_to_console(d):
        bb.warn("SCA has found {}".format(",".join(warn_log)))
    
    if any(_fatals):
        bb.build.exec_func("do_sca_deploy_rats", d)
        bb.error("SCA has following fatal errors: {}".format("\n".join(_fatals)))
}

python do_sca_deploy_rats() {
    import os
    import shutil
    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "rats", "raw"), exist_ok=True)
    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "rats", "checkstyle"), exist_ok=True)
    raw_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "rats", "raw", "{}-{}.xml".format(d.getVar("PN"), d.getVar("PV")))
    cs_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "rats", "checkstyle", "{}-{}.xml".format(d.getVar("PN"), d.getVar("PV")))
    src_raw = os.path.join(d.getVar("T"), "sca_raw_rats.xml")
    src_conv = os.path.join(d.getVar("T"), "sca_checkstyle_rats.xml")
    if os.path.exists(src_raw):
        shutil.copy(src_raw, raw_target)
    if os.path.exists(src_conv):
        shutil.copy(src_conv, cs_target)
    if os.path.exists(cs_target):
        do_sca_export_sources(d, cs_target)
}

addtask do_sca_rats before do_install after do_configure
addtask do_sca_deploy_rats after do_sca_rats before do_package

DEPENDS += "rats-native sca-recipe-rats-rules-native"
