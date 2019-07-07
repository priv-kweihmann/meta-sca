inherit sca-helper
inherit sca-global
inherit sca-proselint-core
inherit sca-conv-to-export

SCA_DEPLOY_TASK = "do_sca_deploy_proselint_image"

python do_sca_deploy_proselint_image() {
    sca_conv_deploy(d, "proselint", "json")
}

addtask do_sca_proselint_core before do_image_complete after do_image
addtask do_sca_deploy_proselint_image before do_image_complete after do_sca_proselint_core

do_sca_proselint_core[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_proselint_image[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "sca-image-proselint-rules-native"
