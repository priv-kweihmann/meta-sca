## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_RUBYCRITIC_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_RUBYCRITIC_EXTRA_FATAL ?= ""
SCA_RUBYCRITIC_FILE_FILTER ?= ".rb"

SCA_RAW_RESULT_FILE[rubycritic] = "json"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress
inherit sca-tracefiles

def do_sca_conv_rubycritic(d):
    import os
    import json
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")
    
    _findings = []
    _suppress = sca_suppress_init(d, "SCA_RUBYCRITIC_EXTRA_SUPPRESS",
                                  d.expand("${STAGING_DATADIR_NATIVE}/rubycritic-${SCA_MODE}-suppress"))

    if os.path.exists(sca_raw_result_file(d, "rubycritic")):
        content = []
        with open(sca_raw_result_file(d, "rubycritic"), "r") as f:
            try:
                content = json.load(f)
            except json.JSONDecodeError:
                content = {}
            for item in content["analysed_modules"]:
                if not "smells" in item:
                    continue
                for f in item["smells"]:
                    try:
                        g = sca_get_model_class(d,
                                                PackageName=package_name,
                                                BuildPath=buildpath,
                                                Tool="rubycritic",
                                                File=f["locations"][0]["path"],
                                                Line=str(f["locations"][0]["line"]),
                                                Message=f["message"],
                                                ID=f["type"],
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

python do_sca_rubycritic() {
    import os
    import json
    import shutil
    import subprocess

    cmd_output = ""

    ## Run
    os.environ["RUBYLIB"] = os.path.join(d.getVar("STAGING_LIBDIR_NATIVE"), "ruby/")
    os.environ["GEM_DIR"] = os.path.join(d.getVar("STAGING_LIBDIR_NATIVE"), "ruby/gems/")
    os.environ["GEM_HOME"] = os.path.join(d.getVar("STAGING_LIBDIR_NATIVE"), "ruby/gems/")
    os.environ["GEM_PATH"] = os.path.join(d.getVar("STAGING_LIBDIR_NATIVE"), "ruby/gems/")

    _args = ["rubycritic"]
    _args += ["--format=json"]
    _args += ["--path={}".format(d.expand("${T}/rubycritic"))]
    
    _files = get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), ".*ruby", d.getVar("SCA_RUBYCRITIC_FILE_FILTER"), \
                                                sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))
    
    if any(_files):    
        try:
            subprocess.check_call(_args + _files, universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            pass

    if os.path.exists(d.expand("${T}/rubycritic/report.json")):
        try:
            shutil.copy(d.expand("${T}/rubycritic/report.json"), sca_raw_result_file(d, "rubycritic"))
        except:
            pass
}

python do_sca_rubycritic_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/rubycritic.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_rubycritic(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "rubycritic", get_fatal_entries(d, "SCA_RUBYCRITIC_EXTRA_FATAL",
                       d.expand("${STAGING_DATADIR_NATIVE}/rubycritic-${SCA_MODE}-fatal")))
}

SCA_DEPLOY_TASK = "do_sca_deploy_rubycritic"

python do_sca_deploy_rubycritic() {
    sca_conv_deploy(d, "rubycritic")
}

do_sca_rubycritic[doc] = "Lint ruby scripts with rubycritic"
do_sca_rubycritic_report[doc] = "Report findings of do_sca_rubycritic"
do_sca_deploy_rubycritic[doc] = "Deploy results of do_sca_rubycritic"
addtask do_sca_rubycritic after do_configure before do_sca_tracefiles
addtask do_sca_rubycritic_report after do_sca_tracefiles
addtask do_sca_deploy_rubycritic after do_sca_rubycritic_report before do_package

DEPENDS += "rubycritic-native sca-recipe-rubycritic-rules-native"
