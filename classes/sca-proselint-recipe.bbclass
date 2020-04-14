## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-proselint-core
inherit sca-conv-to-export
inherit sca-tracefiles

SCA_DEPLOY_TASK = "do_sca_deploy_proselint_recipe"

python do_sca_deploy_proselint_recipe() {
    sca_conv_deploy(d, "proselint")
}

do_sca_proselint_core[doc] = "Lint text documents with proselint"
do_sca_proselint_core_report[doc] = "Report findings from do_sca_proselint_core"
do_sca_deploy_proselint_recipe[doc] = "Deploy results of do_sca_proselint_core"
addtask do_sca_proselint_core after do_compile before do_sca_tracefiles
addtask do_sca_proselint_core_report after do_sca_tracefiles
addtask do_sca_deploy_proselint_recipe after do_sca_proselint_core_report before do_package

DEPENDS += "sca-recipe-proselint-rules-native"
