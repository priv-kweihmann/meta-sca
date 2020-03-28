## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_REEK_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_REEK_EXTRA_FATAL ?= ""
SCA_REEK_FILE_FILTER ?= ".rb"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress

def do_sca_conv_reek(d):
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
                content = {}
            for item in content:
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            BuildPath=buildpath,
                                            Tool="reek",
                                            File=item["source"],
                                            Line=str(item["lines"][0]),
                                            Message=item["message"],
                                            ID=item["smell_type"],
                                            Severity="warning")
                    if _suppress.Suppressed(g):
                        continue
                    if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                        continue
                    if g.Severity in sca_allowed_warning_level(d):
                        _findings.append(g)
                except Exception as exp:
                    bb.warn(str(exp))

    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_reek() {
    import os
    import subprocess
    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_REEK_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_REEK_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "reek-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "reek-{}-fatal".format(d.getVar("SCA_MODE"))))

    tmp_result = os.path.join(d.getVar("T", True), "sca_raw_reek.json")
    d.setVar("SCA_RAW_RESULT_FILE", tmp_result)
    cmd_output = ""

    ## Run
    os.environ["RUBYLIB"] = os.path.join(d.getVar("STAGING_LIBDIR_NATIVE"), "ruby/")
    os.environ["GEM_DIR"] = os.path.join(d.getVar("STAGING_LIBDIR_NATIVE"), "ruby/gems/")
    os.environ["GEM_HOME"] = os.path.join(d.getVar("STAGING_LIBDIR_NATIVE"), "ruby/gems/")
    os.environ["GEM_PATH"] = os.path.join(d.getVar("STAGING_LIBDIR_NATIVE"), "ruby/gems/")

    _args = ["reek"]
    _args += ["-f", "json"]
    
    _files = get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), ".*ruby", d.getVar("SCA_REEK_FILE_FILTER"), \
                                                sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))
    
    if any(_files):    
        try:
            cmd_output += subprocess.check_output(_args + _files, universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            cmd_output += e.stdout or ""

    with open(tmp_result, "w") as o:
        o.write(cmd_output)
    
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/reek.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_reek(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "reek", get_fatal_entries(d))
}

SCA_DEPLOY_TASK = "do_sca_deploy_reek"

python do_sca_deploy_reek() {
    sca_conv_deploy(d, "reek", "json")
}

do_sca_reek[doc] = "Lint ruby scripts with reek"
do_sca_deploy_reek[doc] = "Deploy results of do_sca_reek"
addtask do_sca_reek before do_install after do_configure
addtask do_sca_deploy_reek after do_sca_reek before do_package

DEPENDS += "reek-native sca-recipe-reek-rules-native"
