## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-pylint-core
inherit sca-global

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
   sca_conv_deploy(d, "pylint", "txt")
}

do_sca_pylint_core[doc] = "Lint python code with pylint"
do_sca_deploy_pylint_recipe[doc] = "Deploy results of do_sca_pylint_core"
addtask do_sca_pylint_core before do_install after do_compile
addtask do_sca_deploy_pylint_recipe before do_package after do_sca_pylint_core

DEPENDS += "sca-recipe-pylint-rules-native"