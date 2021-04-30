SUMMARY = "Python docstring reStructuredText (RST) validator"
HOMEPAGE = "https://github.com/peterjc/flake8-rst-docstrings"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=647e2c41944e325227c84555a6bced85"

DEPENDS += "\
            python3-flake8-native \
            python3-restructuredtext-lint-native \
            "

PYPI_PACKAGE = "flake8-rst-docstrings"

SRC_URI[md5sum] = "1dc97d0116c4c997ea32d18fd72337f3"
SRC_URI[sha256sum] = "1617d1dcdb31675d24fd8ff8e5d7932e449a4518dcc1365e50beceb86d658e7f"

inherit pypi
inherit setuptools3
inherit native
