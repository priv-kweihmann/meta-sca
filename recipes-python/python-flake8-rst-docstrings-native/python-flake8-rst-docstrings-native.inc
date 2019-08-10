SUMMARY = "Python docstring reStructuredText (RST) validator"

HOMEPAGE = "https://github.com/peterjc/flake8-rst-docstrings"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=3220ac937dae1dd25fe76c6c613288f5"

PYPI_PACKAGE = "flake8-rst-docstrings"

DEPENDS += " \
            ${PYTHON_PN}-flake8-native \
            ${PYTHON_PN}-restructuredtext-lint-native \
            "

inherit pypi
inherit native
