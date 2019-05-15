SUMMARY = "the blessed package to manage your versions by scm tags"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=8227180126797a0148f94f483f3e1489"

PYPI_PACKAGE = "setuptools_scm"
inherit pypi

RDEPENDS_${PN} = "${PYTHON_PN}-setuptools-native ${PYTHON_PN}-debugger-native ${PYTHON_PN}-json-native"

inherit native
