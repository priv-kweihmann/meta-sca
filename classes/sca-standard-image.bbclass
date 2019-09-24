## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-standard-core

SCA_DEPLOY_TASK = "do_sca_deploy_standard_image"

python do_sca_deploy_standard_image() {
    sca_conv_deploy(d, "standard", "txt")
}

addtask do_sca_standard_core before do_image_complete after do_image
addtask do_sca_deploy_standard_image before do_image_complete after do_sca_standard_core

do_sca_standard_core[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_standard_image[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "sca-image-standard-rules-native"
