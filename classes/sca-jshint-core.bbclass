## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Set the config file to be used - the files must be placed at ${STAGING_DATADIR_NATIVE}/jshint/configs
## See jshint-native recipe for details
SCA_JSHINT_EXTRA_SUPPRESS ?= ""
SCA_JSHINT_EXTRA_FATAL ?= ""
SCA_JSHINT_FILE_FILTER ?= ".js .html .htm"

SCA_RAW_RESULT_FILE[jshint] = "txt"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-license-filter
inherit sca-suppress

DEPENDS += "jshint-native"

def do_sca_conv_jshint(d):
    import os
    import re
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^(?P<file>.*):(?P<line>\d+):(?P<col>\d+):\s+(?P<msg>.*)\s+\((?P<id>.*)\)"

    severity_map = {
        "E": "error",
        "W": "warning"
    }
    _findings = []
    _suppress = sca_suppress_init(d, "SCA_JSHINT_EXTRA_SUPPRESS", 
                                    d.expand("${STAGING_DATADIR_NATIVE}/jshint-${SCA_MODE}-suppress"))

    if os.path.exists(sca_raw_result_file(d, "jshint")):
        with open(sca_raw_result_file(d, "jshint"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="jshint",
                                            BuildPath=buildpath,
                                            File=m.group("file"),
                                            Line=m.group("line"),
                                            Column=m.group("col"),
                                            Message=m.group("msg"),
                                            ID=m.group("id"),
                                            Severity=severity_map[m.group("id")[0]])
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

python do_sca_jshint_core() {
    import os
    import subprocess
    import json

    if not os.path.exists("node_modules"):
        os.symlink(os.path.join(d.getVar("STAGING_LIBDIR_NATIVE"), "node_modules"), "node_modules", target_is_directory=True)

    _args = ["jshint"]
    _args += ["--reporter", "unix"]
    _args += ["--verbose"]
    _args += ["--extract", "auto"]
    _files = get_files_by_extention(d, d.getVar("SCA_SOURCES_DIR"), d.getVar("SCA_JSHINT_FILE_FILTER"),
                                sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    cmd_output = exec_wrap_check_output(_args, _files)
    with open(sca_raw_result_file(d, "jshint"), "w") as o:
        o.write(cmd_output)

    try:
        os.remove("node_modules")
    except FileNotFoundError:
        pass
}

python do_sca_jshint_core_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/jshint.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_jshint(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "jshint", get_fatal_entries(d, "SCA_JSHINT_EXTRA_FATAL",
                        d.expand("${STAGING_DATADIR_NATIVE}/jshint-${SCA_MODE}-fatal")))
}
