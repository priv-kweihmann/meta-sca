## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-proselint-core
inherit sca-conv-to-export

SCA_DEPLOY_TASK = "do_sca_deploy_proselint_recipe"

python do_sca_deploy_proselint_recipe() {
    sca_conv_deploy(d, "proselint", "json")
}

addtask do_sca_proselint_core before do_install after do_compile
addtask do_sca_deploy_proselint_recipe before do_package after do_sca_proselint_core

do_sca_proselint_core[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_proselint_recipe[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "sca-recipe-proselint-rules-native"
