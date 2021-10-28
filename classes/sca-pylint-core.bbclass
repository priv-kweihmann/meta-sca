## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann
SCA_RAW_RESULT_FILE[pylint] = "txt"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-license-filter
inherit sca-suppress
inherit sca-image-backtrack

def do_sca_conv_pylint(d):
    import os
    import re

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^(?P<file>.*):(?P<line>\d+):\s+\[(?P<raw_severity>\w+)\((?P<raw_severity_id>.*)\).*\]\s+(?P<message>.*)"

    severity_map = {
        "F" : "error",
        "E" : "error",
        "W" : "warning",
        "R" : "info",
        "C" : "info"
    }

    _findings = []
    _suppress = sca_suppress_init(d, "SCA_PYLINT_EXTRA_SUPPRESS",
                                  d.expand("${STAGING_DATADIR_NATIVE}/pylint-${SCA_MODE}-suppress"))

    if os.path.exists(sca_raw_result_file(d, "pylint")):
        with open(sca_raw_result_file(d, "pylint"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="pylint",
                                            BuildPath=buildpath,
                                            File=m.group("file"),
                                            Line=m.group("line"),
                                            Message=m.group("message"),
                                            ID="{}{}".format(m.group("raw_severity"), m.group("raw_severity_id")),
                                            Severity=severity_map[m.group("raw_severity")[0]])
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

do_sca_pylint_core[vardepsexclude] += "BB_NUMBER_THREADS"
python do_sca_pylint_core() {
    import os
    import subprocess

    _args = ["python3", "-m", "pylint"]
    _args += ["--output-format=parseable"]
    _args += ["--score=no"]
    _args += ["--rcfile={}/pylint.rc".format(d.getVar("T"))]
    if d.getVar("SCA_PYLINT_EXTRA"):
        _args += d.getVar("SCA_PYLINT_EXTRA").split(" ")
    _args += ["-j", d.getVar("BB_NUMBER_THREADS")]

    os.environ["PYLINTHOME"] = d.getVar("T")

    ## Run
    cur_dir = os.getcwd()
    os.chdir(d.getVar("SCA_SOURCES_DIR"))

    os.environ["STAGING_LIBDIR"] = d.getVar("STAGING_LIBDIR")

    ## Patch a pylint.rc-file with all the library paths
    with open(os.path.join(d.getVar("T"), "pylint.rc"), "w") as f:
        f.write("[MASTER]\n")
        f.write('init-hook="import sys;[sys.path.insert(0, a) for a in \'{}\'.split(\':\')]'.format(d.getVar("SCA_PYLINT_LIBATH")) + '"')

    _files = get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), d.getVar("SCA_PYTHON_SHEBANG"), ".py",
                                               sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    cmd_output = exec_wrap_check_output(d, _args, _files)

    with open(sca_raw_result_file(d, "pylint"), "w") as o:
        o.write(cmd_output)
    os.chdir(cur_dir)
}

python do_sca_pylint_core_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/pylint.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_pylint(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "pylint", get_fatal_entries(d, "SCA_PYLINT_EXTRA_FATAL",
                        d.expand("${STAGING_DATADIR_NATIVE}/pylint-${SCA_MODE}-fatal")))
}

DEPENDS += "python3-pylint-native"
