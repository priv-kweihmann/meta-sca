SUMMARY = "Simple cross-platform colored terminal text in Python"
DESCRIPTION = "Simple cross-platform colored terminal text in Python"
HOMEPAGE = "https://github.com/tartley/colorama"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=b4936429a56a652b84c5c01280dcaa26"

RDEPENDS_${PN} += "${PYTHON_PN}-native"

PYPI_PACKAGE = "colorama"

inherit pypi
inherit native
