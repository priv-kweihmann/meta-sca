## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_SETUPTOOLSLINT_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_SETUPTOOLSLINT_EXTRA_FATAL ?= ""
## A local proxy to suppress downloading fragments from pypi
SCA_SETUPTOOLSLINT_LOCAL_PROXY ?= "http://localhost:65533"
## Target file(s)
SCA_SETUPTOOLSLINT_FILES ?= "${S}/setup.py"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress

inherit ${@oe.utils.ifelse(d.getVar('SCA_STD_PYTHON_INTERPRETER') == 'python3', 'python3native', 'pythonnative')}

def do_sca_conv_setuptoolslint(d, cmd_output=""):
    import os
    import re
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^(?P<file>.*):error:\s+(?P<msg>.*)"

    _suppress = sca_suppress_init(d)
    _findings = []

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        with open(d.getVar("SCA_RAW_RESULT_FILE"), "r") as f:
            content = f.read()
            for m in re.finditer(pattern, content, re.MULTILINE):
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="setuptoolslint",
                                            BuildPath=buildpath,
                                            File=m.group("file"),
                                            Message=m.group("msg"),
                                            ID="PackageNotFound",
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

python do_sca_setuptoolslint() {
    import os
    import subprocess
    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_SETUPTOOLSLINT_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_SETUPTOOLSLINT_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "setuptoolslint-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "setuptoolslint-{}-fatal".format(d.getVar("SCA_MODE"))))

    tmp_result = os.path.join(d.getVar("T", True), "sca_raw_setuptoolslint.txt")
    d.setVar("SCA_RAW_RESULT_FILE", tmp_result)

    ## Run
    os.environ["STAGING_INCDIR"] = d.getVar("STAGING_INCDIR")
    os.environ["STAGING_LIBDIR"] = d.getVar("STAGING_LIBDIR")
    os.environ["HTTP_PROXY"] = d.getVar("SCA_SETUPTOOLSLINT_LOCAL_PROXY")
    _args = [d.getVar("PYTHON")]

    cmd_output = ""
    
    for f in clean_split(d, "SCA_SETUPTOOLSLINT_FILES"):
        if os.path.exists(f):
            try:
                # Lint using a fake package, as we only need to first stage of 
                # linting, as pylint is already run by a different module
                tmp_output = subprocess.check_output(_args + [f, "lint", "--lint-packages=2107066c996809c8e5cec0a3ce1b10cfe4ab1fbf"], universal_newlines=True, stderr=subprocess.STDOUT)
            except subprocess.CalledProcessError as e:
                tmp_output = e.stdout or ""
            # Prefix all lines with full file path
            cmd_output += "\n".join(["{}:{}".format(f, x) for x in tmp_output.splitlines()])

    with open(tmp_result, "w") as o:
        o.write(cmd_output)
    
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/setuptoolslint.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_setuptoolslint(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "setuptoolslint", get_fatal_entries(d))
}

SCA_DEPLOY_TASK = "do_sca_deploy_setuptoolslint"

python do_sca_deploy_setuptoolslint() {
    sca_conv_deploy(d, "setuptoolslint", "text")
}

addtask do_sca_setuptoolslint before do_install after do_compile
addtask do_sca_deploy_setuptoolslint after do_sca_setuptoolslint before do_package

do_sca_setuptoolslint[depends] += "${@oe.utils.conditional('SCA_FORCE_RUN', '1', '${PN}:do_sca_do_force_meta_task', '', d)}"
do_sca_deploy_setuptoolslint[depends] += "${@oe.utils.conditional('SCA_FORCE_RUN', '1', '${PN}:do_sca_do_force_meta_task', '', d)}"

DEPENDS += "\
            ${SCA_STD_PYTHON_INTERPRETER}-setuptools-lint-native \
            ${SCA_STD_PYTHON_INTERPRETER}-setuptools-native \
            sca-recipe-setuptoolslint-rules-native \
           "
