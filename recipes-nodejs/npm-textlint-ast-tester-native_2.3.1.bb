SUMMARY = "NPM: @textlint/ast-tester"
DESCRIPTION = "Compliance tests for textlint's AST(Abstract Syntax Tree)."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/ast-tester"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bc9a2bae21f2f74984d4a43e24285986"

DEPENDS = "npm-textlint-ast-node-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/ast-tester/-/ast-tester-2.3.1.tgz"
SRC_URI[md5sum] = "e4a75b5f7576ca42298a0d693433cc13"
SRC_URI[sha256sum] = "3a65e2ee153e20feb596ba16489a98dea044c416aadf9df58872a0a85f6af3d0"

NPM_PKGNAME = "@textlint/ast-tester"

inherit npmhelper
inherit native
