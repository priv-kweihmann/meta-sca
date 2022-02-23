SUMMARY = "Python composable command line interface toolkit"
HOMEPAGE = "https://github.com/pallets/click"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=1fa98232fd645608937a0fdc82e999b8"

SRC_URI[md5sum] = "c89efc98d1b36d52ba26a39c803df0cc"
SRC_URI[sha256sum] = "8458d7b1287c5fb128c90e23381cf99dcde74beaf6c7ff6384ce84d6fe090adb"

PYPI_PACKAGE = "click"

UPSTREAM_CHECK_REGEX ?= "/click/(?P<pver>(\d+[\.\-_]*)+)"

inherit pypi
inherit setuptools3
inherit native
