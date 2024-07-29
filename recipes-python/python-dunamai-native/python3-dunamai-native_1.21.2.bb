SUMMARY = "Dynamic version generation"
HOMEPAGE = "https://github.com/mtkennerly/dunamai"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=059eed55dbfd3fea022510ea62c95dc1"

DEPENDS += "\
    python3-importlib-metadata-native \
    python3-packaging-native \
"

SRC_URI[sha256sum] = "05827fb5f032f5596bfc944b23f613c147e676de118681f3bb1559533d8a65c4"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"

inherit pypi
inherit python_poetry_core
inherit_defer native

PYPI_PACKAGE = "dunamai"
