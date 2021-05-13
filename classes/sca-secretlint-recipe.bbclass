## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2021, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-secretlint-core
inherit sca-conv-to-export
inherit sca-tracefiles

do_sca_secretlint_core[doc] = "Find hardcoded secrets in code"
do_sca_secretlint_core_report[doc] = "Report findings from do_sca_secretlint_core"
addtask do_sca_secretlint_core after do_compile before do_sca_tracefiles
addtask do_sca_secretlint_core_report after do_sca_tracefiles before do_sca_deploy

DEPENDS += "sca-recipe-secretlint-rules-native"
