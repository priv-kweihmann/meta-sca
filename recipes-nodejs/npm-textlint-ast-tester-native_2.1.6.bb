SUMMARY = "NPM: @textlint/ast-tester"
DESCRIPTION = "Compliance tests for textlint's AST(Abstract Syntax Tree)."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/ast-tester"

DEPENDS = "npm-textlint-ast-node-types-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bc9a2bae21f2f74984d4a43e24285986"

SRC_URI = "https://registry.npmjs.org/@textlint/ast-tester/-/ast-tester-2.1.6.tgz"
SRC_URI[md5sum] = "80b6a4b7ff29fa3234f37bf6f3b2557f"
SRC_URI[sha256sum] = "45c727fea1927b05753b8750b4f0a22c70ed29e7507511eecc07f650513d52df"

NPM_PKGNAME = "@textlint/ast-tester"

inherit npmhelper
inherit native
