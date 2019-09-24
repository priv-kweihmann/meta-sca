## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-stylelint-core

SCA_DEPLOY_TASK = "do_sca_deploy_stylelint_image"

python do_sca_deploy_stylelint_image() {
    sca_conv_deploy(d, "stylelint", "txt")
}

addtask do_sca_stylelint_core before do_image_complete after do_image
addtask do_sca_deploy_stylelint_image before do_image_complete after do_sca_stylelint_core

do_sca_stylelint_core[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_stylelint_image[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "sca-image-stylelint-rules-native"
