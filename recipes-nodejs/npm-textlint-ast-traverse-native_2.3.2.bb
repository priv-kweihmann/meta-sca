SUMMARY = "NPM: @textlint/ast-traverse"
DESCRIPTION = "TxtNode traverse library"
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/ast-traverse"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ac49fb893a5f9f03c162f1927dfc7bc1"

DEPENDS = "npm-textlint-ast-node-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/ast-traverse/-/ast-traverse-2.3.2.tgz"
SRC_URI[md5sum] = "3abe4efde54d760ed26f7bfb726ef969"
SRC_URI[sha256sum] = "46163c53d24e1a64fd505a3dd5ef46b476f7066e0810cf018e17a9380570a434"

NPM_PKGNAME = "@textlint/ast-traverse"

inherit npmhelper
inherit native
