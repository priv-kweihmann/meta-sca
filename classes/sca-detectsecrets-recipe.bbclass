## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-detectsecrets-core
inherit sca-conv-to-export

SCA_DEPLOY_TASK = "do_sca_deploy_detectsecrets_recipe"

python do_sca_deploy_detectsecrets_recipe() {
    sca_conv_deploy(d, "detectsecrets", "json")
}

do_compile[postfuncs] += "do_sca_detectsecrets_core"
do_package[prefuncs] += "do_sca_deploy_detectsecrets_recipe"

do_sca_detectsecrets_core[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_detectsecrets_recipe[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "sca-recipe-detectsecrets-rules-native"
