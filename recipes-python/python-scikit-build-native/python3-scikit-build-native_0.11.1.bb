SUMMARY = "Improved build system generator for CPython"
DESCRIPTION = "Improved build system generator for CPython C, C++, Cython and Fortran extensions"
HOMEPAGE = "https://github.com/scikit-build/scikit-build"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7c96d2b08b3cec6d3c67fb864d1fd8cc"

DEPENDS += "${PYTHON_PN}-packaging-native ${PYTHON_PN}-pyparsing-native"

PYPI_PACKAGE = "scikit-build"

SRC_URI[md5sum] = "a10abc6aec21c63ac924f6f69f270417"
SRC_URI[sha256sum] = "da40dfd69b2456fad1349a894b90180b43712152b8a85d2a00f4ae2ce8ac9a5c"

inherit pypi
inherit setuptools3
inherit native
