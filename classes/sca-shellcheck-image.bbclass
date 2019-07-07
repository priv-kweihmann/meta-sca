inherit sca-helper
inherit sca-global
inherit sca-shellcheck-core

SCA_DEPLOY_TASK = "do_sca_deploy_shellcheck_image"

python do_sca_deploy_shellcheck_image() {
    sca_conv_deploy(d, "shellcheck", "xml")
}

addtask do_sca_shellcheck_core before do_image_complete after do_image
addtask do_sca_deploy_shellcheck_image before do_image_complete after do_sca_shellcheck_core

do_sca_shellcheck_core[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_shellcheck_image[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "sca-image-shellcheck-rules-native"
