SUMMARY = "A parser for Python dependency files"
HOMEPAGE = "https://github.com/pyupio/dparse"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=220d28dc5d30a15667788003c931221c"

DEPENDS += "\
            ${PYTHON_PN}-packaging-native \
            ${PYTHON_PN}-pyparsing-native \
            ${PYTHON_PN}-pyyaml-native \
            ${PYTHON_PN}-six-native \
            "

PYPI_PACKAGE = "dparse"

SRC_URI[md5sum] = "d5174ef465e97f8465a427a4aa64cce9"
SRC_URI[sha256sum] = "a1b5f169102e1c894f9a7d5ccf6f9402a836a5d24be80a986c7ce9eaed78f367"

inherit pypi
inherit native
inherit setuptools3
