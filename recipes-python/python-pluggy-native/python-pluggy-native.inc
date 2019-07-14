SUMMARY = "A minimalist production ready plugin system"
DESCRIPTION = "A minimalist production ready plugin system"
HOMEPAGE = "https://github.com/pytest-dev/pluggy"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1c8206d16fd5cc02fa9b0bb98955e5c2"

PYPI_PACKAGE = "pluggy"

DEPENDS += "${PYTHON_PN}-importlib-metadata-native"

inherit pypi
inherit native
