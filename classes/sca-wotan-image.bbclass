## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-wotan-core

do_sca_wotan_core[doc] = "Lint type/javascript files in image"
do_sca_wotan_core_report[doc] = "Report findings from do_sca_wotan_core"
addtask do_sca_wotan_core before do_image_complete after do_image
addtask do_sca_wotan_core_report after do_sca_wotan_core before do_sca_deploy

DEPENDS += "sca-image-wotan-rules-native"
