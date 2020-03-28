## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-jsonlint-core
inherit sca-conv-to-export

SCA_DEPLOY_TASK = "do_sca_deploy_jsonlint_image"

python do_sca_deploy_jsonlint_image() {
    sca_conv_deploy(d, "jsonlint", "txt")
}

do_sca_jsonlint_core[doc] = "Lint json files in image"
do_sca_deploy_jsonlint_image[doc] = "Deploy results of do_sca_jsonlint_core"
addtask do_sca_jsonlint_core before do_image_complete after do_image
addtask do_sca_deploy_jsonlint_image before do_image_complete after do_sca_jsonlint_core

DEPENDS += "sca-image-jsonlint-rules-native"
