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

SRC_URI[md5sum] = "d4991114ad48cd440bd037bf0c15505a"
SRC_URI[sha256sum] = "62d50547d06a5638ce1c5e80d7d701ddf16963b407afcf5bdc83c7de4db94f7c"

inherit pypi
inherit setuptools3
inherit native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-chardet \
    nativesdk-python3-six \
"
