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

inherit sca-helper
inherit sca-conv-checkstyle-clang
inherit sca-global

python do_sca_clang() {
    import os
    import subprocess
    import glob

    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_CLANG_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_CLANG_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "clang-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "clang-{}-suppress".format(d.getVar("SCA_MODE"))))

    _supress = get_suppress_entries(d)
    _fatal = get_fatal_entries(d)
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
    for _f in get_files_by_extention(d, d.getVar("SCA_SOURCES_DIR"), d.getVar("SCA_CLANG_FILE_FILTER").split(" "), []):
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

    raw_file = os.path.join(d.getVar("T", True), "sca_raw_clang.txt")
    d.setVar("SCA_RAW_RESULT_FILE", raw_file)
    with open(raw_file, "w") as o:
        o.write(cmd_output)
    
    result_file = os.path.join(d.getVar("T", True), "sca_checkstyle_clang.xml")
    d.setVar("SCA_RESULT_FILE", result_file)
    conv_output = do_sca_conv_clang(d)
    with open(result_file, "w") as o:
        o.write(conv_output)

    ## Evaluate
    _warnings = get_warnings_from_result(d)
    _fatals = get_fatal_from_result(d, "Clang.Clang", _fatal)
    _errors = get_errors_from_result(d)

    warn_log = []
    if any(_warnings):
        warn_log.append("{} warning(s)".format(len(_warnings)))
    if any(_errors):
        warn_log.append("{} error(s)".format(len(_errors)))
    if warn_log and should_emit_to_console(d):
        bb.warn("SCA has found {}".format(",".join(warn_log)))
    
    if any(_fatals):
        bb.build.exec_func("do_sca_deploy_clang", d)
        bb.error("SCA has following fatal errors: {}".format("\n".join(_fatals)))
}

python do_sca_deploy_clang() {
    import os
    import shutil
    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "clang", "raw"), exist_ok=True)
    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "clang", "checkstyle"), exist_ok=True)
    raw_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "clang", "raw", "{}-{}.txt".format(d.getVar("PN"), d.getVar("PV")))
    cs_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "clang", "checkstyle", "{}-{}.xml".format(d.getVar("PN"), d.getVar("PV")))
    src_raw = os.path.join(d.getVar("T"), "sca_raw_clang.txt")
    src_conv = os.path.join(d.getVar("T"), "sca_checkstyle_clang.xml")
    if os.path.exists(src_raw):
        shutil.copy(src_raw, raw_target)
    if os.path.exists(src_conv):
        shutil.copy(src_conv, cs_target)
    if os.path.exists(cs_target):
        do_sca_export_sources(d, cs_target)
}

addtask do_sca_clang before do_install after do_compile
addtask do_sca_deploy_clang after do_sca_clang before do_package

DEPENDS += "clang-native sca-recipe-clang-rules-native clang-sca-native"
