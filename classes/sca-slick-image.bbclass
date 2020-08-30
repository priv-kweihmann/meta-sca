## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-slick-core
inherit sca-global

do_sca_slick_core[doc] = "Lint shell script with slick in image"
do_sca_slick_core_report[doc] = "Report findings from do_sca_slick_core"
addtask do_sca_slick_core before do_image_complete after do_image
addtask do_sca_slick_core_report after do_sca_slick_core before do_sca_deploy

DEPENDS += "sca-image-slick-rules-native"
