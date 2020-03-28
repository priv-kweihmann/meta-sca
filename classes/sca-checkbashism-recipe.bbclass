## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-checkbashism-core
inherit sca-global

SCA_DEPLOY_TASK = "do_sca_deploy_checkbashism_recipe"

python do_sca_deploy_checkbashism_recipe() {
   sca_conv_deploy(d, "checkbashism", "txt")
}

do_sca_checkbashism_core[doc] = "Lint shell scripts with checkbashisms"
do_sca_deploy_checkbashism_recipe[doc] = "Deploy results of do_sca_checkbashism_core"
addtask do_sca_checkbashism_core before do_install after do_compile
addtask do_sca_deploy_checkbashism_recipe before do_package after do_sca_checkbashism_core

DEPENDS += "sca-recipe-checkbashism-rules-native"
