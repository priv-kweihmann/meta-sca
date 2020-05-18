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

SRC_URI[md5sum] = "89f355fd2500f7b7ce13999afc7cd092"
SRC_URI[sha256sum] = "a0c30272fb4ddda5f5ffc1089d7405b7a71b0b0f51993cb4e5dbb4590b2fc229"

inherit pypi
inherit setuptools3

BBCLASSEXTEND = "native"
