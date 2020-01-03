## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-license-filter
inherit sca-suppress

inherit ${@oe.utils.ifelse(d.getVar('SCA_STD_PYTHON_INTERPRETER') == 'python3', 'python3native', 'pythonnative')}

SCA_VULTURE_EXTRA_FATAL ?= ""
SCA_VULTURE_MIN_CONFIDENCE ?= "80"

def do_sca_conv_vulture(d):
    import os
    import re
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    _suppress = sca_suppress_init(d)

    pattern = r"^(?P<file>.*):(?P<line>\d+):\s*(?P<message>.*)"

    _findings = []

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        with open(d.getVar("SCA_RAW_RESULT_FILE"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                _id = "deadcode"
                _sev = "warning"
                if m.group("message").startswith("invalid syntax"):
                    _id = "syntaxerror"
                    _sev = "error"
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="vulture",
                                            BuildPath=buildpath,
                                            File=m.group("file"),
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

python do_sca_vulture_core() {
    import os
    import subprocess
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_VULTURE_EXTRA_FATAL"))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "vulture-{}-fatal".format(d.getVar("SCA_MODE"))))

    _args = [os.environ.get("PYTHON", d.getVar('SCA_STD_PYTHON_INTERPRETER')), "-m", "vulture"]
    _args += ["--min-confidence", d.getVar("SCA_VULTURE_MIN_CONFIDENCE")]

    _files = get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), d.getVar("SCA_PYTHON_SHEBANG"), ".py",
                                               sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    ## Run
    tmp_result = os.path.join(d.getVar("T", True), "sca_raw_vulture.txt")
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
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/vulture.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_vulture(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "vulture", get_fatal_entries(d))
}

DEPENDS += "${SCA_STD_PYTHON_INTERPRETER}-vulture-native"
