SUMMARY = "Improved build system generator for CPython C, C++, Cython and Fortran extensions"
DESCRIPTION = "Improved build system generator for CPython C, C++, Cython and Fortran extensions"
HOMEPAGE = "https://github.com/scikit-build/scikit-build"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7c96d2b08b3cec6d3c67fb864d1fd8cc"

PYPI_PACKAGE = "scikit-build"

DEPENDS += "${PYTHON_PN}-packaging-native ${PYTHON_PN}-pyparsing-native"

inherit pypi
inherit setuptools3
inherit native

SRC_URI[md5sum] = "c25d3e0dbffd1d01e5075cae40d72c4b"
SRC_URI[sha256sum] = "7342017cc82dd6178e3b19377389b8a8d1f8b429d9cdb315cfb1094e34a0f526"
