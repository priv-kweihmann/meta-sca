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

SRC_URI[md5sum] = "401cc8268f89496643da3f7a48eb4e8e"
SRC_URI[sha256sum] = "26c821cbeb683facb966045e2064303029d572a87ee69ca5a1bf54bf55f93ca6"
