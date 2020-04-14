## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

SCA_HTMLHINT_EXTRA_SUPPRESS ?= ""
SCA_HTMLHINT_EXTRA_FATAL ?= ""

SCA_RAW_RESULT_FILE[htmlhint] = "json"

DEPENDS += "htmlhint-native"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-helper
inherit sca-license-filter
inherit sca-suppress

def do_sca_conv_htmlhint(d):
    import os
    import json
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    items = []

    __excludes = sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA"))
    _suppress = sca_suppress_init(d)
    _findings = []

    if os.path.exists(sca_raw_result_file(d, "htmlhint")):
        j = []
        try:
            with open(sca_raw_result_file(d, "htmlhint")) as i:
                j = json.load(i)
        except:
            pass
        for item in j:
            try:
                _file = item["file"]
                if item["file"] in __excludes:
                    continue
                for m in item["messages"]:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="htmlhint",
                                            BuildPath=buildpath,
                                            Column=str(m["col"]),
                                            File=_file,
                                            Line=str(m["line"]),
                                            Message=m["message"],
                                            ID=m["rule"]["id"],
                                            Severity=m["type"])
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

python do_sca_htmlhint_core() {
    import os
    import subprocess
    import json

    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_HTMLHINT_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_HTMLHINT_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "htmlhint-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "htmlhint-{}-fatal".format(d.getVar("SCA_MODE"))))

    _args = ["htmlhint"]
    _args += ["-f", "json"]
    _args += [d.getVar("SCA_SOURCES_DIR") + "/"]

    cmd_output = ""
    try:
        cmd_output = subprocess.check_output(_args, universal_newlines=True)
    except subprocess.CalledProcessError as e:
        cmd_output = e.stdout or ""
    
    with open(sca_raw_result_file(d, "htmlhint"), "w") as o:
        o.write(cmd_output)
}

python do_sca_htmlhint_core_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/htmlhint.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_htmlhint(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "htmlhint", get_fatal_entries(d))
}
