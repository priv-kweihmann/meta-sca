SUMMARY = "A simple program which checks Python source files for errors"
HOMEPAGE = "https://github.com/PyCQA/pyflakes"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=690c2d09203dc9e07c4083fc45ea981f"

PYPI_PACKAGE = "pyflakes"

SRC_URI[md5sum] = "b5ef05362abf69d083e467318ce14556"
SRC_URI[sha256sum] = "e59fd8e750e588358f1b8885e5a4751203a0516e0ee6d34811089ac294c8806f"

inherit pypi
inherit setuptools3
inherit native
