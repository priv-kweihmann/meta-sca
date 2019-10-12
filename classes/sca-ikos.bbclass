## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_IKOS_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_IKOS_EXTRA_FATAL ?= ""
## File extension filter list (whitespace separated)
SCA_IKOS_FILE_FILTER ?= ".c"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-file-filter

def do_sca_conv_ikos(d):
    import os
    import re
    import hashlib
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    items = []
    pattern = r"^(?P<file>.*)\:(?P<line>\d+)\:(?P<col>\d+):\s+(?P<severity>error|warning):\s+(?P<msg>.*)$"

    severity_map = {
        "error" : "error",
        "warning" : "warning"
    }

    _suppress = get_suppress_entries(d)
    _findings = []

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        with open(d.getVar("SCA_RAW_RESULT_FILE"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    _file = m.group("file")
                    if not _file.startswith(d.getVar("TOPDIR")):
                        _file = os.path.join(d.getVar("TOPDIR"), m.group("file"))
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="ikos",
                                            BuildPath=buildpath,
                                            File=_file,
                                            Column=m.group("col"),
                                            Line=m.group("line"),
                                            Message=m.group("msg"),
                                            ID=hashlib.md5(str.encode(m.group("msg"))).hexdigest(),
                                            Severity=severity_map[m.group("severity").strip()])
                    if not _file.startswith(buildpath):
                        ## ignore all findings that are not part of sources
                        continue
                    if g.GetFormattedID() in _suppress:
                        continue
                    if not sca_is_in_finding_scope(d, "ikos", g.GetFormattedID()):
                        continue
                    if g.Severity in sca_allowed_warning_level(d):
                        _findings.append(g)
                except Exception as e:
                    bb.warn(str(e))
    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

def get_local_includes(path):
    import glob
    res = set()
    for g in ["*.h", "**/*.h"]:
        for i in glob.glob(os.path.join(path, g), recursive=True):
            chunks = i.split("/")
            limit = len(chunks)
            if "c++" in chunks and not "tr1" in chunks:
                continue
            if "include" in chunks:
                limit = len(chunks) - 1 - chunks[::-1].index("include")
            for l in range(len(chunks), limit, -1):
                _incpath = os.path.dirname("/".join(chunks[:l]))
                res.add(_incpath)
    return res

python do_sca_ikos() {
    import os
    import subprocess
    from multiprocessing import Pool

    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_IKOS_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_IKOS_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "ikos-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "ikos-{}-fatal".format(d.getVar("SCA_MODE"))))

    _args = ["ikos"]
    if "m32" in clean_split(d, "TUNE_FEATURES"):
        _args += ["-m32"]
    _args += ["-w"]
    _args += ["--no-libc", "--no-libcpp", "--no-libikos"]
    _args += ["--report-verbosity=1"]
    _args += ["-a boa", "-a dbz", "-a nullity", "-a prover", "-a upa", "-a uva", "-a sio", "-a uio", "-a shc", "-a poa", "-a pcmp", "-a sound", "-a fca", "-a dca", "-a dfa", "-a dbg", "-a watch"]
    for i in get_local_includes(d.getVar("SCA_SOURCES_DIR")):
        _args += ["-I{}".format(i)]
    for i in get_local_includes(d.getVar("STAGING_INCDIR")):
        _args += ["-I{}".format(i)]

    _files = get_files_by_extention(d, 
                                    d.getVar("SCA_SOURCES_DIR"), 
                                    clean_split(d, "SCA_IKOS_FILE_FILTER"), 
                                    sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    tmp_result = os.path.join(d.getVar("T"), "sca_raw_ikos.txt")
    d.setVar("SCA_RAW_RESULT_FILE", tmp_result)
    cmd_output = ""

    ## Run
    for f in _files:
        try:
            cmd_output += subprocess.check_output(_args + [f], universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            cmd_output += e.stdout

    with open(tmp_result, "w") as o:
        o.write(cmd_output)
    
    # Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/ikos.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_ikos(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "ikos", get_fatal_entries(d))
}

SCA_DEPLOY_TASK = "do_sca_deploy_ikos"

python do_sca_deploy_ikos() {
    sca_conv_deploy(d, "ikos", "txt")
}

do_compile[postfuncs] += "do_sca_ikos"
do_package[prefuncs] += "do_sca_deploy_ikos"

do_sca_ikos[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_ikos[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "ikos-native sca-recipe-ikos-rules-native"
