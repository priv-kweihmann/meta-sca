SUMMARY = "NPM: @textlint/text-to-ast"
DESCRIPTION = "Parse plain text to AST with location info."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/text-to-ast/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e13f89c6c99507a95c450fa5e043b0cb"

DEPENDS = "npm-textlint-ast-node-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/text-to-ast/-/text-to-ast-3.3.5.tgz"
SRC_URI[md5sum] = "78eee665077b517d4245221dd20a21b8"
SRC_URI[sha256sum] = "e5140bf9930847611ac8c2899dc99f2b4ddad004be53f76d0ae8313e5a960c29"

NPM_PKGNAME = "@textlint/text-to-ast"

inherit npmhelper
inherit native
