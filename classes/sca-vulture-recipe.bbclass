## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-vulture-core
inherit sca-global

inherit python3-dir

SCA_DEPLOY_TASK = "do_sca_deploy_vulture_recipe"

python do_sca_deploy_vulture_recipe() {
   sca_conv_deploy(d, "vulture", "txt")
}

do_sca_vulture_core[doc] = "Find dead python code"
do_sca_deploy_vulture_recipe[doc] = "Deploy results of do_sca_vulture_core"
addtask do_sca_vulture_core before do_install after do_compile
addtask do_sca_deploy_vulture_recipe before do_package after do_sca_vulture_core

DEPENDS += "sca-recipe-vulture-rules-native"
