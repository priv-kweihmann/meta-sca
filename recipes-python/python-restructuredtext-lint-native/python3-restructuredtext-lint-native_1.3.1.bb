SUMMARY = "reStructuredText linter"
HOMEPAGE = "https://github.com/twolfson/restructuredtext-lint"

LICENSE = "Unlicense"
LIC_FILES_CHKSUM = "file://UNLICENSE;md5=7246f848faa4e9c9fc0ea91122d6e680"

DEPENDS += "${PYTHON_PN}-docutils-native"

PYPI_PACKAGE = "restructuredtext_lint"

UPSTREAM_CHECK_REGEX ?= "/restructuredtext-lint/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "3951511bc9f553a693e967ac5f12b75c"
SRC_URI[sha256sum] = "470e53b64817211a42805c3a104d2216f6f5834b22fe7adb637d1de4d6501fb8"

inherit pypi
inherit native
inherit setuptools3
