SUMMARY = "the modular source code checker: pep8, pyflakes and co"
HOMEPAGE = "https://gitlab.com/pycqa/flake8"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=75b26781f1adf1aa310bda6098937878"

DEPENDS += "\
            ${PYTHON_PN}-entrypoints-native \
            ${PYTHON_PN}-mccabe-native \
            ${PYTHON_PN}-pycodestyle-native \
            ${PYTHON_PN}-pyflakes-native \
            "

PYPI_PACKAGE = "flake8"

SRC_URI[md5sum] = "02d01e424b836a2b43e5413a46efba6a"
SRC_URI[sha256sum] = "ea6623797bf9a52f4c9577d780da0bb17d65f870213f7b5bcc9fca82540c31d5"

inherit pypi
inherit native
inherit setuptools3
