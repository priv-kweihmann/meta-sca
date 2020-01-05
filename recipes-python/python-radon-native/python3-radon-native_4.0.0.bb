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

SRC_URI[md5sum] = "ef95cf3cf43e5d661ae97c757f80f98c"
SRC_URI[sha256sum] = "20f799949e42e6899bc9304539de222d3bdaeec276f38fbd4034859ccd548b46"
