## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_NPMAUDIT_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_NPMAUDIT_EXTRA_FATAL ?= ""

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper

def do_sca_conv_npmaudit(d, cmd_output=""):
    import os
    import json
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    items = []
    severity_map = {
        "critical" : "error",
        "high" : "error",
        "moderate" : "warning",
        "low" : "info"
    }

    _suppress = get_suppress_entries(d)
    _findings = []

    ## Result file parsing
    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        io = {}
        with open(d.getVar("SCA_RAW_RESULT_FILE")) as i:
            try:
                io = json.load(i)
                io = io["advisories"]
            except:
                io = {}
        for k,v in io.items():
            try:
                g = sca_get_model_class(d,
                                        PackageName=package_name,
                                        Tool="npmaudit",
                                        File=d.getVar("FILE"),
                                        Message=v["title"],
                                        ID=str(v["id"]),
                                        Severity=severity_map[v["severity"]])
                if g.GetFormattedID() in _suppress:
                    continue
                if not sca_is_in_finding_scope(d, "npmaudit", g.GetFormattedID()):
                    continue
                if g.Severity in sca_allowed_warning_level(d):
                    _findings.append(g)
            except Exception as e:
                bb.warn(str(e))

    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_npmaudit() {
    import os
    import subprocess
    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_NPMAUDIT_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_NPMAUDIT_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "npmaudit-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "npmaudit-{}-fatal".format(d.getVar("SCA_MODE"))))

    tmp_result = os.path.join(d.getVar("T", True), "sca_raw_npmaudit.json")
    d.setVar("SCA_RAW_RESULT_FILE", tmp_result)
    cmd_output = "{}"

    ## Run
    
    if os.path.exists(os.path.join(d.getVar("SCA_SOURCES_DIR"), "package-lock.json")):
        cur_dir = os.getcwd()
        os.chdir(d.getVar("SCA_SOURCES_DIR"))
        _args = ["npm", "audit", "--json"]
        
        try:
            cmd_output = subprocess.check_output(_args, universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            cmd_output = e.stdout or "{}"
        os.chdir(cur_dir)
    
    with open(tmp_result, "w") as o:
        o.write(cmd_output)
    
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/npmaudit.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_npmaudit(d, cmd_output)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "npmaudit", get_fatal_entries(d))
}

SCA_DEPLOY_TASK = "do_sca_deploy_npmaudit"

python do_sca_deploy_npmaudit() {
    sca_conv_deploy(d, "npmaudit", "json")
}

addtask do_sca_npmaudit before do_install after do_compile
addtask do_sca_deploy_npmaudit after do_sca_npmaudit before do_package

do_sca_npmaudit[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_npmaudit[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "npmaudit-sca-native sca-recipe-npmaudit-rules-native"
