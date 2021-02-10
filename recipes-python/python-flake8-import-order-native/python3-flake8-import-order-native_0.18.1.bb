SUMMARY = "Flake8 plugin that checks import order against various Python Style Guides"
HOMEPAGE = "https://github.com/PyCQA/flake8-import-order"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=e6a600fd5e1d9cbde2d983680233ad02"

DEPENDS += "\
            python3-flake8-native \
            python3-pycodestyle-native \
            python3-pylama-native \
            python3-pytest-native \
            "

PYPI_PACKAGE = "flake8-import-order"

SRC_URI[md5sum] = "c1a3f2e4cf05f1ddf9002074276c123b"
SRC_URI[sha256sum] = "a28dc39545ea4606c1ac3c24e9d05c849c6e5444a50fb7e9cdd430fc94de6e92"

inherit pypi
inherit setuptools3
inherit native
