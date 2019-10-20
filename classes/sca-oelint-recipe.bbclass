## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-oelint-core
inherit sca-conv-to-export

SCA_DEPLOY_TASK = "do_sca_deploy_oelint_recipe"

python do_sca_deploy_oelint_recipe() {
    sca_conv_deploy(d, "oelint", "txt")
}

addtask do_sca_oelint_core before do_install after do_compile
addtask do_sca_deploy_oelint_recipe before do_package after do_sca_oelint_core

do_sca_oelint_core[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_oelint_recipe[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "sca-recipe-oelint-rules-native"
