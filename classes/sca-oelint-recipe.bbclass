## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-oelint-core
inherit sca-conv-to-export

SCA_DEPLOY_TASK = "do_sca_deploy_oelint_recipe"

python do_sca_deploy_oelint_recipe() {
    sca_conv_deploy(d, "oelint")
}

do_sca_oelint_core[doc] = "Lint bitbake recipes"
do_sca_deploy_oelint_recipe[doc] = "Deploy results of do_sca_oelint_core"
addtask do_sca_oelint_core before do_install after do_compile
addtask do_sca_deploy_oelint_recipe before do_package after do_sca_oelint_core

DEPENDS += "sca-recipe-oelint-rules-native"
