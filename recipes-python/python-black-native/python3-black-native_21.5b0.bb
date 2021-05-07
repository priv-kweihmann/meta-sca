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

SRC_URI[md5sum] = "dc655b7c5fb0d2fc25946dbdd7ce8e52"
SRC_URI[sha256sum] = "9dc2042018ca10735366d944c2c12d9cad6dec74a3d5f679d09384ea185d9943"

UPSTREAM_CHECK_REGEX ?= "/${PYPI_PACKAGE}/(?P<pver>(\d+[a-z0-9\.\-_]*)+)"

inherit pypi
inherit setuptools3
inherit native
