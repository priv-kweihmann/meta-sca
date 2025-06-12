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
SCA_OELINT_EXTRA_LAYERS ?= "\
    clang-layer \
    core \
    filesystems-layer \
    flutter-layer \
    freescale-distro \
    freescale-layer \
    gnome-layer \
    intel \
    meta-initramfs \
    meta-python \
    meta-sca \
    multimedia-layer \
    networking-layer \
    openembedded-layer \
    perl-layer \
    qt6-layer \
    rubygems \
    virtualization-layer \
    webkit \
    webserver \
    xfce-layer \
    yocto \
    yoctobsp \
"
SCA_OELINT_RELEASE ?= "${LAYERSERIES_COMPAT_core}"
# check mode - fast or all
SCA_OELINT_MODE ?= "fast"
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
inherit sca-image-backtrack
inherit python3native

def do_sca_conv_oelint(d):
    import os
    import re

    package_name = d.getVar("PN")

    pattern = r"^(?P<file>.*?):(?P<line>\d+):(?P<severity>(warning|error|info)):(?P<id>.*?):(?P<message>.*)$"

    severity_map = {
        "error" : "error",
        "warning" : "warning",
        "info": "info"
    }
    _findings = []
    _suppress = sca_suppress_init(d, clean_split(d, "SCA_OELINT_EXTRA_SUPPRESS"),
                                  d.expand("${STAGING_DATADIR_NATIVE}/oelint-${SCA_MODE}-suppress"),
                                  file_trace=False)

    if os.path.exists(sca_raw_result_file(d, "oelint")):
        with open(sca_raw_result_file(d, "oelint"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    if d.getVar("SCA_OELINT_IGNORE_SPARED_LAYER") == "1":
                        if m.group("file") not in sca_applicable(d, [m.group("file")]):
                            # if sca is not applicable skip here
                            sca_log_note(d, f'{m.group("file")} is not applicable')
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
                        _findings += sca_backtrack_findings(d, g)
                except Exception as exp:
                    sca_log_note(d, str(exp))

    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

do_sca_oelint_core[vardepsexclude] += "BBFILE_COLLECTIONS BBINCLUDED"
python do_sca_oelint_core() {
    import os
    import subprocess
    import glob
    import json

    def create_dict(d, var, sep=':'):
        res = {}
        for item in clean_split(d, var):
            k, v = item.split(sep)
            if k and v:
                res[f'${{{k}}}'] = v
        return res

    _constantfile = os.path.join(d.getVar("T"), "oelint-constants.json")
    _contantcontent = {
        "replacements": {
            "machines": clean_split(d, "SCA_OELINT_EXTRA_KNOWN_MACHINES"),
            "mirrors": create_dict(d, "SCA_OELINT_EXTRA_KNOWN_MIRRORS"),
        },
        "variables": {
            "known": clean_split(d, "SCA_OELINT_EXTRA_KNOWN_VARS"),
            "mandatory": clean_split(d, "SCA_OELINT_EXTRA_MANDATORY_VARS"),
            "protected": clean_split(d, "SCA_OELINT_EXTRA_PROTECTED_VARS"),
            "protected-append": clean_split(d, "SCA_OELINT_EXTRA_PROTECTED_APPEND_VARS"),
            "suggested": clean_split(d, "SCA_OELINT_EXTRA_SUGGESTED_VARS"),
        }
    }

    with open(_constantfile, "w") as o:
        json.dump(_contantcontent, o)

    _layer_collection = [x.strip() for x in (d.getVar('BBFILE_COLLECTIONS') or '').split(' ') if x.strip()]

    _args = ['nativepython3', '-m', 'oelint_adv']
    _args += ["--quiet"]
    _args += ['--release={}'.format(d.getVar('SCA_OELINT_RELEASE'))]
    _args += ["--constantmods=+{}".format(_constantfile)]
    _args += [f"--extra-layer={x}" for x in (d.getVar('SCA_OELINT_EXTRA_LAYERS') or '').split(' ') if x in _layer_collection]
    _args += ["--mode={}".format(d.getVar('SCA_OELINT_MODE'))]
    if bb.data.inherits_class('image', d):
        # On images we don't need certain rules
        _args += ["--suppress=oelint.var.mandatoryvar"]
        _args += ["--suppress=oelint.var.suggestedvar"]
        _args += ["--suppress=oelint.var.bbclassextend"]
    for x in clean_split(d, "SCA_OELINT_CUSTOM_RULES"):
        _args += ["--customrules={}".format(x)]

    def applicable_files(f):
        import fnmatch
        _, ext = os.path.splitext(f)
        if ext in ['.bb', '.bbappend']:
            return True
        if fnmatch.fnmatch(f, '*/distro/*.conf'):
            return True
        if fnmatch.fnmatch(f, '*/machine/*.conf'):
            return True
        if fnmatch.fnmatch(f, '*/layer.conf'):
            return True
        return False
        
    _files = list(set(x.strip() for x in d.getVar("BBINCLUDED").split(" ") if applicable_files(x.strip()) and os.path.exists(x.strip())))

    # Prevent loading of user config
    os.environ["HOME"] = d.getVar("T")
    cmd_output = exec_wrap_check_output(d, _args, _files)

    with open(sca_raw_result_file(d, "oelint"), "w") as o:
        o.write(cmd_output)

    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/oelint.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_oelint(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "oelint", get_fatal_entries(d, clean_split(d, "SCA_OELINT_EXTRA_FATAL"),
                        d.expand("${STAGING_DATADIR_NATIVE}/oelint-${SCA_MODE}-fatal")))
}

do_sca_oelint_core[vardeps] += "\
    SCA_OELINT_CUSTOM_RULES \
    SCA_OELINT_EXTRA_FATAL \
    SCA_OELINT_EXTRA_KNOWN_MACHINES \
    SCA_OELINT_EXTRA_KNOWN_MIRRORS \
    SCA_OELINT_EXTRA_KNOWN_VARS \
    SCA_OELINT_EXTRA_MANDATORY_VARS \
    SCA_OELINT_EXTRA_PROTECTED_APPEND_VARS \
    SCA_OELINT_EXTRA_PROTECTED_VARS \
    SCA_OELINT_EXTRA_SUGGESTED_VARS \
    SCA_OELINT_EXTRA_SUPPRESS \
    SCA_OELINT_RELEASE \
    SCA_SCOPE_FILTER \
    SCA_SEVERITY_TRANSFORM \
    SCA_SUPPRESS_LOCALS \
"
