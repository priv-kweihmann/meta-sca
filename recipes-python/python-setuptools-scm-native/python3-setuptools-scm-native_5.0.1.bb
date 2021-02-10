SUMMARY = "the blessed package to manage your versions by scm tags"
HOMEPAGE = "https://github.com/pypa/setuptools_scm"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=8227180126797a0148f94f483f3e1489"

DEPENDS += "python3-setuptools-native"

PYPI_PACKAGE = "setuptools_scm"

UPSTREAM_CHECK_REGEX ?= "/setuptools-scm/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "c11bf23d80224691a46ee5deb84c42db"
SRC_URI[sha256sum] = "c85b6b46d0edd40d2301038cdea96bb6adc14d62ef943e75afb08b3e7bcf142a"

inherit pypi
inherit setuptools3
inherit native
