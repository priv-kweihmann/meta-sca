SUMMARY = "flake8 debug statement checker"
HOMEPAGE = "https://github.com/jbkahn/flake8-debugger"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
## No license in repo & package
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

PYPI_PACKAGE = "flake8-debugger"

DEPENDS += "python3-flake8-native"

SRC_URI[md5sum] = "f5e7dbd23d72358d83942f97d8b68707"
SRC_URI[sha256sum] = "52b002560941e36d9bf806fca2523dc7fb8560a295d5f1a6e15ac2ded7a73840"

inherit pypi
inherit setuptools3
inherit native
