## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

SCA_ANSIBLELINT_EXTRA_SUPPRESS ?= ""
SCA_ANSIBLELINT_EXTRA_FATAL ?= ""
SCA_ANSIBLELINT_FILE_FILTER ?= ".yaml"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-license-filter
inherit sca-suppress
inherit sca-image-backtrack

DEPENDS += "python3-ansiblelint-native"

SCA_RAW_RESULT_FILE[ansiblelint] = "txt"

def do_sca_conv_ansiblelint(d):
    import os
    import re

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^(?P<file>.*):(?P<line>\d+):\s*(?P<id>.*?)\s+(?P<msg>.*)"

    _suppress = sca_suppress_init(d, "SCA_ANSIBLELINT_EXTRA_SUPPRESS",
                                  d.expand("${STAGING_DATADIR_NATIVE}/ansiblelint-${SCA_MODE}-suppress"))
    _excludes = sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA"))

    _findings = []
    if os.path.exists(sca_raw_result_file(d, "ansiblelint")):
        with open(sca_raw_result_file(d, "ansiblelint"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    _file = m.group("file")
                    if not _file.startswith("/"):
                        _file = os.path.join(d.getVar("TOPDIR"), _file)
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="ansiblelint",
                                            BuildPath=buildpath,
                                            File=_file,
                                            Line=m.group("line"),
                                            Message=m.group("msg"),
                                            ID=m.group("id"),
                                            Severity="warning")
                    if g.File in _excludes:
                        continue
                    if _suppress.Suppressed(g):
                        continue
                    if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                        continue
                    if g.Severity in sca_allowed_warning_level(d):
                        _findings += sca_backtrack_findings(d, g)
                except Exception as exp:
                    sca_log_note(d, str(exp))
    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_ansiblelint_core() {
    import os
    import subprocess

    os.environ["HOME"] = d.getVar("T")
    _args = [os.path.join(d.getVar("STAGING_BINDIR_NATIVE"), "python3-native", "python3")]
    _args += ["-m", "ansiblelint"]
    _args += ["-p"]
    _args += ["-f", "plain"]
    _args += ["--nocolor"]
    _args += ["--offline"]
    _files = get_files_by_extention(d, d.getVar("SCA_SOURCES_DIR"), d.getVar("SCA_ANSIBLELINT_FILE_FILTER"),
                        sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    cmd_output = exec_wrap_check_output(d, _args, _files)

    with open(sca_raw_result_file(d, "ansiblelint"), "w") as o:
        o.write(cmd_output)
}

do_sca_ansiblelint_core_report[vardepsexclude] += "TOPDIR"
python do_sca_ansiblelint_core_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/ansiblelint.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_ansiblelint(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "ansiblelint", get_fatal_entries(d, "SCA_ANSIBLELINT_EXTRA_FATAL",
                       d.expand("${STAGING_DATADIR_NATIVE}/ansiblelint-${SCA_MODE}-fatal")))
}