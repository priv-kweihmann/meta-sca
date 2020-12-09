SUMMARY = "cryptography exposes cryptographic primitives"
DESCRIPTION = "cryptography is a package designed to expose cryptographic primitives and recipes to Python developers"
HOMEPAGE = "https://github.com/pyca/cryptography"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.BSD;md5=5ae30ba4123bc4f2fa49aa0b0dce887b"

DEPENDS += "\
            ${PYTHON_PN}-asn1crypto-native \
            ${PYTHON_PN}-cffi-native \
            ${PYTHON_PN}-six-native \
           "

RDEPENDS_${PN}_class-target += "\
                                ${PYTHON_PN}-asn1crypto \
                                ${PYTHON_PN}-cffi \
                                ${PYTHON_PN}-six \
                               "

PYPI_PACKAGE = "cryptography"

SRC_URI[md5sum] = "96f254561a3cd0825e5a3787c356cf7b"
SRC_URI[sha256sum] = "d9f1e520f2ee08c5a88e1ae0b31159bdb13da40a486bea3e9f7d338564850ea6"

inherit pypi
inherit setuptools3

BBCLASSEXTEND = "native"
