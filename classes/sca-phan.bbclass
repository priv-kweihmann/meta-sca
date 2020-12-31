## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_PHAN_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_PHAN_EXTRA_FATAL ?= ""
SCA_PHAN_FILE_FILTER ?= ".php"

SCA_RAW_RESULT_FILE[phan] = "json"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress
inherit sca-image-backtrack
inherit sca-tracefiles

PHP_EXTENSION = "ast"
inherit php-ext

def do_sca_conv_phan(d):
    import os
    import json

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    _findings = []
    _suppress = sca_suppress_init(d, "SCA_PHAN_EXTRA_SUPPRESS",
                                  d.expand("${STAGING_DATADIR_NATIVE}/phan-${SCA_MODE}-suppress"))

    _severity_map = {
        "10": "error",
        "9": "error",
        "8": "error",
        "7": "warning",
        "6": "warning",
        "5": "warning",
        "4": "warning",
        "3": "info",
        "2": "info",
        "1": "info",
        "0": "info",
    }

    if os.path.exists(sca_raw_result_file(d, "phan")):
        content = []
        with open(sca_raw_result_file(d, "phan"), "r") as f:
            try:
                content = json.load(f)
            except json.JSONDecodeError:
                pass
            for m in content:
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="phan",
                                            BuildPath=d.getVar("SCA_SOURCES_DIR"),
                                            File=m["location"]["path"],
                                            Line=str(m["location"]["lines"]["begin"]),
                                            Message=m["description"],
                                            ID=m["check_name"],
                                            Severity=_severity_map[str(m["severity"])])
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

do_sca_phan[vardepsexclude] += "BB_NUMBER_THREADS"
python do_sca_phan() {
    import os
    import subprocess

    os.makedirs(os.path.join(d.getVar("T"), "phanout"), exist_ok=True)
    ## Run
    os.environ["PHP_INI_SCAN_DIR"] = os.path.dirname(d.getVar("PHP_INI_FILE"))
    _args = [os.path.join(d.getVar("STAGING_BINDIR_NATIVE"), "phan/vendor/bin/phan")]
    _args += ["--disable-cache"]
    _args += ["-S"]
    _args += ["-b"]
    _args += ["-j", d.getVar("BB_NUMBER_THREADS")]
    _args += ["-m=json"]
    _args += ["-t"]
    _args += ["-u"]
    _args += ["-z"]
    _args += ["--allow-polyfill-parser"]

    _files = get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), ".*php", [".php"], \
                                                sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    cmd_output = exec_wrap_check_output(d, _args, _files, combine=exec_wrap_combine_json, default_val=[])

    with open(sca_raw_result_file(d, "phan"), "w") as o:
        o.write(cmd_output)
}

python do_sca_phan_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/phan.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_phan(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "phan", get_fatal_entries(d, "SCA_PHAN_EXTRA_FATAL",
                        d.expand("${STAGING_DATADIR_NATIVE}/phan-${SCA_MODE}-fatal")))
}

do_sca_phan[doc] = "Lint php scripts with phan in workspace"
do_sca_phan_report[doc] = "Report findings of do_sca_phan"
addtask do_sca_phan after do_configure before do_sca_tracefiles
addtask do_sca_phan_report after do_sca_tracefiles before do_sca_deploy

DEPENDS += "phan-native sca-recipe-phan-rules-native"
