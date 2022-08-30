SUMMARY = "Debian package related modules"
HOMEPAGE = "https://salsa.debian.org/python-debian-team/python-debian"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0-or-later;md5=fed54355545ffd980b814dab4a3b312c"

DEPENDS += "\
            python3-chardet-native \
            python3-six-native \
           "

PYPI_PACKAGE = "python-debian"

SRC_URI[md5sum] = "16b9ec29d89c07e16022c4f591a1ac08"
SRC_URI[sha256sum] = "51e202823777a3d716a843b8a540fba2ba0bed9f507a87c0c0f9eefcdec3342c"

inherit pypi
inherit setuptools3
inherit native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-chardet \
    nativesdk-python3-six \
"
