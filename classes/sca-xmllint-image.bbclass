inherit sca-helper
inherit sca-global
inherit sca-xmllint-core

SCA_DEPLOY_TASK = "do_sca_deploy_xmllint_image"

python do_sca_deploy_xmllint_image() {
    sca_conv_deploy(d, "xmllint", "txt")
}

addtask do_sca_xmllint_core before do_image_complete after do_image
addtask do_sca_deploy_xmllint_image before do_image_complete after do_sca_xmllint_core

do_sca_xmllint_core[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_xmllint_image[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "sca-image-xmllint-rules-native"
