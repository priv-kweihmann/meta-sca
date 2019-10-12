## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-standard-core

SCA_DEPLOY_TASK = "do_sca_deploy_standard_image"

python do_sca_deploy_standard_image() {
    sca_conv_deploy(d, "standard", "txt")
}

do_image[postfuncs] += "do_sca_standard_core"
do_image_complete[prefuncs] += "do_sca_deploy_standard_image"

do_sca_standard_core[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_standard_image[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "sca-image-standard-rules-native"
