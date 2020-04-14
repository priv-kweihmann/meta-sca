## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-pylint-core
inherit sca-global
inherit sca-tracefiles

inherit python3-dir

## Add ids to suppress on a recipe level
SCA_PYLINT_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_PYLINT_EXTRA_FATAL ?= ""
## Folder to scan
SCA_PYLINT_ROOTPATH ?= "${B}"
## PYTHONHOME-path to use
SCA_PYLINT_HOMEPATH ?= "${STAGING_LIBDIR}/python${PYTHON_BASEVERSION}"
## The Librarypath to use
SCA_PYLINT_LIBATH ?= "${STAGING_LIBDIR}/python${PYTHON_BASEVERSION}/:${STAGING_LIBDIR}/python${PYTHON_BASEVERSION}/site-packages/"

SCA_DEPLOY_TASK = "do_sca_deploy_pylint_recipe"

python do_sca_deploy_pylint_recipe() {
   sca_conv_deploy(d, "pylint")
}

do_sca_pylint_core[doc] = "Lint python code with pylint"
do_sca_pylint_core_report[doc] = "Report findings from do_sca_pylint_core"
do_sca_deploy_pylint_recipe[doc] = "Deploy results of do_sca_pylint_core"
addtask do_sca_pylint_core after do_compile before do_sca_tracefiles
addtask do_sca_pylint_core_report after do_sca_tracefiles
addtask do_sca_deploy_pylint_recipe after do_sca_pylint_core_report before do_package

DEPENDS += "sca-recipe-pylint-rules-native"
