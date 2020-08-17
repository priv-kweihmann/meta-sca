## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-license-filter
inherit sca-suppress

inherit python3native

SCA_VULTURE_EXTRA_FATAL ?= ""
SCA_VULTURE_MIN_CONFIDENCE ?= "80"

SCA_RAW_RESULT_FILE[vulture] = "txt"

def do_sca_conv_vulture(d):
    import os
    import re

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    _suppress = sca_suppress_init(d, "", None)

    pattern = r"^(?P<file>.*):(?P<line>\d+):\s*(?P<message>.*)"

    _findings = []

    if os.path.exists(sca_raw_result_file(d, "vulture")):
        with open(sca_raw_result_file(d, "vulture"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                _id = "deadcode"
                _sev = "warning"
                if m.group("message").startswith("invalid syntax"):
                    _id = "syntaxerror"
                    _sev = "error"
                try:
                    _file = os.path.join(d.getVar("TOPDIR"), m.group("file"))
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="vulture",
                                            BuildPath=buildpath,
                                            File=_file,
                                            Line=m.group("line"),
                                            Message=m.group("message"),
                                            ID=_id,
                                            Severity=_sev)
                    if _suppress.Suppressed(g):
                        continue
                    if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                        continue
                    if g.Severity in sca_allowed_warning_level(d):
                        _findings.append(g)
                except Exception as exp:
                    bb.warn(str(exp))

    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

do_sca_vulture_core[vardepsexclude] += "BB_NUMBER_THREADS"
python do_sca_vulture_core() {
    import os
    import subprocess

    _args = [os.environ.get("PYTHON", "python3"), "-m", "vulture"]
    _args += ["--min-confidence", d.getVar("SCA_VULTURE_MIN_CONFIDENCE")]

    _files = get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), d.getVar("SCA_PYTHON_SHEBANG"), ".py",
                                               sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    ## Run
    cmd_output = exec_wrap_check_output(_args, _files)
    with open(sca_raw_result_file(d, "vulture"), "w") as o:
        o.write(cmd_output)
}

python do_sca_vulture_core_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/vulture.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_vulture(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "vulture", get_fatal_entries(d, "SCA_VULTURE_EXTRA_FATAL",
                       d.expand("${STAGING_DATADIR_NATIVE}/vulture-${SCA_MODE}-fatal")))
}

DEPENDS += "python3-vulture-native"
