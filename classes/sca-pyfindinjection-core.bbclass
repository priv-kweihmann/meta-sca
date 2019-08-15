## Add ids to suppress on a recipe level
SCA_PYFINDINJECTION_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_PYFINDINJECTION_EXTRA_FATAL ?= ""

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-license-filter

def do_sca_conv_pyfindinjection(d):
    import os
    import re
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^(?P<file>.*):(?P<line>\d*)\t+(?P<msg>.*)"

    severity_map = {
        "string interpolation of SQL query" : {"error", "string.interpolation"},
        "string concatenation of SQL query" : ("error", "string.concat"),
        "str.format called on SQL query" : ("error", "string.format"),
        "eval() is just generally evil" : ("error", "evil.eval"),
    }

    _suppress = get_suppress_entries(d)
    _excludes = sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA"))
    _findings = []

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        with open(d.getVar("SCA_RAW_RESULT_FILE"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    _sev, _id = severity_map[m.group("msg")]
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="pyfindinjection",
                                            BuildPath=buildpath,
                                            File=m.group("file"),
                                            Line=m.group("line"),
                                            Message=m.group("msg"),
                                            ID=_id,
                                            Severity=_sev)
                    if g.File in _excludes:
                        continue
                    if g.GetFormattedID() in _suppress:
                        continue
                    if not sca_is_in_finding_scope(d, "pyfindinjection", g.GetFormattedID()):
                        continue
                    if g.Severity in sca_allowed_warning_level(d):
                        _findings.append(g)
                except Exception as exp:
                    bb.warn(str(exp))

    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_pyfindinjection_core() {
    import os
    import subprocess
    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_PYFINDINJECTION_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_PYFINDINJECTION_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "pyfindinjection-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "pyfindinjection-{}-fatal".format(d.getVar("SCA_MODE"))))

    _args = [os.path.join(d.getVar("STAGING_BINDIR_NATIVE"), "python-native", "python")]
    _args += [os.path.join(d.getVar("STAGING_BINDIR_NATIVE"), "py-find-injection")]

    result_raw_file = os.path.join(d.getVar("T"), "sca_raw_pyfindinjection.txt")
    d.setVar("SCA_RAW_RESULT_FILE", result_raw_file)

    cmd_output = ""

    ## Run
    _files = get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), d.getVar("SCA_PYTHON_SHEBANG"), ".py",
                                               sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))
    if any(_files):
        try:
            cmd_output = subprocess.check_output(_args + _files, universal_newlines=True)
        except subprocess.CalledProcessError as e:
            cmd_output = e.stdout or ""
    with open(result_raw_file, "w") as o:
        o.write(cmd_output)
    
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/pyfindinjection.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_pyfindinjection(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "pyfindinjection", get_fatal_entries(d))
}

DEPENDS += "python-pyfindinjection-native"
