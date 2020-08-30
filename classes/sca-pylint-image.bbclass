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

do_sca_pylint_core[doc] = "Lint python code with pylint in image"
do_sca_deploy_pylint_image[doc] = "Deploy results of do_sca_pylint_core"
addtask do_sca_pylint_core before do_image_complete after do_image
addtask do_sca_pylint_core_report after do_sca_pylint_core before do_sca_deploy

DEPENDS += "sca-image-pylint-rules-native"
