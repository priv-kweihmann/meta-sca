SUMMARY = "reStructuredText linter"
HOMEPAGE = "https://github.com/twolfson/restructuredtext-lint"

LICENSE = "Unlicense"
LIC_FILES_CHKSUM = "file://UNLICENSE;md5=7246f848faa4e9c9fc0ea91122d6e680"

DEPENDS += "python3-docutils-native"

PYPI_PACKAGE = "restructuredtext_lint"

UPSTREAM_CHECK_REGEX ?= "/restructuredtext-lint/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "f329e3fb722f4d58b72af9e96f088df4"
SRC_URI[sha256sum] = "d3b10a1fe2ecac537e51ae6d151b223b78de9fafdd50e5eb6b08c243df173c80"

inherit pypi
inherit setuptools3
inherit native
