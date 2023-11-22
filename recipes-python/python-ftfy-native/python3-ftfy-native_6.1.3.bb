SUMMARY = "fixes text for you"
HOMEPAGE = "http://github.com/LuminosoInsight/python-ftfy"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3ad45685700b2029ae5b070e6dd62c09"

DEPENDS += "python3-wcwidth-native"

PYPI_PACKAGE = "ftfy"

SRC_URI[md5sum] = "cdc052940b23499699bdf1acaf20f320"
SRC_URI[sha256sum] = "693274aead811cff24c1e8784165aa755cd2f6e442a5ec535c7d697f6422a422"

inherit pypi
inherit python_poetry_core
inherit native

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-wcwidth"
