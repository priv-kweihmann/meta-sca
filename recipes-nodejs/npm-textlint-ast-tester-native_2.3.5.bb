SUMMARY = "NPM: @textlint/ast-tester"
DESCRIPTION = "Compliance tests for textlint's AST(Abstract Syntax Tree)."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/ast-tester"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bc9a2bae21f2f74984d4a43e24285986"

DEPENDS = "npm-textlint-ast-node-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/ast-tester/-/ast-tester-2.3.5.tgz"
SRC_URI[md5sum] = "c25e654e01c23d0b09992e077a6bd5c1"
SRC_URI[sha256sum] = "d08164d93fe81afa447c74e246a52d6ff4ec2874d0a0ddd62eec0fbc05f678c7"

NPM_PKGNAME = "@textlint/ast-tester"

inherit npmhelper
inherit native
