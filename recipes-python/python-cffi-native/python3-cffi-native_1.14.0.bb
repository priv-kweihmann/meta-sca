SUMMARY = "Foreign Function Interface for Python calling C code."
DESCRIPTION = "Foreign Function Interface for Python calling C code."
HOMEPAGE = "https://bitbucket.org/cffi/cffi/src/default/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5677e2fdbf7cdda61d6dd2b57df547bf"

RDEPENDS_${PN} += "${PYTHON_PN}-native"

DEPENDS += " \
    ${PYTHON_PN}-pycparser-native \
    libffi-native \
"

PYPI_PACKAGE = "cffi"

inherit pypi
inherit setuptools3
inherit native

SRC_URI[md5sum] = "74845f8d2b7b583dd9a3574f402edf39"
SRC_URI[sha256sum] = "2d384f4a127a15ba701207f7639d94106693b6cd64173d6c8988e2c25f3ac2b6"
