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

SRC_URI[md5sum] = "35ad1f9e1003cac9404c1493eb10d7f5"
SRC_URI[sha256sum] = "041c81822e9f84b1d9c401182e174996f0bae9991f33725d059b771744290774"
