## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-stank-core

SCA_DEPLOY_TASK = "do_sca_deploy_stank_recipe"

python do_sca_deploy_stank_recipe() {
    sca_conv_deploy(d, "stank", "txt")
}

do_compile[postfuncs] += "do_sca_stank_core"
do_package[prefuncs] += "do_sca_deploy_stank_recipe"

do_sca_stank_core[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_stank_recipe[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "sca-recipe-stank-rules-native"
