## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

SCA_STANK_FILE_FILTER ?= ".sh .osh .lksh .csh .cshrc .tcsh .tcshrc .fish .fishrc .ion .ionrc .rc .rcrc .tsh .etsh .elv"
SCA_STANK_SHEBANG ?= ".*ash|bash|csh|dash|elvish|fish|ion|ksh|ksh93|lksh|mksh|pdksh|posh|rc|sh|tcsh|zsh"
SCA_STANK_EXTRA_SUPPRESS ?= ""
SCA_STANK_EXTRA_FATAL ?= ""

SCA_RAW_RESULT_FILE[stank] = "txt"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-license-filter
inherit sca-suppress
inherit sca-image-backtrack

def do_sca_conv_stank(d):
    import os
    import re

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")
    _suppress = sca_suppress_init(d, clean_split(d, "SCA_STANK_EXTRA_SUPPRESS"),
                                  d.expand("${STAGING_DATADIR_NATIVE}/stank-${SCA_MODE}-suppress"))
    _findings = []

    pattern = r"^(?P<msg>.*):\s+(?P<file>.*)"

    _severity_map = {
        "Ambiguous launch style. Either feature a file extensions, or else feature executable bits": ["AmbiguousLaunchStyle", "warning"],
        "CR/CRLF line ending detected": ["LineEnding", "warning"],"CR/CRLF line ending detected": ["LineEnding", "warning"],
        "Clarify interpreter with a shebang line": ["MissingShebang", "error"],
        "Configuration features executable permissions": ["ConfigExecBits", "info"],
        "Configuration features shebang": ["ConfigShebang", "info"],
        "Control program flow like `set -eu` at the top of executable scripts": ["ControlFlow", "warning"],
        "Interpreter mismatch between shebang and extension": ["ShebangMismatch", "warning"],
        "Leading BOM reduces portability": ["Portability", "info"],
        "List traps deprecated in favor of function trap": ["ListTrap", "warning"],
        "Missing `set -E` / `set -o errtrace` to guard traps": ["SetETrap", "warning"],
        "Missing final end of line sequence": ["EOLMissing", "info"],
        "Missing shebang": ["MissingShebang", "error"],
        "Modulino ambiguity. Either have owner executable permissions with no extension, or else remove executable bits and use an extension like .lib.sh": ["ModulinoAmbiguity", "warning"],
        "Rewrite in pure POSIX sh for portability": ["Portability", "info"],
        "Rewrite script in ksh, bash, zsh, etc., and enable debugging flags for robustness": ["Robustness", "info"],
        "Rewrite script in sh, ksh, posh, dash, etc. for performance boost": ["PortabilityShell", "info"],
        "Risk of parse error for interpreter space / secondary argument. Any safety flags will be ignored on `sh <script>` launch": ["RiskyOp", "warning"],
        "Sourceable script features executable mode bits": ["LibScript", "warning"],
        "Tokenize like `unset IFS` at the top of executable scripts": ["Tokenize", "warning"],
        "Traps may reset in subshells": ["TrapSubShell", "warning"],
        "exec discards traps": ["ExecTrap", "warning"],
    }

    if os.path.exists(sca_raw_result_file(d, "stank")):
        with open(sca_raw_result_file(d, "stank"), "r") as f:
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
                    if _suppress.Suppressed(g):
                        continue
                    if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                        continue
                    if g.Severity in sca_allowed_warning_level(d):
                        _findings += sca_backtrack_findings(d, g)
                except Exception as exp:
                    # turn into warn when upgrading version
                    sca_log_note(d, str(exp))

    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_stank_core() {
    import os
    import subprocess

    _args = [
        ["funk", "-modulino"],
        ["stink", "-pp"],
        ["stink", "-cr"],
    ]

    _files = get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), d.getVar("SCA_STANK_SHEBANG"), d.getVar("SCA_STANK_FILE_FILTER"),
                                                      sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    cmd_output = ""
    if any(_files):
        for a in _args:
            cmd_output += exec_wrap_check_output(d, a, _files)

    with open(sca_raw_result_file(d, "stank"), "w") as o:
        o.write(cmd_output)
}

do_sca_stank_core[vardeps] += "\
    SCA_FILE_FILTER_EXTRA \
    SCA_LOCAL_FILE_FILTER \
"

python do_sca_stank_core_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/stank.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_stank(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "stank", get_fatal_entries(d, clean_split(d, "SCA_STANK_EXTRA_FATAL"),
                       d.expand("${STAGING_DATADIR_NATIVE}/stank-${SCA_MODE}-fatal")))
}

do_sca_stank_core_report[vardeps] += "\
    SCA_SCOPE_FILTER \
    SCA_SEVERITY_TRANSFORM \
    SCA_STANK_EXTRA_FATAL \
    SCA_STANK_EXTRA_SUPPRESS \
    SCA_SUPPRESS_LOCALS \
"

DEPENDS += "stank-sca-native"
