## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-bashate-core
inherit sca-global

inherit ${@oe.utils.ifelse(d.getVar('SCA_STD_PYTHON_INTERPRETER') == 'python3', 'python3-dir', 'python-dir')}

SCA_DEPLOY_TASK = "do_sca_deploy_bashate_image"

python do_sca_deploy_bashate_image() {
    sca_conv_deploy(d, "bashate", "txt")
}

do_image[postfuncs] += "do_sca_bashate_core"
do_image_complete[prefuncs] += "do_sca_deploy_bashate_image"

do_sca_bashate_core[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_bashate_image[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "sca-image-bashate-rules-native"