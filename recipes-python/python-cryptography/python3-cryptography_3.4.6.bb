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

SRC_URI[md5sum] = "498e716708a5d36ff4593c71d7bef364"
SRC_URI[sha256sum] = "2d32223e5b0ee02943f32b19245b61a62db83a882f0e76cc564e1cec60d48f87"

export CRYPTOGRAPHY_DONT_BUILD_RUST="1"

inherit pypi
inherit setuptools3

BBCLASSEXTEND = "native"
