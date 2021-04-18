SUMMARY = "Python docstring reStructuredText (RST) validator"
HOMEPAGE = "https://github.com/peterjc/flake8-rst-docstrings"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=3220ac937dae1dd25fe76c6c613288f5"

DEPENDS += "\
            python3-flake8-native \
            python3-restructuredtext-lint-native \
            "

PYPI_PACKAGE = "flake8-rst-docstrings"

SRC_URI[md5sum] = "b56fdafad863d4b3897c7565124ebc9c"
SRC_URI[sha256sum] = "7d34d2175a0cd92aba0872ade74268b2f2c12582c7267d4a0e6ef1c32a828ce3"

inherit pypi
inherit setuptools3
inherit native
