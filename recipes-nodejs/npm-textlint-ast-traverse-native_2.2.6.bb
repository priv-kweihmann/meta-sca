SUMMARY = "NPM: @textlint/ast-traverse"
DESCRIPTION = "TxtNode traverse library"
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/ast-traverse"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ac49fb893a5f9f03c162f1927dfc7bc1"

DEPENDS = "npm-textlint-ast-node-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/ast-traverse/-/ast-traverse-2.2.6.tgz"
SRC_URI[md5sum] = "be86120196dbcc84d50f3512b997a9cd"
SRC_URI[sha256sum] = "2e0aa2cffef04ebbce1b5879412dd5eec3204d2b30c7cc4294786411a2406788"

NPM_PKGNAME = "@textlint/ast-traverse"

inherit npmhelper
inherit native
