SUMMARY = "Python package for creating and manipulating graphs and networks."
DESCRIPTION = "Python package for creating and manipulating graphs and networks."
HOMEPAGE = "https://github.com/networkx/networkx"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3376ff7c9c58048c62d91431f7f08cde"

PYPI_PACKAGE = "networkx"
PYPI_PACKAGE_EXT = "zip"

DEPENDS += "${PYTHON_PN}-decorator-native"

inherit pypi

FILES_${PN} += "${datadir}/networkx"

inherit native
