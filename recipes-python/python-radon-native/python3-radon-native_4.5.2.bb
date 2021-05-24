SUMMARY = "Various code metrics for Python code"
HOMEPAGE = "https://github.com/rubik/radon"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4540bac589ba237d0f9238a399607ca"

DEPENDS += "\
            python3-colorama-native \
            python3-flake8-polyfill-native \
            python3-future-native \
            python3-mando-native \
           "

PYPI_PACKAGE = "radon"

SRC_URI[md5sum] = "60303f3181b4866c81d04967f551962d"
SRC_URI[sha256sum] = "63b863dd294fcc86f6aecace8d7cb4228acc2a16ab0b89c11ff60cb14182b488"

inherit pypi
inherit setuptools3
inherit native
