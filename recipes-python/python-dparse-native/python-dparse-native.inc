SUMMARY = "A parser for Python dependency files"
DESCRIPTION = "A parser for Python dependency files"
HOMEPAGE = "https://github.com/pyupio/dparse"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=220d28dc5d30a15667788003c931221c"

PYPI_PACKAGE = "dparse"

DEPENDS += " \
            ${PYTHON_PN}-packaging-native \
            ${PYTHON_PN}-pyparsing-native \
            ${PYTHON_PN}-pyyaml-native \
            ${PYTHON_PN}-six-native \
            "

inherit pypi
inherit native
