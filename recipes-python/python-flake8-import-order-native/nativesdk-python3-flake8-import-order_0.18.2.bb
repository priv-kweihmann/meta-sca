SUMMARY = "Flake8 plugin that checks import order against various Python Style Guides"
HOMEPAGE = "https://github.com/PyCQA/flake8-import-order"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=e6a600fd5e1d9cbde2d983680233ad02"

DEPENDS += "\
    nativesdk-python3-flake8 \
    nativesdk-python3-pycodestyle \
    nativesdk-python3-pylama \
    nativesdk-python3-pytest \
"

PYPI_PACKAGE = "flake8-import-order"

SRC_URI[md5sum] = "9d863a6c484c569a5b4935406eea1b4d"
SRC_URI[sha256sum] = "e23941f892da3e0c09d711babbb0c73bc735242e9b216b726616758a920d900e"

inherit pypi
inherit setuptools3
inherit_defer nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
    nativesdk-python3-pycodestyle \
    nativesdk-python3-pylama \
    nativesdk-python3-pytest \
"
