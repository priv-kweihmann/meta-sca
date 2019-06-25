SUMMARY = "Various code metrics for Python code"
DESCRIPTION = "Various code metrics for Python code"
HOMEPAGE = "https://github.com/rubik/radon"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4540bac589ba237d0f9238a399607ca"

DEPENDS += "\
            ${PYTHON_PN}-colorama-native \
            ${PYTHON_PN}-flake8polyfill-native \
            ${PYTHON_PN}-future-native \
            ${PYTHON_PN}-mando-native \
            "

PYPI_PACKAGE = "radon"

inherit pypi
inherit native
