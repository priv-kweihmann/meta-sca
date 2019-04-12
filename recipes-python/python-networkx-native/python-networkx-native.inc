SUMMARY = "Python package for creating and manipulating graphs and networks."
DESCRIPTION = "Python package for creating and manipulating graphs and networks."
HOMEPAGE = "https://github.com/networkx/networkx"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=b68290ee1026b204170a23bbdb27a4fd"

PYPI_PACKAGE = "networkx"
PYPI_PACKAGE_EXT = "zip"

DEPENDS += "${PYTHON_PN}-decorator-native"

inherit pypi

FILES_${PN} += "${datadir}/networkx"

inherit native
