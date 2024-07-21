## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2023, Konrad Weihmann

# This disables creating expensive SBOMs
# which just consume space and don't serve
# any purpose for our test distro

do_create_spdx_setscene[noexec] = "1"
deltask do_collect_spdx_deps
deltask do_create_spdx
deltask do_create_spdx_runtime
deltask do_create_package_spdx
deltask do_create_rootfs_spdx
deltask do_create_image_spdx
deltask do_create_image_sbom

ROOTFS_POSTUNINSTALL_COMMAND:remove = "image_combine_spdx"
