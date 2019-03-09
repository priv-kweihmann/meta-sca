## Add ids to suppress on a recipe level
SCA_GIXY_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_GIXY_EXTRA_FATAL ?= ""
## Default ngixn config file to pick
SCA_GIXY_NGINX_CONF ?= "/etc/nginx/nginx.conf"

inherit sca-helper
inherit sca-conv-checkstyle-gixy
inherit sca-global

python do_sca_gixy() {
    import os
    import subprocess
    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_GIXY_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_GIXY_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "gixy-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "gixy-{}-fatal".format(d.getVar("SCA_MODE"))))

    _supress = get_suppress_entries(d)
    _fatal = get_fatal_entries(d)

    tmp_result = os.path.join(d.getVar("T", True), "sca_raw_gixy.json")
    d.setVar("SCA_RAW_RESULT_FILE", tmp_result)
    cmd_output = ""

    ## Run
    _file = d.getVar("SCA_GIXY_NGINX_CONF")
    if os.path.isabs(_file):
        _file = _file.lstrip("/")
    
    if os.path.exists(os.path.join(d.getVar("SCA_SOURCES_DIR"), _file)):
        _args = ["gixy"]
        _args += ["--root-dir={}".format(d.getVar("SCA_SOURCES_DIR"))]
        _args += ["-f", "json"]
        _args += ["-l"]
        _args += ["-o", tmp_result]
        _args += [d.getVar("SCA_GIXY_NGINX_CONF")]
        
        try:
            cmd_output = subprocess.check_output(_args, universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            cmd_output = e.stdout or ""
    
    if not os.path.exists(tmp_result):
        import json
        with open(tmp_result, "w") as o:
            json.dump([], o)
    
    result_file = os.path.join(d.getVar("T", True), "sca_checkstyle_gixy.xml")
    d.setVar("SCA_RESULT_FILE", result_file)
    conv_output = do_sca_conv_gixy(d, cmd_output)
    with open(result_file, "w") as o:
        o.write(conv_output)

    ## Evaluate
    _warnings = get_warnings_from_result(d)
    _fatals = get_fatal_from_result(d, "gixy.gixy", _fatal)
    _errors = get_errors_from_result(d)

    warn_log = []
    if any(_warnings) and should_emit_to_console(d):
        warn_log.append("{} warning(s)".format(len(_warnings)))
    if any(_errors) and should_emit_to_console(d):
        warn_log.append("{} error(s)".format(len(_errors)))
    if warn_log and should_emit_to_console(d):
        bb.warn("SCA has found {}".format(",".join(warn_log)))
    
    if any(_fatals):
        bb.build.exec_func("do_sca_deploy_gixy", d)
        bb.error("SCA has following fatal errors: {}".format("\n".join(_fatals)))
}

python do_sca_deploy_gixy() {
    import os
    import shutil
    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "gixy", "raw"), exist_ok=True)
    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "gixy", "checkstyle"), exist_ok=True)
    raw_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "gixy", "raw", "{}-{}.json".format(d.getVar("PN"), d.getVar("PV")))
    cs_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "gixy", "checkstyle", "{}-{}.xml".format(d.getVar("PN"), d.getVar("PV")))
    src_raw = os.path.join(d.getVar("T"), "sca_raw_gixy.json")
    src_conv = os.path.join(d.getVar("T"), "sca_checkstyle_gixy.xml")
    if os.path.exists(src_raw):
        shutil.copy(src_raw, raw_target)
    if os.path.exists(src_conv):
        shutil.copy(src_conv, cs_target)
    if os.path.exists(cs_target):
        do_sca_export_sources(d, cs_target)
}

addtask do_sca_gixy before do_image_complete after do_image
addtask do_sca_deploy_gixy before do_image_complete after do_sca_gixy

DEPENDS += "${SCA_STD_PYTHON_INTERPRETER}-gixy-native sca-image-gixy-rules-native"
