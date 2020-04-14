## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-detectsecrets-core
inherit sca-conv-to-export
inherit sca-tracefiles

SCA_DEPLOY_TASK = "do_sca_deploy_detectsecrets_recipe"

python do_sca_deploy_detectsecrets_recipe() {
    sca_conv_deploy(d, "detectsecrets")
}

do_sca_detectsecrets_core[doc] = "Find hardcoded secrets in code"
do_sca_detectsecrets_core_report[doc] = "Report findings from do_sca_detectsecrets_core"
do_sca_deploy_detectsecrets_recipe[doc] = "Deploy results of do_sca_detectsecrets_core"
addtask do_sca_detectsecrets_core after do_compile before do_sca_tracefiles
addtask do_sca_detectsecrets_core_report after do_sca_tracefiles
addtask do_sca_deploy_detectsecrets_recipe after do_sca_detectsecrets_core_report before do_package

DEPENDS += "sca-recipe-detectsecrets-rules-native"
