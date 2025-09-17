## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2024, Konrad Weihmann

SCA_RAW_RESULT_FILE[ruff] = "txt"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-license-filter
inherit sca-suppress
inherit sca-image-backtrack

inherit python3native

def do_sca_conv_ruff(d):
    import os
    import re

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^(?P<file>.*):(?P<line>\d+):(?P<col>\d+):\s*(?P<severity>[A-Z]+)(?P<id>\d+)\s+(?P<message>.*)"

    severity_map = {
    }
    _findings = []
    _suppress = sca_suppress_init(d, clean_split(d, "SCA_RUFF_EXTRA_SUPPRESS"),
                                  d.expand("${STAGING_DATADIR_NATIVE}/ruff-${SCA_MODE}-suppress"))

    if os.path.exists(sca_raw_result_file(d, "ruff")):
        with open(sca_raw_result_file(d, "ruff"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    if severity_map.get(m.group("severity"), "warning") not in sca_allowed_warning_level(d):
                        continue
                    _file = os.path.join(d.getVar("TOPDIR"), m.group("file"))
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="ruff",
                                            BuildPath=buildpath,
                                            File=_file,
                                            Line=str(int(m.group("line")) + 1),
                                            Column=m.group("col"),
                                            Message=m.group("message"),
                                            ID="{}{}".format(m.group("severity"), m.group("id")),
                                            Severity=severity_map.get(m.group("severity"), "warning"))
                    if _suppress.Suppressed(g):
                        continue
                    if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                        continue
                    _findings += sca_backtrack_findings(d, g)
                except Exception as exp:
                    sca_log_note(d, str(exp))

    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

do_sca_ruff_core[vardepsexclude] += "BB_NUMBER_THREADS"
python do_sca_ruff_core() {
    import os
    import subprocess

    _args = ['ruff', 'check', '--no-cache', '--output-format=concise']
    _args += ['--select=ALL']
    _args += ['--isolated']

    _files = get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), d.getVar("SCA_PYTHON_SHEBANG"), ".py",
                                               sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    ## Run
    cmd_output = exec_wrap_check_output(d, _args, _files)

    with open(sca_raw_result_file(d, "ruff"), "w") as o:
        o.write(cmd_output)
}

do_sca_ruff_core[vardeps] += "\
    SCA_FILE_FILTER_EXTRA \
    SCA_LOCAL_FILE_FILTER \
"

python do_sca_ruff_core_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/ruff.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_ruff(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "ruff", get_fatal_entries(d, clean_split(d, "SCA_RUFF_EXTRA_FATAL"),
                       d.expand("${STAGING_DATADIR_NATIVE}/ruff-${SCA_MODE}-fatal")))
}

do_sca_ruff_core_report[vardeps] += "\
    SCA_RUFF_EXTRA_FATAL \
    SCA_RUFF_EXTRA_SUPPRESS \
    SCA_SCOPE_FILTER \
    SCA_SEVERITY_TRANSFORM \
    SCA_SUPPRESS_LOCALS \
"

DEPENDS += "python3-ruff-native"
