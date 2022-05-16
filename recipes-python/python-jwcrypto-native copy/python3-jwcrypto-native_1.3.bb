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

SRC_URI[md5sum] = "581dff61ab35d2a2881448f6ba52aa91"
SRC_URI[sha256sum] = "0d6461ba13f7c271d8bac5018ee60ddbcae5ff39403fafa42375f57d08e398bb"

inherit pypi
inherit setuptools3
inherit native
