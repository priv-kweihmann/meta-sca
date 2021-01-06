SUMMARY = "NPM: tslib"
DESCRIPTION = "Runtime library for TypeScript helper functions"
HOMEPAGE = "https://www.typescriptlang.org/"

LICENSE = "0BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=f938d99cba29007eeae26d80a9a4cfa6"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/tslib/-/tslib-2.1.0.tgz"
SRC_URI[md5sum] = "92312295f3bec1f543dffb258ec3fb38"
SRC_URI[sha256sum] = "3c741a8155d94d86074f97253561e29f3d4cfed30681564a3cb4b93d68b6efe2"

NPM_PKGNAME = "tslib"

inherit npmhelper
inherit native
