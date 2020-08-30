## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-oelint-core
inherit sca-conv-to-export

do_sca_oelint_core[doc] = "Lint bitbake recipes"
addtask do_sca_oelint_core before do_sca_deploy after do_compile

DEPENDS += "sca-recipe-oelint-rules-native"
