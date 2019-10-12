## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-flake8-core
inherit sca-global

inherit ${@oe.utils.ifelse(d.getVar('SCA_STD_PYTHON_INTERPRETER') == 'python3', 'python3-dir', 'python-dir')}

## Add ids to suppress on a recipe level
SCA_FLAKE8_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_FLAKE8_EXTRA_FATAL ?= ""

SCA_DEPLOY_TASK = "do_sca_deploy_flake8_image"

python do_sca_deploy_flake8_image() {
    sca_conv_deploy(d, "flake8", "txt")
}

do_image[postfuncs] += "do_sca_flake8_core"
do_image_complete[prefuncs] += "do_sca_deploy_flake8_image"

do_sca_flake8_core[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_flake8_image[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "sca-image-flake8-rules-native"