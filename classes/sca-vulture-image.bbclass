## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-vulture-core
inherit sca-global

inherit python3-dir

do_sca_vulture_core[doc] = "Find dead python code in image"
do_sca_vulture_core_report[doc] = "Report findings from do_sca_vulture_core"
addtask do_sca_vulture_core before do_image_complete after do_image
addtask do_sca_vulture_core_report after do_sca_vulture_core before do_sca_deploy

DEPENDS += "sca-image-vulture-rules-native"
