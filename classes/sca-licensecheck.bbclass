## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_LICENSECHECK_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_LICENSECHECK_EXTRA_FATAL ?= ""

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress

def do_sca_conv_licensecheck(d):
    import os
    import re
    
    package_name = d.getVar("PN")

    items = []

    pattern = r"^(?P<msg>Wrong.*)$"

    _suppress = sca_suppress_init(d)
    _findings = []

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        with open(d.getVar("SCA_RAW_RESULT_FILE"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="licensecheck",
                                            BuildPath=sca_get_layer_path_for_file(d, d.getVar("FILE")),
                                            File=d.getVar("FILE"),
                                            Message=m.group("msg"),
                                            ID="invalid-license",
                                            Severity="error")
                    if _suppress.Suppressed(g):
                        continue
                    if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                        continue
                    if g.Severity in sca_allowed_warning_level(d):
                        _findings.append(g)
                except Exception as e:
                    bb.warn(str(e))
    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_licensecheck() {
    import os
    import subprocess
    from multiprocessing import Pool

    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_LICENSECHECK_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_LICENSECHECK_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "licensecheck-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "licensecheck-{}-fatal".format(d.getVar("SCA_MODE"))))

    lc_result = os.path.join(d.getVar("T"), "sca_raw_licensecheck.csv")
    tmp_result = os.path.join(d.getVar("T"), "sca_raw_licensecheck.txt")
    d.setVar("SCA_RAW_RESULT_FILE", tmp_result)

    _args = ["lc"]
    _args += ["-f", "csv"]
    _args += ["--output", lc_result]
    _args += ["."]

    if os.path.exists(lc_result):
        os.remove(lc_result)

    ## Run
    _cwd = os.getcwd()
    os.chdir(d.getVar("SCA_SOURCES_DIR"))
    try:
        subprocess.check_call(_args, universal_newlines=True, stderr=subprocess.STDOUT)
    except subprocess.CalledProcessError as e:
        pass
    os.chdir(_cwd)
            
    cmd_output = ""
    try:
        cmd_output = subprocess.check_output(["nativepython3",
                                              os.path.join(d.getVar("STAGING_BINDIR_NATIVE"), "licensecheck"),
                                              d.getVar("LICENSE"), lc_result],
                                             universal_newlines=True, stderr=subprocess.STDOUT)
    except subprocess.CalledProcessError as e:
        pass
    
    with open(tmp_result, "w") as o:
        o.write(cmd_output)
    
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/licensecheck.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_licensecheck(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "licensecheck", get_fatal_entries(d))
}

SCA_DEPLOY_TASK = "do_sca_deploy_licensecheck"

python do_sca_deploy_licensecheck() {
    sca_conv_deploy(d, "licensecheck", "txt")
}

do_sca_licensecheck[doc] = "Scan license information in workspace"
do_sca_deploy_licensecheck[doc] = "Deploy results of do_sca_licensecheck"
addtask do_sca_licensecheck before do_install after do_compile
addtask do_sca_deploy_licensecheck after do_sca_licensecheck before do_package

DEPENDS += "licensecheck-sca-native sca-recipe-licensecheck-rules-native"
