## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-eslint-core
inherit sca-conv-to-export

SCA_DEPLOY_TASK = "do_sca_deploy_eslint_image"

python do_sca_deploy_eslint_image() {
    sca_conv_deploy(d, "eslint", "xml")
}

addtask do_sca_eslint_core before do_image_complete after do_image
addtask do_sca_deploy_eslint_image before do_image_complete after do_sca_eslint_core

do_sca_eslint_core[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_eslint_image[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "sca-image-eslint-rules-native"
