## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-checkbashism-core
inherit sca-global
inherit sca-tracefiles

SCA_DEPLOY_TASK = "do_sca_deploy_checkbashism_recipe"

python do_sca_deploy_checkbashism_recipe() {
   sca_conv_deploy(d, "checkbashism")
}

do_sca_checkbashism_core[doc] = "Lint shell scripts with checkbashisms"
do_sca_checkbashism_core_report[doc] = "Report findings from do_sca_checkbashism_core"
do_sca_deploy_checkbashism_recipe[doc] = "Deploy results of do_sca_checkbashism_core"
addtask do_sca_checkbashism_core after do_compile before do_sca_tracefiles
addtask do_sca_checkbashism_core_report after do_sca_tracefiles
addtask do_sca_deploy_checkbashism_recipe after do_sca_checkbashism_core_report before do_package

DEPENDS += "sca-recipe-checkbashism-rules-native"
