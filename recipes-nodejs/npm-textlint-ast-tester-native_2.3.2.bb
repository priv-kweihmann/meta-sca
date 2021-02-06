SUMMARY = "NPM: @textlint/ast-tester"
DESCRIPTION = "Compliance tests for textlint's AST(Abstract Syntax Tree)."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/ast-tester"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bc9a2bae21f2f74984d4a43e24285986"

DEPENDS = "npm-textlint-ast-node-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/ast-tester/-/ast-tester-2.3.2.tgz"
SRC_URI[md5sum] = "d29fbd44017a901d088ae6472ed31d91"
SRC_URI[sha256sum] = "3bd1f697e7a89c8811febc7f5d885d961a46b546116a01d8c77e3ced5e15492a"

NPM_PKGNAME = "@textlint/ast-tester"

inherit npmhelper
inherit native
