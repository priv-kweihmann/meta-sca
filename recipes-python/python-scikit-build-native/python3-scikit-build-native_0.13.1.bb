SUMMARY = "Improved build system generator for CPython"
DESCRIPTION = "Improved build system generator for CPython C, C++, Cython and Fortran extensions"
HOMEPAGE = "https://github.com/scikit-build/scikit-build"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7c96d2b08b3cec6d3c67fb864d1fd8cc"

DEPENDS += "python3-packaging-native python3-pyparsing-native"

PYPI_PACKAGE = "scikit-build"

SRC_URI[md5sum] = "b3f4b7adafcf6aa713e5a6eadd84179b"
SRC_URI[sha256sum] = "5d1774a2eb15988e081c582c254ab4a9752096e6a34f235411cb79bd61660c37"

inherit pypi
inherit setuptools3
inherit native
