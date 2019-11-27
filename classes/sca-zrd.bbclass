## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_ZRD_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_ZRD_EXTRA_FATAL ?= ""

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress

inherit ${@oe.utils.ifelse(d.getVar('SCA_STD_PYTHON_INTERPRETER') == 'python3', 'python3native', 'pythonnative')}

def do_sca_conv_zrd(d):
    import os
    import re
    import csv
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    severity_map = {
        "warning" : "warning",
        "error" : "error"
    }

    code_map = {
        "2000" : "duplicate key",
        "2001" : "missing key",
        "2002" : "redundant key",
        "2003" : "untranslated value",
        "2004" : "unused key",
        "2005" : "undefined key",
        "2006" : "missing file",
        "2007" : "redundant file",
        "2008" : "unmatched placeholder",
        "2009" : "format error",
        "2010" : "encoding error"
    }

    _suppress = sca_suppress_init(d)
    __excludes = sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA"))
    _findings = []

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        with open(d.getVar("SCA_RAW_RESULT_FILE"), "r", encoding='utf-8-sig') as f:
            reader = csv.DictReader(f)
            for row in reader:
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="zrd",
                                            BuildPath=buildpath,
                                            File=row["file"],
                                            Line=row["line"],
                                            Message="{}:{}".format(str(row["code"]), code_map[str(row["code"])]),
                                            ID=row["code"],
                                            Severity=severity_map[row["severity"]])
                    if g.File in __excludes:
                        continue
                    if _suppress.Suppressed(g):
                        continue
                    if not sca_is_in_finding_scope(d, "zrd", g.GetFormattedID()):
                        continue
                    if g.Severity in sca_allowed_warning_level(d):
                        _findings.append(g)
                except Exception as exp:
                    bb.warn(str(exp))

    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_zrd() {
    import os
    import subprocess
    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_ZRD_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_ZRD_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "zrd-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "zrd-{}-fatal".format(d.getVar("SCA_MODE"))))

    tmp_result = os.path.join(d.getVar("T", True), "sca_raw_zrd.csv")
    d.setVar("SCA_RAW_RESULT_FILE", tmp_result)

    _args = [os.path.join(d.getVar("STAGING_BINDIR_NATIVE"), d.getVar("PYTHON_PN") + "-native", d.getVar("PYTHON_PN"))]
    _args += [os.path.join(d.getVar("STAGING_BINDIR_NATIVE"), "zrd", "resource_detector.py")]
    _args += ["-d", tmp_result]
    _files = get_files_by_extention(d, d.getVar("SCA_SOURCES_DIR"), "",
                                sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    ## Run
    if any(_files):
        try:
            cmd_output = subprocess.check_output(_args + _files, universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            cmd_output = e.stdout or ""
    
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/zrd.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_zrd(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "zrd", get_fatal_entries(d))
}

SCA_DEPLOY_TASK = "do_sca_deploy_zrd"

python do_sca_deploy_zrd() {
    sca_conv_deploy(d, "zrd", "csv")
}

addtask do_sca_zrd before do_install after do_compile
addtask do_sca_deploy_zrd after do_sca_zrd before do_package

do_sca_zrd[depends] += "${@oe.utils.conditional('SCA_FORCE_RUN', '1', '${PN}:do_sca_do_force_meta_task', '', d)}"
do_sca_deploy_zrd[depends] += "${@oe.utils.conditional('SCA_FORCE_RUN', '1', '${PN}:do_sca_do_force_meta_task', '', d)}"

DEPENDS += "${SCA_STD_PYTHON_INTERPRETER}-zeroresourcedetector-native sca-recipe-zrd-rules-native"
