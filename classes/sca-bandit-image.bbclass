## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-bandit-core

SCA_DEPLOY_TASK = "do_sca_deploy_bandit_image"

python do_sca_deploy_bandit_image() {
    sca_conv_deploy(d, "bandit")
}

do_sca_bandit_core[doc] = "Find insecure python code in image"
addtask do_sca_bandit_core before do_image_complete after do_image
do_sca_bandit_core_report[doc] = "Report findings from do_sca_bandit_core"
addtask do_sca_bandit_core_report after do_sca_bandit_core
do_sca_deploy_bandit_image[doc] = "Deploy results of do_sca_bandit_core"
addtask do_sca_deploy_bandit_image before do_image_complete after do_sca_bandit_core_report

DEPENDS += "sca-image-bandit-rules-native"
