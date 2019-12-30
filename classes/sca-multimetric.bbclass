## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## File extension filter list (whitespace separated)
SCA_MULTIMETRIC_FILE_FILTER ?= ".c .C .c++ .cc .cp .cpp .CPP .cxx .go .h .H .h++ .hh .hpp .hxx .idc .js .jsm .lua .php .php3 .php4 .php5 .pl .pm .pxd .pxi .py .pyx .t .wlua"
SCA_MULTIMETRIC_EXTRA_SUPPRESS ?= ""
SCA_MULTIMETRIC_EXTRA_FATAL ?= ""

SCA_MULTIMETRIC_ERROR_cyclomatic_complexity_gt ?= "30.0"
SCA_MULTIMETRIC_WARN_cyclomatic_complexity_gt ?= "15.0"

# possible entries for variables are 
# comment_ratio
# cyclomatic_complexity
# halstead_bugprop
# halstead_timerequired
# halstead_difficulty
# halstead_volume
# halstead_effort
# loc
# maintainability_index
# operands_sum
# operands_uniq
# operators_sum
# operators_uniq


inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress

def do_sca_conv_multimetric(d):
    import os
    import re
    import json
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    _suppress = sca_suppress_init(d)
    _findings = []
    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        j = {}
        try:
            with open(d.getVar("SCA_RAW_RESULT_FILE")) as i:
                j = json.load(i)
        except Exception as e:
            bb.warn(str(e))
        try:
            for _file, v in j["files"].items():
                for _item in v.keys():
                    ## lt error
                    if d.getVar("SCA_MULTIMETRIC_ERROR_{}_lt".format(_item)):
                        threshold = float(d.getVar("SCA_MULTIMETRIC_ERROR_{}_lt".format(_item)))
                        val = float(str(v[_item]))
                        if val < threshold:
                            g = sca_get_model_class(d,
                                                    PackageName=package_name,
                                                    Tool="multimetric",
                                                    BuildPath=buildpath,
                                                    File=_file,
                                                    Message="value {} is {}<{}".format(_item, val, threshold),
                                                    ID=_item,
                                                    Severity="error")
                            if _suppress.Suppressed(g):
                                continue
                            if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                                continue
                            if g.Severity in sca_allowed_warning_level(d):
                                _findings.append(g)
                    elif d.getVar("SCA_MULTIMETRIC_ERROR_{}_gt".format(_item)):
                        threshold = float(d.getVar("SCA_MULTIMETRIC_ERROR_{}_gt".format(_item)))
                        val = float(str(v[_item]))
                        if val > threshold:
                            g = sca_get_model_class(d,
                                                    PackageName=package_name,
                                                    Tool="multimetric",
                                                    BuildPath=buildpath,
                                                    File=_file,
                                                    Message="value {} is {}>{}".format(_item, val, threshold),
                                                    ID=_item,
                                                    Severity="error")
                            if _suppress.Suppressed(g):
                                continue
                            if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                                continue
                            if g.Severity in sca_allowed_warning_level(d):
                                _findings.append(g)
                    elif d.getVar("SCA_MULTIMETRIC_WARN_{}_lt".format(_item)):
                        threshold = float(d.getVar("SCA_MULTIMETRIC_WARN_{}_lt".format(_item)))
                        val = float(str(v[_item]))
                        if val < threshold:
                            g = sca_get_model_class(d,
                                                    PackageName=package_name,
                                                    Tool="multimetric",
                                                    BuildPath=buildpath,
                                                    File=_file,
                                                    Message="value {} is {}<{}".format(_item, val, threshold),
                                                    ID=_item,
                                                    Severity="warning")
                            if _suppress.Suppressed(g):
                                continue
                            if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                                continue
                            if g.Severity in sca_allowed_warning_level(d):
                                _findings.append(g)
                    elif d.getVar("SCA_MULTIMETRIC_WARN_{}_gt".format(_item)):
                        threshold = float(d.getVar("SCA_MULTIMETRIC_WARN_{}_gt".format(_item)))
                        val = float(str(v[_item]))
                        if val > threshold:
                            g = sca_get_model_class(d,
                                                    PackageName=package_name,
                                                    Tool="multimetric",
                                                    BuildPath=buildpath,
                                                    File=_file,
                                                    Message="value {} is {}>{}".format(_item, val, threshold),
                                                    ID=_item,
                                                    Severity="warning")
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

python do_sca_multimetric() {
    import os
    import subprocess

    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_MULTIMETRIC_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_MULTIMETRIC_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "multimetric-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "multimetric-{}-fatal".format(d.getVar("SCA_MODE"))))

    _args = ["multimetric"]

    ## Run
    json_output = {}
    tmp_result = os.path.join(d.getVar("T", True), "sca_raw_multimetric.json")
    d.setVar("SCA_RAW_RESULT_FILE", tmp_result)
    _files = get_files_by_extention(d, 
                                    d.getVar("SCA_SOURCES_DIR"), 
                                    clean_split(d, "SCA_MULTIMETRIC_FILE_FILTER"), 
                                    sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))
    cmd_output = "{}"
    if any(_files):
        try:
            cmd_output = subprocess.check_output(_args + _files, universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            cmd_output = e.stdout or ""
        
    with open(tmp_result, "w") as o:
        o.write(cmd_output)
    
    # Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/multimetric.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_multimetric(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "multimetric", get_fatal_entries(d))
}

SCA_DEPLOY_TASK = "do_sca_deploy_multimetric"

python do_sca_deploy_multimetric() {
    sca_conv_deploy(d, "multimetric", "json")
}

addtask do_sca_multimetric before do_install after do_compile
addtask do_sca_deploy_multimetric after do_sca_multimetric before do_package

do_sca_multimetric[depends] += "${@oe.utils.conditional('SCA_FORCE_RUN', '1', '${PN}:do_sca_do_force_meta_task', '', d)}"
do_sca_deploy_multimetric[depends] += "${@oe.utils.conditional('SCA_FORCE_RUN', '1', '${PN}:do_sca_do_force_meta_task', '', d)}"

DEPENDS += "python3-multimetric-native sca-recipe-multimetric-rules-native"
