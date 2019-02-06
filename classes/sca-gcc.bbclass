inherit sca-helper
inherit sca-conv-checkstyle-gcc
inherit sca-global

## Add ids to suppress on a recipe level
SCA_GCC_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_GCC_EXTRA_FATAL ?= ""

python do_sca_gcc() {
    import re
    import bb
    import os

    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_GCC_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_GCC_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "gcc-suppress"))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "gcc-fatal"))

    _supress = get_suppress_entries(d)
    _fatal = get_fatal_entries(d)

    tmp_result = os.path.join(d.getVar("T", True), "sca_raw_gcc.txt")
    d.setVar("SCA_RAW_RESULT_FILE", tmp_result)
    
    if not os.path.exists(os.path.join(d.getVar("T"), "log.do_compile")):
        with open(tmp_result, "w") as f:
            f.write("")
        content = ""
    else:
        f = open("%s/log.do_compile" % d.getVar("T"), "r")
        content = f.read()
        f.close()
    
    pattern = r"^(?P<file>.*):(?P<line>\d+):(?P<column>\d+):\s+(?P<severity>\w+):\s+(?P<message>.*)\s\[-(?P<id>.*)\]"
    with open(tmp_result, "w") as f:
        x = re.findall(r"^.*:\d+:\d+:\s+(?:warning|error).*$", content, re.MULTILINE)
        for l in x:
            for m in re.finditer(pattern, l, re.MULTILINE):
                if not m.group("id") in _supress:
                    f.write(l + "\n")
        if not x:
            f.write("")
        f.close()

    result_file = os.path.join(d.getVar("T", True), "sca_checkstyle_gcc.xml")
    d.setVar("SCA_RESULT_FILE", result_file)
    conv_output = do_sca_conv_gcc(d)
    with open(result_file, "w") as o:
        o.write(conv_output)

    ## Evaluate
    _warnings = get_warnings_from_result(d)
    _fatals = get_fatal_from_result(d , _fatal)
    _errors = get_errors_from_result(d)

    warn_log = []
    if any(_warnings):
        warn_log.append("{} warning(s)".format(len(_warnings)))
    if any(_errors):
        warn_log.append("{} error(s)".format(len(_errors)))
    if warn_log:
        bb.warning("SCA has found {}".format(",".join(warn_log)))
    
    if any(_fatals):
        bb.fatal("SCA has following fatal errors: {}".format("\n".join(_fatals)))
}

python do_sca_deploy_gcc() {
    import os
    import shutil
    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "gcc", "raw"), exist_ok=True)
    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "gcc", "checkstyle"), exist_ok=True)
    raw_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "gcc", "raw", "{}-{}.txt".format(d.getVar("PN"), d.getVar("PV")))
    cs_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "gcc", "checkstyle", "{}-{}.xml".format(d.getVar("PN"), d.getVar("PV")))
    shutil.copy(os.path.join(d.getVar("T"), "sca_raw_gcc.txt"), raw_target)
    shutil.copy(os.path.join(d.getVar("T"), "sca_checkstyle_gcc.xml"), cs_target)
    do_sca_export_sources(d, cs_target)
}

addtask do_sca_gcc before do_install after do_compile
addtask do_sca_deploy_gcc after do_sca_gcc before do_package

DEPENDS += "sca-recipe-gcc-rules-native"