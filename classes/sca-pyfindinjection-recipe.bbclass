## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-pyfindinjection-core
inherit sca-global
inherit sca-tracefiles

SCA_DEPLOY_TASK = "do_sca_deploy_pyfindinjection_recipe"

python do_sca_deploy_pyfindinjection_recipe() {
    sca_conv_deploy(d, "pyfindinjection")
}

do_sca_pyfindinjection_core[doc] = "Find code injections in python code"
do_sca_pyfindinjection_core_report[doc] = "Report findings from do_sca_pyfindinjection_core"
do_sca_deploy_pyfindinjection_recipe[doc] = "Deploy results of do_sca_pyfindinjection_core"
addtask do_sca_pyfindinjection_core after do_compile before do_sca_tracefiles
addtask do_sca_pyfindinjection_core_report after do_sca_tracefiles
addtask do_sca_deploy_pyfindinjection_recipe after do_sca_pyfindinjection_core_report before do_package

DEPENDS += "sca-recipe-pyfindinjection-rules-native"
