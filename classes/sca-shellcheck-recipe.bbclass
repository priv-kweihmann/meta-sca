## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-shellcheck-core

SCA_DEPLOY_TASK = "do_sca_deploy_shellcheck_recipe"

python do_sca_deploy_shellcheck_recipe() {
    sca_conv_deploy(d, "shellcheck", "xml")
}

do_compile[postfuncs] += "do_sca_shellcheck_core"
do_package[prefuncs] += "do_sca_deploy_shellcheck_recipe"

do_sca_shellcheck_core[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_shellcheck_recipe[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "sca-recipe-shellcheck-rules-native"
