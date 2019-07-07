inherit sca-tlv-core
inherit sca-global

SCA_DEPLOY_TASK = "do_sca_deploy_tlv_image"

SCA_TLV_FILES ?= "${SCA_SOURCES_DIR}/${sysconfdir}/* ${SCA_SOURCES_DIR}/${sysconfdir}/**/*"

python do_sca_deploy_tlv_image() {
    sca_conv_deploy(d, "tlv", "txt")
}

addtask do_sca_tlv_core before do_image_complete after do_image
addtask do_sca_deploy_tlv_image before do_image_complete after do_sca_tlv_core

do_sca_tlv_core[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_tlv_image[nostamp] = "${@sca_force_run(d)}"
