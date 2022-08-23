SUMMARY = "Python library for parsing Dockerfile files"
HOMEPAGE = "https://github.com/containerbuildsystem/dockerfile-parse"

DEPENDS += "\
    python3-six-native \
"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=732073107cf3502051ce427bb5b01816"

PYPI_PACKAGE = "dockerfile-parse"

SRC_URI[sha256sum] = "07e65eec313978e877da819855870b3ae47f3fac94a40a965b9ede10484dacc5"

inherit pypi
inherit setuptools3
inherit native

UPSTREAM_CHECK_REGEX ?= "/dockerfile-parse/(?P<pver>(\d+[\.\-_]*)+)"
