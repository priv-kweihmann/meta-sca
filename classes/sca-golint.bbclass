## Add ids to suppress on a recipe level
SCA_GOLINT_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_GOLINT_EXTRA_FATAL ?= ""
## File extension filter list (whitespace separated)
SCA_GOLINT_FILE_FILTER ?= ".go"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper

def do_sca_conv_golint(d):
    import os
    import re
    import hashlib
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    items = []
    pattern = r"^(?P<file>.*):(?P<line>\d+):(?P<col>\d+):\s*(?P<msg>.*)"

    _suppress = get_suppress_entries(d)
    _findings = []

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        with open(d.getVar("SCA_RAW_RESULT_FILE"), "r") as f:
            content = f.read()
            for m in re.finditer(pattern, content, re.MULTILINE):
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="golint",
                                            BuildPath=buildpath,
                                            File=m.group("file"),
                                            Column=m.group("col"),
                                            Line=m.group("line"),
                                            Message=m.group("msg"),
                                            ID=hashlib.md5(str.encode(m.group("msg"))).hexdigest(),
                                            Severity="warning")
                    if g.GetFormattedID() in _suppress:
                        continue
                    if not sca_is_in_finding_scope(d, "golint", g.GetFormattedID()):
                        continue
                    if g.Severity in sca_allowed_warning_level(d):
                        _findings.append(g)
                except Exception as e:
                    bb.warn(str(e))
    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_golint() {
    import os
    import subprocess
    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_GOLINT_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_GOLINT_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "golint-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "golint-{}-fatal".format(d.getVar("SCA_MODE"))))

    _args = ["golint"]

    cmd_output = ""
    tmp_result = os.path.join(d.getVar("T", True), "sca_raw_golint.txt")
    d.setVar("SCA_RAW_RESULT_FILE", tmp_result)

    _files = get_files_by_extention(d, 
                                    d.getVar("SCA_SOURCES_DIR"), 
                                    clean_split(d, "SCA_GOLINT_FILE_FILTER"), 
                                    sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    ## Run
    if any(_files):
        try:
            cmd_output = subprocess.check_output(_args + _files, universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            cmd_output = e.stdout or ""
    with open(tmp_result, "w") as o:
        o.write(cmd_output)
    
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/golint.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_golint(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "golint", get_fatal_entries(d))
}

SCA_DEPLOY_TASK = "do_sca_deploy_golint"

python do_sca_deploy_golint() {
    sca_conv_deploy(d, "golint", "txt")
}

addtask do_sca_golint before do_compile after do_configure
addtask do_sca_deploy_golint after do_sca_golint before do_package

do_sca_golint[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_golint[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "golint-sca-native sca-recipe-golint-rules-native"
