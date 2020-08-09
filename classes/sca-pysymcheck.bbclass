## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_PYSYMCHECK_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_PYSYMCHECK_EXTRA_FATAL ?= ""
## Used rule file
SCA_PYSYMCHECK_RULE_FILE ?= "${STAGING_DATADIR_NATIVE}/pysymbolcheck/basic_rules.json"

SCA_RAW_RESULT_FILE[pysymcheck] = "txt"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress
inherit python3native

def do_sca_conv_pysymcheck(d):
    import os
    import re
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^(?P<file>.*):(?P<severity>.*):(?P<id>.*):\s+(?P<message>.*)"

    severity_map = {
        "error" : "error",
        "warning" : "warning",
        "info": "info"
    }

    _suppress = sca_suppress_init(d, "SCA_PYSYMCHECK_EXTRA_SUPPRESS",
                                  d.expand("${STAGING_DATADIR_NATIVE}/pysymcheck-${SCA_MODE}-suppress"),
                                  file_trace=False)

    _findings = []

    if os.path.exists(sca_raw_result_file(d, "pysymcheck")):
        with open(sca_raw_result_file(d, "pysymcheck"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="pysymcheck",
                                            BuildPath=buildpath,
                                            File=m.group("file"),
                                            Message=m.group("message"),
                                            ID=m.group("id"),
                                            Severity=severity_map[m.group("severity")])
                    if _suppress.Suppressed(g):
                        continue
                    if g.Severity in sca_allowed_warning_level(d):
                        _findings.append(g)
                except Exception as exp:
                    bb.warn(str(exp))

    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_pysymcheck() {
    import os
    import subprocess

    _args = ["pysymbolcheck"]
    _args += ["--libpath", ":".join([d.getVar("STAGING_LIBDIR_NATIVE")])]
    _args += [d.getVar("SCA_PYSYMCHECK_RULE_FILE")]

    if not os.path.exists(os.path.join(d.getVar("STAGING_BINDIR_NATIVE"), "pysymbolcheck", d.getVar("SCA_PYSYMCHECK_RULE_FILE"))):
        bb.warn("Rule-File {} does not exists - Empty results will be expected".format(d.getVar("SCA_PYSYMCHECK_RULE_FILE")))

    _files = get_files_by_mimetype(d, d.getVar("D"), 
                                  ["application/x-executable", 'application/x-sharedlib',
                                   "application/x-pie-executable", "application/x-pie-sharedlib"],
                                   sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))
    ## Run
    cmd_output = exec_wrap_check_output(_args, _files, chunk_size=1)
    with open(sca_raw_result_file(d, "pysymcheck"), "w") as o:
        o.write(cmd_output)
    
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/pysymcheck.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_pysymcheck(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "pysymcheck", get_fatal_entries(d, "SCA_PYSYMCHECK_EXTRA_FATAL",
                        d.expand("${STAGING_DATADIR_NATIVE}/pysymcheck-${SCA_MODE}-fatal")))
}

SCA_DEPLOY_TASK = "do_sca_deploy_pysymcheck"

python do_sca_deploy_pysymcheck() {
    sca_conv_deploy(d, "pysymcheck")
}

do_sca_pysymcheck[doc] = "Find forbidden function linkage"
do_sca_deploy_pysymcheck[doc] = "Deploy results of do_sca_pysymcheck"
addtask do_sca_pysymcheck after do_install
addtask do_sca_deploy_pysymcheck after do_sca_pysymcheck before do_package

DEPENDS += "python3-pysymbolcheck-native sca-recipe-pysymcheck-rules-native"
