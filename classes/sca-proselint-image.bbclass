## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-proselint-core
inherit sca-conv-to-export

do_sca_proselint_core[doc] = "Lint text documents with proselint in image"
do_sca_deploy_proselint_image[doc] = "Deploy results of do_sca_proselint_core"
addtask do_sca_proselint_core before do_image_complete after do_image
addtask do_sca_proselint_core_report after do_sca_proselint_core before do_sca_deploy

DEPENDS += "sca-image-proselint-rules-native"
