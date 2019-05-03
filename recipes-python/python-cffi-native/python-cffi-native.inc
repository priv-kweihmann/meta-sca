SUMMARY = "Foreign Function Interface for Python calling C code."
DESCRIPTION = "Foreign Function Interface for Python calling C code."
HOMEPAGE = "https://bitbucket.org/cffi/cffi/src/default/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5677e2fdbf7cdda61d6dd2b57df547bf"

RDEPENDS_${PN} += "${PYTHON_PN}-native"

DEPENDS += " \
    ${PYTHON_PN}-pycparser-native \
"

PYPI_PACKAGE = "cffi"

inherit pypi

inherit native
