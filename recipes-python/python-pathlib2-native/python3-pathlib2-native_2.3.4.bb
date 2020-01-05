SUMMARY = "Object-oriented filesystem paths"
DESCRIPTION = "Object-oriented filesystem paths"
HOMEPAGE = "https://github.com/mcmtroffaes/pathlib2"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=042856c23a3e903b33bf361ea1cbe29a"

DEPENDS += "${PYTHON_PN}-six-native"

PYPI_PACKAGE = "pathlib2"

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "96da6398b3ea944417b84ccb25b171aa"
SRC_URI[sha256sum] = "446014523bb9be5c28128c4d2a10ad6bb60769e78bd85658fe44a450674e0ef8"
