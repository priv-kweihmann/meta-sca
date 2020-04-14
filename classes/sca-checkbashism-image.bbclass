## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-checkbashism-core
inherit sca-global

SCA_DEPLOY_TASK = "do_sca_deploy_checkbashism_image"

python do_sca_deploy_checkbashism_image() {
    sca_conv_deploy(d, "checkbashism")
}

do_sca_checkbashism_core[doc] = "Lint shell scripts with checkbashisms in image"
do_sca_deploy_checkbashism_image[doc] = "Deploy results of do_sca_checkbashism_core"
do_sca_checkbashism_core_report[doc] = "Report findings from do_sca_checkbashism_core"
addtask do_sca_checkbashism_core before do_image_complete after do_image
addtask do_sca_checkbashism_core_report after do_sca_bashate_core
addtask do_sca_deploy_checkbashism_image before do_image_complete after do_sca_checkbashism_core_report

DEPENDS += "sca-image-checkbashism-rules-native"
