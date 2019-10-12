## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-yamllint-core

SCA_DEPLOY_TASK = "do_sca_deploy_yamllint_recipe"

python do_sca_deploy_yamllint_recipe() {
    sca_conv_deploy(d, "yamllint", "txt")
}

do_compile[postfuncs] += "do_sca_yamllint_core"
do_package[prefuncs] += "do_sca_deploy_yamllint_recipe"

do_sca_yamllint_core[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_yamllint_recipe[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "sca-recipe-yamllint-rules-native"
