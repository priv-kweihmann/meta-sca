SUMMARY = "NPM: @textlint/ast-tester"
DESCRIPTION = "Compliance tests for textlint's AST(Abstract Syntax Tree)."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/ast-tester"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bc9a2bae21f2f74984d4a43e24285986"

DEPENDS = "npm-debug-native \
           npm-textlint-ast-node-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/ast-tester/-/ast-tester-12.1.0.tgz"
SRC_URI[md5sum] = "cf91c0cc47943784a24da1a296254d00"
SRC_URI[sha256sum] = "e5fffb74db94e064ade148e3afd0bc93f906b2ccfa602551c7d5bcd8507d267a"

NPM_PKGNAME = "@textlint/ast-tester"

inherit npmhelper
inherit native
