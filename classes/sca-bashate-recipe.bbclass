## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-bashate-core
inherit sca-global
inherit sca-tracefiles

inherit python3-dir

SCA_DEPLOY_TASK = "do_sca_deploy_bashate_recipe"

python do_sca_deploy_bashate_recipe() {
   sca_conv_deploy(d, "bashate")
}

do_sca_bashate_core[doc] = "Lint shell scripts with bashate"
do_sca_bashate_core_report[doc] = "Report findings from do_sca_bashate_core"
do_sca_deploy_bashate_recipe[doc] = "Deploy results of do_sca_bashate_core"
addtask do_sca_bashate_core after do_compile before do_sca_tracefiles
addtask do_sca_bashate_core_report after do_sca_tracefiles
addtask do_sca_deploy_bashate_recipe after do_sca_bashate_core_report before do_package

DEPENDS += "sca-recipe-bashate-rules-native"
