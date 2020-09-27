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

SRC_URI[md5sum] = "c3807891d36aa9de8187e9db8b2bb457"
SRC_URI[sha256sum] = "9d9fc6a16357965d282dd4ab6531013935425d0dc4950df2e0cf2a1b1ac1017d"

inherit pypi
inherit setuptools3

BBCLASSEXTEND = "native"
