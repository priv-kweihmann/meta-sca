## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-ansiblelint-core
inherit sca-tracefiles

SCA_DEPLOY_TASK = "do_sca_deploy_ansiblelint_recipe"

python do_sca_deploy_ansiblelint_recipe() {
    sca_conv_deploy(d, "ansiblelint")
}

do_sca_ansiblelint_core[doc] = "Lint ansible playbooks"
do_sca_ansiblelint_core_report[doc] = "Report findings from do_sca_ansiblelint_core"
do_sca_deploy_ansiblelint_recipe[doc] = "Deploy results of do_sca_ansiblelint_core"
addtask do_sca_ansiblelint_core after do_compile before do_sca_tracefiles
addtask do_sca_ansiblelint_core_report after do_sca_tracefiles
addtask do_sca_deploy_ansiblelint_recipe after do_sca_ansiblelint_core_report before do_package

DEPENDS += "sca-recipe-ansiblelint-rules-native"
