## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-bandit-core

do_sca_bandit_core[doc] = "Find insecure python code in image"
addtask do_sca_bandit_core before do_image_complete after do_image
do_sca_bandit_core_report[doc] = "Report findings from do_sca_bandit_core"
addtask do_sca_bandit_core_report after do_sca_bandit_core before do_sca_deploy

DEPENDS += "sca-image-bandit-rules-native"
