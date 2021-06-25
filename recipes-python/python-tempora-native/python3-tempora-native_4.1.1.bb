SUMMARY = "Objects and routines pertaining to date and time"
HOMEPAGE = "https://github.com/jaraco/tempora"

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

SRC_URI[md5sum] = "ab60cbeb6409d5b121595bc8057a0d0e"
SRC_URI[sha256sum] = "c54da0f05405f04eb67abbb1dff4448fd91428b58cb00f0f645ea36f6a927950"

inherit pypi
inherit setuptools3
inherit native
