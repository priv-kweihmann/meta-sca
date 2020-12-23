SUMMARY = "NPM: @textlint/ast-tester"
DESCRIPTION = "Compliance tests for textlint's AST(Abstract Syntax Tree)."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/ast-tester"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bc9a2bae21f2f74984d4a43e24285986"

DEPENDS = "npm-textlint-ast-node-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/ast-tester/-/ast-tester-2.2.5.tgz"
SRC_URI[md5sum] = "f01050a2058aca594016bcb3206cdaa3"
SRC_URI[sha256sum] = "03ac13057d69a48941cad9c329bdf7974285e25c0d46c928ddbd751b62ce2dd5"

NPM_PKGNAME = "@textlint/ast-tester"

inherit npmhelper
inherit native
