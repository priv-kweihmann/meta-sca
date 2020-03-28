## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-ansiblelint-core

SCA_DEPLOY_TASK = "do_sca_deploy_ansiblelint_recipe"

python do_sca_deploy_ansiblelint_recipe() {
    sca_conv_deploy(d, "ansiblelint", "txt")
}

do_sca_ansiblelint_core[doc] = "Lint ansible playbooks"
addtask do_sca_ansiblelint_core before do_install after do_compile
do_sca_deploy_ansiblelint_recipe[doc] = "Deploy results of do_sca_ansiblelint_core"
addtask do_sca_deploy_ansiblelint_recipe before do_package after do_sca_ansiblelint_core

DEPENDS += "sca-recipe-ansiblelint-rules-native"
