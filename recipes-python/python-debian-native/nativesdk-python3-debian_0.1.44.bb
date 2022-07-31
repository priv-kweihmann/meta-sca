SUMMARY = "Debian package related modules"
HOMEPAGE = "https://salsa.debian.org/python-debian-team/python-debian"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0-or-later;md5=fed54355545ffd980b814dab4a3b312c"

DEPENDS += "\
    nativesdk-python3-chardet \
    nativesdk-python3-six \
"

PYPI_PACKAGE = "python-debian"

SRC_URI[md5sum] = "289a4961d3a0a8ff897c8ecc595bcc18"
SRC_URI[sha256sum] = "65592fe3b64f6c6c93d94e2d2599db5e0c22831d3bcff07cb7b96d3840b1333e"

inherit pypi
inherit setuptools3
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-chardet \
    nativesdk-python3-six \
"
