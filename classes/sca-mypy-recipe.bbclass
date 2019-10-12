## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-mypy-core
inherit sca-global

inherit ${@oe.utils.ifelse(d.getVar('SCA_STD_PYTHON_INTERPRETER') == 'python3', 'python3-dir', 'python-dir')}

## Add ids to suppress on a recipe level
SCA_MYPY_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_MYPY_EXTRA_FATAL ?= ""

SCA_DEPLOY_TASK = "do_sca_deploy_mypy_recipe"

python do_sca_deploy_mypy_recipe() {
   sca_conv_deploy(d, "mypy", "txt")
}

do_compile[postfuncs] += "do_sca_mypy_core"
do_package[prefuncs] += "do_sca_deploy_mypy_recipe"

do_sca_mypy_core[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_mypy_recipe[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "sca-recipe-mypy-rules-native"