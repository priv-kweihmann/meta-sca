## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2021, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-secretlint-core
inherit sca-conv-to-export

do_sca_secretlint_core[doc] = "Find hardcoded secrets in image"
do_sca_deploy_secretlint_image[doc] = "Deploy results of do_sca_secretlint_core"
addtask do_sca_secretlint_core before do_image_complete after do_image
addtask do_sca_secretlint_core_report after do_sca_secretlint_core before do_sca_deploy

DEPENDS += "sca-image-secretlint-rules-native"
