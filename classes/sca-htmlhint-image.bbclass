## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-htmlhint-core
inherit sca-conv-to-export

SCA_DEPLOY_TASK = "do_sca_deploy_htmlhint_image"

python do_sca_deploy_htmlhint_image() {
    sca_conv_deploy(d, "htmlhint", "json")
}

do_sca_htmlhint_core[doc] = "Lint html files with htmlhint in image"
do_sca_deploy_htmlhint_image[doc] = "Deploy results of do_sca_htmlhint_core"
addtask do_sca_htmlhint_core before do_image_complete after do_image
addtask do_sca_deploy_htmlhint_image before do_image_complete after do_sca_htmlhint_core

DEPENDS += "sca-image-htmlhint-rules-native"
