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
inherit setuptools3

SRC_URI[md5sum] = "7dc0ce36b6cf49b13b46bb37ddca80c5"
SRC_URI[sha256sum] = "45681a117ecc81e870cbf1262835ae4af5e7a8b08e40b944a8a6e6b895914cfb"
