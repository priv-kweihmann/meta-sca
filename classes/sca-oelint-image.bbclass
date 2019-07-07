inherit sca-helper
inherit sca-global
inherit sca-oelint-core
inherit sca-conv-to-export

SCA_DEPLOY_TASK = "do_sca_deploy_oelint_image"

python do_sca_deploy_oelint_image() {
    sca_conv_deploy(d, "oelint", "txt")
}

addtask do_sca_oelint_core before do_image_complete after do_image
addtask do_sca_deploy_oelint_image before do_image_complete after do_sca_oelint_core

do_sca_oelint_core[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_oelint_image[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "sca-image-oelint-rules-native"
