## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-vulture-core
inherit sca-global

inherit ${@oe.utils.ifelse(d.getVar('SCA_STD_PYTHON_INTERPRETER') == 'python3', 'python3-dir', 'python-dir')}

SCA_DEPLOY_TASK = "do_sca_deploy_vulture_image"

python do_sca_deploy_vulture_image() {
    sca_conv_deploy(d, "vulture", "txt")
}

addtask do_sca_vulture_core before do_image_complete after do_image
addtask do_sca_deploy_vulture_image before do_image_complete after do_sca_vulture_core

do_sca_vulture_core[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_vulture_image[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "sca-image-vulture-rules-native"