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
