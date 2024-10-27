SUMMARY = "fixes text for you"
HOMEPAGE = "http://github.com/LuminosoInsight/python-ftfy"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3ad45685700b2029ae5b070e6dd62c09"

DEPENDS += "python3-wcwidth-native"

PYPI_PACKAGE = "ftfy"

SRC_URI[md5sum] = "8951f7ffa3aeb09c8cb77e29321a92c1"
SRC_URI[sha256sum] = "9b3c3d90f84fb267fe64d375a07b7f8912d817cf86009ae134aa03e1819506ec"

inherit pypi
inherit python_hatchling
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-wcwidth"
