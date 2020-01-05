SUMMARY = "nose is nicer testing for python"
HOMEPAGE = "https://github.com/nose-devs/nose"

LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://lgpl.txt;md5=a6f89e2100d9b6cdffcea4f398e37343"

PYPI_PACKAGE = "nose"

DEPENDS += "${PYTHON_PN}-coverage-native"

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "4d3ad0ff07b61373d2cefc89c5d0b20b"
SRC_URI[sha256sum] = "f1bffef9cbc82628f6e7d7b40d7e255aefaa1adb6a1b1d26c69a8b79e6208a98"
