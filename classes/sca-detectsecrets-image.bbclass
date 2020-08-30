## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-detectsecrets-core
inherit sca-conv-to-export

do_sca_detectsecrets_core[doc] = "Find hardcoded secrets in image"
do_sca_deploy_detectsecrets_image[doc] = "Deploy results of do_sca_detectsecrets_core"
addtask do_sca_detectsecrets_core before do_image_complete after do_image
addtask do_sca_detectsecrets_core_report after do_sca_detectsecrets_core before do_sca_deploy

DEPENDS += "sca-image-detectsecrets-rules-native"
