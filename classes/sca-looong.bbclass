## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to lead to a fatal on a recipe level
SCA_LOOONG_EXTRA_FATAL ?= ""
## Error threshold
SCA_LOOONG_ERR_THRESHOLD ?= "8"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper

inherit python3-dir

def do_sca_conv_looong(d):
    import os
    import re
    
    package_name = d.getVar("PN", True)
    buildpath = d.getVar("SCA_SOURCES_DIR", True)

    pattern = r"^(?P<func>.*?)\s+\[(?P<file>.*)\]\s+\[.*\]\s+(?P<level>\d+)"

    _excludes = sca_filter_files(d, d.getVar("SCA_SOURCES_DIR", True), clean_split(d, "SCA_FILE_FILTER_EXTRA"))

    _findings = []

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE", True)):
        with open(d.getVar("SCA_RAW_RESULT_FILE", True), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    _severity = ""
                    _level = int(m.group("level"))
                    if _level > int(d.getVar("SCA_LOOONG_ERR_THRESHOLD", True)):
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
                    if g.File in _excludes:
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
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_LOOONG_EXTRA_FATAL", True))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "looong-{}-fatal".format(d.getVar("SCA_MODE", True))))

    _args = ["python3", os.path.join(d.getVar("STAGING_DIR_NATIVE", True), d.getVar("PYTHON_SITEPACKAGES_DIR", True)[1:], "looong", "main.py")]
    _args += ["-d", d.getVar("SCA_SOURCES_DIR", True)]

    _files = get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR", True), d.getVar("SCA_PYTHON_SHEBANG", True), ".py",
                                               sca_filter_files(d, d.getVar("SCA_SOURCES_DIR", True), clean_split(d, "SCA_FILE_FILTER_EXTRA")))
    ## Run
    cmd_output = ""
    tmp_result = os.path.join(d.getVar("T", True), "sca_raw_looong.txt")
    d.setVar("SCA_RAW_RESULT_FILE", tmp_result)
    if any(_files):
        try:
            cmd_output += subprocess.check_output(_args, universal_newlines=True)
        except subprocess.CalledProcessError as e:
            cmd_output += e.stdout or ""
    with open(tmp_result, "w") as o:
        escaped = re.compile(r'\x1B[@-_][0-?]*[ -/]*[@-~]')
        o.write(escaped.sub('', cmd_output))
    
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/looong.dm".format(d.getVar("T", True)))
    dm_output = do_sca_conv_looong(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE", True), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "looong", get_fatal_entries(d))
}

SCA_DEPLOY_TASK = "do_sca_deploy_looong"

python do_sca_deploy_looong() {
    sca_conv_deploy(d, "looong", "txt")
}

addtask do_sca_looong before do_install after do_compile
addtask do_sca_deploy_looong after do_sca_looong before do_package

do_sca_looong[depends] += "${@oe.utils.conditional('SCA_FORCE_RUN', '1', '${PN}:do_sca_do_force_meta_task', '', d)}"
do_sca_deploy_looong[depends] += "${@oe.utils.conditional('SCA_FORCE_RUN', '1', '${PN}:do_sca_do_force_meta_task', '', d)}"

DEPENDS += "python3-looong-native sca-recipe-looong-rules-native"
