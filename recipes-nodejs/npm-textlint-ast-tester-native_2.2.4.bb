SUMMARY = "NPM: @textlint/ast-tester"
DESCRIPTION = "Compliance tests for textlint's AST(Abstract Syntax Tree)."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/ast-tester"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bc9a2bae21f2f74984d4a43e24285986"

DEPENDS = "npm-textlint-ast-node-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/ast-tester/-/ast-tester-2.2.4.tgz"
SRC_URI[md5sum] = "4ece8a0031b938c8aa18b8c24efdf3a5"
SRC_URI[sha256sum] = "4558a6a277687a675561259e9632bc41d40fa80544213a64f2da5f7e504bbe4b"

NPM_PKGNAME = "@textlint/ast-tester"

inherit npmhelper
inherit native
