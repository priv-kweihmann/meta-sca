## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_PHAN_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_PHAN_EXTRA_FATAL ?= ""
SCA_PHAN_FILE_FILTER ?= ".php"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress

PHP_EXTENSION = "ast"
inherit php-ext

def do_sca_conv_phan(d):
    import os
    import json
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")
    
    _findings = []
    _suppress = sca_suppress_init(d)

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

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        content = []
        with open(d.getVar("SCA_RAW_RESULT_FILE"), "r") as f:
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
                        _findings.append(g)
                except Exception as exp:
                    bb.warn(str(exp))

    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_phan() {
    import os
    import subprocess
    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_PHAN_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_PHAN_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "phan-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "phan-{}-fatal".format(d.getVar("SCA_MODE"))))

    tmp_result = os.path.join(d.getVar("T", True), "sca_raw_phan.json")
    d.setVar("SCA_RAW_RESULT_FILE", tmp_result)
    cmd_output = ""

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
   
    _files = get_files_by_extention_or_shebang(d, d.getVar("SCA_SOURCES_DIR"), ".*php", [".php"], \
                                                sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))
    
    if any(_files): 
        try:
            cmd_output += subprocess.check_output(_args + _files, universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            cmd_output += e.stdout or ""

    with open(tmp_result, "w") as o:
        if not cmd_output.startswith("[") and "[" in cmd_output:
            cmd_output = cmd_output[cmd_output.find("["):]
        elif not cmd_output.startswith("["):
            cmd_output = "[]"
        o.write(cmd_output)
    
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/phan.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_phan(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "phan", get_fatal_entries(d))
}

SCA_DEPLOY_TASK = "do_sca_deploy_phan"

python do_sca_deploy_phan() {
    sca_conv_deploy(d, "phan", "json")
}

addtask do_sca_phan before do_install after do_configure
addtask do_sca_deploy_phan after do_sca_phan before do_package

DEPENDS += "phan-native sca-recipe-phan-rules-native"
