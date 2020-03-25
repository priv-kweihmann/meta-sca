## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-pyfindinjection-core
inherit sca-global

SCA_DEPLOY_TASK = "do_sca_deploy_pyfindinjection_image"

python do_sca_deploy_pyfindinjection_image() {
    sca_conv_deploy(d, "pyfindinjection", "txt")
}

addtask do_sca_pyfindinjection_core before do_image_complete after do_image
addtask do_sca_deploy_pyfindinjection_image before do_image_complete after do_sca_pyfindinjection_core

DEPENDS += "sca-image-pyfindinjection-rules-native"