SUMMARY = "NPM: @textlint/ast-tester"
DESCRIPTION = "Compliance tests for textlint's AST(Abstract Syntax Tree)."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/ast-tester"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bc9a2bae21f2f74984d4a43e24285986"

DEPENDS = "npm-debug-native \
           npm-textlint-ast-node-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/ast-tester/-/ast-tester-12.0.2.tgz"
SRC_URI[md5sum] = "a37bfd39695d3a8b11fbfedb3abba73d"
SRC_URI[sha256sum] = "726127654e1a12ba508a7fc456665f7b7718beff0c1ee18172f7e54f4683ef6d"

NPM_PKGNAME = "@textlint/ast-tester"

inherit npmhelper
inherit native
