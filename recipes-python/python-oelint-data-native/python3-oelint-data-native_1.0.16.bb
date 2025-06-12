SUMMARY = "Data for oelint-adv"
HOMEPAGE = "https://github.com/priv-kweihmann/oelint-data"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=146a96f86505ef81a8e123389637dc56"

DEPENDS += "\
    python3-oelint-parser-native \
"

PYPI_PACKAGE = "oelint-data"

SRC_URI[sha256sum] = "1582cd6b875d0d800a36a84ee0f02197c1815782134d5a95e0311af465a96809"

inherit pypi
inherit pypi-old
inherit setuptools3
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk--python3-oelint-parser \
"
