SUMMARY = "NPM: esquery"
DESCRIPTION = "A query library for ECMAScript AST using a CSS selector like query language."
HOMEPAGE = "https://github.com/estools/esquery/"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://license.txt;md5=3c167ae57ad981192db49e7a35b2753d"

DEPENDS = "npm-estraverse-native"

SRC_URI = "https://registry.npmjs.org/esquery/-/esquery-1.4.0.tgz"
SRC_URI[md5sum] = "67c3703f159c91ae9bd06b896a863b19"
SRC_URI[sha256sum] = "6e5add1c721480e6b9f2da07d6e14e706587649b84c565c56b8eb29c04cefa09"

NPM_PKGNAME = "esquery"

inherit npmhelper
inherit native
