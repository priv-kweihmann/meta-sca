SUMMARY = "Python package for creating and manipulating graphs and networks"
HOMEPAGE = "https://github.com/networkx/networkx"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=5cfa4d8f5881e0d053bb497130b9c73a"

DEPENDS += "python3-pandas-native"

PYPI_PACKAGE = "networkx"

SRC_URI[md5sum] = "407eb28c54e08725559754ca7ab185e0"
SRC_URI[sha256sum] = "c0946ed31d71f1b732b5aaa6da5a0388a345019af232ce2f49c766e2d6795c51"

inherit pypi
inherit setuptools3
inherit native
