## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-bandit-core

SCA_DEPLOY_TASK = "do_sca_deploy_bandit_recipe"

python do_sca_deploy_bandit_recipe() {
    sca_conv_deploy(d, "bandit", "json")
}

do_compile[postfuncs] += "do_sca_bandit_core"
do_package[prefuncs] += "do_sca_deploy_bandit_recipe"

do_sca_bandit_core[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_bandit_recipe[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "sca-recipe-bandit-rules-native"
