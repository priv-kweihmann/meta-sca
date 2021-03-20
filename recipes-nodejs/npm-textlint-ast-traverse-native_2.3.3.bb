SUMMARY = "NPM: @textlint/ast-traverse"
DESCRIPTION = "TxtNode traverse library"
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/ast-traverse"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ac49fb893a5f9f03c162f1927dfc7bc1"

DEPENDS = "npm-textlint-ast-node-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/ast-traverse/-/ast-traverse-2.3.3.tgz"
SRC_URI[md5sum] = "0eb85c795170b583e23a11dd5fe2cc6e"
SRC_URI[sha256sum] = "6bc0d453c91b81dc4e3793a13334086cbf338a20342af0c52dfc628d4695d637"

NPM_PKGNAME = "@textlint/ast-traverse"

inherit npmhelper
inherit native
