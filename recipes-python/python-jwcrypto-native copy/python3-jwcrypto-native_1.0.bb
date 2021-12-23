SUMMARY = "Implementation of JOSE Web standards"
HOMEPAGE = "https://github.com/latchset/jwcrypto"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

DEPENDS += "\
            python3-cryptography-native \
            python3-deprecated-native \
           "

PYPI_PACKAGE = "jwcrypto"

SRC_URI[md5sum] = "c665a34696d9f6250c312b7dc466bbd3"
SRC_URI[sha256sum] = "f88816eb0a41b8f006af978ced5f171f33782525006cdb055b536a40f4d46ac9"

inherit pypi
inherit setuptools3
inherit native
