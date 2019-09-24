## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-eslint-core
inherit sca-conv-to-export

SCA_DEPLOY_TASK = "do_sca_deploy_eslint_recipe"

python do_sca_deploy_eslint_recipe() {
    sca_conv_deploy(d, "eslint", "xml")
}

addtask do_sca_eslint_core before do_install after do_compile
addtask do_sca_deploy_eslint_recipe before do_package after do_sca_eslint_core

do_sca_eslint_core[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_eslint_recipe[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "sca-recipe-eslint-rules-native"
