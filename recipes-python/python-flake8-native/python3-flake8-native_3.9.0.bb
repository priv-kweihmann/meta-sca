SUMMARY = "the modular source code checker: pep8, pyflakes and co"
HOMEPAGE = "https://gitlab.com/pycqa/flake8"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=75b26781f1adf1aa310bda6098937878"

DEPENDS += "\
            python3-entrypoints-native \
            python3-mccabe-native \
            python3-pycodestyle-native \
            python3-pyflakes-native \
            "

PYPI_PACKAGE = "flake8"

SRC_URI[md5sum] = "7c1cd6aeb465ad3c572e5461c4d7b022"
SRC_URI[sha256sum] = "78873e372b12b093da7b5e5ed302e8ad9e988b38b063b61ad937f26ca58fc5f0"

inherit pypi
inherit setuptools3
inherit native
