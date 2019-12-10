## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-jshint-core
inherit sca-conv-to-export

SCA_DEPLOY_TASK = "do_sca_deploy_jshint_recipe"

python do_sca_deploy_jshint_recipe() {
    sca_conv_deploy(d, "jshint", "txt")
}

addtask do_sca_jshint_core before do_install after do_compile
addtask do_sca_deploy_jshint_recipe before do_package after do_sca_jshint_core

do_sca_jshint_core[depends] += "${@oe.utils.conditional('SCA_FORCE_RUN', '1', '${PN}:do_sca_do_force_meta_task', '', d)}"
do_sca_deploy_jshint_recipe[depends] += "${@oe.utils.conditional('SCA_FORCE_RUN', '1', '${PN}:do_sca_do_force_meta_task', '', d)}"

DEPENDS += "sca-recipe-jshint-rules-native"
