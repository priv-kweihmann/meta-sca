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

do_image[postfuncs] += "do_sca_htmlhint_core"
do_image_complete[prefuncs] += "do_sca_deploy_htmlhint_image"

do_sca_htmlhint_core[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_htmlhint_image[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "sca-image-htmlhint-rules-native"
