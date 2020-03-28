## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-pyfindinjection-core
inherit sca-global

SCA_DEPLOY_TASK = "do_sca_deploy_pyfindinjection_recipe"

python do_sca_deploy_pyfindinjection_recipe() {
    sca_conv_deploy(d, "pyfindinjection", "txt")
}

do_sca_pyfindinjection_core[doc] = "Find code injections in python code"
do_sca_deploy_pyfindinjection_recipe[doc] = "Deploy results of do_sca_pyfindinjection_core"
addtask do_sca_pyfindinjection_core before do_install after do_compile
addtask do_sca_deploy_pyfindinjection_recipe before do_package after do_sca_pyfindinjection_core

DEPENDS += "sca-recipe-pyfindinjection-rules-native"
