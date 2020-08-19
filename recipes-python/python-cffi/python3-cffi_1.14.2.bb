SUMMARY = "Foreign Function Interface for Python calling C code"
HOMEPAGE = "https://bitbucket.org/cffi/cffi/src/default/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5677e2fdbf7cdda61d6dd2b57df547bf"

DEPENDS += "\
            ${PYTHON_PN}-pycparser-native \
            libffi-native \
           "

RDEPENDS_${PN}_class-target += "\
                                ${PYTHON_PN}-pycparser \
                                libffi \
                               "

PYPI_PACKAGE = "cffi"

SRC_URI[md5sum] = "3cc2f1daf62dd66eda79b4d6281cebfc"
SRC_URI[sha256sum] = "ae8f34d50af2c2154035984b8b5fc5d9ed63f32fe615646ab435b05b132ca91b"

inherit pypi
inherit setuptools3

BBCLASSEXTEND = "native"
