## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-standard-core
inherit sca-tracefiles

do_sca_standard_core[doc] = "Lint js files with standard"
do_sca_standard_core_report[doc] = "Report findings from do_sca_standard_core"
addtask do_sca_standard_core after do_compile before do_sca_tracefiles
addtask do_sca_standard_core_report after do_sca_tracefiles before do_sca_deploy

DEPENDS += "sca-recipe-standard-rules-native"
