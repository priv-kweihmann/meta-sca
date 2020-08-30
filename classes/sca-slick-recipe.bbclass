## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-slick-core
inherit sca-global
inherit sca-tracefiles

do_sca_slick_core[doc] = "Lint shell script with slick"
do_sca_slick_core_report[doc] = "Report findings from do_sca_slick_core"
addtask do_sca_slick_core after do_compile before do_sca_tracefiles
addtask do_sca_slick_core_report after do_sca_tracefiles before do_sca_deploy

DEPENDS += "sca-recipe-slick-rules-native"
