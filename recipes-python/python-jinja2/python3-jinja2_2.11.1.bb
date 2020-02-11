SUMMARY = "A small but fast and easy to use stand-alone template engine written in pure python."
DESCRIPTION = "A small but fast and easy to use stand-alone template engine written in pure python."
HOMEPAGE = "https://github.com/pallets/jinja"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=5dc88300786f1c214c1e9827a5229462"

SRC_URI = "git://github.com/pallets/jinja.git;protocol=https;tag=${PV};nobranch=1"
S = "${WORKDIR}/git"

DEPENDS += "${PYTHON_PN}-markupsafe"

inherit setuptools3

BBCLASSEXTEND = "native"
