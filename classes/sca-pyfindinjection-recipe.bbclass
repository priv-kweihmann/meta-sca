## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-pyfindinjection-core
inherit sca-global

SCA_DEPLOY_TASK = "do_sca_deploy_pyfindinjection_recipe"

python do_sca_deploy_pyfindinjection_recipe() {
    sca_conv_deploy(d, "pyfindinjection", "txt")
}

do_compile[postfuncs] += "do_sca_pyfindinjection_core"
do_package[prefuncs] += "do_sca_deploy_pyfindinjection_recipe"

do_sca_pyfindinjection_core[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_pyfindinjection_recipe[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "sca-recipe-pyfindinjection-rules-native"