SUMMARY = "Python composable command line interface toolkit"
HOMEPAGE = "https://github.com/pallets/click"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=1fa98232fd645608937a0fdc82e999b8"

SRC_URI[md5sum] = "f617e27a51a27d1f69aede198c5b27f6"
SRC_URI[sha256sum] = "7027bc7bbafaab8b2c2816861d8eb372429ee3c02e193fc2f93d6c4ab9de49c5"

PYPI_PACKAGE = "click"

UPSTREAM_CHECK_REGEX ?= "/click/(?P<pver>(\d+[\.\-_]*)+)"

inherit pypi
inherit setuptools3
inherit native
