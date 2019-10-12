## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-standard-core

SCA_DEPLOY_TASK = "do_sca_deploy_standard_recipe"

python do_sca_deploy_standard_recipe() {
    sca_conv_deploy(d, "standard", "txt")
}

do_compile[postfuncs] += "do_sca_standard_core"
do_package[prefuncs] += "do_sca_deploy_standard_recipe"

do_sca_standard_core[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_standard_recipe[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "sca-recipe-standard-rules-native"
