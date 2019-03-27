SUMMARY = "Improved build system generator for CPython C, C++, Cython and Fortran extensions"
DESCRIPTION = "Improved build system generator for CPython C, C++, Cython and Fortran extensions"
HOMEPAGE = "https://github.com/scikit-build/scikit-build"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7c96d2b08b3cec6d3c67fb864d1fd8cc"

PYPI_PACKAGE = "scikit-build"

DEPENDS += "${PYTHON_PN}-packaging-native ${PYTHON_PN}-pyparsing-native"

inherit pypi

FILES_${PN} += "${datadir}/skbuild ${datadir}/scikit-build"

inherit native
