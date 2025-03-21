SUMMARY = "Automated security testing using bandit and flake8"
HOMEPAGE = "https://github.com/tylerwince/flake8-bandit"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c3f9dda449e4d01bf0045d5476dcfefd"

DEPENDS += "\
            python3-bandit-native \
            python3-flake8-native \
            python3-flake8-polyfill-native \
            python3-pycodestyle-native \
            "

SRC_URI[sha256sum] = "068e09287189cbfd7f986e92605adea2067630b75380c6b5733dab7d87f9a84e"

PYPI_PACKAGE = "flake8-bandit"

inherit pypi
inherit pypi-old
inherit setuptools3
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-bandit \
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
    nativesdk-python3-flake8-polyfill \
    nativesdk-python3-pycodestyle \
"
