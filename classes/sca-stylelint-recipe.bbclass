## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-stylelint-core
inherit sca-tracefiles

SCA_DEPLOY_TASK = "do_sca_deploy_stylelint_recipe"

python do_sca_deploy_stylelint_recipe() {
    sca_conv_deploy(d, "stylelint")
}

do_sca_stylelint_core[doc] = "Lint s/css files with stylelint"
do_sca_stylelint_core_report[doc] = "Report findings from do_sca_stylelint_core"
do_sca_deploy_stylelint_recipe[doc] = "Deploy results of do_sca_stylelint_core"
addtask do_sca_stylelint_core after do_compile before do_sca_tracefiles
addtask do_sca_stylelint_core_report after do_sca_tracefiles
addtask do_sca_deploy_stylelint_recipe after do_sca_stylelint_core_report before do_package

DEPENDS += "sca-recipe-stylelint-rules-native"
