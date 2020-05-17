SUMMARY = "NPM: @textlint/ast-traverse"
DESCRIPTION = "TxtNode traverse library"
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/ast-traverse"

DEPENDS = "npm-textlint-ast-node-types-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ac49fb893a5f9f03c162f1927dfc7bc1"

SRC_URI = "https://registry.npmjs.org/@textlint/ast-traverse/-/ast-traverse-2.1.7.tgz"
SRC_URI[md5sum] = "99e61a875af2f8baffbe9db214fdf0de"
SRC_URI[sha256sum] = "eec881281beb2f47e109f1a708aa61a4383d7ee23c07908aa52a8b881b8b2d58"

NPM_PKGNAME = "@textlint/ast-traverse"

inherit npmhelper
inherit native
