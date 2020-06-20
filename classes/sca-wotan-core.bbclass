## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

SCA_WOTAN_EXTRA_SUPPRESS ?= ""
SCA_WOTAN_EXTRA_FATAL ?= ""
SCA_WOTAN_FILE_FILTER ?= ".js .ts .vue"
SCA_WOTAN_CONFIG ?= "wotan:recommended"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-license-filter
inherit sca-suppress

DEPENDS += "wotan-native"

SCA_RAW_RESULT_FILE[wotan] = "json"

def do_sca_conv_wotan(d):
    import os
    import json
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    _suppress = sca_suppress_init(d)
    _findings = []

    if os.path.exists(sca_raw_result_file(d, "wotan")):
        content = []
        with open(sca_raw_result_file(d, "wotan"), "r") as f:
            try:
                content = json.load(f)
            except json.JSONDecodeError:
                content = []
            for m in content:
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            BuildPath=buildpath,
                                            Tool="wotan",
                                            File=m["fileName"],
                                            Line=str(m["start"]["line"]),
                                            Column=str(m["start"]["character"] + 1),
                                            Message=m["message"],
                                            ID=m["ruleName"],
                                            Severity=m["severity"])
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

python do_sca_wotan_core() {
    import os
    import subprocess

    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_WOTAN_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_WOTAN_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "wotan-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "wotan-{}-fatal".format(d.getVar("SCA_MODE"))))

    _args = ["wotan"]
    _args += ["-c", d.getVar("SCA_WOTAN_CONFIG")]
    _args += ["--fix", "false"]
    _args += ["--formatter", "json"]

    _files = get_files_by_extention(d, d.getVar("SCA_SOURCES_DIR"), d.getVar("SCA_WOTAN_FILE_FILTER"), \
                                    sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))
    cmd_output = ""
    if any(_files):
        _args += _files
        try:
            cmd_output = subprocess.check_output(_args, universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            cmd_output = e.stdout or ""
    
    cmd_output = "\n".join([x for x in cmd_output.split("\n") if not x.startswith("Rule") and not x.endswith("requires type information.")])

    with open(sca_raw_result_file(d, "wotan"), "w") as o:
        o.write(cmd_output)
}

python do_sca_wotan_core_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/wotan.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_wotan(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "wotan", get_fatal_entries(d))
}
