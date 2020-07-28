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

SCA_RAW_RESULT_FILE[sparse] = "txt"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress
inherit sca-tracefiles

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

    _suppress = sca_suppress_init(d, "SCA_SPARSE_EXTRA_SUPPRESS",
                                  d.expand("${STAGING_DATADIR_NATIVE}/sparse-${SCA_MODE}-suppress"))
    _findings = []

    if os.path.exists(sca_raw_result_file(d, "sparse")):
        with open(sca_raw_result_file(d, "sparse"), "r") as f:
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
    for _f in _files:
        try:
            cmd_output += subprocess.check_output(_args + [_f], universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            cmd_output += e.stdout or ""
    with open(sca_raw_result_file(d, "sparse"), "w") as o:
        o.write(cmd_output)
}

python do_sca_sparse_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/sparse.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_sparse(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "sparse", get_fatal_entries(d, "SCA_SPARSE_EXTRA_FATAL",
                       d.expand("${STAGING_DATADIR_NATIVE}/sparse-${SCA_MODE}-fatal")))
}

SCA_DEPLOY_TASK = "do_sca_deploy_sparse"

python do_sca_deploy_sparse() {
    sca_conv_deploy(d, "sparse")
}

do_sca_sparse[doc] = "Lint C files with sparse"
do_sca_sparse_report[doc] = "Report findings of do_sca_sparse"
do_sca_deploy_sparse[doc] = "Deploy results of do_sca_sparse"
addtask do_sca_sparse after do_compile before do_sca_tracefiles
addtask do_sca_sparse_report after do_sca_tracefiles
addtask do_sca_deploy_sparse after do_sca_sparse_report before do_package

DEPENDS += "sparse-native sca-recipe-sparse-rules-native"
