## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-bandit-core
inherit sca-tracefiles

SCA_DEPLOY_TASK = "do_sca_deploy_bandit_recipe"

python do_sca_deploy_bandit_recipe() {
    sca_conv_deploy(d, "bandit")
}

do_sca_bandit_core[doc] = "Find insecure python code"
do_sca_bandit_core_report[doc] = "Report findings from do_sca_bandit_core"
do_sca_deploy_bandit_image[doc] = "Deploy results of do_sca_bandit_core"
addtask do_sca_bandit_core after do_compile before do_sca_tracefiles
addtask do_sca_bandit_core_report after do_sca_tracefiles
addtask do_sca_deploy_bandit_recipe after do_sca_bandit_core_report before do_package

DEPENDS += "sca-recipe-bandit-rules-native"
