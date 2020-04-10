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

PYPI_PACKAGE = "cryptography"

SRC_URI[md5sum] = "b1d1802e8874fa7d18e84bfe5607333f"
SRC_URI[sha256sum] = "0cacd3ef5c604b8e5f59bf2582c076c98a37fe206b31430d0cd08138aff0986e"

inherit pypi
inherit setuptools3
inherit native
