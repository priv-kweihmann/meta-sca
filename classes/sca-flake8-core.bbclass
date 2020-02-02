## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

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
    
    package_name = d.getVar("PN", True)
    buildpath = d.getVar("SCA_SOURCES_DIR", True)

    pattern = r"^(?P<file>.*):(?P<line>\d+):(?P<col>\d+):\s*(?P<severity>[A-Z]+)(?P<id>\d+)\s+(?P<message>.*)"

    severity_map = {
        "DUO": "warning",
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
        "W": "warning"
    }
    _findings = []
    _suppress = sca_suppress_init(d)

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE", True)):
        with open(d.getVar("SCA_RAW_RESULT_FILE", True), "r") as f:
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
                    bb.warn(str(exp))
                    
    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_flake8_core() {
    import os
    import subprocess
    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_FLAKE8_EXTRA_SUPPRESS", True))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_FLAKE8_EXTRA_FATAL", True))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "flake8-{}-suppress".format(d.getVar("SCA_MODE", True))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "flake8-{}-fatal".format(d.getVar("SCA_MODE", True))))

    _args = [os.environ.get("PYTHON", "python3"), "-m", "flake8"]
    _args += ["--isolated"]
    _args += ["--ignore="] ## enable all warning by default
    _args += ["-j", d.getVar("BB_NUMBER_THREADS", True)]

    _files = get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR", True), d.getVar("SCA_PYTHON_SHEBANG", True), ".py",
                                               sca_filter_files(d, d.getVar("SCA_SOURCES_DIR", True), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    ## Run
    tmp_result = os.path.join(d.getVar("T", True), "sca_raw_flake8.txt")
    d.setVar("SCA_RAW_RESULT_FILE", tmp_result)
    cmd_output = ""
    if any(_files):
        try:
            cmd_output = subprocess.check_output(_args + _files, universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            cmd_output = e.output or ""
    with open(tmp_result, "w") as o:
        o.write(cmd_output)
    
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/flake8.dm".format(d.getVar("T", True)))
    dm_output = do_sca_conv_flake8(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE", True), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "flake8", get_fatal_entries(d))
}

## addtask do_static_code_analysis_flake8 before do_install after do_compile

DEPENDS += "python3-flake8-sca-native"
