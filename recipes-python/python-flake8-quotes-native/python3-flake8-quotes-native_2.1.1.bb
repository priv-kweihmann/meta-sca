SUMMARY = "Flake8 extension for checking quotes in python"
DESCRIPTION = "Flake8 extension for checking quotes in python"
HOMEPAGE = "https://github.com/zheller/flake8-quotes"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=838c366f69b72c5df05c96dff79b35f2"

PYPI_PACKAGE = "flake8-quotes"

DEPENDS += "${PYTHON_PN}-flake8-native"

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "5e86d6448240960204698567125db088"
SRC_URI[sha256sum] = "11a15d30c92ca5f04c2791bd7019cf62b6f9d3053eb050d02a135557eb118bfc"
