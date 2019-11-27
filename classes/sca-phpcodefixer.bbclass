## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_PHPCODEFIXER_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_PHPCODEFIXER_EXTRA_FATAL ?= ""
SCA_PHPCODEFIXER_FILE_FILTER ?= ".php"
## Set explicit php-version to be checked against, default auto pick
SCA_PHPCODEFIXER_PHP_VERSION ?= ""

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress

def do_sca_conv_phpcodefixer(d):
    import os
    import json
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")
    
    _findings = []
    _suppress = sca_suppress_init(d)

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        content = []
        with open(d.getVar("SCA_RAW_RESULT_FILE"), "r") as f:
            try:
                content = json.load(f)
            except json.JSONDecodeError:
                content = {"problems": []}
            for m in content["problems"]:
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            BuildPath=buildpath,
                                            Tool="phpcodefixer",
                                            File=os.path.join(m["path"], m["file"]),
                                            Line=str(m["line"]),
                                            Message="{}: {} since PHP version {}".format(m["type"], m["category"], m["version"]),
                                            ID=m["checker"],
                                            Severity="error")
                    if _suppress.Suppressed(g):
                        continue
                    if not sca_is_in_finding_scope(d, "phpcodefixer", g.GetFormattedID()):
                        continue
                    if g.Severity in sca_allowed_warning_level(d):
                        _findings.append(g)
                except Exception as exp:
                    bb.warn(str(exp))

    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_phpcodefixer() {
    import os
    import subprocess
    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_PHPCODEFIXER_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_PHPCODEFIXER_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "phpcodefixer-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "phpcodefixer-{}-fatal".format(d.getVar("SCA_MODE"))))

    tmp_result = os.path.join(d.getVar("T", True), "sca_raw_phpcodefixer.json")
    d.setVar("SCA_RAW_RESULT_FILE", tmp_result)
    cmd_output = ""

    ## Run
    _args = [os.path.join(d.getVar("STAGING_BINDIR_NATIVE"), "phpcodefixer/vendor/bin/phpcf")]
    _args += ["--max-size=1000mb"]
    _args += ["--output-json=-"]
    _args += ["--ansi"]
    if d.getVar("SCA_PHPCODEFIXER_PHP_VERSION"):
        _args += ["--target={}".format(d.getVar("SCA_PHPCODEFIXER_PHP_VERSION"))]
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
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/phpcodefixer.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_phpcodefixer(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "phpcodefixer", get_fatal_entries(d))
}

SCA_DEPLOY_TASK = "do_sca_deploy_phpcodefixer"

python do_sca_deploy_phpcodefixer() {
    sca_conv_deploy(d, "phpcodefixer", "json")
}

addtask do_sca_phpcodefixer before do_install after do_configure
addtask do_sca_deploy_phpcodefixer after do_sca_phpcodefixer before do_package

do_sca_phpcodefixer[depends] += "${@oe.utils.conditional('SCA_FORCE_RUN', '1', '${PN}:do_sca_do_force_meta_task', '', d)}"
do_sca_deploy_phpcodefixer[depends] += "${@oe.utils.conditional('SCA_FORCE_RUN', '1', '${PN}:do_sca_do_force_meta_task', '', d)}"

DEPENDS += "phpcodefixer-native sca-recipe-phpcodefixer-rules-native"
