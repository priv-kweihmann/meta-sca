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

SRC_URI[md5sum] = "0e24c9928bd0e358197c5dcac2c95c4f"
SRC_URI[sha256sum] = "10fdc29bf85fa0df39a230a225bb6d093982fc0825b648a414bbc06bddd79909"

inherit pypi
inherit setuptools3
inherit native
