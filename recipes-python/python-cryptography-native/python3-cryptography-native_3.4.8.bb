SUMMARY = "cryptography exposes cryptographic primitives"
DESCRIPTION = "cryptography is a package designed to expose cryptographic primitives and recipes to Python developers"
HOMEPAGE = "https://github.com/pyca/cryptography"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.BSD;md5=5ae30ba4123bc4f2fa49aa0b0dce887b"

DEPENDS += "\
            python3-asn1crypto-native \
            python3-cffi-native \
            python3-semantic-version-native \
            python3-setuptools-rust-native \
            python3-six-native \
           "

PYPI_PACKAGE = "cryptography"

SRC_URI[md5sum] = "e8b3e233556690acdc026b432a57c3fa"
SRC_URI[sha256sum] = "94cc5ed4ceaefcbe5bf38c8fba6a21fc1d365bb8fb826ea1688e3370b2e24a1c"

export CRYPTOGRAPHY_DONT_BUILD_RUST="1"

inherit pypi
inherit setuptools3
inherit native
