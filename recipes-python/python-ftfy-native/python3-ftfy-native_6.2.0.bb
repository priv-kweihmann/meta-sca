SUMMARY = "fixes text for you"
HOMEPAGE = "http://github.com/LuminosoInsight/python-ftfy"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3ad45685700b2029ae5b070e6dd62c09"

DEPENDS += "python3-wcwidth-native"

PYPI_PACKAGE = "ftfy"

SRC_URI[md5sum] = "295d15c09dd55eab191a5521c323d2b0"
SRC_URI[sha256sum] = "5e42143c7025ef97944ca2619d6b61b0619fc6654f98771d39e862c1424c75c0"

inherit pypi
inherit python_poetry_core
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-wcwidth"
