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

SRC_URI[sha256sum] = "3af84bb6ed78fb29325308d4eca55e2842f1583010cb6c09207375a4ecea151f"

inherit pypi
inherit setuptools3
inherit native
