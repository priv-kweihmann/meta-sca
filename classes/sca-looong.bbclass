## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to lead to a fatal on a recipe level
SCA_LOOONG_EXTRA_FATAL ?= ""
## Error threshold
SCA_LOOONG_ERR_THRESHOLD ?= "8"

SCA_RAW_RESULT_FILE[looong] = "txt"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress
inherit sca-tracefiles

inherit python3-dir

def do_sca_conv_looong(d):
    import os
    import re

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^(?P<func>.*?)\s+\[(?P<file>.*)\]\s+\[.*\]\s+(?P<level>\d+)"

    _suppress = sca_suppress_init(d, "", None)
    _excludes = sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA"))

    _findings = []

    if os.path.exists(sca_raw_result_file(d, "looong")):
        with open(sca_raw_result_file(d, "looong"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    _severity = ""
                    _level = int(m.group("level"))
                    if _level > int(d.getVar("SCA_LOOONG_ERR_THRESHOLD")):
                        _severity = "error"
                    else:
                        _severity = "warning"
                    _msg = "Function '{}' has an argument list of {}".format(m.group("func"), _level)
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="looong",
                                            BuildPath=buildpath,
                                            File=m.group("file"),
                                            Message=_msg,
                                            ID="TooLongArgumentList",
                                            Severity=_severity)
                    if g.File in _excludes or _suppress.Suppressed(g):
                        continue
                    if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                        continue
                    if g.Severity in sca_allowed_warning_level(d):
                        _findings.append(g)
                except Exception as exp:
                    bb.warn(str(exp))

    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_looong() {
    import os
    import subprocess
    import re

    _args = ["python3", os.path.join(d.getVar("STAGING_DIR_NATIVE"), d.getVar("PYTHON_SITEPACKAGES_DIR")[1:], "looong", "main.py")]
    _args += ["-d", d.getVar("SCA_SOURCES_DIR")]

    _files = get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), d.getVar("SCA_PYTHON_SHEBANG"), ".py",
                                               sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))
    ## Run
    cmd_output = ""
    if any(_files):
        try:
            cmd_output += subprocess.check_output(_args, universal_newlines=True)
        except subprocess.CalledProcessError as e:
            cmd_output += e.stdout or ""
    with open(sca_raw_result_file(d, "looong"), "w") as o:
        escaped = re.compile(r'\x1B[@-_][0-?]*[ -/]*[@-~]')
        o.write(escaped.sub('', cmd_output))
}

python do_sca_looong_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/looong.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_looong(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "looong", get_fatal_entries(d, "SCA_LOOONG_EXTRA_FATAL",
                        d.expand("${STAGING_DATADIR_NATIVE}/looong-${SCA_MODE}-fatal")))
}

SCA_DEPLOY_TASK = "do_sca_deploy_looong"

python do_sca_deploy_looong() {
    sca_conv_deploy(d, "looong")
}

do_sca_looong[doc] = "Find python function to be refactored"
do_sca_looong_report[doc] = "Report findings of do_sca_looong"
do_sca_deploy_looong[doc] = "Deploy results of do_sca_looong"
addtask do_sca_looong after do_compile before do_sca_tracefiles
addtask do_sca_looong_report after do_sca_tracefiles
addtask do_sca_deploy_looong after do_sca_looong_report before do_package

DEPENDS += "python3-looong-native sca-recipe-looong-rules-native"
