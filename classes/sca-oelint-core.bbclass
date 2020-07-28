## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

SCA_OELINT_EXTRA_SUPPRESS ?= ""
SCA_OELINT_EXTRA_FATAL ?= ""
SCA_OELINT_IGNORE_SPARED_LAYER ?= "1"
SCA_OELINT_EXTRA_KNOWN_MACHINES ?= ""
SCA_OELINT_EXTRA_KNOWN_VARS ?= ""
SCA_OELINT_EXTRA_MANDATORY_VARS ?= ""
SCA_OELINT_EXTRA_PROTECTED_VARS ?= ""
SCA_OELINT_EXTRA_PROTECTED_APPEND_VARS ?= ""
SCA_OELINT_EXTRA_SUGGESTED_VARS ?= ""
# Note: format is mirror:replacement without any ${} framing
SCA_OELINT_EXTRA_KNOWN_MIRRORS ?= ""
SCA_OELINT_CUSTOM_RULES ?= "${STAGING_DATADIR_NATIVE}/oelint-rules"

SCA_RAW_RESULT_FILE[oelint] = "txt"

DEPENDS += "python3-oelint-adv-native"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-helper
inherit sca-license-filter
inherit sca-suppress
inherit python3native

def do_sca_conv_oelint(d, _files):
    import os
    import re

    package_name = d.getVar("PN", True)
    buildpath = d.getVar("SCA_SOURCES_DIR")

    items = []
    pattern = r"^(?P<file>.*?):(?P<line>\d+):(?P<severity>(warning|error|info)):(?P<id>.*?):(?P<message>.*)$"

    severity_map = {
        "error" : "error",
        "warning" : "warning",
        "info": "info"
    }
    _findings = []
    _suppress = sca_suppress_init(d, "SCA_OELINT_EXTRA_SUPPRESS",
                                  d.expand("${STAGING_DATADIR_NATIVE}/oelint-${SCA_MODE}-suppress"),
                                  file_trace=False)
    _spared_layer_files = _files
    if d.getVar("SCA_OELINT_IGNORE_SPARED_LAYER") == "1":
        _spared_layer_files = sca_files_part_of_unspared_layer(d, _files)

    if os.path.exists(sca_raw_result_file(d, "oelint")):
        with open(sca_raw_result_file(d, "oelint"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    if not m.group("file") in _spared_layer_files:
                        # if file is not in unspared layer continue
                        continue
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            BuildPath=sca_get_layer_path_for_file(d, m.group("file")),
                                            Tool="oelint",
                                            File=m.group("file"),
                                            Line=m.group("line"),
                                            Message=m.group("message"),
                                            ID=m.group("id").replace(".", "_"),
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

do_sca_oelint_core[vardepsexclude] += "BBINCLUDED"
python do_sca_oelint_core() {
    import os
    import subprocess
    import glob
    import json

    _constantfile = os.path.join(d.getVar("T"), "oelint-constants.json")
    _contantcontent = {
        "known_machines": clean_split(d, "SCA_OELINT_EXTRA_KNOWN_MACHINES"),
        "known_vars": clean_split(d, "SCA_OELINT_EXTRA_KNOWN_VARS"),
        "mandatory_vars": clean_split(d, "SCA_OELINT_EXTRA_MANDATORY_VARS"),
        "protected_vars": clean_split(d, "SCA_OELINT_EXTRA_PROTECTED_VARS"),
        "protected_append_vars": clean_split(d, "SCA_OELINT_EXTRA_PROTECTED_APPEND_VARS"),
        "protected_vars": clean_split(d, "SCA_OELINT_EXTRA_SUGGESTED_VARS"),
        "known_mirrors": {}
    }
    for x in clean_split(d, "SCA_OELINT_EXTRA_KNOWN_MIRRORS"):
        chunks = x.split(":")
        if len(chunks) > 1:
            _contantcontent["known_mirrors"]["${{{}}}".format(chunks[0])] = ":".join(chunks[1:])

    with open(_constantfile, "w") as o:
        json.dump(_contantcontent, o)

    _args = ['nativepython3', '-m', 'oelint_adv']
    _args += ["--output={}".format(sca_raw_result_file(d, "oelint"))]
    _args += ["--constantfile={}".format(_constantfile)]
    if bb.data.inherits_class('image', d):
        # On images we don't need certain rules
        _args += ["--suppress=oelint.var.mandatoryvar"]
        _args += ["--suppress=oelint.var.suggestedvar"]
        _args += ["--suppress=oelint.var.bbclassextend"]
    for x in clean_split(d, "SCA_OELINT_CUSTOM_RULES"):
        _args += ["--customrules={}".format(x)]
    _files = [x.strip() for x in d.getVar("BBINCLUDED").split(" ") if x.strip().endswith(".bb") or x.strip().endswith(".bbappend")]

    with open(sca_raw_result_file(d, "oelint"), "w") as o:
        o.write("")

    if any(_files):
        _args += _files
        try:
            subprocess.check_output(_args, universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            pass

    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/oelint.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_oelint(d, _files)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "oelint", get_fatal_entries(d, "SCA_OELINT_EXTRA_FATAL", 
                        d.expand("${STAGING_DATADIR_NATIVE}/oelint-${SCA_MODE}-fatal")))
}
