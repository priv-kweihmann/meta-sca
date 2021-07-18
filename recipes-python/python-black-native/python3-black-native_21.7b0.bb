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

SRC_URI[md5sum] = "e5b33d678bac0b1a8003087e39df5896"
SRC_URI[sha256sum] = "c8373c6491de9362e39271630b65b964607bc5c79c83783547d76c839b3aa219"

UPSTREAM_CHECK_REGEX ?= "/${PYPI_PACKAGE}/(?P<pver>(\d+[a-z0-9\.\-_]*)+)"

inherit pypi
inherit setuptools3
inherit native
