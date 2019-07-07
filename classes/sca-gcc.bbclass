## Add ids to suppress on a recipe level
SCA_GCC_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_GCC_EXTRA_FATAL ?= ""

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper

def do_sca_conv_gcc(d):
    import os
    import re
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^(?P<file>.*):(?P<line>\d+):(?P<column>\d+):\s+(?P<severity>\w+):\s+(?P<message>.*)\s\[-(?P<id>.*)\]"

    severity_map = {
        "error" : "error",
        "warning" : "warning",
        "info": "info"
    }

    _suppress = get_suppress_entries(d)
    _excludes = sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA"))

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        with open(d.getVar("SCA_RAW_RESULT_FILE"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="gcc",
                                            BuildPath=buildpath,
                                            File=m.group("file"),
                                            Line=m.group("line"),
                                            Message=m.group("message"),
                                            ID=m.group("id"),
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

python do_sca_gcc() {
    import re
    import bb
    import os

    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_GCC_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_GCC_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "gcc-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "gcc-{}-fatal".format(d.getVar("SCA_MODE"))))

    tmp_result = os.path.join(d.getVar("T", True), "sca_raw_gcc.txt")
    d.setVar("SCA_RAW_RESULT_FILE", tmp_result)
    
    if not os.path.exists(os.path.join(d.getVar("T"), "log.do_compile")):
        with open(tmp_result, "w") as f:
            f.write("")
        content = ""
    else:
        f = open("%s/log.do_compile" % d.getVar("T"), "r")
        content = f.read()
        f.close()
    
    pattern = r"^(?P<file>.*):(?P<line>\d+):(?P<column>\d+):\s+(?P<severity>\w+):\s+(?P<message>.*)\s\[-(?P<id>.*)\]"
    with open(tmp_result, "w") as f:
        x = re.findall(r"^.*:\d+:\d+:\s+(?:warning|error).*$", content, re.MULTILINE)
        for l in x:
            for m in re.finditer(pattern, l, re.MULTILINE):
                f.write(l + "\n")
        if not x:
            f.write("")
        f.close()

    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/gcc.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_gcc(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "gcc", get_fatal_entries(d))
}

SCA_DEPLOY_TASK = "do_sca_deploy_gcc"

python do_sca_deploy_gcc() {
    sca_conv_deploy(d, "gcc", "txt")
}

addtask do_sca_gcc before do_install after do_compile
addtask do_sca_deploy_gcc after do_sca_gcc before do_package

do_sca_gcc[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_gcc[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "sca-recipe-gcc-rules-native gcc-sca-native"