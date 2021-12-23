SUMMARY = "Python composable command line interface toolkit"
HOMEPAGE = "https://github.com/pallets/click"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=1fa98232fd645608937a0fdc82e999b8"

SRC_URI[md5sum] = "6bcf62c52c6b58c9977c7d19b0d0cbf9"
SRC_URI[sha256sum] = "410e932b050f5eed773c4cda94de75971c89cdb3155a72a0831139a79e5ecb5b"

PYPI_PACKAGE = "click"

UPSTREAM_CHECK_REGEX ?= "/click/(?P<pver>(\d+[\.\-_]*)+)"

inherit pypi
inherit setuptools3
inherit native
