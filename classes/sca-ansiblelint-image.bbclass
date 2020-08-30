## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-ansiblelint-core

do_sca_ansiblelint_core[doc] = "Lint ansible playbooks in image"
addtask do_sca_ansiblelint_core before do_image_complete after do_image
do_sca_ansiblelint_core_report[doc] = "Report findings from do_sca_ansiblelint_core"
addtask do_sca_ansiblelint_core_report after do_sca_ansiblelint_core before do_sca_deploy

DEPENDS += "sca-image-ansiblelint-rules-native"
