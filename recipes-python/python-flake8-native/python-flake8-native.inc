SUMMARY = "the modular source code checker: pep8, pyflakes and co"
DESCRIPTION = "the modular source code checker: pep8, pyflakes and co"
HOMEPAGE = "https://gitlab.com/pycqa/flake8"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=75b26781f1adf1aa310bda6098937878"

PYPI_PACKAGE = "flake8"

DEPENDS += "\
            ${PYTHON_PN}-entrypoints-native \
            ${PYTHON_PN}-pyflakes-native \
            ${PYTHON_PN}-pycodestyle-native \
            ${PYTHON_PN}-mccabe-native \
            "

inherit pypi
inherit native
