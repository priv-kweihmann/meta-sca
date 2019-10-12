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

do_compile[postfuncs] += "do_sca_proselint_core"
do_package[prefuncs] += "do_sca_deploy_proselint_recipe"

do_sca_proselint_core[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_proselint_recipe[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "sca-recipe-proselint-rules-native"
