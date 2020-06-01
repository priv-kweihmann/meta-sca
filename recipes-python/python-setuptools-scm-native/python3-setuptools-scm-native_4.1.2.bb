SUMMARY = "the blessed package to manage your versions by scm tags"
HOMEPAGE = "https://github.com/pypa/setuptools_scm"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=8227180126797a0148f94f483f3e1489"

DEPENDS += "${PYTHON_PN}-setuptools-native"

PYPI_PACKAGE = "setuptools_scm"

UPSTREAM_CHECK_REGEX ?= "/setuptools-scm/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "e6c9fad17c90516d640868eb833d5150"
SRC_URI[sha256sum] = "a8994582e716ec690f33fec70cca0f85bd23ec974e3f783233e4879090a7faa8"

inherit pypi
inherit native
inherit setuptools3
