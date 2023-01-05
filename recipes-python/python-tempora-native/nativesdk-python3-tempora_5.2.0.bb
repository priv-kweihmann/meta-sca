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

SRC_URI[md5sum] = "87fc0d99edd557323e61a16017707a8b"
SRC_URI[sha256sum] = "af82eb016decda8daf566d1e4836f94f7f8ba8c7153637460156e081aadc64df"

inherit pypi
inherit python_setuptools_build_meta
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-jaraco-functools \
    nativesdk-python3-pytz \
"
