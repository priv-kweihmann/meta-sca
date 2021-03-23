SUMMARY = "NPM: @textlint/ast-traverse"
DESCRIPTION = "TxtNode traverse library"
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/ast-traverse"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ac49fb893a5f9f03c162f1927dfc7bc1"

DEPENDS = "npm-textlint-ast-node-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/ast-traverse/-/ast-traverse-2.3.4.tgz"
SRC_URI[md5sum] = "2ac6349ddbd3383d99d7e60b35dc2650"
SRC_URI[sha256sum] = "85f5b65d4a8cfa3b2d69241d206fa682bbbb5047c2a412787b77e01842a935bc"

NPM_PKGNAME = "@textlint/ast-traverse"

inherit npmhelper
inherit native
