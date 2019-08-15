## Add ids to suppress on a recipe level
SCA_CHECKBASHISM_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_CHECKBASHISM_EXTRA_FATAL ?= ""

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-license-filter

def do_sca_conv_checkbashism(d):
    import os
    import re
    import hashlib
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^possible\sbashism\sin\s(?P<file>.*)\sline\s(?P<line>\d+)\s\((?P<id>.*)\)"
    
    __suppress = get_suppress_entries(d)
    _findings = []
    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        with open(d.getVar("SCA_RAW_RESULT_FILE"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    ## This tool does not have explicit IDs
                    ## so we are creating one from the hash of the message
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="checkbashism",
                                            BuildPath=buildpath,
                                            File=m.group("file"),
                                            Line=m.group("line"),
                                            Message=m.group("id"),
                                            ID=hashlib.md5(str.encode(m.group("id"))).hexdigest(),
                                            Severity="warning")
                    if g.GetFormattedID() in __suppress:
                        continue
                    if not sca_is_in_finding_scope(d, "checkbashism", g.GetFormattedID()):
                        continue
                    if g.Severity in sca_allowed_warning_level(d):
                        _findings.append(g)
                except Exception as exp:
                    bb.warn(str(exp))

    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_checkbashism_core() {
    import os
    import subprocess
    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_CHECKBASHISM_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_CHECKBASHISM_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "checkbashism-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "checkbashism-{}-fatal".format(d.getVar("SCA_MODE"))))

    _args = ["checkbashisms.pl"]
    _args += ["-n", "-p"]

    ## Run
    cmd_output = ""
    tmp_result = os.path.join(d.getVar("T", True), "sca_raw_checkbashism.txt")
    d.setVar("SCA_RAW_RESULT_FILE", tmp_result)
    
    _files = get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), ".*/(ba|k)*sh", ".sh",
                                                    sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))
    if any(_files):
        try:
            cmd_output = subprocess.check_output(_args + _files, universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            cmd_output = e.stdout or ""
    with open(tmp_result, "w") as o:
        o.write(cmd_output)

    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/checkbashism.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_checkbashism(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "checkbashism", get_fatal_entries(d))
}

DEPENDS += "checkbashism-native"
