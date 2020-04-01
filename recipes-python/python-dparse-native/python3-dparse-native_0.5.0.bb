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

SRC_URI[md5sum] = "5866bbc00a014054378f1433228a9cfa"
SRC_URI[sha256sum] = "db349e53f6d03c8ee80606c49b35f515ed2ab287a8e1579e2b4bdf52b12b1530"

inherit pypi
inherit native
inherit setuptools3
