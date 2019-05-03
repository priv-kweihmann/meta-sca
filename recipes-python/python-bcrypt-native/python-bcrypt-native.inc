SUMMARY = "Modern(-ish) password hashing for your software and your servers "
DESCRIPTION = "Modern(-ish) password hashing for your software and your servers"
HOMEPAGE = "https://github.com/pyca/bcrypt/"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

RDEPENDS_${PN} += "${PYTHON_PN}-native"

DEPENDS += "${PYTHON_PN}-cffi-native"

PYPI_PACKAGE = "bcrypt"

inherit pypi

inherit native
