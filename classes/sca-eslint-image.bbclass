## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-eslint-core
inherit sca-conv-to-export

SCA_DEPLOY_TASK = "do_sca_deploy_eslint_image"

python do_sca_deploy_eslint_image() {
    sca_conv_deploy(d, "eslint", "xml")
}

do_sca_eslint_core[doc] = "LInt js files with eslint in image"
do_sca_deploy_eslint_recipe[doc] = "Deploy results of do_sca_eslint_core"
addtask do_sca_eslint_core before do_image_complete after do_image
addtask do_sca_deploy_eslint_image before do_image_complete after do_sca_eslint_core

DEPENDS += "sca-image-eslint-rules-native"
