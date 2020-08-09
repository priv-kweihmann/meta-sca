## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_REEK_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_REEK_EXTRA_FATAL ?= ""
SCA_REEK_FILE_FILTER ?= ".rb"

SCA_RAW_RESULT_FILE[reek] = "json"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress
inherit sca-tracefiles

def do_sca_conv_reek(d):
    import os
    import json
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")
    
    _findings = []
    _suppress = sca_suppress_init(d, "SCA_REEK_EXTRA_SUPPRESS", 
                                  d.expand("${STAGING_DATADIR_NATIVE}/reek-${SCA_MODE}-suppress"))

    if os.path.exists(sca_raw_result_file(d, "reek")):
        content = []
        with open(sca_raw_result_file(d, "reek"), "r") as f:
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

    os.environ["RUBYLIB"] = os.path.join(d.getVar("STAGING_LIBDIR_NATIVE"), "ruby/")
    os.environ["GEM_DIR"] = os.path.join(d.getVar("STAGING_LIBDIR_NATIVE"), "ruby/gems/")
    os.environ["GEM_HOME"] = os.path.join(d.getVar("STAGING_LIBDIR_NATIVE"), "ruby/gems/")
    os.environ["GEM_PATH"] = os.path.join(d.getVar("STAGING_LIBDIR_NATIVE"), "ruby/gems/")

    _args = ["reek"]
    _args += ["-f", "json"]
    
    _files = get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), ".*ruby", d.getVar("SCA_REEK_FILE_FILTER"), \
                                                sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))
    ## Run
    cmd_output = exec_wrap_check_output(_args, _files, combine=exec_wrap_combine_json, default_val={})

    with open(sca_raw_result_file(d, "reek"), "w") as o:
        o.write(cmd_output)
}

python do_sca_reek_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/reek.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_reek(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "reek", get_fatal_entries(d, "SCA_REEK_EXTRA_FATAL", 
                       d.expand("${STAGING_DATADIR_NATIVE}/reek-${SCA_MODE}-fatal")))
}

SCA_DEPLOY_TASK = "do_sca_deploy_reek"

python do_sca_deploy_reek() {
    sca_conv_deploy(d, "reek")
}

do_sca_reek[doc] = "Lint ruby scripts with reek"
do_sca_reek_report[doc] = "Report findings of do_sca_reek"
do_sca_deploy_reek[doc] = "Deploy results of do_sca_reek"
addtask do_sca_reek after do_configure before do_sca_tracefiles
addtask do_sca_reek_report after do_sca_tracefiles
addtask do_sca_deploy_reek after do_sca_reek_report before do_package

DEPENDS += "reek-native sca-recipe-reek-rules-native"
