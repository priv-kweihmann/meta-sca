## Add ids to suppress on a recipe level
SCA_RETIRE_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_RETIRE_EXTRA_FATAL ?= ""
## File extension filter list (whitespace separated)
SCA_RETIRE_FILE_FILTER ?= ".js .json"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper

def do_sca_conv_retire(d):
    import os
    import json
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    items = []

    _findings = []

    _severity_map = {
        "critical" : "error",
        "high": "error",
        "medium": "warning",
        "low": "info"
    }

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        content = []
        with open(d.getVar("SCA_RAW_RESULT_FILE"), "r") as f:
            try:
                content = json.load(f)
            except json.JSONDecodeError as e:
                bb.warn(str(e))
            for item in content:
                try:
                    _file = item["file"]
                    for results in item["results"]:
                        _component = results["component"]
                        for vul in results["vulnerabilities"]:
                            g = sca_get_model_class(d,
                                                    PackageName=package_name,
                                                    Tool="retire",
                                                    BuildPath=buildpath,
                                                    File=_file,
                                                    Message="{}: Used version has a known vulnerability of {}".format(_component, vul["identifiers"]["summary"]),
                                                    ID="knownVulnerability",
                                                    Severity=_severity_map[vul["severity"]])
                            if not sca_is_in_finding_scope(d, "retire", g.GetFormattedID()):
                                continue
                            if g.Severity in sca_allowed_warning_level(d):
                                _findings.append(g)
                except Exception as e:
                    bb.warn(str(e))
    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_retire() {
    import os
    import subprocess
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_RETIRE_EXTRA_FATAL"))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "retire-{}-fatal".format(d.getVar("SCA_MODE"))))

    _args = ["retire", "-c", "--outputformat", "jsonsimple", "--path", d.getVar("SCA_SOURCES_DIR")]

    cmd_output = ""
    tmp_result = os.path.join(d.getVar("T", True), "sca_raw_retire.json")
    d.setVar("SCA_RAW_RESULT_FILE", tmp_result)

    _files = get_files_by_extention(d, 
                                    d.getVar("SCA_SOURCES_DIR"), 
                                    clean_split(d, "SCA_RETIRE_FILE_FILTER"), 
                                    sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    ## Run
    if any(_files):
        try:
            cmd_output = subprocess.check_output(_args, universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            cmd_output = e.stdout or ""
    with open(tmp_result, "w") as o:
        if not cmd_output:
            cmd_output = "[]"
        o.write(cmd_output)
    
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/retire.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_retire(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "retire", get_fatal_entries(d))
}

SCA_DEPLOY_TASK = "do_sca_deploy_retire"

python do_sca_deploy_retire() {
    sca_conv_deploy(d, "retire", "json")
}

addtask do_sca_retire before do_package after do_install
addtask do_sca_deploy_retire after do_sca_retire before do_package

do_sca_retire[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_retire[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "retire-native sca-recipe-retire-rules-native"
