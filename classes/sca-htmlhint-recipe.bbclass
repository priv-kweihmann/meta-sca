## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-htmlhint-core
inherit sca-conv-to-export

SCA_DEPLOY_TASK = "do_sca_deploy_htmlhint_recipe"

python do_sca_deploy_htmlhint_recipe() {
    sca_conv_deploy(d, "htmlhint", "json")
}

addtask do_sca_htmlhint_core before do_install after do_compile
addtask do_sca_deploy_htmlhint_recipe before do_package after do_sca_htmlhint_core

do_sca_htmlhint_core[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_htmlhint_recipe[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "sca-recipe-htmlhint-rules-native"
