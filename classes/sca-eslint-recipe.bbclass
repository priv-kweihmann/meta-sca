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

do_compile[postfuncs] += "do_sca_eslint_core"
do_package[prefuncs] += "do_sca_deploy_eslint_recipe"

do_sca_eslint_core[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_eslint_recipe[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "sca-recipe-eslint-rules-native"
