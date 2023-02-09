SUMMARY = "general-purpose retrying library"
HOMEPAGE = "https://github.com/jd/tenacity"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=175792518e4ac015ab6696d16c4f607e"

DEPENDS += "\
             python3-setuptools-scm-native \
             python3-six-native \
            "

PYPI_PACKAGE = "tenacity"

SRC_URI[md5sum] = "7b28e49ee421655c44841edd57bb75fc"
SRC_URI[sha256sum] = "a43bcd8910406e0884ca0db3db7bed581f389c1d05165e992a1ddabfc81df05e"

inherit pypi
inherit setuptools3
inherit native

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-six"
