SUMMARY = "Python package for creating and manipulating graphs and networks"
HOMEPAGE = "https://github.com/networkx/networkx"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=5cfa4d8f5881e0d053bb497130b9c73a"

DEPENDS += "python3-decorator-native"

PYPI_PACKAGE = "networkx"

SRC_URI[md5sum] = "f4e861e98c09b061d1446c798c1db368"
SRC_URI[sha256sum] = "bf4cb807d1bccf1593c7d0742d9127d9e04e021867299082658b0fc3907924e8"

do_install_append() {
    # according to https://github.com/networkx/networkx/issues/4718#issuecomment-813034594
    # it's safe to use decorator 5.0.5+
    # can be likely removed with a future update of networkx
    find ${D} -type f -exec sed -i "s#decorator<5.*#decorator#g" {} \;
}

inherit pypi
inherit setuptools3
inherit native
