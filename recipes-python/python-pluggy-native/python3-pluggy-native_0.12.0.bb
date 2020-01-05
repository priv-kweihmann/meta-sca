SUMMARY = "A minimalist production ready plugin system"
DESCRIPTION = "A minimalist production ready plugin system"
HOMEPAGE = "https://github.com/pytest-dev/pluggy"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1c8206d16fd5cc02fa9b0bb98955e5c2"

PYPI_PACKAGE = "pluggy"

DEPENDS += "${PYTHON_PN}-importlib-metadata-native"

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "e986647f5d786c0cc1bd065cf9bac658"
SRC_URI[sha256sum] = "0825a152ac059776623854c1543d65a4ad408eb3d33ee114dff91e57ec6ae6fc"
