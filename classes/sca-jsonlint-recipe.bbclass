## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-jsonlint-core
inherit sca-conv-to-export
inherit sca-tracefiles

SCA_DEPLOY_TASK = "do_sca_deploy_jsonlint_recipe"

python do_sca_deploy_jsonlint_recipe() {
    sca_conv_deploy(d, "jsonlint")
}

do_sca_jsonlint_core[doc] = "Lint json files"
do_sca_jsonlint_core_report[doc] = "Report findings from do_sca_jsonlint_core"
do_sca_deploy_jsonlint_recipe[doc] = "Deploy results of do_sca_jsonlint_core"
addtask do_sca_jsonlint_core after do_compile before do_sca_tracefiles
addtask do_sca_jsonlint_core_report after do_sca_tracefiles
addtask do_sca_deploy_jsonlint_recipe after do_sca_jsonlint_core_report before do_package

DEPENDS += "sca-recipe-jsonlint-rules-native"
