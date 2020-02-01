SUMMARY = "Various code metrics for Python code"
HOMEPAGE = "https://github.com/rubik/radon"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4540bac589ba237d0f9238a399607ca"

PYPI_PACKAGE = "radon"

DEPENDS += " \
            ${PYTHON_PN}-colorama-native \
            ${PYTHON_PN}-flake8-polyfill-native \
            ${PYTHON_PN}-future-native \
            ${PYTHON_PN}-mando-native \
           "

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "93627b0b230e07531adaa33a6da1c401"
SRC_URI[sha256sum] = "56082c52206db45027d4a73612e1b21663c4cc2be3760fee769d966fd7efdd6d"
