SUMMARY = "Object-oriented filesystem paths"
DESCRIPTION = "Object-oriented filesystem paths"
HOMEPAGE = "https://github.com/mcmtroffaes/pathlib2"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=042856c23a3e903b33bf361ea1cbe29a"

DEPENDS += "${PYTHON_PN}-six-native"

PYPI_PACKAGE = "pathlib2"

inherit pypi
inherit native
