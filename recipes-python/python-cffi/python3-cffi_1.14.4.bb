SUMMARY = "Foreign Function Interface for Python calling C code"
HOMEPAGE = "https://bitbucket.org/cffi/cffi/src/default/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5677e2fdbf7cdda61d6dd2b57df547bf"

DEPENDS += "\
            python3-pycparser-native \
            libffi-native \
           "

RDEPENDS_${PN}_class-target += "\
                                python3-pycparser \
                                libffi \
                               "

PYPI_PACKAGE = "cffi"

SRC_URI[md5sum] = "ad3d8537b1516bad6bcdc36c458788be"
SRC_URI[sha256sum] = "1a465cbe98a7fd391d47dce4b8f7e5b921e6cd805ef421d04f5f66ba8f06086c"

inherit pypi
inherit setuptools3

BBCLASSEXTEND = "native"
