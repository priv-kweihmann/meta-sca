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

do_compile[postfuncs] += "do_sca_oelint_core"
do_package[prefuncs] += "do_sca_deploy_oelint_recipe"

do_sca_oelint_core[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_oelint_recipe[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "sca-recipe-oelint-rules-native"
