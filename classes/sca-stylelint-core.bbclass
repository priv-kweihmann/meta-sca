## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Set the config file to be used - the files must be placed at ${STAGING_DATADIR_NATIVE}/stylelint/configs
## See stylelint-native recipe for details
SCA_STYLELINT_EXTRA_SUPPRESS ?= ""
SCA_STYLELINT_EXTRA_FATAL ?= ""
SCA_STYLELINT_CONFIG ?= "stylelint-config-standard"
SCA_STYLELINT_FILE_FILTER ?= ".css .scss .html .htm"

SCA_RAW_RESULT_FILE[stylelint] = "txt"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-license-filter
inherit sca-suppress

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

    _suppress = sca_suppress_init(d, "SCA_STYLELINT_EXTRA_SUPPRESS",
                                  d.expand("${STAGING_DATADIR_NATIVE}/stylelint-${SCA_MODE}-suppress"))
    _findings = []

    if os.path.exists(sca_raw_result_file(d, "stylelint")):
        with open(sca_raw_result_file(d, "stylelint"), "r") as f:
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
                    if _suppress.Suppressed(g):
                        continue
                    if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
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

    _config = {
        "extends": os.path.join(d.getVar("STAGING_LIBDIR_NATIVE"), "node_modules", d.getVar("SCA_STYLELINT_CONFIG"))
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
    with open(sca_raw_result_file(d, "stylelint"), "w") as o:
        o.write(cmd_output)
}

python do_sca_stylelint_core_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/stylelint.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_stylelint(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "stylelint", get_fatal_entries(d, "SCA_STYLELINT_EXTRA_FATAL",
                       d.expand("${STAGING_DATADIR_NATIVE}/stylelint-${SCA_MODE}-fatal")))
}
