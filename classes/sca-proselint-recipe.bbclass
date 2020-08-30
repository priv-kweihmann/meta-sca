## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-proselint-core
inherit sca-conv-to-export
inherit sca-tracefiles

do_sca_proselint_core[doc] = "Lint text documents with proselint"
do_sca_proselint_core_report[doc] = "Report findings from do_sca_proselint_core"
addtask do_sca_proselint_core after do_compile before do_sca_tracefiles
addtask do_sca_proselint_core_report after do_sca_tracefiles before do_sca_deploy

DEPENDS += "sca-recipe-proselint-rules-native"
