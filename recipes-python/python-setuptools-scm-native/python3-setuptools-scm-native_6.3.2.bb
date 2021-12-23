SUMMARY = "the blessed package to manage your versions by scm tags"
HOMEPAGE = "https://github.com/pypa/setuptools_scm"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=8227180126797a0148f94f483f3e1489"

DEPENDS += "\
    python3-packaging-native \
    python3-setuptools-native \
    python3-tomli-native \
"

PYPI_PACKAGE = "setuptools_scm"

UPSTREAM_CHECK_REGEX ?= "/setuptools-scm/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[sha256sum] = "a49aa8081eeb3514eb9728fa5040f2eaa962d6c6f4ec9c32f6c1fba88f88a0f2"

inherit pypi
inherit setuptools3
inherit native
