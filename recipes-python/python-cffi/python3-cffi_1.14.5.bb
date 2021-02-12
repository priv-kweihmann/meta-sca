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

SRC_URI[md5sum] = "272cb183bf0365530e3c0d8f446cd89d"
SRC_URI[sha256sum] = "fd78e5fee591709f32ef6edb9a015b4aa1a5022598e36227500c8f4e02328d9c"

inherit pypi
inherit setuptools3

BBCLASSEXTEND = "native"
