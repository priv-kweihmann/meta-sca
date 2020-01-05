## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

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
    _suppress = sca_suppress_init(d)

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        with open(d.getVar("SCA_RAW_RESULT_FILE"), "r") as f:
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
                    bb.warn(str(exp))

    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_mypy_core() {
    import os
    import subprocess
    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_MYPY_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_MYPY_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "mypy-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "mypy-{}-fatal".format(d.getVar("SCA_MODE"))))

    _args = [os.path.join(d.getVar("STAGING_BINDIR_NATIVE"), "python3-native/python3"), "-m", "mypy"]
    _args += ["--strict"]
    _args += ["--no-incremental"]
    _args += ["--python-version", d.getVar("PYTHON_BASEVERSION")]

    _files = get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), d.getVar("SCA_PYTHON_SHEBANG"), ".py",
                sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    ## Run
    cmd_output = ""
    tmp_result = os.path.join(d.getVar("T", True), "sca_raw_mypy.txt")
    d.setVar("SCA_RAW_RESULT_FILE", tmp_result)

    if any(_files):
        try:
            cmd_output = subprocess.check_output(_args + _files, universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            cmd_output = e.stdout or ""
    with open(tmp_result, "w") as o:
        o.write(cmd_output)
    
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/mypy.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_mypy(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "mypy", get_fatal_entries(d))
}

## addtask do_static_code_analysis_mypy before do_install after do_compile

DEPENDS += "python3-mypy-native"
