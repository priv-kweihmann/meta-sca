SCA_HTMLHINT_EXTRA_SUPPRESS ?= ""
SCA_HTMLHINT_EXTRA_FATAL ?= ""

DEPENDS += "htmlhint-native"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-helper
inherit sca-license-filter

def do_sca_conv_htmlhint(d):
    import os
    import json
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    items = []

    __excludes = sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA"))
    __suppress = get_suppress_entries(d)

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        j = []
        try:
            with open(d.getVar("SCA_RAW_RESULT_FILE")) as i:
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
                    if g.GetPlainID() in __suppress:
                        continue
                    if g.Severity in sca_allowed_warning_level(d):
                        sca_add_model_class(d, g)
            except Exception as exp:
                bb.warn(str(exp))

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
    result_raw_file = os.path.join(d.getVar("T"), "sca_raw_htmlhint.json")

    d.setVar("SCA_RAW_RESULT_FILE", result_raw_file)
    with open(result_raw_file, "w") as o:
        o.write(cmd_output)

    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/htmlhint.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_htmlhint(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "htmlhint", get_fatal_entries(d))
}
