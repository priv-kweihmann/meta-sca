## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-checkbashism-core
inherit sca-global

SCA_DEPLOY_TASK = "do_sca_deploy_checkbashism_recipe"

python do_sca_deploy_checkbashism_recipe() {
   sca_conv_deploy(d, "checkbashism", "txt")
}

do_compile[postfuncs] += "do_sca_checkbashism_core"
do_package[prefuncs] += "do_sca_deploy_checkbashism_recipe"

do_sca_checkbashism_core[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_checkbashism_recipe[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "sca-recipe-checkbashism-rules-native"