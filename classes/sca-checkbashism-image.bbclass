## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-checkbashism-core
inherit sca-global

do_sca_checkbashism_core[doc] = "Lint shell scripts with checkbashisms in image"
do_sca_deploy_checkbashism_image[doc] = "Deploy results of do_sca_checkbashism_core"
addtask do_sca_checkbashism_core before do_image_complete after do_image
addtask do_sca_checkbashism_core_report after do_sca_bashate_core before do_sca_deploy

DEPENDS += "sca-image-checkbashism-rules-native"
