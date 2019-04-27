inherit sca-conv-checkstyle-htmlhint
inherit sca-license-filter
inherit sca-helper

SCA_HTMLHINT_EXTRA_SUPPRESS ?= ""
SCA_HTMLHINT_EXTRA_FATAL ?= ""

python do_prepare_recipe_sysroot_append() {
    import glob
    import os

    ## Rewrite all of the packages-paths if we have to
    for item in glob.glob(os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "htmlhint") + "/**/package.json", recursive=True):
        content = ""
        with open(item, "r") as i:
            content = i.read().replace("%SYSROOT%", d.getVar("STAGING_DATADIR_NATIVE"))
        with open(item, "w") as o:
            o.write(content)
}

DEPENDS += "nodejs-native htmlhint-native"

python do_sca_htmlhint_core() {
    import os
    import subprocess
    import json

    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_HTMLHINT_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_HTMLHINT_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "htmlhint-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "htmlhint-{}-fatal".format(d.getVar("SCA_MODE"))))

    _supress = get_suppress_entries(d)
    _fatal = get_fatal_entries(d)

    _args = [os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "htmlhint", "node_modules", ".bin", "htmlhint")]
    _args += ["-f", "checkstyle"]
    _args += [d.getVar("SCA_SOURCES_DIR") + "/"]

    cmd_output = ""
    try:
        cmd_output = subprocess.check_output(_args, universal_newlines=True)
    except subprocess.CalledProcessError as e:
        cmd_output = e.stdout or ""
    result_raw_file = os.path.join(d.getVar("T"), "sca_raw_htmlhint.xml")

    if not cmd_output.endswith("</checkstyle>"):
        if cmd_output.find("<file") != -1:
            cmd_output += "</file>"
        cmd_output += "</checkstyle>"
    d.setVar("SCA_RAW_RESULT", result_raw_file)
    with open(result_raw_file, "w") as o:
        o.write(cmd_output)
    xml_output = do_sca_conv_htmlhint(d)
    result_file = os.path.join(d.getVar("T"), "sca_checkstyle_htmlhint.xml")
    d.setVar("SCA_RESULT_FILE", result_file)
    with open(result_file, "w") as o:
        o.write(xml_output)

    ## Evaluate
    _warnings = get_warnings_from_result(d)
    _fatals = get_fatal_from_result(d, "htmlhint.", _fatal)
    _errors = get_errors_from_result(d)

    warn_log = []
    if any(_warnings) and should_emit_to_console(d):
        warn_log.append("{} warning(s)".format(len(_warnings)))
    if any(_errors) and should_emit_to_console(d):
        warn_log.append("{} error(s)".format(len(_errors)))
    if warn_log and should_emit_to_console(d):
        bb.warn("SCA has found {}".format(",".join(warn_log)))
    
    if any(_fatals):
        bb.build.exec_func(d.getVar("SCA_DEPLOY_TASK"), d)
        bb.error("SCA has following fatal errors: {}".format("\n".join(_fatals)))
}
