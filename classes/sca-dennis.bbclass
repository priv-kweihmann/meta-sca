## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_DENNIS_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_DENNIS_EXTRA_FATAL ?= ""

SCA_RAW_RESULT_FILE[dennis] = "txt"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress

inherit python3native

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

    __suppress = sca_suppress_init(d, "SCA_DENNIS_EXTRA_SUPPRESS",
                                   d.expand("${STAGING_DATADIR_NATIVE}/dennis-${SCA_MODE}-suppress"),
                                   file_trace=False)
    _findings = []

    if os.path.exists(sca_raw_result_file(d, "dennis")):
        with open(sca_raw_result_file(d, "dennis"), "r") as f:
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
                    if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
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
    
    with open(sca_raw_result_file(d, "dennis"), "w") as o:
        o.write(allrun_output)

    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/dennis.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_dennis(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "dennis", get_fatal_entries(d, "SCA_DENNIS_EXTRA_FATAL",
                       d.expand("${STAGING_DATADIR_NATIVE}/dennis-${SCA_MODE}-fatal")))
}

SCA_DEPLOY_TASK = "do_sca_deploy_dennis"

python do_sca_deploy_dennis() {
    sca_conv_deploy(d, "dennis")
}

do_sca_dennis[doc] = "Lint i18n files"
do_sca_deploy_dennis[doc] = "Deploy results of do_sca_dennis"
addtask do_sca_dennis after do_configure before do_install
addtask do_sca_deploy_dennis after do_sca_dennis before do_package

DEPENDS += "python3-dennis-native sca-recipe-dennis-rules-native"
