SUMMARY = "A small but fast and easy to use stand-alone template engine written in pure python."
DESCRIPTION = "A small but fast and easy to use stand-alone template engine written in pure python."
HOMEPAGE = "https://github.com/pallets/jinja"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=5dc88300786f1c214c1e9827a5229462"

DEPENDS += "${PYTHON_PN}-native ${PYTHON_PN}-markupsafe-native"

PYPI_PACKAGE = "Jinja2"

inherit pypi
inherit setuptools3
inherit native


SRC_URI[md5sum] = "7883559bc5cc3e2781d94b4be61cfdcd"
SRC_URI[sha256sum] = "9fe95f19286cfefaa917656583d020be14e7859c6b0252588391e47db34527de"
