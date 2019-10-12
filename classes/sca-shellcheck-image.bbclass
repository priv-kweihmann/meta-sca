## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-shellcheck-core

SCA_DEPLOY_TASK = "do_sca_deploy_shellcheck_image"

python do_sca_deploy_shellcheck_image() {
    sca_conv_deploy(d, "shellcheck", "xml")
}

do_image[postfuncs] += "do_sca_shellcheck_core"
do_image_complete[prefuncs] += "do_sca_deploy_shellcheck_image"

do_sca_shellcheck_core[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_shellcheck_image[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "sca-image-shellcheck-rules-native"
