SUMMARY = "Python parsing module"
DESCRIPTION = "Python parsing module"
HOMEPAGE = "https://github.com/pyparsing/pyparsing/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=657a566233888513e1f07ba13e2f47f1"

RDEPENDS_${PN} += "${PYTHON_PN}-native"

PYPI_PACKAGE = "pyparsing"

inherit pypi

FILES_${PN} += "${datadir}/pyparsing"

inherit native
