## This class does parse the bitbake log for WARNING and ERROR strings
CONLOG = "${LOG_DIR}/cooker/${MACHINE}/console-latest.log"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper

def do_sca_conv_bitbake(d):
    import os
    import re
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^(?P<severity>WARNING|ERROR):\s+{}-{}-{}\s+(?P<task>.*):\s+(?P<message>.*)$".format(d.getVar("PN"), d.getVar("PKGV"), d.getVar("PR"))

    severity_map = {
        "ERROR" : "error",
        "WARNING" : "warning",
    }

    _suppress = get_suppress_entries(d)
    _excludes = sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA"))

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        with open(d.getVar("SCA_RAW_RESULT_FILE"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="bitbake",
                                            BuildPath=buildpath,
                                            File=d.getVar("FILE"),
                                            Message="{}: {}".format(m.group("task"), m.group("message")),
                                            ID=m.group("severity"),
                                            Severity=severity_map[m.group("severity")])
                    if g.File in _excludes:
                        continue
                    if g.GetPlainID() in _suppress:
                        continue
                    if g.Severity in sca_allowed_warning_level(d):
                        sca_add_model_class(d, g)
                except Exception as exp:
                    bb.warn(str(exp))

    return sca_save_model_to_string(d)

python do_sca_bitbake () {
    content = ""
    with open(d.getVar("CONLOG")) as f:
        content = f.read()
    result_raw_file = os.path.join(d.getVar("T"), "sca_raw_bitbake.txt")
    d.setVar("SCA_RAW_RESULT_FILE", result_raw_file)
    with open(result_raw_file, "w") as o:
        o.write(content)

    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/bitbake.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_bitbake(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "bitbake", get_fatal_entries(d))
}

SCA_DEPLOY_TASK = "do_sca_deploy_gcc"

python do_sca_deploy_bitbake() {
    sca_conv_deploy(d, "bitbake", "txt")
}

DEPENDS += "bitbake-sca-native"