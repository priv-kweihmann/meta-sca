## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-bitbake-core

do_sca_bitbake[doc] = "Get bitbake warnings"
do_sca_deploy_bitbake[doc] = "Deploy results of do_sca_bitbake"
addtask do_sca_bitbake after do_package_qa do_compile do_install
addtask do_sca_deploy_bitbake after do_sca_bitbake before do_package_write_rpm do_package_write_deb do_package_write_tar do_package_write_ipk