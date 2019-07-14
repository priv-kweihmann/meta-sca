SUMMARY = "Check for FIXME, TODO and other temporary developer notes"
DESCRIPTION = "Check for FIXME, TODO and other temporary developer notes"
HOMEPAGE = "https://github.com/tommilligan/flake8-fixme"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

PYPI_PACKAGE = "flake8-fixme"

DEPENDS += "${PYTHON_PN}-flake8-native"

inherit pypi
inherit native
