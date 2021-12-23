SUMMARY = "Foreign Function Interface for Python calling C code"
HOMEPAGE = "https://bitbucket.org/cffi/cffi/src/default/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5677e2fdbf7cdda61d6dd2b57df547bf"

DEPENDS += "\
            python3-pycparser-native \
            libffi-native \
           "

PYPI_PACKAGE = "cffi"

SRC_URI[md5sum] = "f3a3f26cd3335fc597479c9475da0a0b"
SRC_URI[sha256sum] = "920f0d66a896c2d99f0adbb391f990a84091179542c205fa53ce5787aff87954"

inherit pypi
inherit setuptools3
inherit native
