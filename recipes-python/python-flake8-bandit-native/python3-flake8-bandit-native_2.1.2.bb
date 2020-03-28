SUMMARY = "Automated security testing using bandit and flake8."

HOMEPAGE = "https://github.com/tylerwince/flake8-bandit"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c3f9dda449e4d01bf0045d5476dcfefd"

PYPI_PACKAGE = "flake8_bandit"

UPSTREAM_CHECK_REGEX ?= "/flake8-bandit/(?P<pver>(\d+[\.\-_]*)+)"

DEPENDS += " \
            ${PYTHON_PN}-bandit-native \
            ${PYTHON_PN}-flake8-native \
            ${PYTHON_PN}-flake8-polyfill-native \
            ${PYTHON_PN}-pycodestyle-native \
            "

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "30b3113b388cbf6d1ca588e4fc4ca0c6"
SRC_URI[sha256sum] = "687fc8da2e4a239b206af2e54a90093572a60d0954f3054e23690739b0b0de3b"
