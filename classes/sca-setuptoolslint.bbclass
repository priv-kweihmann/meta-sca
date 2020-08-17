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

SCA_RAW_RESULT_FILE[setuptoolslint] = "txt"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress

inherit python3native

def do_sca_conv_setuptoolslint(d, cmd_output=""):
    import os
    import re

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^(?P<file>.*):error:\s+(?P<msg>.*)"

    _suppress = sca_suppress_init(d, "SCA_SETUPTOOLSLINT_EXTRA_SUPPRESS",
                                  d.expand("${STAGING_DATADIR_NATIVE}/setuptoolslint-${SCA_MODE}-suppress"),
                                  file_trace=False)
    _findings = []

    if os.path.exists(sca_raw_result_file(d, "setuptoolslint")):
        with open(sca_raw_result_file(d, "setuptoolslint"), "r") as f:
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

    ## Run
    os.environ["STAGING_INCDIR"] = d.getVar("STAGING_INCDIR")
    os.environ["STAGING_LIBDIR"] = d.getVar("STAGING_LIBDIR")
    os.environ["HTTP_PROXY"] = d.getVar("SCA_SETUPTOOLSLINT_LOCAL_PROXY")
    os.environ["PYTHONPATH"] = ":".join([os.environ.get("PYTHONPATH", ""), os.path.join(d.getVar("STAGING_LIBDIR_NATIVE"), "python-sysconfigdata")])
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

    with open(sca_raw_result_file(d, "setuptoolslint"), "w") as o:
        o.write(cmd_output)

    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/setuptoolslint.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_setuptoolslint(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "setuptoolslint", get_fatal_entries(d, "SCA_SETUPTOOLSLINT_EXTRA_FATAL",
                       d.expand("${STAGING_DATADIR_NATIVE}/setuptoolslint-${SCA_MODE}-fatal")))
}

SCA_DEPLOY_TASK = "do_sca_deploy_setuptoolslint"

python do_sca_deploy_setuptoolslint() {
    sca_conv_deploy(d, "setuptoolslint")
}

do_sca_setuptoolslint[doc] = "Lint python library installation"
do_sca_deploy_setuptoolslint[doc] = "Deploy results of do_sca_setuptoolslint"
addtask do_sca_setuptoolslint before do_install after do_compile
addtask do_sca_deploy_setuptoolslint after do_sca_setuptoolslint before do_package

DEPENDS += "\
            python3-setuptools-lint-native \
            python3-setuptools-native \
            sca-recipe-setuptoolslint-rules-native \
           "
