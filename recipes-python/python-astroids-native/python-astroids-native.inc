SUMMARY = "astroids"
DESCRIPTION = "Common representation framework of pythoncode for static code analysis checkers"
HOMEPAGE = "https://github.com/PyCQA/astroid"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

DEPENDS += "${PYTHON_PN}-native \
            ${PYTHON_PN}-wrapt-native \
            ${PYTHON_PN}-pytest-runner-native \
            ${PYTHON_PN}-pylazy-object-proxy-native"

PYPI_PACKAGE = "astroid"

inherit pypi

FILES_${PN} += "${datadir}/astroid"

inherit native
