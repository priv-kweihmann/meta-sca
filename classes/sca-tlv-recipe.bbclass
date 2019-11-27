## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-tlv-core
inherit sca-global

SCA_DEPLOY_TASK = "do_sca_deploy_tlv_recipe"

SCA_TLV_FILES ?= "${SCA_SOURCES_DIR}/* ${SCA_SOURCES_DIR}/**/*"

python do_sca_deploy_tlv_recipe() {
   sca_conv_deploy(d, "tlv", "txt")
}

addtask do_sca_tlv_core before do_install after do_compile
addtask do_sca_deploy_tlv_recipe before do_package after do_sca_tlv_core

do_sca_tlv_core[depends] += "${@oe.utils.conditional('SCA_FORCE_RUN', '1', '${PN}:do_sca_do_force_meta_task', '', d)}"
do_sca_deploy_tlv_recipe[depends] += "${@oe.utils.conditional('SCA_FORCE_RUN', '1', '${PN}:do_sca_do_force_meta_task', '', d)}"