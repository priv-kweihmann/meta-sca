SUMMARY = "The uncompromising Python code formatter"
DESCRIPTION = "The uncompromising Python code formatter"
HOMEPAGE = "https://github.com/python/black"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d3465a2a183908c9cb95bf490bd1e7ab"

DEPENDS += " \
            ${PYTHON_PN}-click-native \
            ${PYTHON_PN}-attrs-native \
            ${PYTHON_PN}-appdirs-native \
            ${PYTHON_PN}-toml-native \
            ${PYTHON_PN}-typed-ast-native \
            ${PYTHON_PN}-setuptools-scm-native \
            "

PYPI_PACKAGE = "black"

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "496632a95b73b8f5c5081d795a4e6af1"
SRC_URI[sha256sum] = "c2edb73a08e9e0e6f65a0e6af18b059b8b1cdd5bef997d7a0b181df93dc81539"
