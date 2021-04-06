SUMMARY = "NPM: tslib"
DESCRIPTION = "Runtime library for TypeScript helper functions"
HOMEPAGE = "https://www.typescriptlang.org/"

LICENSE = "0BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=f938d99cba29007eeae26d80a9a4cfa6"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/tslib/-/tslib-2.2.0.tgz"
SRC_URI[md5sum] = "2a0906d2f39be74f80572c93e9b6b687"
SRC_URI[sha256sum] = "1f00ed681b1394a8093a196d558d0513ea951f6a31c864719ccff906594cc5e5"

NPM_PKGNAME = "tslib"

inherit npmhelper
inherit native
