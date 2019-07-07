inherit sca-helper
inherit sca-global
inherit sca-jsonlint-core
inherit sca-conv-to-export

SCA_DEPLOY_TASK = "do_sca_deploy_jsonlint_image"

python do_sca_deploy_jsonlint_image() {
    sca_conv_deploy(d, "jsonlint", "txt")
}

addtask do_sca_jsonlint_core before do_image_complete after do_image
addtask do_sca_deploy_jsonlint_image before do_image_complete after do_sca_jsonlint_core

do_sca_jsonlint_core[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_jsonlint_image[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "sca-image-jsonlint-rules-native"
