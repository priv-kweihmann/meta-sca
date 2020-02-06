SUMMARY = "the blessed package to manage your versions by scm tags"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=8227180126797a0148f94f483f3e1489"

PYPI_PACKAGE = "setuptools_scm"

DEPENDS += "${PYTHON_PN}-setuptools-native"

UPSTREAM_CHECK_REGEX ?= "/setuptools-scm/(?P<pver>(\d+[\.\-_]*)+)"

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "cf3f044990221c9ad0355549b983859b"
SRC_URI[sha256sum] = "26b8a108783cd88f4b15ff1f0f347d6b476db25d0c226159b835d713f9487320"
