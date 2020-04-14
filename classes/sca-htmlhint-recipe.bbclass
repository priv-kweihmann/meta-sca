## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-htmlhint-core
inherit sca-conv-to-export
inherit sca-tracefiles

SCA_DEPLOY_TASK = "do_sca_deploy_htmlhint_recipe"

python do_sca_deploy_htmlhint_recipe() {
    sca_conv_deploy(d, "htmlhint")
}

do_sca_htmlhint_core[doc] = "Lint html files with htmlhint"
do_sca_htmlhint_core_report[doc] = "Report findings from do_sca_htmlhint_core"
do_sca_deploy_htmlhint_recipe[doc] = "Deploy results of do_sca_htmlhint_core"
addtask do_sca_htmlhint_core after do_compile before do_sca_tracefiles
addtask do_sca_htmlhint_core_report after do_sca_tracefiles
addtask do_sca_deploy_htmlhint_recipe after do_sca_htmlhint_core_report before do_package

DEPENDS += "sca-recipe-htmlhint-rules-native"
