SUMMARY = "Backport of pathlib-compatible object wrapper for zip files"
HOMEPAGE = "https://github.com/jaraco/zipp"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7a7126e068206290f3fe9f8d6c713ea6"

DEPENDS += "\
            python3-setuptools-scm-native \
            python3-toml-native \
            "

PYPI_PACKAGE = "zipp"

SRC_URI[md5sum] = "8d5cf6eb3270384ae13a6440797ea564"
SRC_URI[sha256sum] = "71c644c5369f4a6e07636f0aa966270449561fcea2e3d6747b8d23efaa9d7832"

inherit pypi
inherit setuptools3
inherit native
