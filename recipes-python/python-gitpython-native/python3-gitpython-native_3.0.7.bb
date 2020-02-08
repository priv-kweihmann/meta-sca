SUMMARY = "GitPython is a python library used to interact with Git repositories."
DESCRIPTION = "GitPython is a python library used to interact with Git repositories."
HOMEPAGE = "https://github.com/gitpython-developers/GitPython"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8b8d26c37c1d5a04f9b0186edbebc183"

DEPENDS += "${PYTHON_PN}-native ${PYTHON_PN}-ddt-native ${PYTHON_PN}-gitdb-native"

PYPI_PACKAGE = "GitPython"

inherit pypi
inherit setuptools3
inherit native

SRC_URI[md5sum] = "c3e8bc89e92706356473b9485ffd9e67"
SRC_URI[sha256sum] = "99cd0403cecd8a13b95d2e045b9fcaa7837137fcc5ec3105f2c413305d82c143"
