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

SRC_URI[md5sum] = "6fecdf7bc0b912070875666b57700636"
SRC_URI[sha256sum] = "1fc0e0a2c8ae7d269dfcf0c60a89afa299664f3e811395d40b1922dff8f854b5"

UPSTREAM_CHECK_REGEX ?= "/${PYPI_PACKAGE}/(?P<pver>(\d+[a-z0-9\.\-_]*)+)"

inherit pypi
inherit setuptools3
inherit native
