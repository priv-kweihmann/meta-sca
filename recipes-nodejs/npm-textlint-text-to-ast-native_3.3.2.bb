SUMMARY = "NPM: @textlint/text-to-ast"
DESCRIPTION = "Parse plain text to AST with location info."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/text-to-ast/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e13f89c6c99507a95c450fa5e043b0cb"

DEPENDS = "npm-textlint-ast-node-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/text-to-ast/-/text-to-ast-3.3.2.tgz"
SRC_URI[md5sum] = "ec9467c013b5331b9db38ab9139a47fe"
SRC_URI[sha256sum] = "1a80fe7bfc93433289eacacbaf07350e0e26659b3809a7cee71926e1f35e98a7"

NPM_PKGNAME = "@textlint/text-to-ast"

inherit npmhelper
inherit native
