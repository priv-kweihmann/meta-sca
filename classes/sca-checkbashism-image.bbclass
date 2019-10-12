## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-checkbashism-core
inherit sca-global

SCA_DEPLOY_TASK = "do_sca_deploy_checkbashism_image"

python do_sca_deploy_checkbashism_image() {
    sca_conv_deploy(d, "checkbashism", "txt")
}

do_image[postfuncs] += "do_sca_checkbashism_core"
do_image_complete[prefuncs] += "do_sca_deploy_checkbashism_image"

do_sca_checkbashism_core[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_checkbashism_image[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "sca-image-checkbashism-rules-native"