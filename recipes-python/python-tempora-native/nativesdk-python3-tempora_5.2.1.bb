SUMMARY = "Objects and routines pertaining to date and time"
HOMEPAGE = "https://github.com/jaraco/tempora"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7a7126e068206290f3fe9f8d6c713ea6"

DEPENDS += "\
    nativesdk-python3-jaraco-functools \
    nativesdk-python3-pytz \
    python3-setuptools-scm-native \
    python3-toml-native \
    python3-wheel-native \
"

PYPI_PACKAGE = "tempora"

SRC_URI[md5sum] = "a4b09c1285680f8491c4a574ae7201db"
SRC_URI[sha256sum] = "b7176486c5948a75201e8d0b21ef2c23ca808474060df47218c92295bdce5276"

inherit pypi
inherit python_setuptools_build_meta
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-jaraco-functools \
    nativesdk-python3-pytz \
"
