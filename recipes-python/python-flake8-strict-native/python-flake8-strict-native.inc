SUMMARY = "Flake8 plugin that checks Python code against a set of opinionated style rules"
DESCRIPTION = "Flake8 plugin that checks Python code against a set of opinionated style rules"
HOMEPAGE = "https://github.com/smarkets/flake8-strict"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=0835ade698e0bcf8506ecda2f7b4f302"

PYPI_PACKAGE = "flake8_strict"

DEPENDS += " \
            ${PYTHON_PN}-black-native \
            ${PYTHON_PN}-enum-compat-native \
            ${PYTHON_PN}-flake8-native \
            "

inherit pypi
inherit native
