SUMMARY = "Flake8 plugin that checks import order against various Python Style Guides"
DESCRIPTION = "Flake8 plugin that checks import order against various Python Style Guides"
HOMEPAGE = "https://github.com/PyCQA/flake8-import-order"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=e6a600fd5e1d9cbde2d983680233ad02"

PYPI_PACKAGE = "flake8-import-order"

DEPENDS += " \
            ${PYTHON_PN}-pylama-native \
            ${PYTHON_PN}-pytest-native \
            ${PYTHON_PN}-pycodestyle-native \
            ${PYTHON_PN}-flake8-native \
            "

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "c1a3f2e4cf05f1ddf9002074276c123b"
SRC_URI[sha256sum] = "a28dc39545ea4606c1ac3c24e9d05c849c6e5444a50fb7e9cdd430fc94de6e92"
