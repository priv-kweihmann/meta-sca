SUMMARY = "Checks for old string formatting."

HOMEPAGE = "https://github.com/gforcada/flake8-pep3101"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

PYPI_PACKAGE = "flake8-pep3101"

DEPENDS += "${PYTHON_PN}-flake8-native"

inherit pypi
inherit native
