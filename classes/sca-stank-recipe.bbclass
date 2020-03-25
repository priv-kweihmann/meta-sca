## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-stank-core

SCA_DEPLOY_TASK = "do_sca_deploy_stank_recipe"

python do_sca_deploy_stank_recipe() {
    sca_conv_deploy(d, "stank", "txt")
}

addtask do_sca_stank_core before do_install after do_compile
addtask do_sca_deploy_stank_recipe before do_package after do_sca_stank_core

DEPENDS += "sca-recipe-stank-rules-native"
