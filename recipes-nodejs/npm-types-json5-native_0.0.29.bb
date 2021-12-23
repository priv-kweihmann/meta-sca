SUMMARY = "NPM: @types/json5"
DESCRIPTION = "TypeScript definitions for JSON5"
HOMEPAGE = "https://github.com/json5/json5"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/json5/-/json5-0.0.29.tgz"
SRC_URI[md5sum] = "b2b856287e2f65c5298b7747332bb633"
SRC_URI[sha256sum] = "439d14e46f574bc1a62a72ad4598e7f22ebd8021410ab7d869723801c436e95d"

NPM_PKGNAME = "@types/json5"

inherit npmhelper
inherit native

S = "${WORKDIR}/json5"
