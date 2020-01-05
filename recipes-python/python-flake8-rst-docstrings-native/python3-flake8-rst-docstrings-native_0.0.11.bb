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
inherit setuptools3

SRC_URI[md5sum] = "dc59c98bf29dfc45c0ae9321d8f9fa77"
SRC_URI[sha256sum] = "a2fa35c6ef978422234afae8c345f23ff721571d43f2895e29817e94be92dd6c"
