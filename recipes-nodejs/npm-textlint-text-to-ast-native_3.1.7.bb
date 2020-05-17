SUMMARY = "NPM: @textlint/text-to-ast"
DESCRIPTION = "Parse plain text to AST with location info."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/text-to-ast/"

DEPENDS = "npm-textlint-ast-node-types-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e13f89c6c99507a95c450fa5e043b0cb"

SRC_URI = "https://registry.npmjs.org/@textlint/text-to-ast/-/text-to-ast-3.1.7.tgz"
SRC_URI[md5sum] = "0435234a70fd139dfc125fa7c1f3099a"
SRC_URI[sha256sum] = "37ef7115ae7f43d2b4601b4d2ffb3b5ce078e6556c9f8256a346e5c75b169f5d"

NPM_PKGNAME = "@textlint/text-to-ast"

inherit npmhelper
inherit native
