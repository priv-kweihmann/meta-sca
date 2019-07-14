SUMMARY = "Flake8 extension for checking quotes in python"
DESCRIPTION = "Flake8 extension for checking quotes in python"
HOMEPAGE = "https://github.com/zheller/flake8-quotes"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=838c366f69b72c5df05c96dff79b35f2"

PYPI_PACKAGE = "flake8-quotes"

DEPENDS += "${PYTHON_PN}-flake8-native"

inherit pypi
inherit native
