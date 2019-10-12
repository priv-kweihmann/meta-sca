## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-pylint-core
inherit sca-global

inherit ${@oe.utils.ifelse(d.getVar('SCA_STD_PYTHON_INTERPRETER') == 'python3', 'python3-dir', 'python-dir')}

## Add ids to suppress on a recipe level
SCA_PYLINT_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_PYLINT_EXTRA_FATAL ?= ""
## Folder to scan
SCA_PYLINT_ROOTPATH ?= "${B}"
## PYTHONHOME-path to use
SCA_PYLINT_HOMEPATH ?= "${STAGING_LIBDIR}/python${PYTHON_BASEVERSION}"
## The Librarypath to use
SCA_PYLINT_LIBATH ?= "${STAGING_LIBDIR}/python${PYTHON_BASEVERSION}/:${STAGING_LIBDIR}/python${PYTHON_BASEVERSION}/site-packages/"

SCA_DEPLOY_TASK = "do_sca_deploy_pylint_recipe"

python do_sca_deploy_pylint_recipe() {
   sca_conv_deploy(d, "pylint", "txt")
}

do_compile[postfuncs] += "do_sca_pylint_core"
do_package[prefuncs] += "do_sca_deploy_pylint_recipe"

do_sca_pylint_core[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_pylint_recipe[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "sca-recipe-pylint-rules-native"