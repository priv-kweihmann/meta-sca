SUMMARY = "Backport of pathlib-compatible object wrapper for zip files"
DESCRIPTION = "Backport of pathlib-compatible object wrapper for zip files"
HOMEPAGE = "https://github.com/jaraco/zipp"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7a7126e068206290f3fe9f8d6c713ea6"

DEPENDS += "${PYTHON_PN}-setuptools-scm-native"

PYPI_PACKAGE = "zipp"

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "2bc608312bc259bd490cfb4832c898ed"
SRC_URI[sha256sum] = "7ae5ccaca427bafa9760ac3cd8f8c244bfc259794b5b6bb9db4dda2241575d09"
