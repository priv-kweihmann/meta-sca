## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-jshint-core
inherit sca-conv-to-export

SCA_DEPLOY_TASK = "do_sca_deploy_jshint_image"

python do_sca_deploy_jshint_image() {
    sca_conv_deploy(d, "jshint", "txt")
}

do_sca_jshint_core[doc] = "Lint js files with jshint in image"
do_sca_deploy_jshint_image[doc] = "Deploy results of do_sca_jshint_core"
addtask do_sca_jshint_core before do_image_complete after do_image
addtask do_sca_deploy_jshint_image before do_image_complete after do_sca_jshint_core

DEPENDS += "sca-image-jshint-rules-native"
