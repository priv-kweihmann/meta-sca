## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-yamllint-core

SCA_DEPLOY_TASK = "do_sca_deploy_yamllint_recipe"

python do_sca_deploy_yamllint_recipe() {
    sca_conv_deploy(d, "yamllint", "txt")
}

do_sca_yamllint_core[doc] = "Lint yaml files"
do_sca_deploy_yamllint_recipe[doc] = "Deploy results of do_sca_yamllint_core"
addtask do_sca_yamllint_core before do_install after do_compile
addtask do_sca_deploy_yamllint_recipe before do_package after do_sca_yamllint_core

DEPENDS += "sca-recipe-yamllint-rules-native"
