SUMMARY = "Various code metrics for Python code"
HOMEPAGE = "https://github.com/rubik/radon"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4540bac589ba237d0f9238a399607ca"

DEPENDS += "\
            python3-colorama-native \
            python3-flake8-polyfill-native \
            python3-future-native \
            python3-mando-native \
           "

PYPI_PACKAGE = "radon"

SRC_URI[md5sum] = "1998534eb6382576fda336a3d22786f9"
SRC_URI[sha256sum] = "cb1d8752e5f862fb9e20d82b5f758cbc4fb1237c92c9a66450ea0ea7bf29aeee"

inherit pypi
inherit setuptools3
inherit native
