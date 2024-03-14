SUMMARY = "Implementation of JOSE Web standards"
HOMEPAGE = "https://github.com/latchset/jwcrypto"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

DEPENDS += "\
    python3-cryptography-native \
    python3-deprecated-native \
"

PYPI_PACKAGE = "jwcrypto"

SRC_URI[sha256sum] = "771a87762a0c081ae6166958a954f80848820b2ab066937dc8b8379d65b1b039"

inherit pypi
inherit setuptools3
inherit native
