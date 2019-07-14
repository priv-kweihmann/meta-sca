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
