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
inherit setuptools3

SRC_URI[md5sum] = "4e3dc79fbc8f58a7b8dd1ca3744cc1b0"
SRC_URI[sha256sum] = "00a5fdfa900629e5159bf3600d44905b333f4059a3366f28e0dbd13eeab17b19"
