SUMMARY = "Python composable command line interface toolkit"
DESCRIPTION = "Python composable command line interface toolkit"
HOMEPAGE = "https://github.com/pallets/click"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=1fa98232fd645608937a0fdc82e999b8"

DEPENDS += "${PYTHON_PN}-native"

PYPI_PACKAGE = "click"

UPSTREAM_CHECK_REGEX ?= "/click/(?P<pver>(\d+[\.\-_]*)+)"

inherit pypi
inherit setuptools3
inherit native

SRC_URI[md5sum] = "6d5c7077d8d3ce44de6e3d661b751585"
SRC_URI[sha256sum] = "8a18b4ea89d8820c5d0c7da8a64b2c324b4dabb695804dbfea19b9be9d88c0cc"
