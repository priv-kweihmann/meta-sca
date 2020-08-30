## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-bitbake-core

do_sca_bitbake[doc] = "Get bitbake warnings"
addtask do_sca_bitbake after do_image before do_sca_deploy
