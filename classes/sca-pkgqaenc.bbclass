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
SCA_PKGQAENC_BLACKLIST_SHEBANG ?= ""
SCA_PKGQAENC_BLACKLIST_DIRS ?= "\
                                ${infodir} \
                                ${mandir} \
                                ${docdir} \
                                "
SCA_PKGQAENC_BLACKLIST_FILES ?= "\
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
SCA_PKGQAENC_WHITELIST_FILES ?= ""
SCA_PKGQAENC_BLACKLIST_FILES-dev ?= "\
                                    application/x-executable \
                                    application/x-sharedlib \
                                    application/x-pie-executable \
                                    "

SCA_PKGQAENC_SOURCECHECKSUM ?= "${T}/sca_seen_sources.txt"
SCA_PKGQAENC_NO_COPY_NO_CHECK_CLASSES ?= "bin_package"
SCA_RAW_RESULT_FILE[pkgqaenc] = "txt"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress
inherit sca-image-backtrack

def do_sca_conv_pkgqaenc(d):
    import os
    import re
    import hashlib

    package_name = d.getVar("PN")
    buildpath = d.getVar("PKGDEST")

    items = []
    pattern = r"^WARNING:\s+\[(?P<id>.*?)\]:\s+(?P<path>.*?):\s+(?P<msg>.*)"

    _suppress = sca_suppress_init(d, "SCA_PKGQAENC_EXTRA_SUPPRESS",
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

do_sca_pkgqaenc_pre() {
    echo "" > ${SCA_PKGQAENC_SOURCECHECKSUM}
    find ${S} -type f -exec md5sum {} >> ${SCA_PKGQAENC_SOURCECHECKSUM} \;
}

python do_sca_pkgqaenc() {
    import os
    import subprocess
    import json
    from urllib.parse import unquote

    _config_tmp = os.path.join(d.getVar("T"), "pkgqaenc.conf")
    os.environ["MAGIC"] = os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "misc/magic.mgc")
    _args = ["nativepython3", os.path.join(d.getVar("STAGING_BINDIR_NATIVE"), "pkgqaenc")]
    _args += ["--debug"]
    _args += [_config_tmp]

    cmd_output = ""

    for p in clean_split(d, "PACKAGES"):
        _suffix = p.replace(d.getVar("PN"), "", 1)
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
            "sourceChecksum": d.expand("${SCA_PKGQAENC_SOURCECHECKSUM}")
        }
        for k, v in (d.getVarFlags("SCA_PKGQAENC_PERM_MAX_MASK{}".format(_suffix)) or {}).items():
            if "maxMask" not in conf:
                conf["maxMask"] = {}
            conf["maxMask"][k.replace("_", "/")] = v
        for k, v in (d.getVarFlags("SCA_PKGQAENC_PERM_MIN_MASK{}".format(_suffix)) or {}).items():
            if "minMask" not in conf:
                conf["minMask"] = {}
            conf["minMask"][k.replace("_", "/")] = v
        conf["acceptableDirs"] = [x for x in (d.getVar("SCA_PKGQAENC_ACCEPTABLE_DIRS{}".format(_suffix)) or "").split(" ") if x]
        conf["blacklistDirs"] = [x for x in (d.getVar("SCA_PKGQAENC_BLACKLIST_DIRS{}".format(_suffix)) or "").split(" ") if x]
        conf["acceptableShebang"] = [unquote(x) for x in (d.getVar("SCA_PKGQAENC_ACCEPTABLE_SHEBANG{}".format(_suffix)) or "").split(" ") if x]
        conf["blacklistShebang"] = [unquote(x) for x in (d.getVar("SCA_PKGQAENC_BLACKLIST_SHEBANG{}".format(_suffix)) or "").split(" ") if x]
        conf["blacklistFiles"] = [x for x in (d.getVar("SCA_PKGQAENC_BLACKLIST_FILES{}".format(_suffix)) or "").split(" ") if x]
        conf["whitelistFiles"] = [x for x in (d.getVar("SCA_PKGQAENC_WHITELIST_FILES{}".format(_suffix)) or "").split(" ") if x]
        conf["execCheck"] = [x for x in (d.getVar("SCA_PKGQAENC_EXEC_CHECK{}".format(_suffix)) or "").split(" ") if x]
        if not any(bb.data.inherits_class(x, d) for x in clean_split(d, "SCA_PKGQAENC_NO_COPY_NO_CHECK_CLASSES")):
            conf["nocopyCheck"] = clean_split(d, "SCA_PKGQAENC_NO_COPY_CHECK{}".format(_suffix))
        with open(_config_tmp, "w") as o:
            json.dump(conf, o)
        _destDir = os.path.join(d.getVar("PKGDEST"), p)
        try:
            cmd_output += subprocess.check_output(_args + [_destDir], universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            cmd_output += e.stdout or ""

    with open(sca_raw_result_file(d, "pkgqaenc"), "w") as o:
        o.write(cmd_output)

    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/pkgqaenc.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_pkgqaenc(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "pkgqaenc", get_fatal_entries(d, "SCA_PKGQAENC_EXTRA_FATAL",
                        d.expand("${STAGING_DATADIR_NATIVE}/pkgqaenc-${SCA_MODE}-fatal")))
}

do_sca_pkgqaenc_pre[doc] = "Package linter pre function"
do_sca_pkgqaenc_pre[dirs] = "${S}"
do_sca_pkgqaenc[doc] = "Lint produced packages"
addtask do_sca_pkgqaenc_pre before do_configure after do_patch
addtask do_sca_pkgqaenc before do_sca_deploy after do_package

DEPENDS += "pkgqaenc-native sca-recipe-pkgqaenc-rules-native"