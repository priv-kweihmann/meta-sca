SUMMARY = "A small but fast and easy to use stand-alone template engine written in pure python."
DESCRIPTION = "A small but fast and easy to use stand-alone template engine written in pure python."
HOMEPAGE = "https://github.com/pallets/jinja"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=5dc88300786f1c214c1e9827a5229462"

DEPENDS += "${PYTHON_PN}-markupsafe"

PYPI_PACKAGE = "Jinja2"

inherit pypi
inherit setuptools3

SRC_URI[md5sum] = "5d88c7e77aa63fc852a04f65dbfe5594"
SRC_URI[sha256sum] = "93187ffbc7808079673ef52771baa950426fd664d3aad1d0fa3e95644360e250"

BBCLASSEXTEND = "native"
