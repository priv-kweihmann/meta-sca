SUMMARY = "Checks for old string formatting."

HOMEPAGE = "https://github.com/gforcada/flake8-pep3101"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

PYPI_PACKAGE = "flake8-pep3101"

DEPENDS += "${PYTHON_PN}-flake8-native"

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "de11047e9657cfc091fe1a632603db95"
SRC_URI[sha256sum] = "86e3eb4e42de8326dcd98ebdeaf9a3c6854203a48f34aeb3e7e8ed948107f512"
