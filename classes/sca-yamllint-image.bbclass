## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-yamllint-core

SCA_DEPLOY_TASK = "do_sca_deploy_yamllint_image"

python do_sca_deploy_yamllint_image() {
    sca_conv_deploy(d, "yamllint", "txt")
}

do_sca_yamllint_core[doc] = "Lint yaml files in image"
do_sca_deploy_yamllint_image[doc] = "Deploy results of do_sca_yamllint_core"
addtask do_sca_yamllint_core before do_image_complete after do_image
addtask do_sca_deploy_yamllint_image before do_image_complete after do_sca_yamllint_core

DEPENDS += "sca-image-yamllint-rules-native"
