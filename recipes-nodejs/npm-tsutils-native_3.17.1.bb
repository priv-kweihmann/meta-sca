SUMMARY = "NPM: tsutils"
DESCRIPTION = "utilities for working with typescript's AST"
HOMEPAGE = "https://github.com/ajafff/tsutils#readme"

DEPENDS = "npm-tslib-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cccdd4a66333521de89f60315d618caf"

SRC_URI = "https://registry.npmjs.org/tsutils/-/tsutils-3.17.1.tgz"
SRC_URI[md5sum] = "5159c8360c4313e9e09d71d3cbd04574"
SRC_URI[sha256sum] = "820bc20ed36ae0ed905422477e7c6d4729c1f830c628d06ef8fae1ffbd354497"

NPM_PKGNAME = "tsutils"

inherit npmhelper
inherit native
