SUMMARY = "NPM: @textlint/ast-tester"
DESCRIPTION = "Compliance tests for textlint's AST(Abstract Syntax Tree)."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/ast-tester"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bc9a2bae21f2f74984d4a43e24285986"

DEPENDS = "npm-debug-native \
           npm-textlint-ast-node-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/ast-tester/-/ast-tester-12.0.0.tgz"
SRC_URI[md5sum] = "7f99f5e29fd588660a4eb6a57044b1a3"
SRC_URI[sha256sum] = "36ead797f83b7452d5e1601a40a2e7d19e927441b56d4f1f7503b23d758cc665"

NPM_PKGNAME = "@textlint/ast-tester"

inherit npmhelper
inherit native
