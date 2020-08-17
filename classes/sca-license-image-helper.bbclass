## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## This class contains helper methods
## when dealing with licenses and images

ROOTFS_POSTPROCESS_COMMAND =+ " do_sca_image_pkg_list; "

SCA_IMAGE_PKG_LIST = "${T}/pkgs.json"

python do_sca_image_pkg_list() {
    import json
    from oe.rootfs import image_list_installed_packages
    with open(d.getVar("SCA_IMAGE_PKG_LIST"), "w") as o:
        json.dump(image_list_installed_packages(d), o)
}
