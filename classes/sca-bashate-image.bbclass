## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-bashate-core
inherit sca-global

inherit python3-dir

do_sca_bashate_core[doc] = "Lint shell scripts with bashate in image"
addtask do_sca_bashate_core before do_image_complete after do_image
do_sca_bashate_core_report[doc] = "Report findings from do_sca_bashate_core"
addtask do_sca_bashate_core_report after do_sca_bashate_core before do_sca_deploy

DEPENDS += "sca-image-bashate-rules-native"
