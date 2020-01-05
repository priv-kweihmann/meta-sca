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

SRC_URI[md5sum] = "5f3d73d82d1753b59bb49a6bc6046dee"
SRC_URI[sha256sum] = "71ea07f44df9568a75d0f354c49143a4575d90645e9fead6dfb52c26a85ed13a"

inherit pypi
inherit native
inherit setuptools3
