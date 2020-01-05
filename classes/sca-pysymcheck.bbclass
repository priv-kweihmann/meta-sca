## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_PYSYMCHECK_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_PYSYMCHECK_EXTRA_FATAL ?= ""
## Used rule file
SCA_PYSYMCHECK_RULE_FILE ?= "basic_rules.json"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress

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

    _suppress = sca_suppress_init(d)
    _excludes = sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA"))

    _findings = []

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        with open(d.getVar("SCA_RAW_RESULT_FILE"), "r") as f:
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
                    if g.File in _excludes:
                        continue
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

python do_sca_pysymcheck() {
    import os
    import subprocess
    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_PYSYMCHECK_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_PYSYMCHECK_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "pysymcheck-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "pysymcheck-{}-fatal".format(d.getVar("SCA_MODE"))))

    _args = ["python3", os.path.join(d.getVar("STAGING_BINDIR_NATIVE"), "pysymbolcheck", "pysymbolcheck.py")]
    _args += ["--libpath", ":".join([d.getVar("STAGING_LIBDIR_NATIVE")])]
    _args += [os.path.join(d.getVar("STAGING_BINDIR_NATIVE"), "pysymbolcheck", d.getVar("SCA_PYSYMCHECK_RULE_FILE"))]

    if not os.path.exists(os.path.join(d.getVar("STAGING_BINDIR_NATIVE"), "pysymbolcheck", d.getVar("SCA_PYSYMCHECK_RULE_FILE"))):
        bb.warn("Rule-File {} does not exists - Empty results will be expected".format(d.getVar("SCA_PYSYMCHECK_RULE_FILE")))

    _files = get_files_by_mimetype(d, d.getVar("B"), ["application/x-executable", 'application/x-sharedlib'],\
                                   sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))
    ## Run
    cmd_output = ""
    tmp_result = os.path.join(d.getVar("T", True), "sca_raw_pysymcheck.txt")
    d.setVar("SCA_RAW_RESULT_FILE", tmp_result)
    for _f in _files:
        try:
            cmd_output += subprocess.check_output(_args + [_f], universal_newlines=True)
        except subprocess.CalledProcessError as e:
            cmd_output += e.stdout or ""
    with open(tmp_result, "w") as o:
        o.write(cmd_output)
    
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/pysymcheck.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_pysymcheck(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "pysymcheck", get_fatal_entries(d))
}

SCA_DEPLOY_TASK = "do_sca_deploy_pysymcheck"

python do_sca_deploy_pysymcheck() {
    sca_conv_deploy(d, "pysymcheck", "txt")
}

addtask do_sca_pysymcheck before do_install after do_compile
addtask do_sca_deploy_pysymcheck after do_sca_pysymcheck before do_package

do_sca_pysymcheck[depends] += "${@oe.utils.conditional('SCA_FORCE_RUN', '1', '${PN}:do_sca_do_force_meta_task', '', d)}"
do_sca_deploy_pysymcheck[depends] += "${@oe.utils.conditional('SCA_FORCE_RUN', '1', '${PN}:do_sca_do_force_meta_task', '', d)}"

DEPENDS += "python3-pysymbolcheck-native sca-recipe-pysymcheck-rules-native"
