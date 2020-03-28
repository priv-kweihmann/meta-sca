## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-mypy-core
inherit sca-global

inherit python3-dir

## Add ids to suppress on a recipe level
SCA_MYPY_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_MYPY_EXTRA_FATAL ?= ""

SCA_DEPLOY_TASK = "do_sca_deploy_mypy_recipe"

python do_sca_deploy_mypy_recipe() {
   sca_conv_deploy(d, "mypy", "txt")
}

do_sca_mypy_core[doc] = "Lint python files wtth mypy"
do_sca_deploy_mypy_recipe[doc] = "Deploy results of do_sca_mypy_core"
addtask do_sca_mypy_core before do_install after do_compile
addtask do_sca_deploy_mypy_recipe before do_package after do_sca_mypy_core

DEPENDS += "sca-recipe-mypy-rules-native"
