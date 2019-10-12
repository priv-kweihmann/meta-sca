## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-stylelint-core

SCA_DEPLOY_TASK = "do_sca_deploy_stylelint_recipe"

python do_sca_deploy_stylelint_recipe() {
    sca_conv_deploy(d, "stylelint", "txt")
}

do_compile[postfuncs] += "do_sca_stylelint_core"
do_package[prefuncs] += "do_sca_deploy_stylelint_recipe"

do_sca_stylelint_core[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_stylelint_recipe[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "sca-recipe-stylelint-rules-native"
