SUMMARY = "flake8 debug statement checker"
HOMEPAGE = "https://github.com/jbkahn/flake8-debugger"

LICENSE = "MIT"
## No license in repo & package
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

PYPI_PACKAGE = "flake8-debugger"

DEPENDS += "python3-flake8-native"

SRC_URI[md5sum] = "2a47fb0d32d67e3a379208dce9f72765"
SRC_URI[sha256sum] = "e43dc777f7db1481db473210101ec2df2bd39a45b149d7218a618e954177eda6"

inherit pypi
inherit setuptools3
inherit native
