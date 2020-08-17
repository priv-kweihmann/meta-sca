## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## This class contains methods for filtering file
## according to their license

def sca_get_module_licenses(d):
    return d.getVar("LICENSE").replace(" ", "").split("&")

def sca_is_wildcard_lic(d):
    return any([x for x in d.getVar("SCA_AUTO_LICENSE_FILTER").split(" ") if x == ".*"])

def sca_license_filter_match(d, pkglic=[]):
    import re
    modlics = pkglic or sca_get_module_licenses(d)
    for item in d.getVar("SCA_AUTO_LICENSE_FILTER").split(" "):
        for lic in modlics:
            if re.match(item, lic, 0):
                return True
    return False


def sca_filter_by_license_image(d):
    import oe.packagedata
    import bb
    import os
    import json

    if not d.getVar("IMAGE_ROOTFS") or not os.path.exists(d.getVar("SCA_IMAGE_PKG_LIST")):
        bb.warn("License-Filter can only be applied on image-level")
        return []

    ## extract installed package list from rootfs
    pack_list = []
    with open(d.getVar("SCA_IMAGE_PKG_LIST")) as i:
        pack_list = json.load(i).keys()

    ignores = []
    for item in pack_list:
        try:
            pkgdata = oe.packagedata.read_subpkgdata_dict(item, d)
            if not sca_license_filter_match(d, [ pkgdata["LICENSE"] ]):
                file_list = pkgdata["FILES_INFO"]
                if isinstance(file_list, str):
                    import ast
                    file_list = ast.literal_eval(file_list)

                ## put all files from this package to ignore_list
                for k in file_list.keys():
                    if k.startswith("/"):
                        ignores.append(k[1:]) ## add only relative paths
                    else:
                        ignores.append(k)
        except Exception as e:
            bb.note("{} -> {} - {}".format(item, e, oe.packagedata.read_subpkgdata_dict(item, d)))

    return list(set(ignores))

def sca_filter_by_license_recipe(d):
    if not sca_license_filter_match(d):
        return []
    return [ "1" ] ## return dummy value


def sca_filter_by_license(d):
    if d.getVar("SCA_MODE") == "image":
        return sca_filter_by_license_image(d)
    else:
        return sca_filter_by_license_recipe(d)

