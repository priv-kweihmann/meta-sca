SUMMARY = "NPM: @textlint/ast-tester"
DESCRIPTION = "Compliance tests for textlint's AST(Abstract Syntax Tree)."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/ast-tester"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bc9a2bae21f2f74984d4a43e24285986"

DEPENDS = "npm-textlint-ast-node-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/ast-tester/-/ast-tester-2.3.3.tgz"
SRC_URI[md5sum] = "4c37dfbc8b31a250de848133760fa996"
SRC_URI[sha256sum] = "a3a9ca2197be8369175d41ebbea6f5b528b5493370f6615534bd18a663a8c7f4"

NPM_PKGNAME = "@textlint/ast-tester"

inherit npmhelper
inherit native
