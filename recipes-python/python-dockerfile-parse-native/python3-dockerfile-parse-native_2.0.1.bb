SUMMARY = "Python library for parsing Dockerfile files"
HOMEPAGE = "https://github.com/containerbuildsystem/dockerfile-parse"

DEPENDS += "\
    python3-six-native \
"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=732073107cf3502051ce427bb5b01816"

PYPI_PACKAGE = "dockerfile-parse"

SRC_URI[sha256sum] = "3184ccdc513221983e503ac00e1aa504a2aa8f84e5de673c46b0b6eee99ec7bc"

inherit pypi
inherit setuptools3
inherit native

UPSTREAM_CHECK_REGEX ?= "/dockerfile-parse/(?P<pver>(\d+[\.\-_]*)+)"
