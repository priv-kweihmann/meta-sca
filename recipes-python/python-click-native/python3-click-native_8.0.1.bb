SUMMARY = "Python composable command line interface toolkit"
HOMEPAGE = "https://github.com/pallets/click"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=1fa98232fd645608937a0fdc82e999b8"

SRC_URI[md5sum] = "ff66f850b8eb4dc618b405d7fe22a0c2"
SRC_URI[sha256sum] = "8c04c11192119b1ef78ea049e0a6f0463e4c48ef00a30160c704337586f3ad7a"

PYPI_PACKAGE = "click"

UPSTREAM_CHECK_REGEX ?= "/click/(?P<pver>(\d+[\.\-_]*)+)"

inherit pypi
inherit setuptools3
inherit native
