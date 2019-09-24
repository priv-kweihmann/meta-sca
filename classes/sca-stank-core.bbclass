## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

SCA_STANK_FILE_FILTER ?= ".sh .osh .lksh .csh .cshrc .tcsh .tcshrc .fish .fishrc .ion .ionrc .rc .rcrc .tsh .etsh .elv"
SCA_STANK_SHEBANG ?= ".*ash|bash|csh|dash|elvish|fish|ion|ksh|ksh93|lksh|mksh|pdksh|posh|rc|sh|tcsh|zsh"
SCA_STANK_EXTRA_SUPPRESS ?= ""
SCA_STANK_EXTRA_FATAL ?= ""

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-license-filter

def do_sca_conv_stank(d):
    import os
    import re
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")
    _suppress = get_suppress_entries(d)
    _findings = []

    pattern = r"^(?P<msg>.*):\s+(?P<file>.*)"

    _severity_map = {
        "CR/CRLF line ending detected"                                      : ["LineEnding", "warning"],
        "Clarify interpreter with a shebang line"                           : ["MissingShebang", "error"],
        "Configuration features executable permissions"                     : ["ConfigExecBits", "info"],
        "Configuration features shebang"                                    : ["ConfigShebang", "info"],
        "Interpreter mismatch between shebang and extension"                : ["ShebangMismatch", "warning"],
        "Leading BOM reduces portability"                                   : ["Portability", "info"],
        "Missing final end of line sequence"                                : ["EOLMissing", "info"],
        "Missing shebang"                                                   : ["MissingShebang", "error"],
        "Modulino ambiguity. Either have owner executable permissions with no extension, or else remove executable bits and use an extension like .lib.sh": ["ModulinoAmbiguity", "warning"],
        "Rewrite in pure POSIX sh for portability"                          : ["Portability", "info"],
        "Rewrite script in ksh, bash, zsh, etc., and enable debugging flags for robustness": ["Robustness", "info"],
        "Rewrite script in sh, ksh, posh, dash, etc. for performance boost" : ["Performance", "info"],
    }
    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        with open(d.getVar("SCA_RAW_RESULT_FILE"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            File=m.group("file"),
                                            BuildPath=buildpath,
                                            Tool="stank",
                                            Message=m.group("msg"),
                                            ID=_severity_map[m.group("msg")][0],
                                            Severity=_severity_map[m.group("msg")][1])
                    if g.GetFormattedID() in _suppress:
                        continue
                    if not sca_is_in_finding_scope(d, "stank", g.GetFormattedID()):
                        continue
                    if g.Severity in sca_allowed_warning_level(d):
                        _findings.append(g)
                except Exception as exp:
                    bb.warn(str(exp))

    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_stank_core() {
    import os
    import subprocess
    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_STANK_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_STANK_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "stank-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "stank-{}-fatal".format(d.getVar("SCA_MODE"))))

    _args = [
        ["rosy", "-kame"],
        ["rosy", "-ahiru"],
        ["rosy", "-usagi"],
        ["funk", "-modulino"],
    ]
    
    _files = get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), d.getVar("SCA_STANK_SHEBANG"), d.getVar("SCA_STANK_FILE_FILTER"),
                                                      sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    result_raw_file = os.path.join(d.getVar("T"), "sca_raw_stank.txt")
    d.setVar("SCA_RAW_RESULT_FILE", result_raw_file)
    cmd_output = ""
    if any(_files):
        for a in _args:
            try:
                cmd_output += subprocess.check_output(a + _files, universal_newlines=True, stderr=subprocess.STDOUT)
            except subprocess.CalledProcessError as e:
                cmd_output += e.stdout or ""
    
    with open(result_raw_file, "w") as o:
        o.write(cmd_output)
    
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/stank.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_stank(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "stank", get_fatal_entries(d))
}

DEPENDS += "stank-native"
