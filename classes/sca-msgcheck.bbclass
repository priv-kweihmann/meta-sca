## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_MSGCHECK_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_MSGCHECK_EXTRA_FATAL ?= ""

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-file-filter
inherit sca-suppress
inherit python3native

def do_sca_conv_msgcheck(d):
    import os
    import re
    
    package_name = d.getVar("PN", True)
    buildpath = d.getVar("SCA_SOURCES_DIR", True)

    items = []
    pattern = r"^(?P<file>.*):(?P<line>\d+):(\s+(?P<severity>warning|error):\s|\s+\[(?P<id>.*)\]\s+|\s+)(?P<msg>.*)"

    __suppress = sca_suppress_init(d)
    _findings = []

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE", True)):
        with open(d.getVar("SCA_RAW_RESULT_FILE", True), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                _id = m.group("id")
                _sev = m.group("severity")
                if _id and not _sev:
                    _sev = "warning"
                elif not _sev:
                    _sev = "warning"
                elif not _id:
                    _id = "compile"
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="msgcheck",
                                            BuildPath=buildpath,
                                            File=m.group("file"),
                                            Line=m.group("line"),
                                            Message=m.group("msg"),
                                            ID=_id,
                                            Severity=_sev)
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

python do_sca_msgcheck() {
    import os
    import subprocess
    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_MSGCHECK_EXTRA_SUPPRESS", True))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_MSGCHECK_EXTRA_FATAL", True))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "msgcheck-{}-suppress".format(d.getVar("SCA_MODE", True))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "msgcheck-{}-fatal".format(d.getVar("SCA_MODE", True))))

    tmp_result = os.path.join(d.getVar("T", True), "sca_raw_msgcheck.txt")
    d.setVar("SCA_RAW_RESULT_FILE", tmp_result)
    cmd_output = ""
    _args = [os.environ.get("PYTHON", "python3"), "-m", "msgcheck"]

    _files = get_files_by_extention(d, d.getVar("SCA_SOURCES_DIR", True), ".po", \
        sca_filter_files(d, d.getVar("SCA_SOURCES_DIR", True), clean_split(d, "SCA_FILE_FILTER_EXTRA")))
    for f in _files:
        try:
            _targs = _args + [f]
            cmd_output += subprocess.check_output(_targs, universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            cmd_output += e.output or ""
        try:
            _targs = _args + ["-c", f]
            cmd_output += subprocess.check_output(_targs, universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            cmd_output += e.output or ""
    
    with open(tmp_result, "w") as o:
        o.write(cmd_output)
    
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/msgcheck.dm".format(d.getVar("T", True)))
    dm_output = do_sca_conv_msgcheck(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE", True), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "msgcheck", get_fatal_entries(d))
}

SCA_DEPLOY_TASK = "do_sca_deploy_msgcheck"

python do_sca_deploy_msgcheck() {
    sca_conv_deploy(d, "msgcheck", "txt")
}

addtask do_sca_msgcheck before do_install after do_configure
addtask do_sca_deploy_msgcheck after do_sca_msgcheck before do_package

do_sca_msgcheck[depends] += "${@oe.utils.conditional('SCA_FORCE_RUN', '1', '${PN}:do_sca_do_force_meta_task', '', d)}"
do_sca_deploy_msgcheck[depends] += "${@oe.utils.conditional('SCA_FORCE_RUN', '1', '${PN}:do_sca_do_force_meta_task', '', d)}"

DEPENDS += "python3-msgcheck-native sca-recipe-msgcheck-rules-native"
