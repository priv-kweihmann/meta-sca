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

SRC_URI[md5sum] = "24b77c173a7e89084004a38fe44e3ce3"
SRC_URI[sha256sum] = "31fa5bb33b2641026211f23e808eb8bd351901988b167d45f323c8f450ecf211"

inherit pypi
inherit python_setuptools_build_meta
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-jaraco-functools \
    nativesdk-python3-pytz \
"
