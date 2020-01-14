## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_FLAWFINDER_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_FLAWFINDER_EXTRA_FATAL ?= ""
## File extension filter list (whitespace separated)
SCA_FLAWFINDER_FILE_FILTER ?= ".c .cpp .h .hpp"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress

def do_sca_conv_flawfinder(d):
    import os
    import re
    import hashlib
    
    package_name = d.getVar("PN", True)
    buildpath = d.getVar("SCA_SOURCES_DIR", True)

    items = []
    pattern = r"^(?P<file>.*):(?P<line>\d+):\s+\[(?P<severity>\d+)\]\s+\(.*\)\s+(?P<id>.*):(?P<msg>.*)"

    severity_map = {
        "5" : "error",
        "4" : "error",
        "3" : "warning",
        "2" : "warning",
        "1" : "info"
    }

    _suppress = sca_suppress_init(d)
    _findings = []

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE", True)):
        with open(d.getVar("SCA_RAW_RESULT_FILE", True), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="flawfinder",
                                            BuildPath=buildpath,
                                            File=m.group("file"),
                                            Line=m.group("line"),
                                            Message=m.group("msg"),
                                            ID=m.group("id"),
                                            Severity=severity_map[m.group("severity").strip()])
                    if _suppress.Suppressed(g):
                        continue
                    if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                        continue
                    if g.Severity in sca_allowed_warning_level(d):
                        _findings.append(g)
                except Exception:
                    pass
    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_flawfinder() {
    import os
    import subprocess
    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_FLAWFINDER_EXTRA_SUPPRESS", True))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_FLAWFINDER_EXTRA_FATAL", True))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "flawfinder-{}-suppress".format(d.getVar("SCA_MODE", True))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "flawfinder-{}-fatal".format(d.getVar("SCA_MODE", True))))

    _args = ["flawfinder"]
    _args += ["--dataonly"]
    _args += ["--quiet"]
    _args += ["--singleline"]
    _files = get_files_by_extention(d, 
                                    d.getVar("SCA_SOURCES_DIR", True), 
                                    clean_split(d, "SCA_FLAWFINDER_FILE_FILTER"), 
                                    sca_filter_files(d, d.getVar("SCA_SOURCES_DIR", True), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    ## Run
    cmd_output = ""
    tmp_result = os.path.join(d.getVar("T", True), "sca_raw_flawfinder.txt")
    d.setVar("SCA_RAW_RESULT_FILE", tmp_result)

    if any(_files):
        try:
            cmd_output = subprocess.check_output(_args + _files, universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            cmd_output = e.output or ""
    with open(tmp_result, "w") as o:
        o.write(cmd_output)
    
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/flawfinder.dm".format(d.getVar("T", True)))
    dm_output = do_sca_conv_flawfinder(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE", True), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "flawfinder", get_fatal_entries(d))
}

SCA_DEPLOY_TASK = "do_sca_deploy_flawfinder"

python do_sca_deploy_flawfinder() {
    sca_conv_deploy(d, "flawfinder", "txt")
}

addtask do_sca_flawfinder before do_install after do_compile
addtask do_sca_deploy_flawfinder after do_sca_flawfinder before do_package

do_sca_flawfinder[depends] += "${@oe.utils.conditional('SCA_FORCE_RUN', '1', '${PN}:do_sca_do_force_meta_task', '', d)}"
do_sca_deploy_flawfinder[depends] += "${@oe.utils.conditional('SCA_FORCE_RUN', '1', '${PN}:do_sca_do_force_meta_task', '', d)}"

DEPENDS += "python3-flawfinder-native sca-recipe-flawfinder-rules-native"
