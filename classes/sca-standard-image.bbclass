## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-standard-core

do_sca_standard_core[doc] = "Lint js files with standard in image"
do_sca_standard_core_report[doc] = "Report findings from do_sca_standard_core"
addtask do_sca_standard_core before do_image_complete after do_image
addtask do_sca_standard_core_report after do_sca_standard_core before do_sca_deploy

DEPENDS += "sca-image-standard-rules-native"
