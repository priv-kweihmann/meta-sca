SUMMARY = "A common base representation of python source code for pylint and other projects"
HOMEPAGE = "https://github.com/PyCQA/astroid"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

DEPENDS += "\
            ${PYTHON_PN}-wrapt-native \
            ${PYTHON_PN}-typed-ast-native \
            ${PYTHON_PN}-pytest-runner-native \
            ${PYTHON_PN}-pylazy-object-proxy-native \
            ${PYTHON_PN}-native \
            "

PYPI_PACKAGE = "astroid"

SRC_URI[md5sum] = "0e686c4f817ddcd3be18b31df644c3bc"
SRC_URI[sha256sum] = "6560e1e1749f68c64a4b5dee4e091fce798d2f0d84ebe638cf0e0585a343acf4"

inherit pypi
inherit native
inherit setuptools3
