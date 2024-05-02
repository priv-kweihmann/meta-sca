## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2024, Konrad Weihmann

inherit sca-ruff-core
inherit sca-global
inherit sca-tracefiles

inherit python3-dir

## Add ids to suppress on a recipe level
SCA_RUFF_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_RUFF_EXTRA_FATAL ?= ""

do_sca_ruff_core[doc] = "Lint python code with ruff"
do_sca_ruff_core_report[doc] = "Report findings from do_sca_ruff_core"
addtask do_sca_ruff_core after do_compile before do_sca_tracefiles
addtask do_sca_ruff_core_report after do_sca_tracefiles before do_sca_deploy

DEPENDS += "sca-recipe-ruff-rules-native"
