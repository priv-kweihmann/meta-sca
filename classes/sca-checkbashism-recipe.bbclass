## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-checkbashism-core
inherit sca-global

SCA_DEPLOY_TASK = "do_sca_deploy_checkbashism_recipe"

python do_sca_deploy_checkbashism_recipe() {
   sca_conv_deploy(d, "checkbashism", "txt")
}

addtask do_sca_checkbashism_core before do_install after do_compile
addtask do_sca_deploy_checkbashism_recipe before do_package after do_sca_checkbashism_core

do_sca_checkbashism_core[depends] += "${@oe.utils.conditional('SCA_FORCE_RUN', '1', '${PN}:do_sca_do_force_meta_task', '', d)}"
do_sca_deploy_checkbashism_recipe[depends] += "${@oe.utils.conditional('SCA_FORCE_RUN', '1', '${PN}:do_sca_do_force_meta_task', '', d)}"

DEPENDS += "sca-recipe-checkbashism-rules-native"