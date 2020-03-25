## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-bitbake-core

addtask do_sca_bitbake after do_image before do_image_complete
addtask do_sca_deploy_bitbake after do_sca_bitbake before do_image_complete