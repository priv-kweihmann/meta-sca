inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-license-filter

inherit ${@oe.utils.ifelse(d.getVar('SCA_STD_PYTHON_INTERPRETER') == 'python3', 'python3native', 'pythonnative')}

def do_sca_conv_flake8(d):
    import os
    import re
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^(?P<file>.*):(?P<line>\d+):(?P<col>\d+):\s*(?P<severity>[A-Z]+)(?P<id>\d+)\s+(?P<message>.*)"

    severity_map = {
        "F" : "error",
        "E" : "error",
        "W" : "error",
        "A" : "warning",
        "C" : "warning",
        "EXE" : "warning",
        "T" : "warning",
        "I" : "warning",
        "M" : "warning",
        "Q" : "warning",
        "S" : "warning",
        "P" : "warning"
    }
    _findings = []
    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        with open(d.getVar("SCA_RAW_RESULT_FILE"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="flake8",
                                            BuildPath=buildpath,
                                            File=m.group("file"),
                                            Line=m.group("line"),
                                            Column=m.group("col"),
                                            Message=m.group("message"),
                                            ID="{}{}".format(m.group("severity"), m.group("id")),
                                            Severity=severity_map[m.group("severity")])
                    if g.Severity in sca_allowed_warning_level(d):
                        _findings.append(g)
                except Exception as exp:
                    bb.warn(str(exp))
                    
    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_flake8_core() {
    import os
    import subprocess
    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_FLAKE8_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_FLAKE8_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "flake8-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "flake8-{}-fatal".format(d.getVar("SCA_MODE"))))

    _suppress = get_suppress_entries(d)

    _args = [os.environ.get("PYTHON", d.getVar('SCA_STD_PYTHON_INTERPRETER')), "-m", "flake8"]
    _args += ["--isolated"]
    _args += ["--ignore={}".format(",".join(_suppress))]
    _args += ["-j", d.getVar("BB_NUMBER_THREADS")]

    _files = get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), d.getVar("SCA_PYTHON_SHEBANG"), ".py",
                                               sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    ## Run
    tmp_result = os.path.join(d.getVar("T", True), "sca_raw_flake8.txt")
    d.setVar("SCA_RAW_RESULT_FILE", tmp_result)
    cmd_output = ""
    if any(_files):
        try:
            cmd_output = subprocess.check_output(_args + _files, universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            cmd_output = e.stdout or ""
    with open(tmp_result, "w") as o:
        o.write(cmd_output)
    
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/flake8.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_flake8(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "flake8", get_fatal_entries(d))
}

## addtask do_static_code_analysis_flake8 before do_install after do_compile

DEPENDS += "${SCA_STD_PYTHON_INTERPRETER}-flake8-sca-native"
