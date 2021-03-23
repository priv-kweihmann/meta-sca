SUMMARY = "NPM: @textlint/ast-tester"
DESCRIPTION = "Compliance tests for textlint's AST(Abstract Syntax Tree)."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/ast-tester"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bc9a2bae21f2f74984d4a43e24285986"

DEPENDS = "npm-textlint-ast-node-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/ast-tester/-/ast-tester-2.3.4.tgz"
SRC_URI[md5sum] = "f77ef7c3a02a183e8286683e856af928"
SRC_URI[sha256sum] = "2d292331bac884feb51109c09886756a301048ec28f458609ae810acbf55f1d0"

NPM_PKGNAME = "@textlint/ast-tester"

inherit npmhelper
inherit native
