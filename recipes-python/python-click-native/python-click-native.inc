SUMMARY = "Python composable command line interface toolkit"
DESCRIPTION = "Python composable command line interface toolkit"
HOMEPAGE = "https://github.com/pallets/click"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=c13ed890b210a882c1778216694c98c7"

DEPENDS += "${PYTHON_PN}-native"

PYPI_PACKAGE = "Click"

inherit pypi

FILES_${PN} += "${datadir}/Click"

inherit native
