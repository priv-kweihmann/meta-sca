SUMMARY = "cryptography is a package designed to expose cryptographic primitives and recipes to Python developers"
DESCRIPTION = "cryptography is a package designed to expose cryptographic primitives and recipes to Python developers"
HOMEPAGE = "https://github.com/pyca/cryptography"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.BSD;md5=5ae30ba4123bc4f2fa49aa0b0dce887b"

RDEPENDS_${PN} += "${PYTHON_PN}-native"

DEPENDS += " \
    ${PYTHON_PN}-cffi-native \
    ${PYTHON_PN}-asn1crypto-native \
    ${PYTHON_PN}-six-native \
"

PYPI_PACKAGE = "cryptography"

inherit pypi
inherit setuptools3
inherit native

SRC_URI[md5sum] = "77730058b556c6d9838679a94c6229ce"
SRC_URI[sha256sum] = "3cda1f0ed8747339bbdf71b9f38ca74c7b592f24f65cdb3ab3765e4b02871651"
