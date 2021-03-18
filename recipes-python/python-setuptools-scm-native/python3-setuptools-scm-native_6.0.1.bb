SUMMARY = "the blessed package to manage your versions by scm tags"
HOMEPAGE = "https://github.com/pypa/setuptools_scm"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=8227180126797a0148f94f483f3e1489"

DEPENDS += "python3-setuptools-native"

PYPI_PACKAGE = "setuptools_scm"

UPSTREAM_CHECK_REGEX ?= "/setuptools-scm/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "aa7f0efbbf46c5576db5994dd1ce3f8d"
SRC_URI[sha256sum] = "d1925a69cb07e9b29416a275b9fadb009a23c148ace905b2fb220649a6c18e92"

inherit pypi
inherit setuptools3
inherit native
