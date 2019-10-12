## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_PROGPILOT_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_PROGPILOT_EXTRA_FATAL ?= ""
SCA_PROGPILOT_FILE_FILTER ?= ".php"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper

def do_sca_conv_progpilot(d):
    import os
    import json
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")
    
    _findings = []
    _suppress = get_suppress_entries(d)

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        content = []
        with open(d.getVar("SCA_RAW_RESULT_FILE"), "r") as f:
            try:
                content = json.load(f)
            except json.JSONDecodeError:
                pass
            for m in content:
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            BuildPath=buildpath,
                                            Tool="progpilot",
                                            File=m["sink_file"],
                                            Line=str(m["sink_line"]),
                                            Column=str(m["sink_column"]),
                                            Message="{}: {}".format(m["vuln_name"], m["vuln_type"]),
                                            ID=m["vuln_cwe"],
                                            Severity="error")
                    if g.GetFormattedID() in _suppress:
                        continue
                    if not sca_is_in_finding_scope(d, "progpilot", g.GetFormattedID()):
                        continue
                    if g.Severity in sca_allowed_warning_level(d):
                        _findings.append(g)
                except Exception as exp:
                    bb.warn(str(exp))

    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_progpilot() {
    import os
    import subprocess
    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_PROGPILOT_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_PROGPILOT_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "progpilot-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "progpilot-{}-fatal".format(d.getVar("SCA_MODE"))))

    tmp_result = os.path.join(d.getVar("T", True), "sca_raw_progpilot.json")
    d.setVar("SCA_RAW_RESULT_FILE", tmp_result)
    cmd_output = ""

    ## Run
    _args = [os.path.join(d.getVar("STAGING_BINDIR_NATIVE"), "progpilot/vendor/bin/progpilot")]
    _args += ["--ansi"]
    _args += ["-n"]
   
    _files = get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), ".*php", [".php"], \
                                                sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))
    
    if any(_files): 
        try:
            cmd_output += subprocess.check_output(_args + _files, universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            cmd_output += e.stdout or ""

    with open(tmp_result, "w") as o:
        o.write(cmd_output)
    
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/progpilot.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_progpilot(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "progpilot", get_fatal_entries(d))
}

SCA_DEPLOY_TASK = "do_sca_deploy_progpilot"

python do_sca_deploy_progpilot() {
    sca_conv_deploy(d, "progpilot", "json")
}

do_compile[postfuncs] += "do_sca_progpilot"
do_package[prefuncs] += "do_sca_deploy_progpilot"

do_sca_progpilot[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_progpilot[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "progpilot-native sca-recipe-progpilot-rules-native"
