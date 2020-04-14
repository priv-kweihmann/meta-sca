## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-vulture-core
inherit sca-global
inherit sca-tracefiles

inherit python3-dir

SCA_DEPLOY_TASK = "do_sca_deploy_vulture_recipe"

python do_sca_deploy_vulture_recipe() {
   sca_conv_deploy(d, "vulture")
}

do_sca_vulture_core[doc] = "Find dead python code"
do_sca_vulture_core_report[doc] = "Report findings from do_sca_vulture_core"
do_sca_deploy_vulture_recipe[doc] = "Deploy results of do_sca_vulture_core"
addtask do_sca_vulture_core after do_compile before do_sca_tracefiles
addtask do_sca_vulture_core_report after do_sca_tracefiles
addtask do_sca_deploy_vulture_recipe after do_sca_vulture_core_report before do_package

DEPENDS += "sca-recipe-vulture-rules-native"
