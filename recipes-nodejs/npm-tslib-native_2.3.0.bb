SUMMARY = "NPM: tslib"
DESCRIPTION = "Runtime library for TypeScript helper functions"
HOMEPAGE = "https://www.typescriptlang.org/"

LICENSE = "0BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=f938d99cba29007eeae26d80a9a4cfa6"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/tslib/-/tslib-2.3.0.tgz"
SRC_URI[md5sum] = "7ff19f1e91760bb4c6969adbcfe583ac"
SRC_URI[sha256sum] = "ae285639feff7e3c39de4626352181a5d73b815725e42639b411c43848abffdb"

NPM_PKGNAME = "tslib"

inherit npmhelper
inherit native
