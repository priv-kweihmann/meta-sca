## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-xmllint-core
inherit sca-tracefiles

SCA_DEPLOY_TASK = "do_sca_deploy_xmllint_recipe"

python do_sca_deploy_xmllint_recipe() {
    sca_conv_deploy(d, "xmllint")
}

do_sca_xmllint_core[doc] = "Lint xml files"
do_sca_xmllint_core_report[doc] = "Report findings from do_sca_xmllint_core"
do_sca_deploy_xmllint_recipe[doc] = "Deploy results of do_sca_xmllint_core"
addtask do_sca_xmllint_core after do_compile before do_sca_tracefiles
addtask do_sca_xmllint_core_report after do_sca_tracefiles
addtask do_sca_deploy_xmllint_recipe after do_sca_xmllint_core_report before do_package

DEPENDS += "sca-recipe-xmllint-rules-native"
