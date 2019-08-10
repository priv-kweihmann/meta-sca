SUMMARY = "nose is nicer testing for python"

HOMEPAGE = "https://github.com/nose-devs/nose"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://lgpl.txt;md5=a6f89e2100d9b6cdffcea4f398e37343"

PYPI_PACKAGE = "nose"

DEPENDS += "${PYTHON_PN}-coverage-native"

inherit pypi
inherit native