## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_SPLINT_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_SPLINT_EXTRA_FATAL ?= ""
## File extension filter list (whitespace separated)
SCA_SPLINT_FILE_FILTER ?= ".c"
## Check intensivity (1-4)
SCA_SPLINT_INTENSITY ?= "2"

SCA_RAW_RESULT_FILE[splint] = "csv"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress
inherit sca-tracefiles

def do_sca_conv_splint(d):
    import os
    import csv

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    items = []

    severity_map = {
        "1" : "error",
        "2" : "warning",
        "3" : "info"
    }

    _suppress = sca_suppress_init(d, "SCA_SPLINT_EXTRA_SUPPRESS",
                                  d.expand("${STAGING_DATADIR_NATIVE}/splint-${SCA_MODE}-suppress"))
    _findings = []

    if os.path.exists(sca_raw_result_file(d, "splint")):
        with open(sca_raw_result_file(d, "splint"), "r") as f:
            reader = csv.DictReader(f)
            for row in reader:
                # ignore unresolved includes for now
                if row["Warning Text"].startswith("Cannot find include file "):
                    continue
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="splint",
                                            BuildPath=buildpath,
                                            File=os.path.join(d.getVar("TOPDIR"), row["File"]),
                                            Line=row["Line"],
                                            Column=row["Column"],
                                            Message=row["Warning Text"],
                                            ID=row["Flag Name"],
                                            Severity=severity_map[row["Priority"].strip()])
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

python do_sca_splint() {
    import os
    import subprocess
    from multiprocessing import Pool

    _args = ["splint"]
    _args += ["-tmpdir", d.getVar("T")]
    _args += ["-nof"]
    _args += ["-linelen", "100000"]
    _args += ["bugslimit", "100000"]
    _int = d.getVar("SCA_SPLINT_INTENSITY")
    if _int == "1":
        _args += ["-weak"]
    elif _int == "2":
        _args += ["-standard"]
    elif _int == "3":
        _args += ["-checks"]
    else:
        _args += ["-strict"]
    for i in get_local_includes(d.getVar("SCA_SOURCES_DIR")):
        _args += ["-I{}".format(i)]
    for i in get_local_includes(d.getVar("STAGING_INCDIR")):
        _args += ["-I{}".format(i)]
    _args += ["-I{}".format(d.getVar("SCA_SOURCES_DIR"))]

    _files = get_files_by_extention(d,
                                    d.getVar("SCA_SOURCES_DIR"),
                                    clean_split(d, "SCA_SPLINT_FILE_FILTER"),
                                    sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    cmd_output = ["Warning,Flag Code,Flag Name,Priority,File,Line,Column,Warning Text,Additional Text"]

    ## Run
    for f in _files:
        _targs = _args + ["+csv", os.path.join(d.getVar("T"), "sca_raw_splint_tmp.csv")]
        try:
            subprocess.check_call(_targs + [f], universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            pass
        with open(os.path.join(d.getVar("T"), "sca_raw_splint_tmp.csv")) as i:
            cmd_output += [x.strip("\n") for x in i.readlines()[1:] if x]
        try:
            os.remove(os.path.join(d.getVar("T"), "sca_raw_splint_tmp.csv"))
        except:
            pass
    with open(sca_raw_result_file(d, "splint"), "w") as o:
        o.write("\n".join(cmd_output))
}

do_sca_splint_report[vardepsexclude] += "TOPDIR"
python do_sca_splint_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/splint.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_splint(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "splint", get_fatal_entries(d, "SCA_SPLINT_EXTRA_FATAL",
                       d.expand("${STAGING_DATADIR_NATIVE}/splint-${SCA_MODE}-fatal")))
}

SCA_DEPLOY_TASK = "do_sca_deploy_splint"

python do_sca_deploy_splint() {
    sca_conv_deploy(d, "splint")
}

do_sca_splint[doc] = "Lint C files with splint"
do_sca_splint_report[doc] = "Report findings of do_sca_splint"
do_sca_deploy_splint[doc] = "Deploy results of do_sca_splint"
addtask do_sca_splint after do_compile before do_sca_tracefiles
addtask do_sca_splint_report after do_sca_tracefiles
addtask do_sca_deploy_splint after do_sca_splint_report before do_package

DEPENDS += "splint-native sca-recipe-splint-rules-native"
