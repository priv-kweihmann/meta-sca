## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-pylint-core
inherit sca-global

inherit python3-dir

## Add ids to suppress on a recipe level
SCA_PYLINT_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_PYLINT_EXTRA_FATAL ?= ""
## Folder to scan
SCA_PYLINT_ROOTPATH ?= "${IMAGE_ROOTFS}"
## PYTHONHOME-path to use
SCA_PYLINT_HOMEPATH ?= "${IMAGE_ROOTFS}/usr/lib/python${PYTHON_BASEVERSION}"
## The Librarypath to use
SCA_PYLINT_LIBATH ?= "${IMAGE_ROOTFS}/usr/lib/python${PYTHON_BASEVERSION}/:${IMAGE_ROOTFS}/usr/lib/python${PYTHON_BASEVERSION}/site-packages/"
## Extra options to be passed to pylint
SCA_PYLINT_EXTRA ?= "--errors-only"

SCA_DEPLOY_TASK = "do_sca_deploy_pylint_image"

python do_sca_deploy_pylint_image() {
    sca_conv_deploy(d, "pylint", "txt")
}

addtask do_sca_pylint_core before do_image_complete after do_image
addtask do_sca_deploy_pylint_image before do_image_complete after do_sca_pylint_core

do_sca_pylint_core[depends] += "${@oe.utils.conditional('SCA_FORCE_RUN', '1', '${PN}:do_sca_do_force_meta_task', '', d)}"
do_sca_deploy_pylint_image[depends] += "${@oe.utils.conditional('SCA_FORCE_RUN', '1', '${PN}:do_sca_do_force_meta_task', '', d)}"

DEPENDS += "sca-image-pylint-rules-native"