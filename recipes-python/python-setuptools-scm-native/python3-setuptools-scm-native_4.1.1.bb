SUMMARY = "the blessed package to manage your versions by scm tags"
HOMEPAGE = "https://github.com/pypa/setuptools_scm"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=8227180126797a0148f94f483f3e1489"

DEPENDS += "${PYTHON_PN}-setuptools-native"

PYPI_PACKAGE = "setuptools_scm"

UPSTREAM_CHECK_REGEX ?= "/setuptools-scm/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "61355bd13001eac2997204dea213154e"
SRC_URI[sha256sum] = "65005ecfde4b2e45370cbc118ff5bbfa2740e7c7ed85c7da574e6fd244c4c7b8"

inherit pypi
inherit native
inherit setuptools3
