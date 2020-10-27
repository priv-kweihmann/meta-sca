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

SRC_URI[md5sum] = "1e476287399bae923514e19429804155"
SRC_URI[sha256sum] = "e4789b84f8dedf190148441f7c5bfe7244782d9cbb194a36e17b91e7d3e1cca9"

inherit pypi
inherit setuptools3

BBCLASSEXTEND = "native"
