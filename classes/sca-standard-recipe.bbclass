## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-standard-core

SCA_DEPLOY_TASK = "do_sca_deploy_standard_recipe"

python do_sca_deploy_standard_recipe() {
    sca_conv_deploy(d, "standard", "txt")
}

addtask do_sca_standard_core before do_install after do_compile
addtask do_sca_deploy_standard_recipe before do_package after do_sca_standard_core

DEPENDS += "sca-recipe-standard-rules-native"
