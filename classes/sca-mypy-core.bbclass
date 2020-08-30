## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

SCA_RAW_RESULT_FILE[mypy] = "txt"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-license-filter
inherit sca-suppress

def do_sca_conv_mypy(d):
    import os
    import re
    import hashlib

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^(?P<file>.*):(?P<line>\d+):\s+(?P<severity>\w+):\s+(?P<message>.*)"

    severity_map = {
        "error" : "error",
        "warning" : "error",
        "note": "info"
    }

    _findings = []
    _suppress = sca_suppress_init(d, "SCA_MYPY_EXTRA_SUPPRESS",
                                  d.expand("${STAGING_DATADIR_NATIVE}/mypy-${SCA_MODE}-suppress"))

    if os.path.exists(sca_raw_result_file(d, "mypy")):
        with open(sca_raw_result_file(d, "mypy"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="mypy",
                                            BuildPath=buildpath,
                                            File=os.path.join(d.getVar("TOPDIR"), m.group("file")),
                                            Line=m.group("line"),
                                            Message=m.group("message"),
                                            ID=hashlib.md5(str.encode(m.group("message"))).hexdigest(),
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

python do_sca_mypy_core() {
    import os
    import subprocess

    os.environ["MYPY_CACHE_DIR"] = os.path.join(d.getVar("T"), "mypy_cache")
    _args = [os.path.join(d.getVar("STAGING_BINDIR_NATIVE"), "python3-native/python3"), "-m", "mypy"]
    _args += ["--strict"]
    _args += ["--no-incremental"]
    _args += ["--python-version", d.getVar("PYTHON_BASEVERSION")]

    _files = get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), d.getVar("SCA_PYTHON_SHEBANG"), ".py",
                sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    ## Run
    cmd_output = exec_wrap_check_output(_args, _files)

    with open(sca_raw_result_file(d, "mypy"), "w") as o:
        o.write(cmd_output)
}

do_sca_mypy_core[vardepsexclude] += "TOPDIR"
python do_sca_mypy_core_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/mypy.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_mypy(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "mypy", get_fatal_entries(d, "SCA_MYPY_EXTRA_FATAL",
                       d.expand("${STAGING_DATADIR_NATIVE}/mypy-${SCA_MODE}-fatal")))
}

DEPENDS += "python3-mypy-native"
