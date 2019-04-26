inherit sca-conv-checkstyle-systemdlint
inherit sca-license-filter
inherit sca-helper

SCA_SYSTEMDLINT_EXTRA_SUPPRESS ?= ""
SCA_SYSTEMDLINT_EXTRA_FATAL ?= ""
SCA_SYSTEMDLINT_SYSTEMD_VERSION ?= ""
SCA_SYSTEMDLINT_FILES ?= ".automount .conf .link .mount .network .path .service .slice .socket .swap .target .timer"
SCA_SYSTEMDLINT_PATHS ?= "${SCA_SOURCES_DIR}/${sysconfdir}/systemd \
                          ${SCA_SOURCES_DIR}/${libdir}/systemd \
                          ${SCA_SOURCES_DIR}/run/systemd \"

DEPENDS += "${SCA_STD_PYTHON_INTERPRETER}-systemdlint-native"

inherit ${@oe.utils.ifelse(d.getVar('SCA_STD_PYTHON_INTERPRETER') == 'python3', 'python3native', 'pythonnative')}

python do_sca_systemdlint() {
    import os
    import subprocess
    import glob

    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_SYSTEMDLINT_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_SYSTEMDLINT_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "systemdlint-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "systemdlint-{}-fatal".format(d.getVar("SCA_MODE"))))

    _supress = get_suppress_entries(d)
    _fatal = get_fatal_entries(d)

    result_raw_file = os.path.join(d.getVar("T"), "sca_raw_systemdlint.txt")
    d.setVar("SCA_RAW_RESULT_FILE", result_raw_file)

    _args = ['systemdlint']
    _args += ["--rootpath={}".format(d.getVar("SCA_SOURCES_DIR"))]
    _args += ["--output={}".format(result_raw_file)]
    if d.getVar("SCA_SYSTEMDLINT_SYSTEMD_VERSION"):
        _args += ["--sversion={}".format(d.getVar("SCA_SYSTEMDLINT_SYSTEMD_VERSION"))]
    _files = []
    for path in clean_split(d, "SCA_SYSTEMDLINT_PATHS"):
        _files += get_files_by_extention(d, path,  d.getVar("SCA_SYSTEMDLINT_FILES"), \
                                            sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    with open(d.getVar("SCA_RAW_RESULT_FILE"), "w") as o:
        o.write("")

    if any(_files):
        _args += _files
        try:
            subprocess.check_output(_args, universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            bb.warn(str(e)[:1000])

    xml_output = do_sca_conv_systemdlint(d)
    result_file = os.path.join(d.getVar("T"), "sca_checkstyle_systemdlint.xml")
    d.setVar("SCA_RESULT_FILE", result_file)
    with open(result_file, "w") as o:
        o.write(xml_output)

    ## Evaluate
    _warnings = get_warnings_from_result(d)
    _fatals = get_fatal_from_result(d, "systemdlint.systemdlint.", _fatal)
    _errors = get_errors_from_result(d)

    warn_log = []
    if any(_warnings):
        warn_log.append("{} warning(s)".format(len(_warnings)))
    if any(_errors):
        warn_log.append("{} error(s)".format(len(_errors)))
    if warn_log and should_emit_to_console(d):
        bb.warn("SCA has found {}".format(",".join(warn_log)))
    
    if any(_fatals):
        bb.build.exec_func(d.getVar("SCA_DEPLOY_TASK"), d)
        bb.error("SCA has following fatal errors: {}".format("\n".join(_fatals)))
}

SCA_DEPLOY_TASK = "do_sca_deploy_systemdlint_image"

python do_sca_deploy_systemdlint_image() {
    import os
    import shutil

    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "systemdlint", "raw"), exist_ok=True)
    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "systemdlint", "checkstyle"), exist_ok=True)

    import os

    raw_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "systemdlint", "raw", "{}-{}.txt".format(d.getVar("PN"), d.getVar("PV")))
    cs_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "systemdlint", "checkstyle", "{}-{}.xml".format(d.getVar("PN"), d.getVar("PV")))
    src_raw = os.path.join(d.getVar("T"), "sca_raw_systemdlint.txt")
    src_conv = os.path.join(d.getVar("T"), "sca_checkstyle_systemdlint.xml")
    if os.path.exists(src_raw):
        shutil.copy(src_raw, raw_target)
    if os.path.exists(src_conv):
        shutil.copy(src_conv, cs_target)
    if os.path.exists(cs_target):
        do_sca_export_sources(d, cs_target)
}

addtask do_sca_systemdlint before do_image_complete after do_image
addtask do_sca_deploy_systemdlint_image before do_image_complete after do_sca_systemdlint

DEPENDS += "sca-image-systemdlint-rules-native"