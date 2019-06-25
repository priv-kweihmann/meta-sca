SUMMARY = "Create Python CLI apps with little to no effort at all!"
DESCRIPTION = "Create Python CLI apps with little to no effort at all!"
HOMEPAGE = "https://github.com/rubik/mando"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a3c8e41bdf640795815537c1ce89a3aa"

DEPENDS += "${PYTHON_PN}-native ${PYTHON_PN}-six-native"

PYPI_PACKAGE = "mando"

inherit pypi
inherit native
