## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-tlv-core
inherit sca-global

SCA_DEPLOY_TASK = "do_sca_deploy_tlv_image"

SCA_TLV_FILES ?= "${SCA_SOURCES_DIR}/${sysconfdir}/* ${SCA_SOURCES_DIR}/${sysconfdir}/**/*"

python do_sca_deploy_tlv_image() {
    sca_conv_deploy(d, "tlv", "txt")
}

addtask do_sca_tlv_core before do_image_complete after do_image
addtask do_sca_deploy_tlv_image before do_image_complete after do_sca_tlv_core

do_sca_tlv_core[depends] += "${@oe.utils.conditional('SCA_FORCE_RUN', '1', '${PN}:do_sca_do_force_meta_task', '', d)}"
do_sca_deploy_tlv_image[depends] += "${@oe.utils.conditional('SCA_FORCE_RUN', '1', '${PN}:do_sca_do_force_meta_task', '', d)}"
