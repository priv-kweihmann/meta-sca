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

SRC_URI[md5sum] = "fba8357333515623bfdcd10af09b6328"
SRC_URI[sha256sum] = "9af06854fafb26d3d40d3dd6402e8baefaf57f90e48fdc9a94f6b22827a60fb3"

inherit pypi
inherit setuptools3
inherit native
