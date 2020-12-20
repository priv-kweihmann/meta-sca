SUMMARY = "cryptography exposes cryptographic primitives"
DESCRIPTION = "cryptography is a package designed to expose cryptographic primitives and recipes to Python developers"
HOMEPAGE = "https://github.com/pyca/cryptography"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.BSD;md5=5ae30ba4123bc4f2fa49aa0b0dce887b"

DEPENDS += "\
            python3-asn1crypto-native \
            python3-cffi-native \
            python3-six-native \
           "

RDEPENDS_${PN}_class-target += "\
                                python3-asn1crypto \
                                python3-cffi \
                                python3-six \
                               "

PYPI_PACKAGE = "cryptography"

SRC_URI[md5sum] = "6faa1a7125c500c0e1586ad342ba3b30"
SRC_URI[sha256sum] = "7e177e4bea2de937a584b13645cab32f25e3d96fc0bc4a4cf99c27dc77682be6"

inherit pypi
inherit setuptools3

BBCLASSEXTEND = "native"
