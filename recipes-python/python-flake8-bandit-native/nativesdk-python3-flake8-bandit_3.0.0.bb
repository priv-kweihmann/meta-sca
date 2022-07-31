SUMMARY = "Automated security testing using bandit and flake8"
HOMEPAGE = "https://github.com/tylerwince/flake8-bandit"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c3f9dda449e4d01bf0045d5476dcfefd"

DEPENDS += "\
    nativesdk-python3-bandit \
    nativesdk-python3-flake8 \
    nativesdk-python3-flake8-polyfill \
    nativesdk-python3-pycodestyle \
"

SRC_URI[sha256sum] = "54d19427e6a8d50322a7b02e1841c0a7c22d856975f3459803320e0e18e2d6a1"

PYPI_PACKAGE = "flake8_bandit"

UPSTREAM_CHECK_REGEX ?= "/flake8-bandit/(?P<pver>(\d+[\.\-_]*)+)"

inherit pypi
inherit setuptools3
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-bandit \
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
    nativesdk-python3-flake8-polyfill \
    nativesdk-python3-pycodestyle \
"
