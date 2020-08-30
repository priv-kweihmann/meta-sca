## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-stank-core

do_sca_stank_core[doc] = "Lint shell scripts with stank in image"
do_sca_stank_core_report[doc] = "Report findings from do_sca_stank_core"
addtask do_sca_stank_core before do_image_complete after do_image
addtask do_sca_stank_core_report after do_sca_stank_core before do_sca_deploy
DEPENDS += "sca-image-stank-rules-native"
