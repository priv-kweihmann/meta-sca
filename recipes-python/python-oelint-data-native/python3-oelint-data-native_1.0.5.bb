SUMMARY = "Data for oelint-adv"
HOMEPAGE = "https://github.com/priv-kweihmann/oelint-data"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=146a96f86505ef81a8e123389637dc56"

DEPENDS += "\
    python3-oelint-parser-native \
"

PYPI_PACKAGE = "oelint-data"

SRC_URI[sha256sum] = "01c317b7e11bd044853affe3dad9ed5a628ed2fc9ff6d19b680d7bdbd2766994"

inherit pypi
inherit pypi-old
inherit setuptools3
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk--python3-oelint-parser \
"
