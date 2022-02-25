SUMMARY = "NPM: @textlint/ast-traverse"
DESCRIPTION = "TxtNode traverse library"
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/ast-traverse"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ac49fb893a5f9f03c162f1927dfc7bc1"

DEPENDS = "npm-textlint-ast-node-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/ast-traverse/-/ast-traverse-12.1.1.tgz"
SRC_URI[md5sum] = "d05829447367be5c60c5c26c426ec31b"
SRC_URI[sha256sum] = "1d1e2bb11b737be861c4313f31cc57743003a8ebc8bf9008c580fe48faa0d803"

NPM_PKGNAME = "@textlint/ast-traverse"

inherit npmhelper
inherit native
