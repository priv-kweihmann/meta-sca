## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_GCC_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_GCC_EXTRA_FATAL ?= ""
## Enable additional hardening checks
SCA_GCC_HARDENING ?= "1"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper

def sca_gcc_hardening(d):
    import re
    import os

    if d.getVar("SCA_GCC_HARDENING") != "1":
        return sca_save_model_to_string(d)
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")
    
    _linker_flags = d.getVar("LDFLAGS")
    _cflags = [x for x in d.getVar("CFLAGS").split(" ") if x] + [x for x in d.getVar("CXXFLAGS").split(" ") if x]
    _cxxflags = [x for x in d.getVar("CXXFLAGS").split(" ") if x] + [x for x in d.getVar("CPPFLAGS").split(" ") if x]

    _suppress = get_suppress_entries(d)
    _excludes = sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA"))

    _findings = []

    logcontent = ""
    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        with open(d.getVar("SCA_RAW_RESULT_FILE"), "r") as f:
            logcontent = f.read()

    for item in ["-z,relro", "-z,now", "-fPIC", "-fPIE"]:
        if not item in _linker_flags and not item in logcontent:
            g = sca_get_model_class(d,
                                    PackageName=package_name,
                                    Tool="gcc",
                                    BuildPath=buildpath,
                                    File=d.getVar("FILE"),
                                    Message="{} is not set in LDFLAGS".format(item),
                                    ID="hardening.linker.{}".format(item.strip("-,")),
                                    Severity="warning")
            if g.File in _excludes or g.GetFormattedID() in _suppress:
                continue
            if not sca_is_in_finding_scope(d, "gcc", g.GetFormattedID()):
                continue
            if g.Severity in sca_allowed_warning_level(d):
                _findings.append(g)
    if not ("-z,nodlopen" in _linker_flags and "-z,nodump" in _linker_flags) and \
       not ("-z,nodlopen" in logcontent and "-z,nodump" in logcontent):
        g = sca_get_model_class(d,
                                PackageName=package_name,
                                Tool="gcc",
                                BuildPath=buildpath,
                                File=d.getVar("FILE"),
                                Message="Neither '-z,nodlopen' nor '-z,nodump' are set in LDFLAGS".format(item),
                                ID="hardening.linker.nodlopen_nodump",
                                Severity="warning")
        if not (g.File in _excludes or g.GetFormattedID() in _suppress) and sca_is_in_finding_scope(d, "gcc", g.GetFormattedID()):
            if g.Severity in sca_allowed_warning_level(d):
                _findings.append(g)
    if not ("-z,noexecstack" in _linker_flags and "-z,noexecheap" in _linker_flags) and \
       not ("-z,noexecstack" in logcontent and "-z,noexecheap" in logcontent):
        g = sca_get_model_class(d,
                                PackageName=package_name,
                                Tool="gcc",
                                BuildPath=buildpath,
                                File=d.getVar("FILE"),
                                Message="Neither '-z,noexecstack' nor '-z,noexecheap' are set in LDFLAGS".format(item),
                                ID="hardening.linker.noexecstack_oexecheap",
                                Severity="warning")
        if not (g.File in _excludes or g.GetFormattedID() in _suppress) and sca_is_in_finding_scope(d, "gcc", g.GetFormattedID()):
            if g.Severity in sca_allowed_warning_level(d):
                _findings.append(g)
    if not ("-O2" in _linker_flags or "-O3" in _linker_flags or "-Os" in _linker_flags) and \
       not ("-O2 " in logcontent or "-O3 " in logcontent or "-Os " in logcontent):
        g = sca_get_model_class(d,
                                PackageName=package_name,
                                Tool="gcc",
                                BuildPath=buildpath,
                                File=d.getVar("FILE"),
                                Message="-O option isn't set to 2,3 or s in LDFLAGS".format(item),
                                ID="hardening.linker.optimize",
                                Severity="warning")
        if not (g.File in _excludes or g.GetFormattedID() in _suppress) and sca_is_in_finding_scope(d, "gcc", g.GetFormattedID()):
            if g.Severity in sca_allowed_warning_level(d):
                _findings.append(g)

    for item in ["-Wall", "-Wcast-align", "-Wconversion", "-Wextra", "-Wformat-security",
                 "-Wformat=2", "-Wsign-conversion", "-Wstrict-overflow", "-Wstrict-prototypes", 
                 "-Wtrampolines", "-fno-common", "-fno-omit-frame-pointer", "-fsanitize=address", 
                 "-fsanitize=thread", "-fstack-check"]:
        if not item in _cflags and not item in logcontent:
            g = sca_get_model_class(d,
                                    PackageName=package_name,
                                    Tool="gcc",
                                    BuildPath=buildpath,
                                    File=d.getVar("FILE"),
                                    Message="{} is not set in CFLAGS".format(item),
                                    ID="hardening.compiler.{}".format(item.strip("-,")),
                                    Severity="warning")
            if (g.File in _excludes or g.GetFormattedID() in _suppress) and sca_is_in_finding_scope(d, "gcc", g.GetFormattedID()):
                continue
            if g.Severity in sca_allowed_warning_level(d):
                _findings.append(g)

    for item in ["-Woverloaded-virtual", "-Wreorder", "-Wsign-promo", "-Weffc++", "-Wnon-virtual-dtor"]:
        if not item in _cxxflags and not item in logcontent:
            g = sca_get_model_class(d,
                                    PackageName=package_name,
                                    Tool="gcc",
                                    BuildPath=buildpath,
                                    File=d.getVar("FILE"),
                                    Message="{} is not set in CXXFLAGS".format(item),
                                    ID="hardening.compiler.{}".format(item.strip("-,")),
                                    Severity="warning")
            if (g.File in _excludes or g.GetFormattedID() in _suppress) and sca_is_in_finding_scope(d, "gcc", g.GetFormattedID()):
                continue
            if g.Severity in sca_allowed_warning_level(d):
                _findings.append(g)   

    if d.getVar("DEBUG_BUILD") != "1" and ("-DDEBUG=1" in _cflags or "-DDEBUG=1" in logcontent):
        g = sca_get_model_class(d,
                                PackageName=package_name,
                                Tool="gcc",
                                BuildPath=buildpath,
                                File=d.getVar("FILE"),
                                Message="-DDEBUG=1 is set in CFLAGS".format(item),
                                ID="hardening.compiler.DEBUG",
                                Severity="warning")
        if not (g.File in _excludes or g.GetFormattedID() in _suppress) and sca_is_in_finding_scope(d, "gcc", g.GetFormattedID()):
            if g.Severity in sca_allowed_warning_level(d):
                _findings.append(g)
    
    if d.getVar("DEBUG_BUILD") != "1" and not ("-D_FORTIFY_SOURCE=2" in _cflags) and not ("-D_FORTIFY_SOURCE=2" in logcontent):
        g = sca_get_model_class(d,
                                PackageName=package_name,
                                Tool="gcc",
                                BuildPath=buildpath,
                                File=d.getVar("FILE"),
                                Message="-D_FORTIFY_SOURCE=2 isn't set in CFLAGS".format(item),
                                ID="hardening.compiler.FORTIFY_SOURCE",
                                Severity="warning")
        if not (g.File in _excludes or g.GetFormattedID() in _suppress) and sca_is_in_finding_scope(d, "gcc", g.GetFormattedID()):
            if g.Severity in sca_allowed_warning_level(d):
                _findings.append(g)
    
    if not ("-fstack-protector-strong" in _cflags or "-fstack-protector" in _cflags or "-fstack-protector-all" in _cflags) and \
       not ("-fstack-protector-strong" in logcontent or "-fstack-protector" in logcontent or "-fstack-protector-all" in logcontent):
        g = sca_get_model_class(d,
                                PackageName=package_name,
                                Tool="gcc",
                                BuildPath=buildpath,
                                File=d.getVar("FILE"),
                                Message="-fstack-protector* isn't set in CFLAGS".format(item),
                                ID="hardening.compiler.stack-protector",
                                Severity="warning")
        if not (g.File in _excludes or g.GetFormattedID() in _suppress) and sca_is_in_finding_scope(d, "gcc", g.GetFormattedID()):
            if g.Severity in sca_allowed_warning_level(d):
                _findings.append(g)

    if not ("-Wmissing-prototypes" in _cflags and "-Wmissing-declarations" in _cflags) and \
       not ("-Wmissing-prototypes" in logcontent and "-Wmissing-declarations" in logcontent):
        g = sca_get_model_class(d,
                                PackageName=package_name,
                                Tool="gcc",
                                BuildPath=buildpath,
                                File=d.getVar("FILE"),
                                Message="-Wmissing-prototypes or -Wmissing-declarations isn't set in CFLAGS".format(item),
                                ID="hardening.compiler.missingproto",
                                Severity="warning")
        if not (g.File in _excludes or g.GetFormattedID() in _suppress) and sca_is_in_finding_scope(d, "gcc", g.GetFormattedID()):
            if g.Severity in sca_allowed_warning_level(d):
                _findings.append(g)
    
    if not ("-mfunction-return=thunk" in _cflags and "-mindirect-branch=thunk" in _cflags) and \
       not ("-mfunction-return=thunk" in logcontent and "-mindirect-branch=thunk" in logcontent):
        g = sca_get_model_class(d,
                                PackageName=package_name,
                                Tool="gcc",
                                BuildPath=buildpath,
                                File=d.getVar("FILE"),
                                Message="-mfunction-return=thunk or -mindirect-branch=thunk isn't set in CFLAGS".format(item),
                                ID="hardening.compiler.function_return",
                                Severity="warning")
        if not (g.File in _excludes or g.GetFormattedID() in _suppress) and sca_is_in_finding_scope(d, "gcc", g.GetFormattedID()):
            if g.Severity in sca_allowed_warning_level(d):
                _findings.append(g)

    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)


def do_sca_conv_gcc(d):
    import os
    import re
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^(?P<file>.*):(?P<line>\d+):(?P<column>\d+):\s+(?P<severity>\w+):\s+(?P<message>.*)\s\[-(?P<id>.*)\]"

    severity_map = {
        "error" : "error",
        "warning" : "warning",
        "info": "info",
        "note": "info"
    }

    _suppress = get_suppress_entries(d)
    _excludes = sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA"))
    _findings = []

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        with open(d.getVar("SCA_RAW_RESULT_FILE"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="gcc",
                                            BuildPath=buildpath,
                                            File=m.group("file"),
                                            Line=m.group("line"),
                                            Message=m.group("message"),
                                            ID=m.group("id"),
                                            Severity=severity_map[m.group("severity")])
                    if g.File in _excludes:
                        continue
                    if g.GetFormattedID() in _suppress:
                        continue
                    if not sca_is_in_finding_scope(d, "gcc", g.GetFormattedID()):
                        continue
                    if g.Severity in sca_allowed_warning_level(d):
                        _findings.append(g)
                except Exception as exp:
                    bb.warn(str(exp))

    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_gcc() {
    import re
    import bb
    import os
    import shutil

    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_GCC_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_GCC_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "gcc-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "gcc-{}-fatal".format(d.getVar("SCA_MODE"))))

    tmp_result = os.path.join(d.getVar("T", True), "sca_raw_gcc.txt")
    d.setVar("SCA_RAW_RESULT_FILE", tmp_result)
    
    if not os.path.exists(os.path.join(d.getVar("T"), "log.do_compile")):
        with open(tmp_result, "w") as f:
            f.write("")
    else:
        shutil.copy(os.path.join(d.getVar("T"), "log.do_compile"), tmp_result)

    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/gcc.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_gcc(d)
    dm_output = sca_gcc_hardening(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "gcc", get_fatal_entries(d))
}

SCA_DEPLOY_TASK = "do_sca_deploy_gcc"

python do_sca_deploy_gcc() {
    sca_conv_deploy(d, "gcc", "txt")
}

addtask do_sca_gcc before do_install after do_compile
addtask do_sca_deploy_gcc after do_sca_gcc before do_package

do_sca_gcc[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_gcc[nostamp] = "${@sca_force_run(d)}"
do_compile[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "sca-recipe-gcc-rules-native gcc-sca-native"