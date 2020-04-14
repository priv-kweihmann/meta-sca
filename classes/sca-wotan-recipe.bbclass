## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-wotan-core
inherit sca-tracefiles

SCA_DEPLOY_TASK = "do_sca_deploy_wotan_recipe"

python do_sca_deploy_wotan_recipe() {
    sca_conv_deploy(d, "wotan")
}

do_sca_wotan_core[doc] = "Lint type/javascript files"
do_sca_wotan_core_report[doc] = "Report findings from do_sca_wotan_core"
do_sca_deploy_wotan_recipe[doc] = "Deploy results of do_sca_wotan_core"
addtask do_sca_wotan_core after do_compile before do_sca_tracefiles
addtask do_sca_wotan_core_report after do_sca_tracefiles
addtask do_sca_deploy_wotan_recipe after do_sca_wotan_core_report before do_package

DEPENDS += "sca-recipe-wotan-rules-native"
