SUMMARY = "NPM: @textlint/ast-traverse"
DESCRIPTION = "TxtNode traverse library"
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/ast-traverse"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ac49fb893a5f9f03c162f1927dfc7bc1"

DEPENDS = "npm-textlint-ast-node-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/ast-traverse/-/ast-traverse-12.0.0.tgz"
SRC_URI[md5sum] = "9eea3e6848186284ca64d3bda4d7a228"
SRC_URI[sha256sum] = "f99a3de551460c13ee866a3a2e415b1f96a582e57bac4e668b55a244b96124ea"

NPM_PKGNAME = "@textlint/ast-traverse"

inherit npmhelper
inherit native
