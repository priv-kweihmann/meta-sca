SUMMARY = "reStructuredText linter"
HOMEPAGE = "https://github.com/twolfson/restructuredtext-lint"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Unlicense"
LIC_FILES_CHKSUM = "file://UNLICENSE;md5=7246f848faa4e9c9fc0ea91122d6e680"

DEPENDS += "python3-docutils-native"

PYPI_PACKAGE = "restructuredtext_lint"

UPSTREAM_CHECK_REGEX ?= "/restructuredtext-lint/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "05aae776c7fe02edb03f3b2601ac6b67"
SRC_URI[sha256sum] = "1b235c0c922341ab6c530390892eb9e92f90b9b75046063e047cacfb0f050c45"

inherit pypi
inherit setuptools3
inherit native
