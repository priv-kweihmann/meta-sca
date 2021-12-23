SUMMARY = "The uncompromising Python code formatter"
HOMEPAGE = "https://github.com/python/black"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d3465a2a183908c9cb95bf490bd1e7ab"

DEPENDS += "\
            python3-appdirs-native \
            python3-attrs-native \
            python3-click-native \
            python3-packaging-native \
            python3-setuptools-scm-native \
            python3-toml-native \
            python3-typed-ast-native \
            "

PYPI_PACKAGE = "black"

SRC_URI[md5sum] = "8222831ddae222de52f8f065ad8ebcc5"
SRC_URI[sha256sum] = "a9952229092e325fe5f3dae56d81f639b23f7131eb840781947e4b2886030f33"

UPSTREAM_CHECK_REGEX ?= "/${PYPI_PACKAGE}/(?P<pver>(\d+[a-z0-9\.\-_]*)+)"

inherit pypi
inherit setuptools3
inherit native
