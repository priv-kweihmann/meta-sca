## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_DENNIS_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_DENNIS_EXTRA_FATAL ?= ""

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress
inherit ${@oe.utils.ifelse(d.getVar('SCA_STD_PYTHON_INTERPRETER') == 'python3', 'python3native', 'pythonnative')}

def do_sca_conv_dennis(d):
    import os
    import re
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    items = []
    pattern = r"^(?P<file>.*):\s+(?P<severity>W|E)(?P<id>\d+)\:\s+(?P<msg>.*)\n.*:\s+(?P<line>\d+)"

    severity_map = {
        "E" : "error",
        "W" : "warning",
    }

    __suppress = sca_suppress_init(d)
    _findings = []

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        with open(d.getVar("SCA_RAW_RESULT_FILE"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="dennis",
                                            BuildPath=buildpath,
                                            File = m.group("file"),
                                            Line=m.group("line"),
                                            Message=m.group("msg"),
                                            ID=m.group("id"),
                                            Severity=severity_map[m.group("severity")])
                    if __suppress.Suppressed(g):
                        continue
                    if not sca_is_in_finding_scope(d, "dennis", g.GetFormattedID()):
                        continue
                    if g.Severity in sca_allowed_warning_level(d):
                        _findings.append(g)
                except Exception as exp:
                    bb.warn(str(exp))

    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_dennis() {
    import os
    import subprocess
    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_DENNIS_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_DENNIS_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "dennis-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "dennis-{}-fatal".format(d.getVar("SCA_MODE"))))

    tmp_result = os.path.join(d.getVar("T", True), "sca_raw_dennis.txt")
    d.setVar("SCA_RAW_RESULT_FILE", tmp_result)
    allrun_output = ""
    _args = ["dennis-cmd"]
    _args += ["lint"]

    _files = get_files_by_extention(d, d.getVar("SCA_SOURCES_DIR"), ".po .pot", \
        sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))
    for f in _files:
        try:
            _targs = _args + [f]
            cmd_output = subprocess.check_output(_targs, universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            ## manually add syntax or similar error
            cmd_output = "E999: Parsing Error.\n1"
       
        if cmd_output:
            prefix = "{}: ".format(f)
            cmd_output = prefix + prefix.join(cmd_output.splitlines(True))
        allrun_output += cmd_output
    
    with open(tmp_result, "w") as o:
        o.write(allrun_output)
    
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/dennis.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_dennis(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "dennis", get_fatal_entries(d))
}

SCA_DEPLOY_TASK = "do_sca_deploy_dennis"

python do_sca_deploy_dennis() {
    sca_conv_deploy(d, "dennis", "txt")
}

addtask do_sca_dennis before do_install after do_configure
addtask do_sca_deploy_dennis after do_sca_dennis before do_package

do_sca_dennis[depends] += "${@oe.utils.conditional('SCA_FORCE_RUN', '1', '${PN}:do_sca_do_force_meta_task', '', d)}"
do_sca_deploy_dennis[depends] += "${@oe.utils.conditional('SCA_FORCE_RUN', '1', '${PN}:do_sca_do_force_meta_task', '', d)}"

DEPENDS += "${SCA_STD_PYTHON_INTERPRETER}-dennis-native sca-recipe-dennis-rules-native"
