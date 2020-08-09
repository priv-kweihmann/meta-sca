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

SRC_URI[md5sum] = "ed03b181be37789f54714b001ce3de89"
SRC_URI[sha256sum] = "b73f6f469c15c9616e0f7ce12080a9ecdee9f2335bdbb5ccea1f2bae26e8d20d"

inherit pypi
inherit native
inherit setuptools3
