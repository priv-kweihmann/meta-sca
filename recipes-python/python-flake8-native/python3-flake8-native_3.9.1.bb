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

SRC_URI[md5sum] = "c2a4fffcd06f06d4bc73a579b4dc0cf2"
SRC_URI[sha256sum] = "1aa8990be1e689d96c745c5682b687ea49f2e05a443aff1f8251092b0014e378"

inherit pypi
inherit setuptools3
inherit native
