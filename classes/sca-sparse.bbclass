## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_SPARSE_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_SPARSE_EXTRA_FATAL ?= ""
## File extension filter list (whitespace separated)
SCA_SPARSE_FILE_FILTER ?= ".c"

SCA_SPARSE_WARNINGS = "\
                        -Wsparse-all \
                        "

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress

def do_sca_conv_sparse(d):
    import os
    import re
    import hashlib
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    items = []
    pattern = r"^(?P<file>.*):(?P<line>\d+):(?P<col>\d+):\s*(?P<severity>.*):\s*(?P<msg>.*)"

    severity_map = {
        "error" : "error",
        "warning" : "warning",
        "info" : "info"
    }

    _suppress = sca_suppress_init(d)
    _findings = []

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        with open(d.getVar("SCA_RAW_RESULT_FILE"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="sparse",
                                            BuildPath=buildpath,
                                            File=m.group("file"),
                                            Column=m.group("col"),
                                            Line=m.group("line"),
                                            Message=m.group("msg"),
                                            ID=hashlib.md5(str.encode(m.group("msg"))).hexdigest(),
                                            Severity=severity_map[m.group("severity").strip()])
                    if g.Message.startswith("unable to open") or \
                       g.Message.startswith("got ") or \
                       g.Message.startswith("too many errors"):
                        continue
                    if _suppress.Suppressed(g):
                        continue
                    if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                        continue
                    if g.Severity in sca_allowed_warning_level(d):
                        _findings.append(g)
                except Exception as e:
                    bb.note(str(e))
    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_sparse() {
    import os
    import subprocess
    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_SPARSE_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_SPARSE_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "sparse-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "sparse-{}-fatal".format(d.getVar("SCA_MODE"))))

    _args = ["sparse"]
    _args += ["-gcc-base-dir", os.path.join(d.getVar("STAGING_DIR"), d.getVar("prefix"))]
    _args += ["-fmax-warnings=1000000"]
    _args += clean_split(d, "SCA_SPARSE_WARNINGS")
    _files = get_files_by_extention(d,    
                                    d.getVar("SCA_SOURCES_DIR"),    
                                    clean_split(d, "SCA_SPARSE_FILE_FILTER"),    
                                    sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    ## Run
    cmd_output = ""
    tmp_result = os.path.join(d.getVar("T", True), "sca_raw_sparse.txt")
    d.setVar("SCA_RAW_RESULT_FILE", tmp_result)
    for _f in _files:
        try:
            cmd_output += subprocess.check_output(_args + [_f], universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            cmd_output += e.stdout or ""
    with open(tmp_result, "w") as o:
        o.write(cmd_output)
    
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/sparse.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_sparse(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "sparse", get_fatal_entries(d))
}

SCA_DEPLOY_TASK = "do_sca_deploy_sparse"

python do_sca_deploy_sparse() {
    sca_conv_deploy(d, "sparse", "txt")
}

do_sca_sparse[doc] = "Lint C files with sparse"
do_sca_deploy_sparse[doc] = "Deploy results of do_sca_sparse"
addtask do_sca_sparse before do_install after do_compile
addtask do_sca_deploy_sparse after do_sca_sparse before do_package

DEPENDS += "sparse-native sca-recipe-sparse-rules-native"
