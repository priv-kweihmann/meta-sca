## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_RUBYCRITIC_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_RUBYCRITIC_EXTRA_FATAL ?= ""
SCA_RUBYCRITIC_FILE_FILTER ?= ".rb"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress

def do_sca_conv_rubycritic(d):
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
    import subprocess
    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_RUBYCRITIC_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_RUBYCRITIC_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "rubycritic-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "rubycritic-{}-fatal".format(d.getVar("SCA_MODE"))))

    tmp_result = d.expand("${T}/rubycritic/report.json")
    d.setVar("SCA_RAW_RESULT_FILE", tmp_result)
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
            with open(tmp_result, "w") as o:
                json.dump({"analysed_modules": []}, o)   
    
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/rubycritic.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_rubycritic(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "rubycritic", get_fatal_entries(d))
}

SCA_DEPLOY_TASK = "do_sca_deploy_rubycritic"

python do_sca_deploy_rubycritic() {
    sca_conv_deploy(d, "rubycritic", "json")
}

do_sca_rubycritic[doc] = "Lint ruby scripts with rubycritic"
do_sca_deploy_rubycritic[doc] = "Deploy results of do_sca_rubycritic"
addtask do_sca_rubycritic before do_install after do_configure
addtask do_sca_deploy_rubycritic after do_sca_rubycritic before do_package

DEPENDS += "rubycritic-native sca-recipe-rubycritic-rules-native"
