SUMMARY = "NPM: tslib"
DESCRIPTION = "Runtime library for TypeScript helper functions"
HOMEPAGE = "https://www.typescriptlang.org/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "0BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=f938d99cba29007eeae26d80a9a4cfa6"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/tslib/-/tslib-2.3.1.tgz"
SRC_URI[md5sum] = "a249a872e7547a1bf855aa31b1541092"
SRC_URI[sha256sum] = "1774fefbfd64c476f33b92ae8efad1347c171ea1300720d0be036e102b8198fc"

NPM_PKGNAME = "tslib"

inherit npmhelper
inherit native
