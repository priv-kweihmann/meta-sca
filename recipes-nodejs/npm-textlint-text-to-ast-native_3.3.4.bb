SUMMARY = "NPM: @textlint/text-to-ast"
DESCRIPTION = "Parse plain text to AST with location info."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/text-to-ast/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e13f89c6c99507a95c450fa5e043b0cb"

DEPENDS = "npm-textlint-ast-node-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/text-to-ast/-/text-to-ast-3.3.4.tgz"
SRC_URI[md5sum] = "256ae7b9a49c6c6dfcc8aadebc88fb53"
SRC_URI[sha256sum] = "1d260d8c529cccf4b6c3d29e4bb5221241db84ed9959eaf0b78b887f2823ebbd"

NPM_PKGNAME = "@textlint/text-to-ast"

inherit npmhelper
inherit native
