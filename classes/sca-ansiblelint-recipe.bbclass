## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-ansiblelint-core

SCA_DEPLOY_TASK = "do_sca_deploy_ansiblelint_recipe"

python do_sca_deploy_ansiblelint_recipe() {
    sca_conv_deploy(d, "ansiblelint", "txt")
}

do_compile[postfuncs] += "do_sca_ansiblelint_core"
do_package[prefuncs] += "do_sca_deploy_ansiblelint_recipe"

do_sca_ansiblelint_core[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_ansiblelint_recipe[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "sca-recipe-ansiblelint-rules-native"
