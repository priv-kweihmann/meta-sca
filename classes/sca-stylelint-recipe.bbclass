## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-stylelint-core

SCA_DEPLOY_TASK = "do_sca_deploy_stylelint_recipe"

python do_sca_deploy_stylelint_recipe() {
    sca_conv_deploy(d, "stylelint", "txt")
}

do_sca_stylelint_core[doc] = "Lint s/css files with stylelint"
do_sca_deploy_stylelint_recipe[doc] = "Deploy results of do_sca_stylelint_core"
addtask do_sca_stylelint_core before do_install after do_compile
addtask do_sca_deploy_stylelint_recipe before do_package after do_sca_stylelint_core

DEPENDS += "sca-recipe-stylelint-rules-native"
