## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_GOSEC_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_GOSEC_EXTRA_FATAL ?= ""
## File extension filter list (whitespace separated)
SCA_GOSEC_FILE_FILTER ?= ".go"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress

def do_sca_conv_gosec(d):
    import os
    import json
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    items = []

    _suppress = sca_suppress_init(d)
    _findings = []

    _severity_map = {
        "LOW": "warning",
        "MEDIUM": "warning",
        "HIGH": "error"
    }

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        content = {}
        with open(d.getVar("SCA_RAW_RESULT_FILE"), "r") as f:
            try:
                content = json.load(f)
            except json.JSONDecodeError:
                pass
        if "Issues" in content.keys():
            for item in content["Issues"]:
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="gosec",
                                            BuildPath=buildpath,
                                            File=item["file"],
                                            Line=item["line"],
                                            Message=item["details"],
                                            ID=item["rule_id"],
                                            Severity=_severity_map[item["severity"]])
                    if _suppress.Suppressed(g):
                        continue
                    if not sca_is_in_finding_scope(d, "gosec", g.GetFormattedID()):
                        continue
                    if g.Severity in sca_allowed_warning_level(d):
                        _findings.append(g)
                except Exception as e:
                    bb.warn(str(e))
    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_gosec() {
    import os
    import subprocess
    import json
    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_GOSEC_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_GOSEC_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "gosec-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "gosec-{}-fatal".format(d.getVar("SCA_MODE"))))

    _args = ["gosec", "-fmt=json"]

    tmp_result = os.path.join(d.getVar("T", True), "sca_raw_gosec.json")
    d.setVar("SCA_RAW_RESULT_FILE", tmp_result)

    _args += ["-out={}".format(tmp_result)]

    _files = get_files_by_extention(d, 
                                    d.getVar("SCA_SOURCES_DIR"), 
                                    clean_split(d, "SCA_GOSEC_FILE_FILTER"), 
                                    sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    ## Run
    if any(_files):
        try:
            subprocess.check_output(_args + [d.getVar("SCA_SOURCES_DIR")], universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError:
            pass
    
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/gosec.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_gosec(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "gosec", get_fatal_entries(d))
}

SCA_DEPLOY_TASK = "do_sca_deploy_gosec"

python do_sca_deploy_gosec() {
    sca_conv_deploy(d, "gosec", "json")
}

addtask do_sca_gosec before do_compile after do_configure
addtask do_sca_deploy_gosec after do_sca_gosec before do_package

do_sca_gosec[depends] += "${@oe.utils.conditional('SCA_FORCE_RUN', '1', '${PN}:do_sca_do_force_meta_task', '', d)}"
do_sca_deploy_gosec[depends] += "${@oe.utils.conditional('SCA_FORCE_RUN', '1', '${PN}:do_sca_do_force_meta_task', '', d)}"

DEPENDS += "gosec-native sca-recipe-gosec-rules-native"
