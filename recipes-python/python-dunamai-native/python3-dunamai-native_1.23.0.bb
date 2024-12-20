SUMMARY = "Dynamic version generation"
HOMEPAGE = "https://github.com/mtkennerly/dunamai"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=059eed55dbfd3fea022510ea62c95dc1"

DEPENDS += "\
    python3-packaging-native \
"

SRC_URI[sha256sum] = "a163746de7ea5acb6dacdab3a6ad621ebc612ed1e528aaa8beedb8887fccd2c4"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"

inherit pypi
inherit python_poetry_core
inherit_defer native

PYPI_PACKAGE = "dunamai"
