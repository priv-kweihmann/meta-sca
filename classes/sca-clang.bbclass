## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_CLANG_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_CLANG_EXTRA_FATAL ?= ""
## Additional absolute paths to additional include dirs
## can be seperated by spaces
SCA_CLANG_ADD_INCLUDES ?= ""
## Set the enabled checkers
SCA_CLANG_CHECKERS ?= "clang-analyzer-apiModeling.StdCLibraryFunctions clang-analyzer-apiModeling.TrustNonnull clang-analyzer-apiModeling.google.GTest clang-analyzer-core.CallAndMessage clang-analyzer-core.DivideZero clang-analyzer-core.DynamicTypePropagation clang-analyzer-core.NonNullParamChecker clang-analyzer-core.NonnilStringConstants clang-analyzer-core.NullDereference clang-analyzer-core.StackAddressEscape clang-analyzer-core.UndefinedBinaryOperatorResult clang-analyzer-core.VLASize clang-analyzer-core.builtin.BuiltinFunctions clang-analyzer-core.builtin.NoReturnFunctions clang-analyzer-core.uninitialized.ArraySubscript clang-analyzer-core.uninitialized.Assign clang-analyzer-core.uninitialized.Branch clang-analyzer-core.uninitialized.CapturedBlockVariable clang-analyzer-core.uninitialized.UndefReturn clang-analyzer-cplusplus.InnerPointer clang-analyzer-cplusplus.Move clang-analyzer-cplusplus.NewDelete clang-analyzer-cplusplus.NewDeleteLeaks clang-analyzer-cplusplus.SelfAssignment clang-analyzer-deadcode.DeadStores clang-analyzer-nullability.NullPassedToNonnull clang-analyzer-nullability.NullReturnedFromNonnull clang-analyzer-nullability.NullableDereferenced clang-analyzer-nullability.NullablePassedToNonnull clang-analyzer-nullability.NullableReturnedFromNonnull clang-analyzer-optin.cplusplus.VirtualCall clang-analyzer-optin.performance.GCDAntipattern clang-analyzer-optin.performance.Padding clang-analyzer-optin.portability.UnixAPI clang-analyzer-security.FloatLoopCounter clang-analyzer-security.insecureAPI.UncheckedReturn clang-analyzer-security.insecureAPI.bcmp clang-analyzer-security.insecureAPI.bcopy clang-analyzer-security.insecureAPI.bzero clang-analyzer-security.insecureAPI.getpw clang-analyzer-security.insecureAPI.gets clang-analyzer-security.insecureAPI.mkstemp clang-analyzer-security.insecureAPI.mktemp clang-analyzer-security.insecureAPI.rand clang-analyzer-security.insecureAPI.strcpy clang-analyzer-security.insecureAPI.vfork clang-analyzer-unix.API clang-analyzer-unix.Malloc clang-analyzer-unix.MallocSizeof clang-analyzer-unix.MismatchedDeallocator clang-analyzer-unix.Vfork clang-analyzer-unix.cstring.BadSizeArg clang-analyzer-unix.cstring.NullArg clang-analyzer-valist.CopyToSelf clang-analyzer-valist.Uninitialized clang-analyzer-valist.Unterminated"
## File extension filter
SCA_CLANG_FILE_FILTER ?= ".c .cpp"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress
inherit sca-tracefiles

SCA_RAW_RESULT_FILE[clang] = "txt"

def do_sca_conv_clang(d):
    import os
    import re
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^(?P<file>.*):(?P<line>\d+):(?P<column>\d+):\s+(?P<severity>warning|error):\s+(?P<msg>.*)\[(?P<id>.*)\]"

    severity_map = {
        "error" : "error",
        "warning" : "warning",
    }

    _suppress = sca_suppress_init(d, "SCA_CLANG_EXTRA_SUPPRESS",
                                  d.expand("${STAGING_DATADIR_NATIVE}/clang-${SCA_MODE}-suppress"))
    _excludes = sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA"))
    _findings = []

    if os.path.exists(sca_raw_result_file(d, "clang")):
        with open(sca_raw_result_file(d, "clang"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="clang",
                                            BuildPath=buildpath,
                                            Column=m.group("column"),
                                            File=m.group("file"),
                                            Line=m.group("line"),
                                            Message=m.group("msg"),
                                            ID=m.group("id"),
                                            Severity=severity_map[m.group("severity")])
                    if not m.group("file").startswith(buildpath):
                        g.File = os.path.join(buildpath, m.group("file"))
                    else:
                        g.File = m.group("file")
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

python do_sca_clang() {
    import os
    import subprocess
    import glob


    _add_include = d.getVar("SCA_CLANG_ADD_INCLUDES", True).split(" ")

    inc_dirs = [d.getVar("SCA_SOURCES_DIR"),    
                os.path.join(d.getVar("SCA_SOURCES_DIR"), "include"),
                os.path.join(d.getVar("STAGING_DIR"), "include"),
                d.getVar("STAGING_INCDIR")]
    if d.getVar("SCA_CLANG_ADD_INCLUDES"):
        inc_dirs += d.getVar("SCA_CLANG_ADD_INCLUDES").split(" ")

    _args = ["clang-tidy"]
    _args += ["-quiet"]
    _args += ["-checks={}".format(",".join(d.getVar("SCA_CLANG_CHECKERS").split(" ")))]
    for item in inc_dirs:
       _args += ["-extra-arg", "-I{}".format(item)]

    compile_json = []
    for _f in get_files_by_extention(d, d.getVar("SCA_SOURCES_DIR"), d.getVar("SCA_CLANG_FILE_FILTER").split(" "), \
                                    sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA"))):
        compile_json.append(
            {
                "directory": d.getVar("B"),
                "file": _f,
                "command": "{} -c {}".format(os.environ.get("CC", "gcc"), _f)
            }
        )

    import json
    with open(os.path.join(d.getVar("B"), "compile_commands.json"), "w") as o:
        json.dump(compile_json, o)

    cmd_output = ""
    for _f in get_files_by_extention(d, d.getVar("SCA_SOURCES_DIR"), d.getVar("SCA_CLANG_FILE_FILTER").split(" "), []):
        try:
            cmd_output += subprocess.check_output(_args + [_f], universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            cmd_output += e.stdout or ""

    if os.path.exists(os.path.join(d.getVar("B"), "compile_commands.json")):
        os.remove(os.path.join(d.getVar("B"), "compile_commands.json"))

    with open(sca_raw_result_file(d, "clang"), "w") as o:
        o.write(cmd_output)
}

python do_sca_clang_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/clang.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_clang(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "clang", get_fatal_entries(d, "SCA_CLANG_EXTRA_FATAL",
                        os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "clang-{}-fatal".format(d.getVar("SCA_MODE")))))
}

SCA_DEPLOY_TASK = "do_sca_deploy_clang"

python do_sca_deploy_clang() {
    sca_conv_deploy(d, "clang")
}

do_sca_clang[doc] = "Run scan of clang-tidy on recipe"
do_sca_clang_report[doc] = "Report findings of do_sca_clang"
do_sca_deploy_clang[doc] = "Deploy results of do_sca_clang"
addtask do_sca_clang after do_compile before do_sca_tracefiles
addtask do_sca_clang_report after do_sca_tracefiles
addtask do_sca_deploy_clang after do_sca_clang_report before do_package

DEPENDS += "clang-native sca-recipe-clang-rules-native clang-sca-native"
