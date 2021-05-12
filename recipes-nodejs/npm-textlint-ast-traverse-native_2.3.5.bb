SUMMARY = "NPM: @textlint/ast-traverse"
DESCRIPTION = "TxtNode traverse library"
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/ast-traverse"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ac49fb893a5f9f03c162f1927dfc7bc1"

DEPENDS = "npm-textlint-ast-node-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/ast-traverse/-/ast-traverse-2.3.5.tgz"
SRC_URI[md5sum] = "a14ffc7ff79d2d85b91644d30940871d"
SRC_URI[sha256sum] = "2bd0b34c3829184a3bc93d94875b703ef92a333380c25ccc22ec3b3a62c4f960"

NPM_PKGNAME = "@textlint/ast-traverse"

inherit npmhelper
inherit native
