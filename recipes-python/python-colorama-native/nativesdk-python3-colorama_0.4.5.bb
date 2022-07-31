SUMMARY = "Simple cross-platform colored terminal text in Python"
HOMEPAGE = "https://github.com/tartley/colorama"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=b4936429a56a652b84c5c01280dcaa26"

PYPI_PACKAGE = "colorama"

SRC_URI[md5sum] = "6abed05fb23a857a3ab22576148e7a4c"
SRC_URI[sha256sum] = "e6c6b4334fc50988a639d9b98aa429a0b57da6e17b9a44f0451f930b6967b7a4"

inherit pypi
inherit setuptools3
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-core"
