SUMMARY = "NPM: esquery"
DESCRIPTION = "A query library for ECMAScript AST using a CSS selector like query language."
HOMEPAGE = "https://github.com/estools/esquery/"

DEPENDS = "npm-estraverse-native"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://license.txt;md5=3c167ae57ad981192db49e7a35b2753d"

SRC_URI = "https://registry.npmjs.org/esquery/-/esquery-1.3.1.tgz"
SRC_URI[md5sum] = "1893c35a8fe04a759fb067c5a84a81fb"
SRC_URI[sha256sum] = "8cbfca0b8c7bb1fdbeca1158f4d7627982c803e45817743bbabbad1fac28eb56"

NPM_PKGNAME = "esquery"

inherit npmhelper
inherit native
