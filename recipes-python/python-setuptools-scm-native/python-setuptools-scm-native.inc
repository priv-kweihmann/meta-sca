SUMMARY = "the blessed package to manage your versions by scm tags"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=8227180126797a0148f94f483f3e1489"

SRC_URI[md5sum] = "cfec5d2dbbd0a85c40066f79035b5878"
SRC_URI[sha256sum] = "a767141fecdab1c0b3c8e4c788ac912d7c94a0d6c452d40777ba84f918316379"

PYPI_PACKAGE = "setuptools_scm"
inherit pypi

RDEPENDS_${PN} = "${PYTHON_PN}-py-native ${PYTHON_PN}-setuptools-native ${PYTHON_PN}-debugger-native ${PYTHON_PN}-json-native"

inherit native
