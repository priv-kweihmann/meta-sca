## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-xmllint-core

SCA_DEPLOY_TASK = "do_sca_deploy_xmllint_recipe"

python do_sca_deploy_xmllint_recipe() {
    sca_conv_deploy(d, "xmllint", "txt")
}

do_compile[postfuncs] += "do_sca_xmllint_core"
do_package[prefuncs] += "do_sca_deploy_xmllint_recipe"

do_sca_xmllint_core[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_xmllint_recipe[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "sca-recipe-xmllint-rules-native"
