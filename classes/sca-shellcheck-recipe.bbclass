## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-shellcheck-core

SCA_DEPLOY_TASK = "do_sca_deploy_shellcheck_recipe"

python do_sca_deploy_shellcheck_recipe() {
    sca_conv_deploy(d, "shellcheck", "xml")
}

addtask do_sca_shellcheck_core before do_install after do_compile
addtask do_sca_deploy_shellcheck_recipe before do_package after do_sca_shellcheck_core

DEPENDS += "sca-recipe-shellcheck-rules-native"
