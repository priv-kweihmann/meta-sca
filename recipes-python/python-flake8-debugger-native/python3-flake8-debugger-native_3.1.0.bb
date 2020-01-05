SUMMARY = "flake8 debug statement checker"
HOMEPAGE = "https://github.com/jbkahn/flake8-debugger"

LICENSE = "MIT"
## No license in repo & package
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

PYPI_PACKAGE = "flake8-debugger"

DEPENDS += " \
            ${PYTHON_PN}-flake8-native \
            "

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "5584986024b136eb5d48823d3cad2fa6"
SRC_URI[sha256sum] = "be4fb88de3ee8f6dd5053a2d347e2c0a2b54bab6733a2280bb20ebd3c4ca1d97"
