## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

SCA_RAW_RESULT_FILE[flake8] = "txt"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-license-filter
inherit sca-suppress

inherit python3native

def do_sca_conv_flake8(d):
    import os
    import re

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^(?P<file>.*):(?P<line>\d+):(?P<col>\d+):\s*(?P<severity>[A-Z]+)(?P<id>\d+)\s+(?P<message>.*)"

    severity_map = {
        "CFQ": "warning",
        "DAR": "warning",
        "DUO": "warning",
        "ECE": "warning",
        "EXE": "error",
        "RST": "warning",
        "TAE": "warning",
        "WPS": "warning",
        "VNE": "info",
        "YTT": "warning",
        "A": "warning",
        "B": "warning",
        "C": "warning",
        "D": "warning",
        "E": "error",
        "F": "error",
        "G": "warning",
        "H": "warning",
        "I": "warning",
        "M": "warning",
        "N": "warning",
        "P": "error",
        "Q": "warning",
        "R": "info",
        "S": "error",
        "T": "warning",
        "W": "warning",
    }
    _findings = []
    _suppress = sca_suppress_init(d, "SCA_FLAKE8_EXTRA_SUPPRESS",
                                  d.expand("${STAGING_DATADIR_NATIVE}/flake8-${SCA_MODE}-suppress"))

    if os.path.exists(sca_raw_result_file(d, "flake8")):
        with open(sca_raw_result_file(d, "flake8"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="flake8",
                                            BuildPath=buildpath,
                                            File=m.group("file"),
                                            Line=str(int(m.group("line")) + 1),
                                            Column=m.group("col"),
                                            Message=m.group("message"),
                                            ID="{}{}".format(m.group("severity"), m.group("id")),
                                            Severity=severity_map[m.group("severity")])
                    if _suppress.Suppressed(g):
                        continue
                    if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                        continue
                    if g.Severity in sca_allowed_warning_level(d):
                        _findings.append(g)
                except Exception as exp:
                    bb.note(str(exp))

    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

do_sca_flake8_core[vardepsexclude] += "BB_NUMBER_THREADS"
python do_sca_flake8_core() {
    import os
    import subprocess

    _args = [os.environ.get("PYTHON", "python3"), "-m", "flake8"]
    _args += ["--isolated"]
    _args += ["--ignore="] ## enable all warning by default
    _args += ["-j", d.getVar("BB_NUMBER_THREADS")]

    _files = get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), d.getVar("SCA_PYTHON_SHEBANG"), ".py",
                                               sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    ## Run
    cmd_output = exec_wrap_check_output(_args, _files)

    with open(sca_raw_result_file(d, "flake8"), "w") as o:
        o.write(cmd_output)
}

python do_sca_flake8_core_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/flake8.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_flake8(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "flake8", get_fatal_entries(d, "SCA_FLAKE8_EXTRA_FATAL",
                       d.expand("${STAGING_DATADIR_NATIVE}/flake8-${SCA_MODE}-fatal")))
}

DEPENDS += "python3-flake8-sca-native"
