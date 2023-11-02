## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2020, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_PKGQAENC_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_PKGQAENC_EXTRA_FATAL ?= ""

SCA_PKGQAENC_PERM_MAX_MASK[default] ?= "0644"
SCA_PKGQAENC_PERM_MAX_MASK[dir] ?= "0644"
SCA_PKGQAENC_PERM_MAX_MASK[application_x-executable] ?= "0755"
SCA_PKGQAENC_PERM_MAX_MASK[application_x-pie-executable] ?= "0755"
SCA_PKGQAENC_PERM_MAX_MASK[application_x-sh] ?= "0755"
SCA_PKGQAENC_PERM_MAX_MASK[application_x-shellscript] ?= "0755"
SCA_PKGQAENC_PERM_MAX_MASK[script] ?= "0755"
SCA_PKGQAENC_PERM_MIN_MASK[default] ?= "0400"
SCA_PKGQAENC_ACCEPTABLE_DIRS ?= "\
                                ${bindir} \
                                ${datadir} \
                                ${infodir} \
                                ${libdir} \
                                ${libexecdir} \
                                ${localstatedir} \
                                ${nonarch_base_libdir} \
                                ${sbindir} \
                                ${servicedir} \
                                ${sharedstatedir} \
                                ${sysconfdir} \
                                ${systemd_system_unitdir} \
                                ${systemd_unitdir} \
                                ${systemd_user_unitdir} \
                                bin \
                                "
SCA_PKGQAENC_ACCEPTABLE_SHEBANG ?= ""
SCA_PKGQAENC_BLOCKLIST_SHEBANG ?= ""
SCA_PKGQAENC_BLOCKLIST_DIRS ?= "\
                                ${infodir} \
                                ${mandir} \
                                ${docdir} \
                                "
SCA_PKGQAENC_BLOCKLIST_FILES ?= "\
                                .c \
                                .cpp \
                                .h \
                                .hpp \
                                .man \
                                text/x-c \
                                "
SCA_PKGQAENC_NO_COPY_CHECK ?= "\
                                application/x-executable \
                                application/x-sharedlib \
                                application/x-pie-executable \
                               "
SCA_PKGQAENC_EXEC_CHECK ?= "\
                             application/x-executable \
                             application/x-pie-executable \
                             script \
                            "
SCA_PKGQAENC_ALLOWLIST_FILES ?= ""
SCA_PKGQAENC_BLOCKLIST_FILES-dev ?= "\
                                    application/x-executable \
                                    application/x-sharedlib \
                                    application/x-pie-executable \
                                    "

SCA_PKGQAENC_NO_COPY_NO_CHECK_CLASSES ?= "bin_package"

SCA_RAW_RESULT_FILE[pkgqaenc] = "txt"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress
inherit sca-image-backtrack

inherit sca-pkgqaenc-pyident
inherit sca-pkgqaenc-hashdog
inherit sca-pkgqaenc-shellident


def do_sca_conv_pkgqaenc(d):
    import os
    import re
    import hashlib

    package_name = d.getVar("PN")
    buildpath = d.getVar("PKGDEST")

    items = []
    pattern = r"^WARNING:\s+\[(?P<id>.*?)\]:\s+(?P<path>.*?):\s+(?P<msg>.*)"

    _suppress = sca_suppress_init(d, clean_split(d, "SCA_PKGQAENC_EXTRA_SUPPRESS"),
                                  d.expand("${STAGING_DATADIR_NATIVE}/pkgqaenc-${SCA_MODE}-suppress"),
                                  file_trace=False)
    _findings = []

    if os.path.exists(sca_raw_result_file(d, "pkgqaenc")):
        with open(sca_raw_result_file(d, "pkgqaenc"), "r") as f:
            content = f.read()
            for m in re.finditer(pattern, content, re.MULTILINE):
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="pkgqaenc",
                                            BuildPath=buildpath,
                                            File=m.group("path"),
                                            Message=m.group("msg"),
                                            ID=m.group("id"),
                                            Severity="warning")
                    if _suppress.Suppressed(g):
                        continue
                    if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                        continue
                    if g.Severity in sca_allowed_warning_level(d):
                        _findings += sca_backtrack_findings(d, g)
                except Exception as e:
                    sca_log_note(d, str(e))
    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

def do_sca_pkgqaenc_core(d, package):
    import os
    import subprocess
    import json
    from urllib.parse import unquote

    def pkg_spec_or_default(d, key, suffix):
        _val = d.getVar(f"{key}{suffix}")
        if isinstance(_val, str) and _val.strip():
            return [x for x in _val.split(" ") if x]
        return [x for x in d.getVar(f"{key}").split(" ") if x]
    
    def pkg_spec_or_default_varflag(d, key, suffix):
        _val = d.getVarFlags(f"{key}{suffix}")
        if _val:
            return [x for x in _val.split(" ") if x]
        return d.getVarFlags(f"{key}")

    _config_tmp = os.path.join(d.getVar("T"), "pkgqaenc.conf")
    try:
        os.remove(_config_tmp)
    except:
        pass
    os.environ["MAGIC"] = os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "misc/magic.mgc")
    _args = ["nativepython3", os.path.join(d.getVar("STAGING_BINDIR_NATIVE"), "pkgqaenc")]
    _args += ["--debug"]
    _args += [_config_tmp]
    
    _suffix = package.replace(d.getVar("PN"), "", 1)
    conf = {
        "minMask": {},
        "maxMask": {},
        "acceptableDirs": [],
        "acceptableShebang": [],
        "blacklistShebang": [],
        "blacklistDirs": [],
        "blacklistFiles": [],
        "nocopyCheck": [],
        "execCheck": [],
        "sourceChecksum": d.expand("${SCA_SOURCECHECKSUM}")
    }
    for k, v in (d.getVarFlags("SCA_PKGQAENC_PERM_MAX_MASK{}".format(_suffix)) or {}).items():
        if "maxMask" not in conf:
            conf["maxMask"] = {}
        conf["maxMask"][k.replace("_", "/")] = v
    for k, v in (d.getVarFlags("SCA_PKGQAENC_PERM_MIN_MASK{}".format(_suffix)) or {}).items():
        if "minMask" not in conf:
            conf["minMask"] = {}
        conf["minMask"][k.replace("_", "/")] = v
    conf["acceptableDirs"] = pkg_spec_or_default(d, "SCA_PKGQAENC_ACCEPTABLE_DIRS", _suffix)
    conf["blacklistDirs"] = pkg_spec_or_default(d, "SCA_PKGQAENC_BLOCKLIST_DIRS", _suffix)
    conf["acceptableShebang"] = [unquote(x) for x in pkg_spec_or_default(d, "SCA_PKGQAENC_ACCEPTABLE_SHEBANG", _suffix) if x]
    conf["blacklistShebang"] = [unquote(x) for x in pkg_spec_or_default(d, "SCA_PKGQAENC_BLOCKLIST_SHEBANG", _suffix) if x]
    conf["blacklistFiles"] = pkg_spec_or_default(d, "SCA_PKGQAENC_BLOCKLIST_FILES", _suffix)
    conf["whitelistFiles"] = pkg_spec_or_default(d, "SCA_PKGQAENC_ALLOWLIST_FILES", _suffix)
    conf["execCheck"] = pkg_spec_or_default(d, "SCA_PKGQAENC_EXEC_CHECK", _suffix)
    if not any(bb.data.inherits_class(x, d) for x in clean_split(d, "SCA_PKGQAENC_NO_COPY_NO_CHECK_CLASSES")):
        conf["nocopyCheck"] = clean_split(d, "SCA_PKGQAENC_NO_COPY_CHECK{}".format(_suffix))
    with open(_config_tmp, "w") as o:
        json.dump(conf, o)
    _destDir = os.path.join(d.getVar("PKGDEST"), package)
    try:
        return subprocess.check_output(_args + [_destDir], universal_newlines=True, stderr=subprocess.STDOUT)
    except subprocess.CalledProcessError as e:
        return e.stdout or ""

def do_sca_pkgqaenc_pkg_process(p, d):
    cmd_output = do_sca_pkgqaenc_core(d, p)
    cmd_output += do_sca_pkgqaenc_shelllist(d, p)
    cmd_output += do_sca_pkgqaenc_pythonident(d, p)
    return cmd_output

python do_sca_pkgqaenc() {
    results = oe.utils.multiprocess_launch(do_sca_pkgqaenc_pkg_process, clean_split(d, "PACKAGES"), d, extraargs=(d,))
    cmd_output = "\n".join(results)
    cmd_output += do_sca_pkgqaenc_hashdog(d)

    with open(sca_raw_result_file(d, "pkgqaenc"), "w") as o:
        o.write(cmd_output)

    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/pkgqaenc.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_pkgqaenc(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "pkgqaenc", get_fatal_entries(d, clean_split(d, "SCA_PKGQAENC_EXTRA_FATAL"),
                        d.expand("${STAGING_DATADIR_NATIVE}/pkgqaenc-${SCA_MODE}-fatal")))
}


do_sca_pkgqaenc[doc] = "Lint produced packages"
do_sca_pkgqaenc[depends] += "python3-native:do_populate_sysroot ${PN}:do_prepare_recipe_sysroot"
do_sca_pkgqaenc[nosdkgen] = "1"
addtask do_sca_pkgqaenc before do_sca_deploy after do_package

DEPENDS += "pkgqaenc-native sca-recipe-pkgqaenc-rules-native python3-native file-native"