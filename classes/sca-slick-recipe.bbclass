## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-slick-core
inherit sca-global

SCA_DEPLOY_TASK = "do_sca_deploy_slick_recipe"

python do_sca_deploy_slick_recipe() {
   sca_conv_deploy(d, "slick", "txt")
}

do_sca_slick_core[doc] = "Lint shell script with slick"
do_sca_deploy_slick_recipe[doc] = "Deploy results of do_sca_slick_core"
addtask do_sca_slick_core before do_install after do_compile
addtask do_sca_deploy_slick_recipe before do_package after do_sca_slick_core

DEPENDS += "sca-recipe-slick-rules-native"