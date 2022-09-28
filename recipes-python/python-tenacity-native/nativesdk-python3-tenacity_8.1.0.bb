SUMMARY = "general-purpose retrying library"
HOMEPAGE = "https://github.com/jd/tenacity"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=175792518e4ac015ab6696d16c4f607e"

DEPENDS += "\
    nativesdk-python3-six \
    python3-setuptools-scm-native \
"

PYPI_PACKAGE = "tenacity"

SRC_URI[md5sum] = "b6a0ac63bcdcbb7340eff579b8b83313"
SRC_URI[sha256sum] = "e48c437fdf9340f5666b92cd7990e96bc5fc955e1298baf4a907e3972067a445"

inherit pypi
inherit setuptools3
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-six"
