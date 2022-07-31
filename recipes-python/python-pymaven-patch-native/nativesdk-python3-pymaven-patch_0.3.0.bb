SUMMARY = "Python access to maven. nexB advanced patch"
HOMEPAGE = "https://github.com/nexB/pymaven"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += "\
    nativesdk-python3-lxml \
    nativesdk-python3-requests \
    python3-pbr-native \
"

PYPI_PACKAGE = "pymaven-patch"

SRC_URI[md5sum] = "71b24a50f893f75a379dae5b2f84a41b"
SRC_URI[sha256sum] = "d55b29bd4aeef3510904a12885eb6856b5bd48f3e29925a123461429f9ad85c0"

inherit pypi
inherit setuptools3
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-lxml \
    nativesdk-python3-requests \
"
