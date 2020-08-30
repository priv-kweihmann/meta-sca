## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## This class does parse the bitbake log for WARNING and ERROR strings
CONLOG = "${LOG_DIR}/cooker/${MACHINE}/console-latest.log"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress

SCA_BITBAKE_HARDENING ?= "\
                          debug_tweaks \
                          insane_skip \
                          security_flags \
                          "

SCA_RAW_RESULT_FILE[bitbake] = "txt"

def do_sca_bitbake_hardening(d):
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")
    _modules = clean_split(d, "SCA_BITBAKE_HARDENING")
    _findings = []
    _suppress = sca_suppress_init(d, "", None, file_trace=False)

    if "debug_tweaks" in _modules:
        ## debug_tweaks in IMAGE_FEATURES isn't used in release build
        if "debug_tweaks" in clean_split(d, "IMAGE_FEATURES") and d.getVar("DEBUG_BUILD") != "1":
            g = sca_get_model_class(d,
                                    PackageName=package_name,
                                    Tool="bitbake",
                                    BuildPath=sca_get_layer_path_for_file(d, d.getVar("FILE")),
                                    File=d.getVar("FILE"),
                                    Message="debug_tweaks is set in IMAGE_FEATURES",
                                    ID="hardening.debug_tweaks",
                                    Severity="warning")
            if not _suppress.Suppressed(g) and g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                if g.Severity in sca_allowed_warning_level(d):
                    _findings.append(g)
    if "insane_skip" in _modules:
        ## INSANE_SKIP isn't used anywhere
        if clean_split(d, "INSANE_SKIP_{}".format(d.getVar("PN"))):
            g = sca_get_model_class(d,
                                    PackageName=package_name,
                                    Tool="bitbake",
                                    BuildPath=sca_get_layer_path_for_file(d, d.getVar("FILE")),
                                    File=d.getVar("FILE"),
                                    Message="INSANE_SKIP is used in recipe",
                                    ID="hardening.insane_skip",
                                    Severity="warning")
            if not _suppress.Suppressed(g) and g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                if g.Severity in sca_allowed_warning_level(d):
                    _findings.append(g)
    if "security_flags" in _modules:
        _files = clean_split(d, "BBINCLUDED")
        ## Check that security_flags from poky are somehow included
        if not any([x for x in _files if x.endswith("meta/conf/distro/include/security_flags.inc")]):
            g = sca_get_model_class(d,
                                    PackageName=package_name,
                                    Tool="bitbake",
                                    BuildPath=sca_get_layer_path_for_file(d, d.getVar("FILE")),
                                    File=d.getVar("FILE"),
                                    Message="security_flags.inc aren't used for building this recipe",
                                    ID="hardening.insane_skip",
                                    Severity="warning")
            if not _suppress.Suppressed(g) and g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                if g.Severity in sca_allowed_warning_level(d):
                    _findings.append(g)

    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

def do_sca_conv_bitbake(d):
    import os
    import re

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^(?P<severity>WARNING|ERROR):\s+{}-{}-{}\s+(?P<task>.*):\s+(?P<message>.*)$".format(
               sca_regex_safe(d, "PN"), sca_regex_safe(d, "PKGV"), sca_regex_safe(d, "PR"))

    severity_map = {
        "ERROR" : "error",
        "WARNING" : "warning",
    }

    _suppress = sca_suppress_init(d, "", None, file_trace=False)
    _excludes = sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA"))

    _findings = []
    if os.path.exists(sca_raw_result_file(d, "bitbake")):
        with open(sca_raw_result_file(d, "bitbake"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="bitbake",
                                            BuildPath=sca_get_layer_path_for_file(d, d.getVar("FILE")),
                                            File=d.getVar("FILE"),
                                            Message="{}: {}".format(m.group("task"), m.group("message")),
                                            ID=m.group("severity"),
                                            Severity=severity_map[m.group("severity")])
                    if g.File in _excludes:
                        continue
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

do_sca_bitbake[vardepsexlude] += "BBINCLUDED"
python do_sca_bitbake () {
    content = ""
    with open(d.getVar("CONLOG")) as f:
        content = f.read()
    with open(sca_raw_result_file(d, "bitbake"), "w") as o:
        o.write(content)

    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/bitbake.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_bitbake(d)
    dm_output = do_sca_bitbake_hardening(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "bitbake", get_fatal_entries(d, "", None))
}

DEPENDS += "bitbake-sca-native"
