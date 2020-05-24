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

SRC_URI[md5sum] = "ada271b0fc6d0c2af12a61d25c823ab6"
SRC_URI[sha256sum] = "c69ac1668e434d37a2d2880b3ca9aafd54b3a10a3ac1ab101d22f29e29cf8634"

inherit pypi
inherit native
inherit setuptools3
