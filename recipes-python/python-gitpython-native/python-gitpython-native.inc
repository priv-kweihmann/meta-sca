SUMMARY = "GitPython is a python library used to interact with Git repositories."
DESCRIPTION = "GitPython is a python library used to interact with Git repositories."
HOMEPAGE = "https://github.com/gitpython-developers/GitPython"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8b8d26c37c1d5a04f9b0186edbebc183"

DEPENDS += "${PYTHON_PN}-native"
RDEPENDS_${PN} += "${PYTHON_PN}-ddt-native ${PYTHON_PN}-gitdb-native"

PYPI_PACKAGE = "GitPython"

inherit pypi

FILES_${PN} += "${datadir}/GitPython"

inherit native