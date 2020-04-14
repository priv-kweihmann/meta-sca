## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-bashate-core
inherit sca-global

inherit python3-dir

SCA_DEPLOY_TASK = "do_sca_deploy_bashate_image"

python do_sca_deploy_bashate_image() {
    sca_conv_deploy(d, "bashate")
}

do_sca_bashate_core[doc] = "Lint shell scripts with bashate in image"
addtask do_sca_bashate_core before do_image_complete after do_image
do_sca_bashate_core_report[doc] = "Report findings from do_sca_bashate_core"
addtask do_sca_bashate_core_report after do_sca_bashate_core
do_sca_deploy_bashate_image[doc] = "Deploy results of do_sca_bashate_core"
addtask do_sca_deploy_bashate_image before do_image_complete after do_sca_bashate_core_report

DEPENDS += "sca-image-bashate-rules-native"
