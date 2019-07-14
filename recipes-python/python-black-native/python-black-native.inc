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
            "

PYPI_PACKAGE = "black"

inherit pypi
inherit native
