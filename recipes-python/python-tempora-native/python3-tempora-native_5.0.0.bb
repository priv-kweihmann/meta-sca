SUMMARY = "Objects and routines pertaining to date and time"
HOMEPAGE = "https://github.com/jaraco/tempora"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7a7126e068206290f3fe9f8d6c713ea6"

DEPENDS += "\
	         python3-jaraco-functools-native \
             python3-pytz-native \
             python3-setuptools-scm-native \
             python3-toml-native \
             python3-wheel-native \
            "

PYPI_PACKAGE = "tempora"

SRC_URI[md5sum] = "2681875080a6b2e6656327b500965342"
SRC_URI[sha256sum] = "aa21dd1956e29559ecb2f2f2e14fcdb950085222fbbf86e6c946b5e1a8c36b26"

inherit pypi
inherit setuptools3
inherit native
