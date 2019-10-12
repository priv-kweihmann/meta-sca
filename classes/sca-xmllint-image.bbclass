## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-xmllint-core

SCA_DEPLOY_TASK = "do_sca_deploy_xmllint_image"

python do_sca_deploy_xmllint_image() {
    sca_conv_deploy(d, "xmllint", "txt")
}

do_image[postfuncs] += "do_sca_xmllint_core"
do_image_complete[prefuncs] += "do_sca_deploy_xmllint_image"

do_sca_xmllint_core[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_xmllint_image[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "sca-image-xmllint-rules-native"
