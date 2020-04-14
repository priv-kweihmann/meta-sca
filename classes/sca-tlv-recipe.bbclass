## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-tlv-core
inherit sca-global
inherit sca-tracefiles

SCA_DEPLOY_TASK = "do_sca_deploy_tlv_recipe"

SCA_TLV_FILES ?= "* **/*"

python do_sca_deploy_tlv_recipe() {
   sca_conv_deploy(d, "tlv")
}

do_sca_tlv_core[doc] = "Find duplicate code various languages"
do_sca_tlv_core_report[doc] = "Report findings from do_sca_tlv_core"
do_sca_deploy_tlv_recipe[doc] = "Deploy results of do_sca_tlv_core"
addtask do_sca_tlv_core after do_compile before do_sca_tracefiles
addtask do_sca_tlv_core_report after do_sca_tracefiles
addtask do_sca_deploy_tlv_recipe after do_sca_tlv_core_report before do_package
