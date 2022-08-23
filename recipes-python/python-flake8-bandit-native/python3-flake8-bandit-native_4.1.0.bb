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

SRC_URI = "git://github.com/tylerwince/flake8-bandit.git;branch=main;protocol=https"
SRCREV = "38912eb20d6ce6bd029f17efafe6d953efb5a05f"

S = "${WORKDIR}/git"

PYPI_PACKAGE = "flake8_bandit"

inherit setuptools3
inherit native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-bandit \
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
    nativesdk-python3-flake8-polyfill \
    nativesdk-python3-pycodestyle \
"
