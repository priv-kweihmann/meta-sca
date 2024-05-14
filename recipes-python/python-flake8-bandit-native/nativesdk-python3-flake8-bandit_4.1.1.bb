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

SRC_URI[sha256sum] = "068e09287189cbfd7f986e92605adea2067630b75380c6b5733dab7d87f9a84e"

PYPI_PACKAGE = "flake8_bandit"

inherit pypi
inherit setuptools3
inherit_defer nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-bandit \
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
    nativesdk-python3-flake8-polyfill \
    nativesdk-python3-pycodestyle \
"

UPSTREAM_CHECK_URI = "https://pypi.org/project/flake8-bandit/"
UPSTREAM_CHECK_REGEX = "/flake8-bandit/(?P<pver>(\d+[\.\-_]*)+)/"
