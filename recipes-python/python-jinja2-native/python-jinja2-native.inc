SUMMARY = "A small but fast and easy to use stand-alone template engine written in pure python."
DESCRIPTION = "A small but fast and easy to use stand-alone template engine written in pure python."
HOMEPAGE = "https://github.com/pallets/jinja"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=20c831f91dd3bd486020f672ba2be386"

DEPENDS += "${PYTHON_PN}-native ${PYTHON_PN}-markupsafe-native"

PYPI_PACKAGE = "Jinja2"

inherit pypi

FILES_${PN} += "${datadir}/Jinja2"

inherit native
