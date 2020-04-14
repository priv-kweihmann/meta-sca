## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-stylelint-core

SCA_DEPLOY_TASK = "do_sca_deploy_stylelint_image"

python do_sca_deploy_stylelint_image() {
    sca_conv_deploy(d, "stylelint")
}

do_sca_stylelint_core[doc] = "Lint s/css files with stylelint in image"
do_sca_deploy_stylelint_image[doc] = "Deploy results of do_sca_stylelint_core"
do_sca_stylelint_core_report[doc] = "Report findings from do_sca_stylelint_core"
addtask do_sca_stylelint_core before do_image_complete after do_image
addtask do_sca_stylelint_core_report after do_sca_stylelint_core
addtask do_sca_deploy_stylelint_image before do_image_complete after do_sca_stylelint_core_report

DEPENDS += "sca-image-stylelint-rules-native"
