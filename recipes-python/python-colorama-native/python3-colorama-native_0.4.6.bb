SUMMARY = "Simple cross-platform colored terminal text in Python"
HOMEPAGE = "https://github.com/tartley/colorama"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=b4936429a56a652b84c5c01280dcaa26"

PYPI_PACKAGE = "colorama"

SRC_URI[md5sum] = "11fe1cbf8299798551ac88f824ea11c4"
SRC_URI[sha256sum] = "08695f5cb7ed6e0531a20572697297273c47b8cae5a63ffc6d6ed5c201be6e44"

inherit pypi
inherit python_hatchling
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-core"
