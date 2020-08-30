## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-eslint-core
inherit sca-conv-to-export
inherit sca-tracefiles

do_sca_eslint_core[doc] = "Lint js files with eslint"
do_sca_eslint_core_report[doc] = "Report findings from do_sca_eslint_core"
addtask do_sca_eslint_core after do_compile before do_sca_tracefiles
addtask do_sca_eslint_core_report after do_sca_tracefiles before do_sca_deploy

DEPENDS += "sca-recipe-eslint-rules-native"
