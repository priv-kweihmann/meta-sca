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

SRC_URI[md5sum] = "652203cf99faa254efff7fab23c2f3a2"
SRC_URI[sha256sum] = "599a1e8ff057ac530c9ad1778293c665cb81a791421f46922d80a86473c13346"
