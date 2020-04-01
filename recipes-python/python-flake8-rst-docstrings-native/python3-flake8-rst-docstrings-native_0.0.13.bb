SUMMARY = "Python docstring reStructuredText (RST) validator"
HOMEPAGE = "https://github.com/peterjc/flake8-rst-docstrings"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=3220ac937dae1dd25fe76c6c613288f5"

DEPENDS += "\
            ${PYTHON_PN}-flake8-native \
            ${PYTHON_PN}-restructuredtext-lint-native \
            "

PYPI_PACKAGE = "flake8-rst-docstrings"

SRC_URI[md5sum] = "c0417cb35286defd3a0531b1bab703f2"
SRC_URI[sha256sum] = "b1b619d81d879b874533973ac04ee5d823fdbe8c9f3701bfe802bb41813997b4"

inherit pypi
inherit native
inherit setuptools3
