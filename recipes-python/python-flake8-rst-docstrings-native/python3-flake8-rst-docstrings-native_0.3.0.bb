SUMMARY = "Python docstring reStructuredText (RST) validator"
HOMEPAGE = "https://github.com/peterjc/flake8-rst-docstrings"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=647e2c41944e325227c84555a6bced85"

DEPENDS += "\
            python3-flake8-native \
            python3-pip-native \
            python3-restructuredtext-lint-native \
            "

PYPI_PACKAGE = "flake8-rst-docstrings"

SRC_URI[sha256sum] = "d1ce22b4bd37b73cd86b8d980e946ef198cfcc18ed82fedb674ceaa2f8d1afa4"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
    nativesdk-python3-restructuredtext-lint \
"
