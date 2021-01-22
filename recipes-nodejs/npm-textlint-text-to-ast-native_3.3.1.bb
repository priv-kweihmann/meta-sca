SUMMARY = "NPM: @textlint/text-to-ast"
DESCRIPTION = "Parse plain text to AST with location info."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/text-to-ast/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e13f89c6c99507a95c450fa5e043b0cb"

DEPENDS = "npm-textlint-ast-node-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/text-to-ast/-/text-to-ast-3.3.1.tgz"
SRC_URI[md5sum] = "66e8253b87f09541f824b48f27ae5cb5"
SRC_URI[sha256sum] = "af2644b3eca11187761a46804bb86d9300507ac2c90a5522787f7864c3798dd5"

NPM_PKGNAME = "@textlint/text-to-ast"

inherit npmhelper
inherit native
