SUMMARY = "NPM: @textlint/ast-tester"
DESCRIPTION = "Compliance tests for textlint's AST(Abstract Syntax Tree)."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/ast-tester"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bc9a2bae21f2f74984d4a43e24285986"

DEPENDS = "npm-debug-native \
           npm-textlint-ast-node-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/ast-tester/-/ast-tester-12.1.1.tgz"
SRC_URI[md5sum] = "233d00f1c6e7cf0900d73db7573b6294"
SRC_URI[sha256sum] = "3f3580f66d4bd4f227a01dd72029bfe578e0d97bded9c23e8d8ab90d021f1f91"

NPM_PKGNAME = "@textlint/ast-tester"

inherit npmhelper
inherit native
