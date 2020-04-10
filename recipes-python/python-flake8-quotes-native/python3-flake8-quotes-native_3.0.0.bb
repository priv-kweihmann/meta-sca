SUMMARY = "Flake8 extension for checking quotes in python"
HOMEPAGE = "https://github.com/zheller/flake8-quotes"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=838c366f69b72c5df05c96dff79b35f2"

DEPENDS += "${PYTHON_PN}-flake8-native"

PYPI_PACKAGE = "flake8-quotes"

SRC_URI[md5sum] = "6d1c77b5d6c85bb2bf375b35e9327dcf"
SRC_URI[sha256sum] = "39762e16a1ea6b7f0e998a04be14d71b55e74de09b5026bd41907c996a8c82cf"

inherit pypi
inherit native
inherit setuptools3
