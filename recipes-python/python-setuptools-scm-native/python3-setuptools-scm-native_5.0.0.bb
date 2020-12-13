SUMMARY = "the blessed package to manage your versions by scm tags"
HOMEPAGE = "https://github.com/pypa/setuptools_scm"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=8227180126797a0148f94f483f3e1489"

DEPENDS += "${PYTHON_PN}-setuptools-native"

PYPI_PACKAGE = "setuptools_scm"

UPSTREAM_CHECK_REGEX ?= "/setuptools-scm/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "7f547d9bb88d7ddff0e11f817dbc0e8c"
SRC_URI[sha256sum] = "c255827812a8053cee6af83dd501f1b27703d1659e85008c9a47a4cb678eeeab"

inherit pypi
inherit native
inherit setuptools3
