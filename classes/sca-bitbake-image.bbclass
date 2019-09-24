## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-bitbake-core

addtask do_sca_bitbake after do_image_qa
addtask do_sca_deploy_bitbake after do_sca_bitbake before do_image_complete

do_sca_bitbake[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_bitbake[nostamp] = "${@sca_force_run(d)}"