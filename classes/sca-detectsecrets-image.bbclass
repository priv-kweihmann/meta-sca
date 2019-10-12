## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-detectsecrets-core
inherit sca-conv-to-export

SCA_DEPLOY_TASK = "do_sca_deploy_detectsecrets_image"

python do_sca_deploy_detectsecrets_image() {
    sca_conv_deploy(d, "detectsecrets", "json")
}

do_image[postfuncs] += "do_sca_detectsecrets_core"
do_image_complete[prefuncs] += "do_sca_deploy_detectsecrets_image"

do_sca_detectsecrets_core[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_detectsecrets_image[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "sca-image-detectsecrets-rules-native"
