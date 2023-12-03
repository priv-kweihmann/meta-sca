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

SRC_URI[sha256sum] = "2c1dc51cf8e38ddf324795dfe9426dee9dd46caf47f535ccbc18781fba810b8d"

inherit pypi
inherit setuptools3
inherit native
