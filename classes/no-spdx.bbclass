## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2023, Konrad Weihmann

# This disables creating expensive SBOMs
# which just consume space and don't serve
# any purpose for our test distro

do_collect_spdx_deps[noexec] = "1"
do_create_spdx[noexec] = "1"
do_create_spdx_setscene[noexec] = "1"
do_create_runtime_spdx[noexec] = "1"

ROOTFS_POSTUNINSTALL_COMMAND:remove = "image_combine_spdx"
