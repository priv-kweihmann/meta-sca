inherit sca-conv-checkstyle-stylelint
inherit sca-license-filter
inherit sca-helper

## Set the config file to be used - the files must be placed at ${STAGING_DATADIR_NATIVE}/stylelint/configs
## See stylelint-native recipe for details
SCA_STYLELINT_EXTRA_SUPPRESS ?= ""
SCA_STYLELINT_EXTRA_FATAL ?= ""
SCA_STYLELINT_CONFIG ?= "stylelint-config-standard"
SCA_STYLELINT_FILE_FILTER ?= ".css .scss .html .htm"

inherit npm-helper

python do_prepare_recipe_sysroot_append() {
    npm_prerun_fix_paths(d, d.getVar("STAGING_DATADIR_NATIVE"), "stylelint")
}

DEPENDS += "stylelint-native"

do_compile_prepend() {
    wget https://raw.githubusercontent.com/ft-interactive/accessibility/master/styles-bad-example.css
}

python do_sca_stylelint_core() {
    import os
    import subprocess
    import json

    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_STYLELINT_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_STYLELINT_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "stylelint-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "stylelint-{}-fatal".format(d.getVar("SCA_MODE"))))

    _supress = get_suppress_entries(d)
    _fatal = get_fatal_entries(d)

    _config = {
        "extends": os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "stylelint", "node_modules", d.getVar("SCA_STYLELINT_CONFIG"))
    }

    with open(os.path.join(d.getVar("T"), "stylelintrc"), "w") as o:
        json.dump(_config, o)

    _args = [os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "stylelint", "node_modules", ".bin", "stylelint")]
    _args += ["-f", "unix"]
    _args += ["--quiet"]
    _args += ["--config", os.path.join(d.getVar("T"), "stylelintrc")]
    _args += ["--no-color"]

    _files = get_files_by_extention(d, d.getVar("SCA_SOURCES_DIR"), d.getVar("SCA_STYLELINT_FILE_FILTER"),
                    sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))
    cmd_output = ""

    if any(_files):
        _args += _files
        try:
            cmd_output = subprocess.check_output(_args, universal_newlines=True)
        except subprocess.CalledProcessError as e:
            cmd_output = e.stdout or ""
    result_raw_file = os.path.join(d.getVar("T"), "sca_raw_stylelint.txt")
    d.setVar("SCA_RAW_RESULT", result_raw_file)
    with open(result_raw_file, "w") as o:
        o.write(cmd_output)
    xml_output = do_sca_conv_stylelint(d)
    result_file = os.path.join(d.getVar("T"), "sca_checkstyle_stylelint.xml")
    d.setVar("SCA_RESULT_FILE", result_file)
    with open(result_file, "w") as o:
        o.write(xml_output)

    ## Evaluate
    _warnings = get_warnings_from_result(d)
    _fatals = get_fatal_from_result(d, "stylelint.", _fatal)
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
