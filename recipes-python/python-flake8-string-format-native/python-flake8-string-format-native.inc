SUMMARY = "Check that indexed parameters are used in strings"
DESCRIPTION = "Check that indexed parameters are used in strings"
HOMEPAGE = "https://github.com/xZise/flake8-string-format"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=0835ade698e0bcf8506ecda2f7b4f302"

PYPI_PACKAGE = "flake8-string-format"

DEPENDS += "${PYTHON_PN}-flake8-native"

inherit pypi
inherit native
