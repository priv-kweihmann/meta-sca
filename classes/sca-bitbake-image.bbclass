## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-bitbake-core

do_image_qa[postfuncs] += "do_sca_bitbake"
do_image_complete[prefuncs] += "do_sca_deploy_bitbake"

do_sca_bitbake[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_bitbake[nostamp] = "${@sca_force_run(d)}"