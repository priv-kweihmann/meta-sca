SUMMARY = "Python package for creating and manipulating graphs and networks."
DESCRIPTION = "Python package for creating and manipulating graphs and networks."
HOMEPAGE = "https://github.com/networkx/networkx"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=b68290ee1026b204170a23bbdb27a4fd"

PYPI_PACKAGE = "networkx"

DEPENDS += "${PYTHON_PN}-decorator-native"

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "63e3fdc9d3a46bcabc776acc5ea5fe48"
SRC_URI[sha256sum] = "f8f4ff0b6f96e4f9b16af6b84622597b5334bf9cae8cf9b2e42e7985d5c95c64"
