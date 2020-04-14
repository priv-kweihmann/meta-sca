## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-shellcheck-core

SCA_DEPLOY_TASK = "do_sca_deploy_shellcheck_image"

python do_sca_deploy_shellcheck_image() {
    sca_conv_deploy(d, "shellcheck")
}

do_sca_shellcheck_core[doc] = "Lint shell script with shellcheck in image"
do_sca_deploy_shellcheck_image[doc] = "Deploy results of do_sca_shellcheck_core"
do_sca_shellcheck_core_report[doc] = "Report findings from do_sca_shellcheck_core"
addtask do_sca_shellcheck_core before do_image_complete after do_image
addtask do_sca_shellcheck_core_report after do_sca_shellcheck_core
addtask do_sca_deploy_shellcheck_image before do_image_complete after do_sca_shellcheck_core_report

DEPENDS += "sca-image-shellcheck-rules-native"
