SUMMARY = "Flake8 extension for checking quotes in python"
HOMEPAGE = "https://github.com/zheller/flake8-quotes"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=838c366f69b72c5df05c96dff79b35f2"

DEPENDS += "python3-flake8-native"

PYPI_PACKAGE = "flake8-quotes"

SRC_URI[md5sum] = "b28fe312a62a84264d7c7659fd01e59c"
SRC_URI[sha256sum] = "aad8492fb710a2d3eabe68c5f86a1428de650c8484127e14c43d0504ba30276c"

inherit pypi
inherit setuptools3
inherit native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
"
