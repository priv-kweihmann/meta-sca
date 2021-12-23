SUMMARY = "Python docstring reStructuredText (RST) validator"
HOMEPAGE = "https://github.com/peterjc/flake8-rst-docstrings"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=647e2c41944e325227c84555a6bced85"

DEPENDS += "\
            python3-flake8-native \
            python3-restructuredtext-lint-native \
            "

PYPI_PACKAGE = "flake8-rst-docstrings"

SRC_URI[md5sum] = "21209e11c12aebc67c0e25286a2eef1d"
SRC_URI[sha256sum] = "b3f46b11110637dc24943ddb978081a66c97d6bfaff4fe27852813001020595b"

inherit pypi
inherit setuptools3
inherit native
