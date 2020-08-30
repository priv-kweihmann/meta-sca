## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-mypy-core
inherit sca-global
inherit sca-tracefiles

inherit python3-dir

## Add ids to suppress on a recipe level
SCA_MYPY_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_MYPY_EXTRA_FATAL ?= ""

do_sca_mypy_core[doc] = "Lint python files wtth mypy"
do_sca_mypy_core_report[doc] = "Report findings from do_sca_mypy_core"
addtask do_sca_mypy_core after do_compile before do_sca_tracefiles
addtask do_sca_mypy_core_report after do_sca_tracefiles before do_sca_deploy

DEPENDS += "sca-recipe-mypy-rules-native"
