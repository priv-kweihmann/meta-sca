SUMMARY = "Automated security testing using bandit and flake8."

HOMEPAGE = "https://github.com/tylerwince/flake8-bandit"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c3f9dda449e4d01bf0045d5476dcfefd"

PYPI_PACKAGE = "flake8_bandit"

DEPENDS += " \  
            ${PYTHON_PN}-bandit-native \
            ${PYTHON_PN}-flake8-native \
            ${PYTHON_PN}-flake8-polyfill-native \
            ${PYTHON_PN}-pycodestyle-native \
            "

inherit pypi
inherit native
