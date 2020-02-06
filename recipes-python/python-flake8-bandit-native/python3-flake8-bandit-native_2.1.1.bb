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

SRC_URI[md5sum] = "bb5af23f4595d3c7840f7f9727aae1c2"
SRC_URI[sha256sum] = "52a67f453ba765398098b39a2273e138983b3499465ef39a12e8ee544c4598fc"
