SUMMARY = "Python package for creating and manipulating graphs and networks"
HOMEPAGE = "https://github.com/networkx/networkx"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=44614b6df7cf3c19be69d0a945e29904"

DEPENDS += "python3-pandas-native"

PYPI_PACKAGE = "networkx"

SRC_URI[md5sum] = "ed6d188c843a76f66bbda9e7acb99cc5"
SRC_URI[sha256sum] = "effb7d9cd5c36e1e0d33f42a3aef5badde5030535826a367d5cf608a170af515"

inherit pypi
inherit setuptools3
inherit native
