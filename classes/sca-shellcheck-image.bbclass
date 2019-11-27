## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-shellcheck-core

SCA_DEPLOY_TASK = "do_sca_deploy_shellcheck_image"

python do_sca_deploy_shellcheck_image() {
    sca_conv_deploy(d, "shellcheck", "xml")
}

addtask do_sca_shellcheck_core before do_image_complete after do_image
addtask do_sca_deploy_shellcheck_image before do_image_complete after do_sca_shellcheck_core

do_sca_shellcheck_core[depends] += "${@oe.utils.conditional('SCA_FORCE_RUN', '1', '${PN}:do_sca_do_force_meta_task', '', d)}"
do_sca_deploy_shellcheck_image[depends] += "${@oe.utils.conditional('SCA_FORCE_RUN', '1', '${PN}:do_sca_do_force_meta_task', '', d)}"

DEPENDS += "sca-image-shellcheck-rules-native"
