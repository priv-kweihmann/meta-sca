SUMMARY = "NPM: tslib"
DESCRIPTION = "Runtime library for TypeScript helper functions"
HOMEPAGE = "https://www.typescriptlang.org/"

LICENSE = "0BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=f938d99cba29007eeae26d80a9a4cfa6"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/tslib/-/tslib-2.0.1.tgz"
SRC_URI[md5sum] = "d7ad9d00b3de3d046980b85b4538483c"
SRC_URI[sha256sum] = "a0cec74336b11da82af2f4a5b0dae48354c7ac0d7839e6cc18f910a1035fd631"

NPM_PKGNAME = "tslib"

inherit npmhelper
inherit native
