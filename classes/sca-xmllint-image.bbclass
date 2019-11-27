## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-xmllint-core

SCA_DEPLOY_TASK = "do_sca_deploy_xmllint_image"

python do_sca_deploy_xmllint_image() {
    sca_conv_deploy(d, "xmllint", "txt")
}

addtask do_sca_xmllint_core before do_image_complete after do_image
addtask do_sca_deploy_xmllint_image before do_image_complete after do_sca_xmllint_core

do_sca_xmllint_core[depends] += "${@oe.utils.conditional('SCA_FORCE_RUN', '1', '${PN}:do_sca_do_force_meta_task', '', d)}"
do_sca_deploy_xmllint_image[depends] += "${@oe.utils.conditional('SCA_FORCE_RUN', '1', '${PN}:do_sca_do_force_meta_task', '', d)}"

DEPENDS += "sca-image-xmllint-rules-native"
