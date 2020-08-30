## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-pyfindinjection-core
inherit sca-global

do_sca_pyfindinjection_core[doc] = "Find code injections in python code in image"
do_sca_deploy_pyfindinjection_image[doc] = "Deploy results of do_sca_pyfindinjection_core"
addtask do_sca_pyfindinjection_core before do_image_complete after do_image
addtask do_sca_pyfindinjection_core_report after do_sca_pyfindinjection_core before do_sca_deploy

DEPENDS += "sca-image-pyfindinjection-rules-native"
