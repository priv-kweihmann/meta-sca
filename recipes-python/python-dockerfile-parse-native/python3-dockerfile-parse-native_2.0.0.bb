SUMMARY = "Python library for parsing Dockerfile files"
HOMEPAGE = "https://github.com/containerbuildsystem/dockerfile-parse"

DEPENDS += "\
    python3-six-native \
"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=732073107cf3502051ce427bb5b01816"

PYPI_PACKAGE = "dockerfile-parse"

SRC_URI[sha256sum] = "21fe7d510642f2b61a999d45c3d9745f950e11fe6ba2497555b8f63782b78e45"

inherit pypi
inherit setuptools3
inherit native

UPSTREAM_CHECK_REGEX ?= "/dockerfile-parse/(?P<pver>(\d+[\.\-_]*)+)"
