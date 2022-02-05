SUMMARY = "Improved build system generator for CPython"
DESCRIPTION = "Improved build system generator for CPython C, C++, Cython and Fortran extensions"
HOMEPAGE = "https://github.com/scikit-build/scikit-build"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7c96d2b08b3cec6d3c67fb864d1fd8cc"

DEPENDS += "python3-packaging-native python3-pyparsing-native"

PYPI_PACKAGE = "scikit-build"

SRC_URI[md5sum] = "e4de098fa96a9eca04910a97f2fa7c3e"
SRC_URI[sha256sum] = "a6ca1b7f1cc8a718564c19f535014f3a71f34508f72e750d4221f987eed0f06d"

inherit pypi
inherit setuptools3
inherit native
