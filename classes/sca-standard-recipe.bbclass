## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-standard-core
inherit sca-tracefiles

SCA_DEPLOY_TASK = "do_sca_deploy_standard_recipe"

python do_sca_deploy_standard_recipe() {
    sca_conv_deploy(d, "standard")
}

do_sca_standard_core[doc] = "Lint js files with standard"
do_sca_standard_core_report[doc] = "Report findings from do_sca_standard_core"
do_sca_deploy_standard_recipe[doc] = "Deploy results of do_sca_standard_core"
addtask do_sca_standard_core after do_compile before do_sca_tracefiles
addtask do_sca_standard_core_report after do_sca_tracefiles
addtask do_sca_deploy_standard_recipe after do_sca_standard_core_report before do_package

DEPENDS += "sca-recipe-standard-rules-native"
