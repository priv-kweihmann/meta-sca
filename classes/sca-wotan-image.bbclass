## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-wotan-core

SCA_DEPLOY_TASK = "do_sca_deploy_wotan_image"

python do_sca_deploy_wotan_image() {
    sca_conv_deploy(d, "wotan", "json")
}

do_image[postfuncs] += "do_sca_wotan_core"
do_image_complete[prefuncs] += "do_sca_deploy_wotan_image"

do_sca_wotan_core[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_wotan_image[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "sca-image-wotan-rules-native"
