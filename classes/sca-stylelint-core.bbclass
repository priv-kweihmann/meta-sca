## Set the config file to be used - the files must be placed at ${STAGING_DATADIR_NATIVE}/stylelint/configs
## See stylelint-native recipe for details
SCA_STYLELINT_EXTRA_SUPPRESS ?= ""
SCA_STYLELINT_EXTRA_FATAL ?= ""
SCA_STYLELINT_CONFIG ?= "stylelint-config-standard"
SCA_STYLELINT_FILE_FILTER ?= ".css .scss .html .htm"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-license-filter

DEPENDS += "stylelint-native"

def do_sca_conv_stylelint(d):
    import os
    import re
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^(?P<file>.*):(?P<line>\d+):(?P<col>\d+):\s+(?P<msg>.*)\s+\((?P<id>.*)\)\s+\[(?P<severity>.*)\]"

    severity_map = {
        "error" : "error",
        "warning" : "warning",
        "info": "info"
    }

    _suppress = get_suppress_entries(d)
    _findings = []

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        with open(d.getVar("SCA_RAW_RESULT_FILE"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="stylelint",
                                            BuildPath=buildpath,
                                            File=m.group("file"),
                                            Column=m.group("col"),
                                            Line=m.group("line"),
                                            Message=m.group("msg"),
                                            ID=m.group("id"),
                                            Severity=severity_map[m.group("severity")])
                    if g.GetPlainID() in _suppress:
                        continue
                    if g.Severity in sca_allowed_warning_level(d):
                        _findings.append(g)
                except Exception as exp:
                    bb.warn(str(exp))

    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_stylelint_core() {
    import os
    import subprocess
    import json

    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_STYLELINT_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_STYLELINT_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "stylelint-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "stylelint-{}-fatal".format(d.getVar("SCA_MODE"))))

    _config = {
        "extends": os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "stylelint", "node_modules", d.getVar("SCA_STYLELINT_CONFIG"))
    }

    with open(os.path.join(d.getVar("T"), "stylelintrc"), "w") as o:
        json.dump(_config, o)

    _args = ["stylelint"]
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
    d.setVar("SCA_RAW_RESULT_FILE", result_raw_file)
    with open(result_raw_file, "w") as o:
        o.write(cmd_output)

    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/stylelint.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_stylelint(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "stylelint", get_fatal_entries(d))
}
