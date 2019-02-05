## This class contains methods for filtering file
## according to their license

def sca_filter_by_license_image(d, licenses)
    import oe.packagedata
    import bb
    import os

    if d.getVar("LICENSE_CREATE_PACKAGE") != "1" or \
       d.getVar("COPY_LIC_MANIFEST") != 1:
       bb.warn("License-Filter can only be used with LICENSE_CREATE_PACKAGE and COPY_LIC_MANIFEST set to '1'")
       return []

    if not d.getVar("IMAGE_ROOTFS"):
        bb.warn("License-Filter can only be applied on image-level")
        return []

    ## extract installed package list from rootfs
    pack_list = []
    with open(os.path.join(d.getVar("IMAGE_ROOTFS"), "usr/share/common-licenses/license.manifest"), "r") as i:
        for item in i.readlines():
            if not item.startswith("PACKAGE NAME: "):
                continue
            pack_list.append(item.replace("PACKAGE NAME: ", "").strip())

    ignores = []
    for item in pack_list:
        try:
            pkgdata = oe.packagedata.read_subpkgdata_dict(item, d)
            if pkgdata["LICENSE"] not in licenses:
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
            bb.warn("{} -> {}".format(item, e))

    return list(set(ignores))

def sca_filter_by_license(d, licenses):
    if d.getVar("SCA_MODE") == "image":
        return sca_filter_by_license_image(d, licenses)
    else:
        ## FIXME
        return []
    
