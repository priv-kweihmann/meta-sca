SUMMARY = "Dynamic version generation"
HOMEPAGE = "https://github.com/mtkennerly/dunamai"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=059eed55dbfd3fea022510ea62c95dc1"

DEPENDS += "\
    python3-packaging-native \
"

SRC_URI[sha256sum] = "375a0b21309336f0d8b6bbaea3e038c36f462318c68795166e31f9873fdad676"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"

inherit pypi
inherit python_poetry_core
inherit_defer native

PYPI_PACKAGE = "dunamai"
