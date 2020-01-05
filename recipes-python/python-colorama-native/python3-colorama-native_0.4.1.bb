SUMMARY = "Simple cross-platform colored terminal text in Python"
DESCRIPTION = "Simple cross-platform colored terminal text in Python"
HOMEPAGE = "https://github.com/tartley/colorama"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=b4936429a56a652b84c5c01280dcaa26"

RDEPENDS_${PN} += "${PYTHON_PN}-native"

PYPI_PACKAGE = "colorama"

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "f927529cd1735f6f50ee2c61628e9c1f"
SRC_URI[sha256sum] = "05eed71e2e327246ad6b38c540c4a3117230b19679b875190486ddd2d721422d"
