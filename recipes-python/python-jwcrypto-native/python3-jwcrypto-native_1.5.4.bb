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

SRC_URI[sha256sum] = "0815fbab613db99bad85691da5f136f8860423396667728a264bcfa6e1db36b0"

inherit pypi
inherit setuptools3
inherit native
