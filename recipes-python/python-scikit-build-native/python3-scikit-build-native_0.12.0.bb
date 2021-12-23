SUMMARY = "Improved build system generator for CPython"
DESCRIPTION = "Improved build system generator for CPython C, C++, Cython and Fortran extensions"
HOMEPAGE = "https://github.com/scikit-build/scikit-build"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7c96d2b08b3cec6d3c67fb864d1fd8cc"

DEPENDS += "python3-packaging-native python3-pyparsing-native"

PYPI_PACKAGE = "scikit-build"

SRC_URI[md5sum] = "4ef1e6a6eea409672f6f7b280ecba904"
SRC_URI[sha256sum] = "f851382c469bcd9a8c98b1878bcfdd13b68556279d2fd9a329be41956ae5a7fe"

inherit pypi
inherit setuptools3
inherit native
