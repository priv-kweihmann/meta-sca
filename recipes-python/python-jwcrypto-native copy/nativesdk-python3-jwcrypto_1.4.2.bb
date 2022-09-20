SUMMARY = "Implementation of JOSE Web standards"
HOMEPAGE = "https://github.com/latchset/jwcrypto"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

DEPENDS += "\
    nativesdk-python3-cryptography \
    nativesdk-python3-deprecated \
"

PYPI_PACKAGE = "jwcrypto"

SRC_URI[md5sum] = "8c1832e28f9832ed2ce78f8de519758d"
SRC_URI[sha256sum] = "80a35e9ed1b3b2c43ce03d92c5d48e6d0b6647e2aa2618e4963448923d78a37b"

inherit pypi
inherit setuptools3
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-cryptography \
    nativesdk-python3-deprecated \
"
