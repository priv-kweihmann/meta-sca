SUMMARY = "Data for oelint-adv"
HOMEPAGE = "https://github.com/priv-kweihmann/oelint-data"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=146a96f86505ef81a8e123389637dc56"

DEPENDS += "\
    python3-oelint-parser-native \
"

PYPI_PACKAGE = "oelint-data"

SRC_URI[sha256sum] = "2279f4305efc41d7dd6d3819c2e019a49903416ce07b7403fd4eb52571278041"

inherit pypi
inherit pypi-old
inherit python_setuptools_build_meta
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk--python3-oelint-parser \
"
