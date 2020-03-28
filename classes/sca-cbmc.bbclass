## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_CBMC_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_CBMC_EXTRA_FATAL ?= ""
## File extension filter list (whitespace separated)
SCA_CBMC_FILE_FILTER ?= ".c"
## Checking modules of CBMC to activate
SCA_CBMC_MODULES ?= "\
                    --bounds-check \
                    --conversion-check \
                    --div-by-zero-check \
                    --float-overflow-check \
                    --memory-leak-check \
                    --nan-check \
                    --pointer-check \
                    --pointer-overflow-check \
                    --signed-overflow-check \
                    --undefined-shift-check \
                    --unsigned-overflow-check \
                    --validate-goto-model \
                    --validate-ssa-equation \
                    "
## Extra command line options for CBMC
SCA_CBMC_EXTRA_OPTIONS ?= ""

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress

def do_sca_conv_cbmc(d):
    import os
    import json
    import hashlib
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    items = []

    severity_map = {
        "ERROR" : "error",
        "WARNING" : "warning",
        "INFO" : "info"
    }

    _suppress = sca_suppress_init(d)
    _findings = []

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        with open(d.getVar("SCA_RAW_RESULT_FILE"), "r") as f:
            content = []
            try:
                content = json.load(f)
            except json.JSONDecodeError as e:
                bb.note(str(e))
            for item in content:
                try:
                    if "messageType" in item.keys() and \
                        item["messageType"] in ["WARNING", "ERROR"] and \
                        "sourceLocation" in item.keys():
                        ## Compiler issue
                        if os.path.isfile(item["sourceLocation"]["file"]):
                            g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="cbmc",
                                            BuildPath=buildpath,
                                            File=item["sourceLocation"]["file"],
                                            Line=item["sourceLocation"]["line"],
                                            Message=item["messageText"],
                                            ID=hashlib.md5(str.encode(item["messageText"])).hexdigest(),
                                            Severity=severity_map[item["messageType"]])
                            if _suppress.Suppressed(g):
                                continue
                            if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                                continue
                            if g.Severity in sca_allowed_warning_level(d):
                                _findings.append(g)
                    if "result" in item.keys():
                        for resitem in item["result"]:
                            if resitem["status"] == "FAILURE":
                                ## analyzer issue
                                _id = ".".join(resitem["property"].split(".")[1:])
                                _msg = resitem["description"]
                                for t in resitem["trace"]:
                                    if "stepType" in t.keys() and \
                                       t["stepType"] == "location-only" and \
                                       "sourceLocation" in t.keys() and \
                                       t["sourceLocation"] and \
                                       os.path.isfile(t["sourceLocation"]["file"]):
                                        g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="cbmc",
                                            BuildPath=buildpath,
                                            File=t["sourceLocation"]["file"],
                                            Line=t["sourceLocation"]["line"],
                                            Message=_msg,
                                            ID=_id,
                                            Severity="error")
                                        if _suppress.Suppressed(g):
                                            continue
                                        if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                                            continue
                                        if g.Severity in sca_allowed_warning_level(d):
                                            _findings.append(g)
                except Exception as e:
                    bb.warn(str(e))
    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_cbmc() {
    import os
    import subprocess
    from multiprocessing import Pool

    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_CBMC_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_CBMC_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "cbmc-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "cbmc-{}-fatal".format(d.getVar("SCA_MODE"))))

    _args = ["cbmc"]
    _args += clean_split(d, "SCA_CBMC_MODULES")
    _args += clean_split(d, "SCA_CBMC_EXTRA_OPTIONS")
    _args += ["--json-ui"]

    _files = get_files_by_extention(d, 
                                    d.getVar("SCA_SOURCES_DIR"), 
                                    clean_split(d, "SCA_CBMC_FILE_FILTER"), 
                                    sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    tmp_result = os.path.join(d.getVar("T"), "sca_raw_cbmc.json")
    d.setVar("SCA_RAW_RESULT_FILE", tmp_result)
    cmd_output = ""
    
    ## Run
    if any(_files):
        try:
            cmd_output = subprocess.check_output(_args + _files, universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            cmd_output = e.stdout or "[]"
    with open(tmp_result, "w") as o:
        o.write(cmd_output)
    
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/cbmc.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_cbmc(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "cbmc", get_fatal_entries(d))
}

SCA_DEPLOY_TASK = "do_sca_deploy_cbmc"

python do_sca_deploy_cbmc() {
    sca_conv_deploy(d, "cbmc", "json")
}

do_sca_cbmc[doc] = "Lint c files with cmbc"
do_sca_deploy_cbmc[doc] = "Deploy results of do_sca_cbmc"
addtask do_sca_cbmc before do_install after do_compile
addtask do_sca_deploy_cbmc after do_sca_cbmc before do_package

DEPENDS += "cbmc-native sca-recipe-cbmc-rules-native"
