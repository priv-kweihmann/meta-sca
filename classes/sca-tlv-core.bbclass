## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-license-filter
inherit sca-suppress

SCA_TLV_MINLINES ?= "8"
SCA_TLV_MINTOKEN ?= "50"

def do_sca_conv_tlv(d):
    import os
    import re
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^(?P<file>.*):(?P<line>\d+):(?P<col>\d+):\[(?P<id>.*)\]:(?P<message>.*)"

    severity_map = {
        "Duplicate" : "error",
        "TooLessVariation" : "warning"
    }
    _suppress = sca_suppress_init(d)
    _findings = []

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        with open(d.getVar("SCA_RAW_RESULT_FILE"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="tlv",
                                            BuildPath=buildpath,
                                            File=m.group("file"),
                                            Line=m.group("line"),
                                            Column=m.group("col"),
                                            Message=m.group("message"),
                                            ID=m.group("id"),
                                            Severity=severity_map[m.group("id")])
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

python do_sca_tlv_core() {
    import os
    import subprocess

    _args = ["tlv"]
    _args += ["--nodetails"]
    _args += ["--minlines={}".format(d.getVar("SCA_TLV_MINLINES"))]
    _args += ["--mintoken={}".format(d.getVar("SCA_TLV_MINTOKEN"))]
    _args += ["--jobs={}".format(d.getVar("BB_NUMBER_THREADS"))]

    ## Run
    _files = get_files_by_glob(d, d.getVar("SCA_TLV_FILES"), 
                               sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))
    tmp_result = os.path.join(d.getVar("T", True), "sca_raw_tlv.txt")
    d.setVar("SCA_RAW_RESULT_FILE", tmp_result)
    cmd_output = ""
    if any(_files):
        try:
            cmd_output = subprocess.check_output(_args + _files, universal_newlines=True)
        except subprocess.CalledProcessError as e:
            cmd_output = e.stdout or ""
    with open(tmp_result, "w") as o:
        o.write(cmd_output)
    
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/tlv.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_tlv(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "tlv", get_fatal_entries(d))
}

## addtask do_static_code_analysis_tlv before do_install after do_compile

DEPENDS += "python3-tlv-native"
