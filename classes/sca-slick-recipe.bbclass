## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-slick-core
inherit sca-global

SCA_DEPLOY_TASK = "do_sca_deploy_slick_recipe"

python do_sca_deploy_slick_recipe() {
   sca_conv_deploy(d, "slick", "txt")
}

addtask do_sca_slick_core before do_install after do_compile
addtask do_sca_deploy_slick_recipe before do_package after do_sca_slick_core

DEPENDS += "sca-recipe-slick-rules-native"