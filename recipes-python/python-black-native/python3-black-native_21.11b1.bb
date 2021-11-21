SUMMARY = "The uncompromising Python code formatter"
HOMEPAGE = "https://github.com/python/black"

DEFAULT_PREFERENCE = "-1"
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

SRC_URI[md5sum] = "837cde784a0466fa5843720650aa5a51"
SRC_URI[sha256sum] = "a042adbb18b3262faad5aff4e834ff186bb893f95ba3a8013f09de1e5569def2"

UPSTREAM_CHECK_REGEX ?= "/${PYPI_PACKAGE}/(?P<pver>(\d+[a-z0-9\.\-_]*)+)"

inherit pypi
inherit setuptools3
inherit native
