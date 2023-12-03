## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2020, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_SCANCODE_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_SCANCODE_EXTRA_FATAL ?= ""
## Discouraged copyright holders, comma separated regex list
SCA_SCANCODE_BAD_CRHOLDER ?= ""

SCA_SCANCODE_LICENSE_FILE_EXCEPTIONS ?= "\
    Makefile.* \
    configure.* \
    m4/.* \
"

SCA_SCANCODE_LICENSE_FILE_MINLENGTH ?= "2"

SCA_RAW_RESULT_FILE[scancode] = "txt"
SCA_RAW_RESULT_FILE[scancode_raw] = "json"

SCA_ACTIVE_MODULES:append = " scancode_raw"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress
inherit sca-image-backtrack
inherit sca-tracefiles

export EXTRACTCODE_LIBARCHIVE_PATH = "${STAGING_LIBDIR_NATIVE}/libarchive.so"
export EXTRACTCODE_7Z_PATH = "${STAGING_BINDIR_NATIVE}/7z"
export TYPECODE_LIBMAGIC_PATH = "${STAGING_LIBDIR_NATIVE}/libmagic.so"
export TYPECODE_LIBMAGIC_DB_PATH = "${STAGING_DATADIR_NATIVE}/magic.mgc"

def do_sca_conv_scancode(d):
    import os
    import re

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    items = []
    pattern = r"^(?P<pkg>.*):\[(?P<id>.+)\]\s+(?P<msg>.*)"

    _suppress = sca_suppress_init(d, clean_split(d, "SCA_SCANCODE_EXTRA_SUPPRESS"),
                                  d.expand("${STAGING_DATADIR_NATIVE}/scancode-${SCA_MODE}-suppress"),
                                  file_trace=False)
    _findings = []

    if os.path.exists(sca_raw_result_file(d, "scancode")):
        with open(sca_raw_result_file(d, "scancode"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="scancode",
                                            BuildPath=sca_get_layer_path_for_file(d, d.getVar("FILE")),
                                            File=d.getVar("FILE"),
                                            Column="1",
                                            Line="1",
                                            Message="{}: {}".format(m.group("pkg"), m.group("msg")),
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

do_sca_scancode[vardepsexclude] += "BB_NUMBER_THREADS"
python do_sca_scancode() {
    import os
    import subprocess

    os.environ["SCANCODE_CACHE"] = d.getVar("T")
    os.environ["SCANCODE_TEMP"] = d.getVar("T")
    _args = ["scancode", "-l", "-c", "--json", sca_raw_result_file(d, "scancode_raw"),
             "--strip-root", "-n", d.getVar("BB_NUMBER_THREADS"), "--quiet"]

    ## Run
    out = exec_wrap_check_output(d, _args, [d.getVar("SCA_SOURCES_DIR")])
    if not os.path.exists(sca_raw_result_file(d, "scancode_raw")):
        bb.warn(out)
}

def scancode_get_license(d, _in):
    import re
    _pn = d.getVar("PN")
    x = d.getVar("LICENSE:{}".format(_in))
    if not x:
        x = d.getVar("LICENSE:${{PN}}{}".format(_in.replace(_pn, "")))
    if not x:
        x = d.getVar("LICENSE")
    if not x:
        x = "CLOSED"
    # Apply SPDXLICENSEMAP settings
    for rename_flag in d.getVarFlags("SPDXLICENSEMAP"):
        x = re.sub(r"{}(\||&|\s+|$)".format(re.escape(rename_flag)), d.getVarFlag("SPDXLICENSEMAP", rename_flag), x)
    return x

python do_sca_scancode_report() {
    import os
    import json

    cmd_output = ""

    _license_files_listed = ["--licfiles={}".format(x.split(";")[0].replace("file://", "", 1)) for x in clean_split(d, "LIC_FILES_CHKSUM")]
    _license_file_exceptions = ["--ignorelicfiles={}".format(x) for x in clean_split(d, "SCA_SCANCODE_LICENSE_FILE_EXCEPTIONS")]

    if os.path.exists(d.getVar("SCA_TRACEFILES_LIST") or "/does/not/exist"):
        with open(d.getVar("SCA_TRACEFILES_LIST")) as i:
            _jobj = json.load(i)
            for key, val in _jobj.items():
                _args = ["licensecheck-helper",
                         "--badcrholders", d.getVar("SCA_SCANCODE_BAD_CRHOLDER"),
                         "--rootpath={}".format(d.getVar("SCA_SOURCES_DIR")),
                         "--licfileminlength={}".format(d.getVar("SCA_SCANCODE_LICENSE_FILE_MINLENGTH")),
                         *_license_files_listed, *_license_file_exceptions,
                         "--sources={}".format(d.getVar("SCA_SOURCECHECKSUM")),
                         scancode_get_license(d, key),
                         "scancode",
                         sca_raw_result_file(d, "scancode_raw")]
                
                _tmp = exec_wrap_check_output(d, _args, val)
                cmd_output += "\n".join(["{}:{}".format(key, x) for x in _tmp.split("\n") if x]) + "\n"
    with open(sca_raw_result_file(d, "scancode"), "w") as o:
        o.write(cmd_output)

    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/scancode.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_scancode(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "scancode", get_fatal_entries(d, clean_split(d, "SCA_SCANCODE_EXTRA_FATAL"),
                       d.expand("${STAGING_DATADIR_NATIVE}/scancode-${SCA_MODE}-fatal")))
}

do_sca_scancode_report[vardeps] += "\
    LIC_FILES_CHKSUM \
    SCA_SCANCODE_EXTRA_FATAL \
    SCA_SCANCODE_EXTRA_SUPPRESS \
    SCA_SCANCODE_LICENSE_FILE_EXCEPTIONS \
    SCA_SCOPE_FILTER \
    SCA_SEVERITY_TRANSFORM \
    SCA_SUPPRESS_LOCALS \
"

do_sca_scancode[doc] = "License compliance with scancode"
do_sca_scancode_report[doc] = "Report findings of do_sca_scancode"
do_sca_scancode[nosdkgen] = "1"
do_sca_scancode_report[nosdkgen] = "1"
addtask do_sca_scancode after do_compile before do_sca_tracefiles
addtask do_sca_scancode_report after do_sca_tracefiles before do_sca_deploy

DEPENDS += "\
            licensecheck-helper-native \
            python3-scancode-native \
            sca-recipe-scancode-rules-native \
           "
