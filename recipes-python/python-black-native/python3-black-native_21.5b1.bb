SUMMARY = "The uncompromising Python code formatter"
HOMEPAGE = "https://github.com/python/black"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d3465a2a183908c9cb95bf490bd1e7ab"

DEPENDS += "\
            python3-appdirs-native \
            python3-attrs-native \
            python3-click-native \
            python3-setuptools-scm-native \
            python3-toml-native \
            python3-typed-ast-native \
            "

PYPI_PACKAGE = "black"

SRC_URI[md5sum] = "24efcdc927b294aa0274b6dd9d04d3c8"
SRC_URI[sha256sum] = "23695358dbcb3deafe7f0a3ad89feee5999a46be5fec21f4f1d108be0bcdb3b1"

UPSTREAM_CHECK_REGEX ?= "/${PYPI_PACKAGE}/(?P<pver>(\d+[a-z0-9\.\-_]*)+)"

inherit pypi
inherit setuptools3
inherit native
