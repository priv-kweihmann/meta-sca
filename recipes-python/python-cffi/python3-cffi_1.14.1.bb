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

SRC_URI[md5sum] = "1dac3d20d5602829dfaa7026658b7795"
SRC_URI[sha256sum] = "b2a2b0d276a136146e012154baefaea2758ef1f56ae9f4e01c612b0831e0bd2f"

inherit pypi
inherit setuptools3

BBCLASSEXTEND = "native"
