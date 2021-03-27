SUMMARY = "cryptography exposes cryptographic primitives"
DESCRIPTION = "cryptography is a package designed to expose cryptographic primitives and recipes to Python developers"
HOMEPAGE = "https://github.com/pyca/cryptography"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.BSD;md5=5ae30ba4123bc4f2fa49aa0b0dce887b"

DEPENDS += "\
            python3-asn1crypto-native \
            python3-cffi-native \
            python3-semantic-version-native \
            python3-setuptools-rust-native \
            python3-six-native \
           "

RDEPENDS_${PN}_class-target += "\
                                python3-asn1crypto \
                                python3-cffi \
                                python3-six \
                               "

PYPI_PACKAGE = "cryptography"

SRC_URI[md5sum] = "f24fb11c6d5beb18cbfe216b9e58c27e"
SRC_URI[sha256sum] = "3d10de8116d25649631977cb37da6cbdd2d6fa0e0281d014a5b7d337255ca713"

export CRYPTOGRAPHY_DONT_BUILD_RUST="1"

inherit pypi
inherit setuptools3

BBCLASSEXTEND = "native"
