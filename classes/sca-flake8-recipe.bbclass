## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-flake8-core
inherit sca-global

inherit ${@oe.utils.ifelse(d.getVar('SCA_STD_PYTHON_INTERPRETER') == 'python3', 'python3-dir', 'python-dir')}

## Add ids to suppress on a recipe level
SCA_FLAKE8_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_FLAKE8_EXTRA_FATAL ?= ""

SCA_DEPLOY_TASK = "do_sca_deploy_flake8_recipe"

python do_sca_deploy_flake8_recipe() {
   sca_conv_deploy(d, "flake8", "txt")
}

addtask do_sca_flake8_core before do_install after do_compile
addtask do_sca_deploy_flake8_recipe before do_package after do_sca_flake8_core

do_sca_flake8_core[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_flake8_recipe[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "sca-recipe-flake8-rules-native"