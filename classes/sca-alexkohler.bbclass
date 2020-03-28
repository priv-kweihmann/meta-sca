## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_ALEXKOHLER_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_ALEXKOHLER_EXTRA_FATAL ?= ""
## File extension filter list (whitespace separated)
SCA_ALEXKOHLER_FILE_FILTER ?= ".go"
SCA_ALEXKOHLER_MODULES ?= "noret nargs nakedret dogsled prealloc identypo unimport"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress

def do_sca_conv_alexkohler(d):
    import os
    import re
    import hashlib
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    items = []
    pattern = r"^\[(?P<id>.*)\]\s+(?P<file>.*):(?P<line>\d+)\s+(?P<msg>.*)"

    _suppress = sca_suppress_init(d)
    _findings = []

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        with open(d.getVar("SCA_RAW_RESULT_FILE"), "r") as f:
            content = f.read()
            for m in re.finditer(pattern, content, re.MULTILINE):
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="alexkohler",
                                            BuildPath=buildpath,
                                            File=m.group("file"),
                                            Line=m.group("line"),
                                            Message=m.group("msg"),
                                            ID=m.group("id"),
                                            Severity="warning")
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

python do_sca_alexkohler() {
    import os
    import subprocess
    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_ALEXKOHLER_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_ALEXKOHLER_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "alexkohler-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "alexkohler-{}-fatal".format(d.getVar("SCA_MODE"))))

    cmd_output = ""
    tmp_result = os.path.join(d.getVar("T", True), "sca_raw_alexkohler.txt")
    d.setVar("SCA_RAW_RESULT_FILE", tmp_result)

    _files = get_files_by_extention(d,    
                                    d.getVar("SCA_SOURCES_DIR"),    
                                    clean_split(d, "SCA_ALEXKOHLER_FILE_FILTER"),    
                                    sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    ## Run
    if any(_files):
        for mod in clean_split(d, "SCA_ALEXKOHLER_MODULES"):
            try:
                tmp_output = subprocess.check_output([mod] + _files, universal_newlines=True, stderr=subprocess.STDOUT)
            except subprocess.CalledProcessError as e:
                tmp_output = e.stdout or ""
            tmp_output = tmp_output.replace("[", "\n[")
            lines = [x.strip() for x in tmp_output.split("\n") if x and not x.startswith("running on package")]
            lines = ["[{}] {}".format(mod, x) for x in lines]
            cmd_output += "\n".join(lines)
            cmd_output += "\n"
    with open(tmp_result, "w") as o:
        o.write(cmd_output)
    
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/alexkohler.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_alexkohler(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "alexkohler", get_fatal_entries(d))
}

SCA_DEPLOY_TASK = "do_sca_deploy_alexkohler"

python do_sca_deploy_alexkohler() {
    sca_conv_deploy(d, "alexkohler", "txt")
}

do_sca_alexkohler[doc] = "Lint go files with alex kohler tools"
addtask do_sca_alexkohler before do_compile after do_configure
do_sca_deploy_alexkohler[doc] = "Deploy results of do_sca_alexkohler"
addtask do_sca_deploy_alexkohler after do_sca_alexkohler before do_package

DEPENDS += "alexkohler-native sca-recipe-alexkohler-rules-native"
