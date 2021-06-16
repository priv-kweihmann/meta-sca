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

SRC_URI[md5sum] = "975b3d794b25478ef4d63f667f37b396"
SRC_URI[sha256sum] = "dc132348a88d103016726fe360cb9ede02cecf99b76e3660ce6c596be132ce04"

UPSTREAM_CHECK_REGEX ?= "/${PYPI_PACKAGE}/(?P<pver>(\d+[a-z0-9\.\-_]*)+)"

inherit pypi
inherit setuptools3
inherit native
