SUMMARY = "A utility belt for advanced users of python-requests"
HOMEPAGE = "https://github.com/requests/toolbelt"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6f14302a4b4099009ab38b4dde5f1075"

DEPENDS += "nativesdk-python3-requests"

PYPI_PACKAGE = "requests-toolbelt"

SRC_URI[md5sum] = "636d226d03632d013269aebbc85f4f4b"
SRC_URI[sha256sum] = "62e09f7ff5ccbda92772a29f394a49c3ad6cb181d568b1337626b2abb628a63d"

inherit pypi
inherit setuptools3
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-requests"
