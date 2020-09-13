SUMMARY = "Various code metrics for Python code"
HOMEPAGE = "https://github.com/rubik/radon"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4540bac589ba237d0f9238a399607ca"

DEPENDS += "\
            ${PYTHON_PN}-colorama-native \
            ${PYTHON_PN}-flake8-polyfill-native \
            ${PYTHON_PN}-future-native \
            ${PYTHON_PN}-mando-native \
           "

PYPI_PACKAGE = "radon"

SRC_URI[md5sum] = "19b6fda39e93d5734fcf9fc4c8bd5830"
SRC_URI[sha256sum] = "63a7876101a64d5418fa9acebff11f9bb48367ac79f22bf3b73c7bf430a8abc0"

inherit pypi
inherit native
inherit setuptools3
