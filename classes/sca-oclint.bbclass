## Add ids to suppress on a recipe level
SCA_OCLINT_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_OCLINT_EXTRA_FATAL ?= ""
## Additional absolute paths to additional include dirs
## can be seperated by spaces
SCA_OCLINT_ADD_INCLUDES ?= ""
## File extension filter
SCA_OCLINT_FILE_FILTER ?= ".c .cpp"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper

def do_sca_conv_oclint(d):
    import os
    import re
    import json
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    items = []

    severity_map = {
        "1" : "error",
        "2" : "warning",
        "3" : "info"
    }

    __suppress = get_suppress_entries(d)

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        io = {}
        with open(d.getVar("SCA_RAW_RESULT_FILE")) as i:
            try:
                io = json.load(i)
            except:
                pass
        if "violation" in io.keys():
            for item in io["violation"]:
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="oclint",
                                            BuildPath=buildpath,
                                            File=item["path"],
                                            Column=str(item["startColumn"]),
                                            Line=str(item["startLine"]),
                                            Message=item["message"].strip() or item["rule"],
                                            ID=item["rule"].replace(" ", "_"),
                                            Severity=severity_map[str(item["priority"])])
                    if g.GetPlainID() in __suppress:
                        continue
                    if g.Severity in sca_allowed_warning_level(d):
                        sca_add_model_class(d, g)
                except Exception as e:
                    bb.note(str(e))

    return sca_save_model_to_string(d)

python do_sca_oclint() {
    import os
    import subprocess
    import glob

    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_OCLINT_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_OCLINT_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "oclint-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "oclint-{}-suppress".format(d.getVar("SCA_MODE"))))

    _add_include = d.getVar("SCA_OCLINT_ADD_INCLUDES", True).split(" ")

    inc_dirs = [d.getVar("SCA_SOURCES_DIR"), 
                os.path.join(d.getVar("SCA_SOURCES_DIR"), "include"),
                os.path.join(d.getVar("STAGING_DIR"), "include"),
                d.getVar("STAGING_INCDIR")]
    if d.getVar("SCA_OCLINT_ADD_INCLUDES"):
        inc_dirs += d.getVar("SCA_OCLINT_ADD_INCLUDES").split(" ")

    _args = [os.path.join(d.getVar("STAGING_BINDIR_NATIVE"), "oclint", "bin", "oclint")]
    _args += ["-report-type", "json"]
    for item in inc_dirs:
       _args += ["-extra-arg", "-I{}".format(item)]

    compile_json = []
    _files = get_files_by_extention(d, d.getVar("SCA_SOURCES_DIR"), d.getVar("SCA_OCLINT_FILE_FILTER").split(" "), \
                                    sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))
    for _f in _files:
        compile_json.append(
            {
                "directory": d.getVar("B"),
                "file": _f,
                "command": "{} -c {}".format(os.environ.get("CC", "gcc"), _f)
            }
        )

    import json
    with open(os.path.join(d.getVar("B"), "compile_commands.json"), "w") as o:
        json.dump(compile_json, o)

    cmd_output = ""
    
    if any(_files):
        try:
            cmd_output += subprocess.check_output(_args + _files, universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            cmd_output += e.stdout or ""

    ## Only the first line is on interest
    cmd_output = cmd_output.split("\n")[0]

    if os.path.exists(os.path.join(d.getVar("B"), "compile_commands.json")):
        os.remove(os.path.join(d.getVar("B"), "compile_commands.json"))

    raw_file = os.path.join(d.getVar("T", True), "sca_raw_oclint.json")
    d.setVar("SCA_RAW_RESULT_FILE", raw_file)
    with open(raw_file, "w") as o:
        o.write(cmd_output)
    
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/oclint.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_oclint(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "oclint", get_fatal_entries(d))
}

SCA_DEPLOY_TASK = "do_sca_deploy_oclint"

python do_sca_deploy_oclint() {
    sca_conv_deploy(d, "oclint", "json")
}

addtask do_sca_oclint before do_install after do_compile
addtask do_sca_deploy_oclint after do_sca_oclint before do_package

DEPENDS += "oclint-native sca-recipe-oclint-rules-native"
