## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2023, Konrad Weihmann

# This disables creating expensive SBOMs
# which just consume space and don't serve
# any purpose for our test distro

deltask do_collect_spdx_deps
deltask do_create_image_sbom
deltask do_create_image_sbom_spdx
deltask do_create_image_spdx
deltask do_create_package_spdx
deltask do_create_rootfs_spdx
deltask do_create_spdx
deltask do_create_spdx_runtime

do_collect_spdx_deps[noexec] = "1"
do_create_image_sbom[noexec] = "1"
do_create_image_sbom_spdx[noexec] = "1"
do_create_image_spdx[noexec] = "1"
do_create_package_spdx[noexec] = "1"
do_create_rootfs_spdx[noexec] = "1"
do_create_spdx[noexec] = "1"
do_create_spdx_runtime[noexec] = "1"
do_create_spdx_setscene[noexec] = "1"

ROOTFS_POSTUNINSTALL_COMMAND:remove = "image_combine_spdx"
