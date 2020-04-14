## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-slick-core
inherit sca-global
inherit sca-tracefiles

SCA_DEPLOY_TASK = "do_sca_deploy_slick_recipe"

python do_sca_deploy_slick_recipe() {
   sca_conv_deploy(d, "slick")
}

do_sca_slick_core[doc] = "Lint shell script with slick"
do_sca_slick_core_report[doc] = "Report findings from do_sca_slick_core"
do_sca_deploy_slick_recipe[doc] = "Deploy results of do_sca_slick_core"
addtask do_sca_slick_core after do_compile before do_sca_tracefiles
addtask do_sca_slick_core_report after do_sca_tracefiles
addtask do_sca_deploy_slick_recipe after do_sca_slick_core_report before do_package

DEPENDS += "sca-recipe-slick-rules-native"
